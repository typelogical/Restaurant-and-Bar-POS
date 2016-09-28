
package gui;

import gui.Window;
import bar.User;
import bar.Validator;
import bar.bar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author admin
 */

public class SwitchUserWindow extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private Window frame;
    private Validator validator;
    public SwitchUserWindow(Window frame, bar bar) {
        this.bar = bar;
        this.frame = frame;
        initComponents();
        this.setVisible (true);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.validator = new Validator ();
    }
    private User user;
    public User getUser () {
        return user;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        switchLabel = new javax.swing.JLabel();
        managerCheckBox = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User Name:");

        jLabel2.setText("Password:");

        loginButton.setText("Switch");
        loginButton.setToolTipText("");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        switchLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        switchLabel.setText("Switch User");

        managerCheckBox.setText("Manager");
        managerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(loginButton)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(managerCheckBox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtusername)
                                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(78, 78, 78))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(switchLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(switchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(managerCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addComponent(loginButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        
    }//GEN-LAST:event_txtusernameActionPerformed
public boolean find (String username, String password) {
    boolean found = false;
    for(User u : bar.employees){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                // Check that user has that valid role to acess as a manager
                if (isManager () && !u.isManager()) {
                    found = false;
                } else {
                    frame.logOutUser ();
                    frame.currUser = u;
                    frame.setUser (u);
                    this.setVisible (false);
                    found = true;
                }
            }
        }
    return found;
}
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String username=txtusername.getText();
        String password=txtpassword.getText();
        
        if (!validator.isValidName (username)) {
            JOptionPane.showMessageDialog (this, "Invalid username.");
            return;
        }
        
        if (!validator.isValidName(username)) {
            JOptionPane.showMessageDialog (this, "Invalid password.");
            return;
        }
        
        boolean found = find (username, password);
        if(found) {
            Calendar cal = new GregorianCalendar ();
            String timestamp = cal.get (Calendar.HOUR) + ":" + cal.get (Calendar.MINUTE) + " " +  
                    (cal.get (Calendar.AM_PM) == 1 ? "PM" : "AM");
            if (frame.currUser.isManager ()) {
                frame.dsiplayTextArea.setText("Manager looged in at " + timestamp + "\n");   
            } else {
                frame.dsiplayTextArea.setText("Waiter " + frame.currUser.getId () + " looged in at " + timestamp + "\n");
            }
        } else {
            JOptionPane.showMessageDialog(this, "wrong username and passwords. please try again...");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void managerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerCheckBoxActionPerformed
        // TODO add your handling code here:
        managerSelected = managerCheckBox.isSelected ();
    }//GEN-LAST:event_managerCheckBoxActionPerformed

    protected bar bar;
    private boolean managerSelected = false;
    public boolean isManager () {
        return managerSelected;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JCheckBox managerCheckBox;
    protected javax.swing.JLabel switchLabel;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}

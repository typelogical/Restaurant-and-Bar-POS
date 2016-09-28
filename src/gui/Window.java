//
//first login in System.  after login create new User. 
//Select basket for user. Select Item for add in basket.  calculate Amount.
package gui;

import bar.DiscountChristmas;
import bar.Table;
import bar.Item;
import bar.ItemWithDiscount;
import bar.ItemsInOffer;
import bar.Payable;
import bar.Summary;
import bar.TableCompany;
import bar.TableEmployee;
import bar.TableLoyal;
import bar.CompanyCustomer;
import bar.Customer;
import bar.EmployeeCustomer;
import bar.LoyalCustomer;
import bar.SimpleCustomer;
import bar.User;
import bar.Waiter;
import bar.Validator;
import bar.bar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Window extends javax.swing.JFrame {
    
    private Login login = null;
    private bar bar = null;
    private Validator validator;
    public Window(Login login, bar bar) {
        initComponents();
        this.login = login;
        this.bar = bar;
        init ();
        validator = new Validator ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jMenuItem1 = new javax.swing.JMenuItem();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        dsiplayTextArea = new java.awt.TextArea();
        modifyItemButton = new javax.swing.JButton();
        removeItem = new javax.swing.JButton();
        waiterIdLabel = new javax.swing.JLabel();
        tableIdLabel = new javax.swing.JLabel();
        javax.swing.JButton printTableButton = new javax.swing.JButton();
        applyDiscountButton = new javax.swing.JButton();
        displayTablesButton = new javax.swing.JButton();
        tablesWaitedButton = new javax.swing.JButton();
        numTablesButton = new javax.swing.JButton();
        totalCostButton = new javax.swing.JButton();
        totalTablesButton = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        displayCustomersButton = new javax.swing.JButton();
        summaryButton = new java.awt.Button();
        employeeSalariesButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        loadMenuItem = new javax.swing.JMenuItem();
        selectTableMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        newCustMItem = new javax.swing.JMenuItem();
        loyalCustMItem = new javax.swing.JMenuItem();
        companyCustMItem = new javax.swing.JMenuItem();
        employeeCustMItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        regularItemMItem = new javax.swing.JMenuItem();
        discountItemMItem = new javax.swing.JMenuItem();
        chrisDiscountMItem = new javax.swing.JMenuItem();
        itemsInOfferMItem = new javax.swing.JMenuItem();
        switchUserMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenuButton = new javax.swing.JMenu();
        exitMenuITem = new javax.swing.JMenu();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        modifyItemButton.setActionCommand("Modify Items");
        modifyItemButton.setLabel("Modify Item");
        modifyItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyItemButtonActionPerformed(evt);
            }
        });

        removeItem.setActionCommand("remove Item");
        removeItem.setLabel("Remove Item");
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });

        waiterIdLabel.setText("Waiter Id: ");

        tableIdLabel.setText("Table Id: ");

        printTableButton.setText("Print Table");
        printTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTableButtonActionPerformed(evt);
            }
        });

        applyDiscountButton.setText("Apply Discount");
        applyDiscountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyDiscountButtonActionPerformed(evt);
            }
        });

        displayTablesButton.setText("Display Tables");
        displayTablesButton.setAutoscrolls(true);
        displayTablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTablesButtonActionPerformed(evt);
            }
        });

        tablesWaitedButton.setText("Cost of Tables Waited");
        tablesWaitedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablesWaitedButtonActionPerformed(evt);
            }
        });

        numTablesButton.setText("Numbe of Tables Waited");
        numTablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTablesButtonActionPerformed(evt);
            }
        });

        totalCostButton.setText("Total Cost of Tables Waited");
        totalCostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostButtonActionPerformed(evt);
            }
        });

        totalTablesButton.setText("Total Tables Waited");
        totalTablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTablesButtonActionPerformed(evt);
            }
        });

        payment.setText("Calculate Payment");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        displayCustomersButton.setText("Display Customers");
        displayCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCustomersButtonActionPerformed(evt);
            }
        });

        summaryButton.setActionCommand("Summary");
        summaryButton.setLabel("Summary");
        summaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryButtonActionPerformed(evt);
            }
        });

        employeeSalariesButton.setText("Print Employee Salaries");
        employeeSalariesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSalariesButtonActionPerformed(evt);
            }
        });

        timeLabel.setText("TimeLabel");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifyItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(applyDiscountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayTablesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablesWaitedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numTablesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalCostButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalTablesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayCustomersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(summaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeSalariesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(waiterIdLabel)
                            .addComponent(timeLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableIdLabel)
                    .addComponent(dsiplayTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(payment)
                .addGap(12, 12, 12))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tableIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(waiterIdLabel)
                        .addGap(18, 18, 18)
                        .addComponent(modifyItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printTableButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(applyDiscountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayTablesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayCustomersButton)
                        .addGap(9, 9, 9)
                        .addComponent(tablesWaitedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numTablesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalCostButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalTablesButton)
                        .addGap(11, 11, 11)
                        .addComponent(employeeSalariesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(summaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dsiplayTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payment)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        saveMenuItem.setText("Save Data");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        loadMenuItem.setText("Load Data");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenuItem);

        selectTableMenuItem.setText("Select Table");
        selectTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTableMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(selectTableMenuItem);

        jMenu2.setText("New table");

        newCustMItem.setText("Simple");
        newCustMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustMItemActionPerformed(evt);
            }
        });
        jMenu2.add(newCustMItem);

        loyalCustMItem.setText("Loyal");
        loyalCustMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loyalCustMItemActionPerformed(evt);
            }
        });
        jMenu2.add(loyalCustMItem);

        companyCustMItem.setText("Company");
        companyCustMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyCustMItemActionPerformed(evt);
            }
        });
        jMenu2.add(companyCustMItem);

        employeeCustMItem.setText("Employee");
        employeeCustMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeCustMItemActionPerformed(evt);
            }
        });
        jMenu2.add(employeeCustMItem);

        jMenu1.add(jMenu2);

        jMenu3.setText("Add Item");

        regularItemMItem.setText("Regular");
        regularItemMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularItemMItemActionPerformed(evt);
            }
        });
        jMenu3.add(regularItemMItem);

        discountItemMItem.setText("Discount");
        discountItemMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountItemMItemActionPerformed(evt);
            }
        });
        jMenu3.add(discountItemMItem);

        chrisDiscountMItem.setText("Christmas Discount");
        chrisDiscountMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chrisDiscountMItemActionPerformed(evt);
            }
        });
        jMenu3.add(chrisDiscountMItem);

        itemsInOfferMItem.setText("Items in Offer");
        itemsInOfferMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsInOfferMItemActionPerformed(evt);
            }
        });
        jMenu3.add(itemsInOfferMItem);

        jMenu1.add(jMenu3);

        switchUserMenuItem.setText("Switch User");
        switchUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchUserMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(switchUserMenuItem);

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(logoutMenuItem);

        jMenuBar1.add(jMenu1);

        helpMenuButton.setText("Help");
        helpMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuButtonMouseClicked(evt);
            }
        });
        helpMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuButtonActionPerformed(evt);
            }
        });
        jMenuBar1.add(helpMenuButton);

        exitMenuITem.setText("Exit");
        exitMenuITem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuITemMouseClicked(evt);
            }
        });
        exitMenuITem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuITemActionPerformed(evt);
            }
        });
        jMenuBar1.add(exitMenuITem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /***************************************************************************/
  
    public Table findTable (int id) {
        for (Table t : tables) {
            if (t.getId () == id) {
                return t;
            }
        }
        return null;
    }
    /***************************************************************************/
    /*
        Change the active table as selected by waiter. Also changes the associated
        customer
    */
    private void selectTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTableMenuItemActionPerformed
        // TODO add your handling code here:
        String tableIdStr = javax.swing.JOptionPane.showInputDialog (this, "Enter table id:");
        // Validate id;
        if (!validator.isValidId (tableIdStr)) {
            JOptionPane.showMessageDialog (this, "Invalid id.");
            return;
        }
        int tableId = Integer.parseInt (tableIdStr);
        Table table = findTable (tableId);
        if (table != null) {
            currTable = table;
            tableIdLabel.setText ("Table ID: " + tableId);
            dsiplayTextArea.setText ("Table witeh id " + tableId + " selected.");
        } else {
            JOptionPane.showMessageDialog(this, "Id not found");
        }
    }//GEN-LAST:event_selectTableMenuItemActionPerformed

    private void exitMenuITemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuITemActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_exitMenuITemActionPerformed

    private void helpMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_helpMenuButtonActionPerformed

    private void exitMenuITemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuITemMouseClicked
        // TODO add your handling code here:
            System.exit(0);
    }//GEN-LAST:event_exitMenuITemMouseClicked

    private void helpMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuButtonMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_helpMenuButtonMouseClicked
    public void addItems (Item item, int count) {
        for (int i = 0; i < count; ++i)
        currTable.addItem (item);
    }
    public boolean modifyItem (Item item) {
        return currTable.modifyItem (item);
    }
    public boolean removeItem (int id) {
        return currTable.removeItem (id);
    }
    public boolean applyDiscount (int id) {
        return currTable.applyDiscount (id, discount);
    }
    public String idToWaiterName (int id) {
       for (User u : bar.employees) {
          if (u.getId () == id) {
              return u.getUsername();
          }
       }
       return null;
    }
    
    //@param id - waiter id
    public float calcValOfTablesWaited (int id) {
        float val = (float) 0.0;
        String waiterName = idToWaiterName (id);
        if (waiterName == null)
            return -1;
        for (Table t : tables) {
            if (t.getWaiterName().equals(waiterName))
                val += (float) t.getTotalAmount();
        }
        return val;
    }
    //@param id - waiter id
    public int calcNumberTablesWaited (int id) {
        int num = 0;
        String waiterName = idToWaiterName (id);
        if (waiterName == null)
            return -1;
        for (Table t : tables) {
            if (t.getWaiterName ().equals(waiterName)) {
                ++num;
            }
        }
        return num;
    }
    //@param id - waiter id
    public float calcTotalValOfTablesWaited () {
        float val = (float) 0.0;
        for (Table t : tables) {
                val += (float) t.getTotalAmount();
        }
        return val;
    }
    //@param id - waiter id
    public int calcTotalNumberTablesWaited () {
        return tables.size ();
        
    }
    public Integer getId () throws Exception {
        String idText = JOptionPane.showInputDialog (this, "Enter id:");
        if (!validator.isValidId (idText)) {
            throw new Exception ("Invalid id");
        }

        return Integer.parseInt (idText);
    }
    
    public String getStringName (String msg) throws Exception {
        String nameText = JOptionPane.showInputDialog (this, msg);
        if (!validator.isValidName (nameText)) {
            throw new Exception ("Invalid string.");
        }
        return nameText;
    }
    
    public float getPrice () throws Exception {
        String priceText = JOptionPane.showInputDialog (this, "Enter price:");
         if (!validator.isValidPrice (priceText)) {
            throw new Exception ("Invalid price.");
        }
        return Float.parseFloat (priceText);
    }
    
    public int getQuantity() throws Exception {
        String priceText = JOptionPane.showInputDialog (this, "Enter quantity:");
         if (!validator.isValidQuantity (priceText)) {
            throw new Exception ("Invalid quantity..");
        }
        return Integer.parseInt (priceText);
    }
    
    public Item itemFactory (String typeText, String name, float price) {
        Item item = null;
        if (typeText.equals ("Regular")) {
               item = new Item (name, price);
        } else if (typeText.equals("Discounted")) {
            item = new ItemWithDiscount (name, price, this.normalItemDiscount );
        } else if (typeText.equals("Christmas Discounted")) {
            item = new DiscountChristmas ( new ItemWithDiscount(name, price, this.normalItemDiscount),
                 (this.christmasItemDiscount));
        } else if(typeText == "Item In Offer") {
            String nText = JOptionPane.showInputDialog (this, "Enter number of items:");
            if (!validator.isValidId (nText)) {
                JOptionPane.showMessageDialog(this, "Invalid number.");
            }
            item = new ItemsInOffer (name, price, this.buyN, this.payN, Integer.parseInt (nText));
        } 
        return item;
    }
    public User customerFactory (String type, String firstName, String lastName, String phoneNum) {
        User cust = null;
        // Type == table type
        if (type.equals("Simple")) {
            cust = new SimpleCustomer (firstName, lastName, phoneNum);
        } else if (type.equals ("Loyal")) {
            cust = new LoyalCustomer (firstName, lastName, phoneNum);
        } else if (type.equals ("Company")) {
            cust = new CompanyCustomer (firstName, lastName, phoneNum);
        } else if (type.equals ("Employee")) {
            cust = new EmployeeCustomer (firstName, lastName, phoneNum);
        }
        return cust;
    }
    public Table tableFactory (User cust) {
        Table table = null;
        if (cust instanceof SimpleCustomer) {
            table = new Table ( new ArrayList(), this.addr, this.currUser.getUsername(),
            new Date (), 0, this.vat, 0, cust);
        } else if (cust instanceof LoyalCustomer) {
            table = new TableLoyal ( new ArrayList(), this.addr, this.currUser.getUsername(),
            new Date (), 0, this.vat, 0, cust);
        } else if (cust instanceof CompanyCustomer) {
            table = new TableCompany ( new ArrayList(), this.addr, this.currUser.getUsername(),
            new Date (), 0, this.vat, 0, cust);
        } else if (cust instanceof EmployeeCustomer) {
            table = new TableEmployee ( new ArrayList(), this.addr, this.currUser.getUsername(),
            new Date (), 0, this.vat, 0, cust);
        }
        return table;
    }
    
    public void addItemHelper (String itemText) {
        try {
            if (currTable == null) {
                    throw new Exception ("No Table Selected.");
            }
            dsiplayTextArea.setText ("");
            String name = this.getStringName ("Enter name:");
            float price = this.getPrice ();
            int quantity = this.getQuantity ();

           Item item = this.itemFactory (itemText,name, price);

           this.addItems (item, quantity);
           JOptionPane.showMessageDialog (this, "Item added.");
        } catch (Exception e) {
            dsiplayTextArea.setText (e.getMessage ());
        }
    }
    public void createTableHelper (String tableType) {
       int isExsitingCust = JOptionPane.showConfirmDialog (this, "Exsiting Customer", "New Table",
               JOptionPane.YES_NO_OPTION);
       try {
        Table table = null;
        User cust = null;
        if (isExsitingCust == JOptionPane.YES_OPTION) {
            int id = getId ();
            cust = this.findCustomer (id);
            if (cust != null) {
                  table = tableFactory (cust);
                  tables.add (table);
                 JOptionPane.showMessageDialog(this, "New table created.");
             } else {
                JOptionPane.showMessageDialog (this, "Customer not found.");
             }
        } else {
            String firstName = getStringName ("Enter first name:");
            String lastName = getStringName ("Enter last name:");
            String phoneNum = getStringName ("Enter phone num:");
            cust = this.customerFactory (tableType, firstName, lastName, phoneNum);
            table = tableFactory (cust);
            tables.add (table);
            JOptionPane.showMessageDialog (this, "New table created.");
        }
        
        setTable (table);
        bar.customers.add ((Customer) cust);
        
       } catch (Exception e) {
           dsiplayTextArea.setText (e.getMessage());
       }
    }
    private void modifyItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyItemButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (currTable == null) {
                throw new Exception ("No Table Selected");
            }
            dsiplayTextArea.setText ("");
            Integer  id = this.getId ();
            String name = this.getStringName ("Enter name:");
            float price = this.getPrice ();
            
            Item item = new Item (name, price);
            item.setId (id);
            
            if (this.modifyItem (item) == true) {
                JOptionPane.showMessageDialog(this, "Item modified");
            } else {
               JOptionPane.showMessageDialog(this, "Item not found.");
            }
        } catch (Exception e) {
            dsiplayTextArea.setText (e.getMessage());
        }
    }//GEN-LAST:event_modifyItemButtonActionPerformed

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        // TODO add your handling code here:
        try {
            if (currTable == null) {
                throw new Exception ("No Table Selected");
            }
            dsiplayTextArea.setText ("");
            Integer  id = this.getId ();
            
            if (this.removeItem (id) == true) {
                JOptionPane.showMessageDialog(this, "Item removed.");
            } else {
               JOptionPane.showMessageDialog(this, "Item not found.");
            }
        } catch (Exception e) {
            dsiplayTextArea.setText (e.getMessage());
        }
    }//GEN-LAST:event_removeItemActionPerformed

    private void printTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTableButtonActionPerformed
        // TODO add your handling code here:
        if (currTable == null) {
            dsiplayTextArea.setText ("No table selected");
            return;
        }
        String tableInfo = currTable.printInfo ();
        dsiplayTextArea.setText (tableInfo + "\n");
    }//GEN-LAST:event_printTableButtonActionPerformed

    private void applyDiscountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyDiscountButtonActionPerformed
        // TODO add your handling code here:
        String idText = JOptionPane.showInputDialog (this, "Enter table Id: ");
        
        if (!validator.isValidId(idText)) {
            JOptionPane.showMessageDialog (this, "Invalid id.");
            return;
        }
        
        int id = Integer.parseInt (idText);
        Table table = this.findTable (id);
        if (table != null) {
            StringBuffer buff = new StringBuffer ();
            float discountedPrice = (float)table.getTotalAmount() * (float)0.9;
            buff.append ("Tablid ID: " + table.getId () + "\n");
            buff.append ("\t10% Discount applied to $" + table.getTotalAmount () + "\n");
            buff.append ("\tNew price: $" + discountedPrice + "\n");
            dsiplayTextArea.setText (buff.toString ());
            table.setNetAmount(discountedPrice);
        } else {
            JOptionPane.showMessageDialog(this, "Table not found.");
        }
        
    }//GEN-LAST:event_applyDiscountButtonActionPerformed
    public User findCustomer (int id) {
        for (Customer c : bar.customers) {
            User u = (User) c;
            if (u.getId() == id) {
                return u;
            }
        }
            return null;
    }    // Update hourss worked
    public void logOutUser () {
        long logOutTime = logInTime.getTime () - new Date ().getTime();
        // Convert milisecs to hours
        int hoursWorked = (int) logOutTime / 1000 / 60;
        
        Waiter currWaiter = (Waiter) (currUser);
        currWaiter.setWage ((float) 8.00);
        currWaiter.setHoursWorked(currWaiter.getHoursWorked() + hoursWorked);
    }
    public boolean validateManagerRole () {
        if (!currUser.isManager ()) {
            JOptionPane.showMessageDialog(this, "Requires manager role.");
            return false;
        } else {
            JOptionPane.showMessageDialog(this, "Manager role validated.");
        }
        return true;
    }
    private void displayTablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTablesButtonActionPerformed
        // TODO add your handling code here:
        StringBuffer buff = new StringBuffer ();
        buff.append ("List of current tables being served: \n");
        if (tables.size () > 0) {
            for (Table t : tables) {
                buff.append ("\t" + t.getId () + "\n");
            }
        } else {
            buff.append ("\tNo tables to display.");
        }
        buff.append ("\nList of current tables served: \n");
        if ( bar.servedTables.size () > 0) {
            for (Table t : bar.servedTables) {
                buff.append ("\t" + t.getId () + "\n");
            }
        } else {
            buff.append ("\tNo tables to display.");
        }
       dsiplayTextArea.setText (buff.toString ());
    }//GEN-LAST:event_displayTablesButtonActionPerformed

    private void numTablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTablesButtonActionPerformed
        // TODO add your handling code here:
        if (validateManagerRole ()) {
            String idText = JOptionPane.showInputDialog (this, "Enter Waiter ID: ");
            if (!validator.isValidId (idText)) {
                JOptionPane.showMessageDialog (this, "Invalid id.");
                return;
            }
            int id = Integer.parseInt (idText);
            int num = this.calcNumberTablesWaited(id);
            if (num < 0) {
                JOptionPane.showMessageDialog (this, "Id not found.");
                return;
            }
            StringBuffer str = new StringBuffer ();
            str.append ("Waiter: " + id + "\n");
            str.append ("   #Tables: " + num + "\n");
            dsiplayTextArea.setText(str.toString ());
        } else {
            return;
        }
    }//GEN-LAST:event_numTablesButtonActionPerformed

    private void totalTablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTablesButtonActionPerformed
        // TODO add your handling code here:
       if (validateManagerRole ()) {
            int num = this.calcTotalNumberTablesWaited();
         
            StringBuffer str = new StringBuffer ();
            str.append ("All Waiters: " + "\n");
            str.append ("   #Tables: " + num + "\n");
            dsiplayTextArea.setText(str.toString ());
        } else {
            return;
        }
    }//GEN-LAST:event_totalTablesButtonActionPerformed

    // Value of tables waited
    private void tablesWaitedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablesWaitedButtonActionPerformed
        // TODO add your handling code here:
        if (validateManagerRole ()) {
            String idText = JOptionPane.showInputDialog (this, "Enter Waiter ID: ");
            if (!validator.isValidId (idText)) {
                JOptionPane.showMessageDialog (this, "Invalid id.");
                return;
            }
            int id = Integer.parseInt (idText);
            float val = this.calcTotalNumberTablesWaited();
           
            StringBuffer str = new StringBuffer ();
            str.append ("Waiter ID: " + id + "\n");
            str.append ("   Total: $" + val + "\n");
            dsiplayTextArea.setText (str.toString());
        } else {
            return;
        }
    }//GEN-LAST:event_tablesWaitedButtonActionPerformed

    private void switchUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchUserMenuItemActionPerformed
        // TODO add your handling code here:
        SwitchUserWindow window = new SwitchUserWindow (this, bar);

        currTable = null;
    }//GEN-LAST:event_switchUserMenuItemActionPerformed

    private void totalCostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCostButtonActionPerformed
        // TODO add your handling code here:
        if (validateManagerRole ()) {
            float val = this.calcTotalValOfTablesWaited();
           
            StringBuffer str = new StringBuffer ();
            str.append ("All Tables: " + "\n");
            str.append ("   Total: $" + val + "\n");
            dsiplayTextArea.setText (str.toString());
        } else {
            return;
        }
    }//GEN-LAST:event_totalCostButtonActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
        // Display total cost
        int option = JOptionPane.showConfirmDialog (this, "Are you want to process table?"
                + "This will remove table from active list.", "Confirm Table Processing", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dsiplayTextArea.setText (currTable.calculatePayment ());
            bar.servedTables.add (currTable);
            tables.remove (currTable);
            this.tableIdLabel.setText ("Table ID: None Selected");
        } else {
            dsiplayTextArea.setText ("Table not processed.");
        }
    }//GEN-LAST:event_paymentActionPerformed

    private void displayCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCustomersButtonActionPerformed
        // TODO add your handling code here:
        String s = "";
        for (Customer c : bar.customers) {
            User u = (User) c;
            s += u.printInfo ();
        }
        this.dsiplayTextArea.setText (s);
    }//GEN-LAST:event_displayCustomersButtonActionPerformed

    private void summaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryButtonActionPerformed
        // TODO add your handling code here:
        // Calculate the summary for tables and its items
        Summary s = new Summary ();
        for (Table t : tables) {
            t.updateSummary (s);
        }
        // Calculate the summary for customers
        for (Customer c : bar.customers) {
            c.updateSummary (s);
        }
        dsiplayTextArea.setText (s.toString ());
    }//GEN-LAST:event_summaryButtonActionPerformed

    private void employeeSalariesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeSalariesButtonActionPerformed
        // TODO add your handling code here:
        StringBuffer str = new StringBuffer ();
        str.append ("Salaries for waiters: \n");
        for (User u : bar.employees) {
            if (!u.isManager ()) {
               str.append ("Waiter ID: " + u.getId() + "\n");
               str.append (((Payable) u).calculatePayment () + "\n\n");
            }
        }
        dsiplayTextArea.setText (str.toString ());
    }//GEN-LAST:event_employeeSalariesButtonActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add your handling code here:
        logOutUser ();
        setVisible (false);
        dispose ();
        System.exit (0);
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private String dataFileName;
    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
        // TODO add your handling code here:
        ObjectInputStream ins;
        try {
            ins = new ObjectInputStream (new FileInputStream (dataFileName));
            bar bar3;
            bar bar2 = (bar) ins.readObject();
            bar = bar2;
            tables = bar.currentTables;
            ins.close ();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//outs.
    }//GEN-LAST:event_loadMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
        ObjectOutputStream outs;
        try {
            outs = new ObjectOutputStream (new FileOutputStream (dataFileName));
            outs.writeObject(bar);
            outs.close ();
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void employeeCustMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeCustMItemActionPerformed
        // TODO add your handling code here:
        createTableHelper ("Employee");
    }//GEN-LAST:event_employeeCustMItemActionPerformed

    private void regularItemMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularItemMItemActionPerformed
        // TODO add your handling code here:
        addItemHelper ("Regular");
    }//GEN-LAST:event_regularItemMItemActionPerformed

    private void chrisDiscountMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chrisDiscountMItemActionPerformed
        // TODO add your handling code here:
        addItemHelper ("Christmas Discounted");
    }//GEN-LAST:event_chrisDiscountMItemActionPerformed

    private void discountItemMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountItemMItemActionPerformed
        // TODO add your handling code here:
        addItemHelper ("Discounted");
    }//GEN-LAST:event_discountItemMItemActionPerformed

    private void itemsInOfferMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsInOfferMItemActionPerformed
        // TODO add your handling code here:
        addItemHelper ("Item in Offer");
    }//GEN-LAST:event_itemsInOfferMItemActionPerformed

    private void loyalCustMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loyalCustMItemActionPerformed
        // TODO add your handling code here:
        createTableHelper ("Loyal");
    }//GEN-LAST:event_loyalCustMItemActionPerformed

    private void newCustMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustMItemActionPerformed
        // TODO add your handling code here:
        createTableHelper ("Simple");
    }//GEN-LAST:event_newCustMItemActionPerformed

    private void companyCustMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyCustMItemActionPerformed
        // TODO add your handling code here:
        createTableHelper ("Company");
    }//GEN-LAST:event_companyCustMItemActionPerformed
    public void setUser (User user) {
        if (!user.isManager ()) {
            waiterIdLabel.setText ("Waiter ID: " + user.getId ());
        } else {
            waiterIdLabel.setText ("Manager");
        }
        tableIdLabel.setText ("Table ID: None Selected.");
    }
    
    public void setTable (Table table) {
        currTable = table;
        tableIdLabel.setText ("Table ID: " + table.getId ());
    }
    
    public void updateTimeLabel () {
        Date time = new Date ();
        SimpleDateFormat frmt = new SimpleDateFormat ("hh:mm a");
        String frmStr = frmt.format (time, new StringBuffer(), new FieldPosition (0)).toString ();
        timeLabel.setText (frmStr);
    }
    public void init() {
        logInTime = new Date ();
        updateTimeLabel ();
        int delay = 60000; // millisecs
        Timer timer = new Timer (delay, new ActionListener () {
            public void actionPerformed (ActionEvent evt) {
                updateTimeLabel ();
            }
        });
        timer.start ();
        tables = bar.currentTables;
        addr = "15112 lfsj fstrests";
        vat = (float) 0.05;
        buyN = 2;
        payN = 1;
        currUser = login.getUser ();
        dataFileName =  "data.ser";
        setUser (currUser);
        Calendar cal = new GregorianCalendar ();
        String timestamp = cal.get (Calendar.HOUR) + ":" + cal.get (Calendar.MINUTE) + " " +  
                (cal.get (Calendar.AM_PM) == 1 ? "PM" : "AM");
        if (currUser.isManager ()) {
            dsiplayTextArea.setText("Manager looged in at " + timestamp + "\n");   
        } else {
            dsiplayTextArea.setText("Waiter " + currUser.getId () + " looged in at " + timestamp + "\n");
        }
        
        this.setVisible(true);
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }
    
    /* Stored info */
    ArrayList<Table> tables;

    /* Settings */
    Table currTable;
    User currUser;
    User currCustomer;
    String addr;
    float vat;
    // Discounts
    float discount = (float)0.1;
    float normalItemDiscount = (float) 0.05;
    float christmasItemDiscount = (float) 0.10;
    float itemInOffer = 3;  // buy two get three
    int buyN;
    int payN;
    Date logInTime;
  
    
    /* Session information */
    
    // Curretn waiter that is logged in
    String waiter; 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyDiscountButton;
    private javax.swing.JMenuItem chrisDiscountMItem;
    private javax.swing.JMenuItem companyCustMItem;
    private javax.swing.JMenuItem discountItemMItem;
    private javax.swing.JButton displayCustomersButton;
    private javax.swing.JButton displayTablesButton;
    public java.awt.TextArea dsiplayTextArea;
    private javax.swing.JMenuItem employeeCustMItem;
    private javax.swing.JButton employeeSalariesButton;
    private javax.swing.JMenu exitMenuITem;
    private javax.swing.JMenuItem itemsInOfferMItem;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem loyalCustMItem;
    private javax.swing.JButton modifyItemButton;
    private javax.swing.JMenuItem newCustMItem;
    private javax.swing.JButton numTablesButton;
    private javax.swing.JButton payment;
    private javax.swing.JMenuItem regularItemMItem;
    private javax.swing.JButton removeItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem selectTableMenuItem;
    private java.awt.Button summaryButton;
    private javax.swing.JMenuItem switchUserMenuItem;
    private javax.swing.JLabel tableIdLabel;
    private javax.swing.JButton tablesWaitedButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton totalCostButton;
    private javax.swing.JButton totalTablesButton;
    private javax.swing.JLabel waiterIdLabel;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.DbCon;

public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
<<<<<<< HEAD
        getAllSales();
        getAllProduct();
=======
         getAllSales();
         getAllPurchase();
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
    }

    DbCon con = new DbCon();

    PreparedStatement ps;
    String sql = " ";
    ResultSet rs;
<<<<<<< HEAD

    // ProductAll method
    String[] productColumns = {"Product_ID", "Product_Name", "Product_Catagory", "Product_Code"};

    public void getAllProduct() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(productColumns);

        pTable.setModel(model);

        sql = "select * from producttable";

        try {

            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("Product_Id");
                String name = rs.getString("Product_Name");
                String catagory = rs.getString("Product_Catagory");
                String code = rs.getString("Product_Code");

                model.addRow(new Object[]{id, name, catagory, code});
            }
            rs.close();
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

=======
    
    public void reset(){
    
         sellerId.setText(null);
        sellerName.setText(null);
        sellerUnitPrice.setText(null);
        sellerQuantity.setText(null);
        sellerTotalPrice.setText(null);
        sellerDiscount.setText(null);
        sellerActualPrice.setText(null);
        sellerCashReceive.setText(null);
        sellerCashReturn.setText(null);
        sellerDAte.setDate(null);
       
        sellerGender.setSelectedItem(null);
    }
    
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
    // calculate total Price 
    public float getTotalPrice() {

        float unitPrice = Float.parseFloat(sellerUnitPrice.getText().trim());
        float quantity = Float.parseFloat(sellerQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        return totalPrice;
    }

    public float getActualPrice() {
        float discount = 0.0f;
        float totalPrice = getTotalPrice();
        String discountStr = sellerDiscount.getText().trim();

        discount = Float.parseFloat(discountStr);
        float discountamount = totalPrice * discount / 100;

        float actualPrice = totalPrice - discountamount;

        return actualPrice;
    }

    public float getDiscount() {
        return getTotalPrice() - getActualPrice();
    }

    public java.sql.Date convertUtilDateToSqlDate(java.util.Date utilDate) {
        if (utilDate != null) {
            return new java.sql.Date(utilDate.getTime());
        }
        return null;
    }
<<<<<<< HEAD
=======
     
     
      String[] salerColumns = {"Seller_ID", "Seller_Name", "Unit Price", "Quantity", "Total Price", "Discount", "Actual Price"};
       public void getAllSales() {
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

    String[] salerColumns = {"Seler_Name", "Unit Price", "Quantity", "Total Price", "Discount", "Actual Price"};

    public void getAllSales() {

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(salerColumns);

        sellerTable.setModel(model);

        sql = "select * from selertable";

        try {

            ps = con.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

<<<<<<< HEAD
                String Seller_Name = rs.getString("Seler_Name");
=======
                int Seller_ID = rs.getInt("Seller_ID");
                String Seller_Name = rs.getString("Seller_Name");
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
                Float Unit_Price = rs.getFloat("Unit_Price");
                Float Quantity = rs.getFloat("Quantity");
                Float Total_Price = rs.getFloat("Total_Price");
                Float Discount = rs.getFloat("Discount");
                Float Actual_Price = rs.getFloat("Actual_Price");

<<<<<<< HEAD
                model.addRow(new Object[]{Seller_Name, Unit_Price, Quantity, Total_Price, Discount, Actual_Price});
=======
                model.addRow(new Object[]{Seller_ID, Seller_Name, Unit_Price, Quantity, Total_Price, Discount, Actual_Price});
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

            }
            rs.close();
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
   

<<<<<<< HEAD
=======
       
       // purchase getAll Method create
     String [] purchaseColumnNames={"pID", "pName", "pCategory", "pQuantity"};  
    public void getAllPurchase() {
        sql = "select * from purchase";

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(purchaseColumnNames);

        pTable.setModel(model);

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("pID");
                String name = rs.getString("pName");
                String category =rs.getString("pCategory");
                String quantity = rs .getString("pQuantity");

                model.addRow(new Object[]{id, name, category, quantity});
            }

            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        mainMenu = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        procuctManage = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pID = new javax.swing.JTextField();
        pName = new javax.swing.JTextField();
        pCode = new javax.swing.JTextField();
        pCategory = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        pClear = new javax.swing.JButton();
        pSave = new javax.swing.JButton();
        pEdit = new javax.swing.JButton();
        pDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sales = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sellerId = new javax.swing.JTextField();
        sellerQuantity = new javax.swing.JTextField();
        sellerGender = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        sUpdate = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        sellerName = new javax.swing.JTextField();
        sellerUnitPrice = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        sellerActualPrice = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        sellerTotalPrice = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        sellerDiscount = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        sellerCashReturn = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        sellerCashReceive = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        sellerDAte = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        sellerTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        productCategory = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        productStocks = new javax.swing.JPanel();
        productUpdate = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        extra = new javax.swing.JPanel();
        extra_2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 182, 143));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DashBoard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 100));

<<<<<<< HEAD
        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
=======
        jPanel2.setBackground(new java.awt.Color(255, 182, 143));
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Product Update");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 160, 60));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 60));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PURCHASE ");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 60));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SALES");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 60));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Product Category");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 60));

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Product Stocks");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 60));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGap(0, 930, Short.MAX_VALUE)
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

<<<<<<< HEAD
        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 70));
=======
        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 70));
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
<<<<<<< HEAD
=======
                .addGap(0, 0, 0)
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainMenu.addTab("tab1", home);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PURCHASE  MANAGE");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1120, 70));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("PRODUCT ID");
<<<<<<< HEAD
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("PRODUCT NAME");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 30));
=======
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("PURCHASE NAME");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 30));
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("CATEGORY");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
<<<<<<< HEAD
        jLabel8.setText("PRODUCT CODE");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, 30));

        pID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel7.add(pID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 180, 30));

        pName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel7.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 180, 30));

        pCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel7.add(pCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 180, 30));
=======
        jLabel8.setText("QUANTITY");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, 30));

        pID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel7.add(pID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, 30));

        pName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel7.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 170, 30));

        pQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel7.add(pQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 170, 30));
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

        pCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Orange" }));
        pCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
<<<<<<< HEAD
        jPanel7.add(pCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 30));
=======
        jPanel7.add(pCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 170, 30));
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "CATEGORY", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        pTable.setRowHeight(25);
        pTable.setRowMargin(10);
        pTable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(pTable);
        if (pTable.getColumnModel().getColumnCount() > 0) {
            pTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 460, 300));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
<<<<<<< HEAD
        jLabel10.setText("PRODUCT LIST");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 460, 30));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 153, 0));
        jButton7.setText("CLEAR");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 80, 40));

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 153, 0));
        jButton11.setText("P-SAVE");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel7.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 80, 40));

        pUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pUpdate.setForeground(new java.awt.Color(255, 153, 0));
        pUpdate.setText("UPDATE");
        pUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
=======
        jLabel10.setText("PURCHASE  LIST");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 500, 30));

        pClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pClear.setForeground(new java.awt.Color(255, 153, 0));
        pClear.setText("CLEAR");
        pClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(pClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 80, 40));

        pSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pSave.setForeground(new java.awt.Color(255, 153, 0));
        pSave.setText("SAVE");
        pSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pSave.addMouseListener(new java.awt.event.MouseAdapter() {
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSaveMouseClicked(evt);
            }
        });
<<<<<<< HEAD
        jPanel7.add(pUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 90, 40));

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 153, 0));
        jButton13.setText("DELETE");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 90, 40));
=======
        jPanel7.add(pSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 80, 40));

        pEdit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pEdit.setForeground(new java.awt.Color(255, 153, 0));
        pEdit.setText("EDIT");
        pEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pEditMouseClicked(evt);
            }
        });
        jPanel7.add(pEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 80, 40));

        pDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pDelete.setForeground(new java.awt.Color(255, 153, 0));
        pDelete.setText("DELETE");
        pDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(pDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 90, 40));
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 20, 20));

        javax.swing.GroupLayout procuctManageLayout = new javax.swing.GroupLayout(procuctManage);
        procuctManage.setLayout(procuctManageLayout);
        procuctManageLayout.setHorizontalGroup(
            procuctManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
            .addGroup(procuctManageLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
        );
        procuctManageLayout.setVerticalGroup(
            procuctManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procuctManageLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addGap(0, 0, Short.MAX_VALUE))
=======
                .addGap(0, 9, Short.MAX_VALUE))
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
        );

        mainMenu.addTab("tab2", procuctManage);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SELLER MANAGE");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("SELLER ID");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("SELLER NAME");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("UNIT PRICE");

        sellerId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        sellerQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        sellerQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellerQuantityFocusLost(evt);
            }
        });

        sellerGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerGender.setForeground(new java.awt.Color(255, 153, 0));
        sellerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        sellerGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SELLER LIST");

        clearbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 153, 0));
        clearbtn.setText("CLEAR");
        clearbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 153, 0));
        addbtn.setText("ADD");
        addbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        sUpdate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        sUpdate.setForeground(new java.awt.Color(255, 153, 0));
        sUpdate.setText("UPDATE");
        sUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sUpdateMouseClicked(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 153, 0));
        deletebtn.setText("DELETE");
        deletebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 153, 0));
        jLabel28.setText("GENDER");

        sellerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        sellerUnitPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerUnitPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        sellerUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellerUnitPriceFocusLost(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 153, 0));
        jLabel29.setText("QUANTITY");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 153, 0));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 153, 0));
        jLabel31.setText("DISCOUNT");

        sellerActualPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerActualPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 153, 0));
        jLabel32.setText("TOTAL PRICE");

        sellerTotalPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerTotalPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 153, 0));
        jLabel33.setText("ACTUAL PRICE");

        sellerDiscount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        sellerDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellerDiscountFocusLost(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 153, 0));
        jLabel34.setText("CASH RETURN");

        sellerCashReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerCashReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 153, 0));
        jLabel35.setText("CASH RECEIVE");

        sellerCashReceive.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellerCashReceive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        sellerCashReceive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellerCashReceiveFocusLost(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 153, 0));
        jLabel36.setText("DATE");

        sellerDAte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        sellerDAte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(sellerTable);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sellerUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sellerId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sellerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                                .addGap(36, 36, 36)
                                .addComponent(editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
=======
                                .addGap(29, 29, 29)
                                .addComponent(sUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
                                .addGap(18, 18, 18)
                                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel35)
                                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel33))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(54, 54, 54)))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sellerCashReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(sellerQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sellerDiscount, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sellerActualPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sellerCashReceive)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sellerTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sellerGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sellerDAte, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(898, 898, 898))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sellerId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellerDAte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41))
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sellerUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sellerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sellerTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellerDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sellerActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(sellerCashReceive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellerCashReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("X");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, -1, 20));

        javax.swing.GroupLayout salesLayout = new javax.swing.GroupLayout(sales);
        sales.setLayout(salesLayout);
        salesLayout.setHorizontalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        salesLayout.setVerticalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainMenu.addTab("tab3", sales);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CATEGORY MANAGE");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1140, 70));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("CATEGORY ID");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, 40));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 153, 0));
        jLabel22.setText("CATEGORY NAME");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, 50));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 0));
        jLabel23.setText("DISCRIPTION");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 50));

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 153, 0));
        jButton15.setText("CLEAR");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 100, 50));

        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 153, 0));
        jButton16.setText("ADD");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 100, 50));

        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 153, 0));
        jButton17.setText("EDIT");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 100, 50));

        jButton18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 153, 0));
        jButton18.setText("DELETE");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 110, 50));

        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel11.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 260, 40));

        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel11.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 260, 40));

        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel11.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 260, 40));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 390, 390));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CAREGORY LIST");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 410, 40));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 570));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("X");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, 20));

        javax.swing.GroupLayout productCategoryLayout = new javax.swing.GroupLayout(productCategory);
        productCategory.setLayout(productCategoryLayout);
        productCategoryLayout.setHorizontalGroup(
            productCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        productCategoryLayout.setVerticalGroup(
            productCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mainMenu.addTab("tab4", productCategory);

        javax.swing.GroupLayout productStocksLayout = new javax.swing.GroupLayout(productStocks);
        productStocks.setLayout(productStocksLayout);
        productStocksLayout.setHorizontalGroup(
            productStocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        productStocksLayout.setVerticalGroup(
            productStocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        mainMenu.addTab("tab5", productStocks);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("X");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("UPDATE ADMIN");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("PRODUCT ID");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("PRODUCT NAME");

        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 153, 0));
        jButton19.setText("UPDATE");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 153, 0));
        jButton20.setText("CLEAR");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout productUpdateLayout = new javax.swing.GroupLayout(productUpdate);
        productUpdate.setLayout(productUpdateLayout);
        productUpdateLayout.setHorizontalGroup(
            productUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productUpdateLayout.setVerticalGroup(
            productUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainMenu.addTab("tab6", productUpdate);

        javax.swing.GroupLayout extraLayout = new javax.swing.GroupLayout(extra);
        extra.setLayout(extraLayout);
        extraLayout.setHorizontalGroup(
            extraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        extraLayout.setVerticalGroup(
            extraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        mainMenu.addTab("tab7", extra);

        javax.swing.GroupLayout extra_2Layout = new javax.swing.GroupLayout(extra_2);
        extra_2.setLayout(extra_2Layout);
        extra_2Layout.setHorizontalGroup(
            extra_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        extra_2Layout.setVerticalGroup(
            extra_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        mainMenu.addTab("tab8", extra_2);

        jPanel3.add(mainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 920, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        mainMenu.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        mainMenu.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        mainMenu.setSelectedIndex(2);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        mainMenu.setSelectedIndex(3);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        mainMenu.setSelectedIndex(4);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        mainMenu.setSelectedIndex(5);
    }//GEN-LAST:event_jButton1MouseClicked

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked

        sql = "insert into selertable( Seler_Name, Unit_Price, Quantity, Total_Price, Discount,Actual_Price, Cash_Receive, Cash_Return, Date,  Seler_Gender) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, sellerName.getText());
            ps.setFloat(2, Float.parseFloat(sellerUnitPrice.getText()));
            ps.setFloat(3, Float.parseFloat(sellerQuantity.getText()));
            ps.setFloat(4, getTotalPrice());
            ps.setFloat(5, getDiscount());
            ps.setFloat(6, getActualPrice());
            ps.setFloat(7, Float.parseFloat(sellerCashReceive.getText()));
            ps.setFloat(8, Float.parseFloat(sellerCashReturn.getText()));
            ps.setDate(9, convertUtilDateToSqlDate(sellerDAte.getDate()));
//            ps.setString(10, sellerPassword.getText());
            ps.setString(10, sellerGender.getSelectedItem().toString());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Data Successfully");
<<<<<<< HEAD
            getAllSales();

=======
             getAllSales();
             reset();
            
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addbtnMouseClicked

    private void sellerUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellerUnitPriceFocusLost
        // TODO add your handling code heret
        try {
            if (!sellerUnitPrice.getText().trim().isEmpty()) {
                // your code when the text field is not empty
            } else {
                JOptionPane.showMessageDialog(rootPane, "Unit Price cannot be Empty");
                sellerUnitPrice.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error occurred :" + e.getMessage());
        }
    }//GEN-LAST:event_sellerUnitPriceFocusLost

    private void sellerQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellerQuantityFocusLost
        // TODO add your handling code here:
        try {
            if (sellerUnitPrice.getText().trim().isEmpty()) {
                sellerUnitPrice.requestFocus();
            } else if (!sellerQuantity.getText().trim().isEmpty()) {
                sellerTotalPrice.setText(getTotalPrice() + " ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Quantity can not be Empty");
                sellerQuantity.requestFocus();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error :" + e.getMessage());
        }
    }//GEN-LAST:event_sellerQuantityFocusLost

    private void sellerDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellerDiscountFocusLost
        // TODO add your handling code here:
        float actualPrice = getActualPrice();
        sellerActualPrice.setText(actualPrice + " ");
    }//GEN-LAST:event_sellerDiscountFocusLost

    private void sellerCashReceiveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellerCashReceiveFocusLost
        // TODO add your handling code here:
        float actualPrice = getActualPrice();
        float cashReceive = Float.parseFloat(sellerCashReceive.getText().trim());
        float cashReturn = actualPrice - cashReceive;
        sellerCashReturn.setText(cashReturn + " ");
    }//GEN-LAST:event_sellerCashReceiveFocusLost

<<<<<<< HEAD
    private void pUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUpdateMouseClicked
//        sql ="update producttable set Product_Name=?, Product_Category=?, Product_Code=? where Product_ID=?";
//        
//        try {
//            ps=con.getCon().prepareStatement(sql);
//            
//            ps.setString(1, pName.getText().trim());
//            ps.setString(2, pCategory.getSelectedItem().toString());
//            ps.setString(3, pCode.getText().trim());
//            ps.setInt(4, Integer.parseInt(pID.getText().trim()));
//            
//            ps.executeUpdate();
//            ps.close();
//            con.getCon().close();
//            
//            JOptionPane.showMessageDialog(rootPane, "Product is Updated");
//           
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane, "Product Not Update");
//            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_pUpdateMouseClicked
=======
    private void pEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEditMouseClicked
        // TODO add your handling code here:
        
        sql ="update purchase set  pName=?, pCategory=? where pQuantity=?, pId=?";
        
        
        
      
    }//GEN-LAST:event_pEditMouseClicked
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

    private void sUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sUpdateMouseClicked
        // TODO add your handling code here:
                sql = "update salertable set Seller_Name=?, Unit_Price=?, Quantity=?, Total_Price=?, Discount=?, Actual_Price=? where Seller_ID =?";
        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setString(1, sellerName.getText().trim());
            ps.setFloat(2, Float.parseFloat(sellerUnitPrice.getText().trim()));
            ps.setFloat(3, Float.parseFloat(sellerQuantity.getText().trim()));
            ps.setFloat(4, Float.parseFloat(sellerTotalPrice.getText().trim()));
            ps.setFloat(5, Float.parseFloat(sellerDiscount.getText().trim()));
            ps.setFloat(6, Float.parseFloat(sellerActualPrice.getText().trim()));
            ps.setInt(7, Integer.parseInt(sellerId.getText().toString()));
            

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Data Updated");
            reset();
            getAllSales();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data not Update");

            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_sUpdateMouseClicked
    // table to field data pass method
    private void sellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerTableMouseClicked
        // TODO add your handling code here:
<<<<<<< HEAD


    }//GEN-LAST:event_editbtnMouseClicked
=======
        
        int rowIndex = sellerTable.getSelectedRow();

        //int roll=tblStudent.getModel().getValueAt(rowIndex, 0).toString();
        String Seller_ID = sellerTable.getModel().getValueAt(rowIndex, 0).toString();
        String Seller_Name = sellerTable.getModel().getValueAt(rowIndex, 1).toString();
        String unit_Price =sellerTable .getModel().getValueAt(rowIndex, 2).toString();
        String Quantity = sellerTable.getModel().getValueAt(rowIndex, 3).toString();
        String Total_Price = sellerTable.getModel().getValueAt(rowIndex, 4).toString();
        String Discount = sellerTable.getModel().getValueAt(rowIndex, 5).toString();
        String Actual_Price = sellerTable.getModel().getValueAt(rowIndex, 6).toString();

        sellerId.setText(Seller_ID);
        sellerName.setText(Seller_Name);
        sellerUnitPrice.setText(unit_Price);
        sellerQuantity.setText(Quantity);
        sellerTotalPrice.setText(Total_Price);
        sellerDiscount.setText(Discount);
        sellerActualPrice.setText(Actual_Price);
    }//GEN-LAST:event_sellerTableMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
         sql="delete from salertable where Seller_ID=?";
        try {
            ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(sellerId.getText()));
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Data Deleted");
            reset();
            getAllSales();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data not Delete");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletebtnMouseClicked
    
    // reset method
    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        // TODO add your handling code here:
        
        reset();
    }//GEN-LAST:event_clearbtnMouseClicked

    private void pSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSaveMouseClicked
        // TODO add your handling code here:
        
        sql = "insert into purchase ( pName, pCategory, pQuantity) values (?,?,?)";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            ps.setString(1, pName.getText());
            ps.setString(2, pCategory.getSelectedItem().toString());
            ps.setInt(3, Integer.parseInt(pQuantity.getText().trim()));
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Purchase Data is Save");
//            reset();
            getAllPurchase();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Purchase Data Not Save");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pSaveMouseClicked
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b

    
    // Product method save botton create
    
    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        
        sql = "insert into producttable (Product_ID, Product_Name, Product_Category, Product_Code) values (?,?,?,?)";
        
        try {
            con.getCon().prepareStatement(sql);
            
            ps.setInt(1, Integer.parseInt(pID.getText().trim()));
            ps.setString(2, pName.getText().trim());
            ps.setString(3, pCategory.getSelectedItem().toString());
            ps.setString(4, pCode.getText().trim());
            
            ps.executeUpdate();
           
            
            JOptionPane.showMessageDialog(rootPane, "Product is Saved");
            getAllProduct();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Product Not Save");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11MouseClicked

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JPanel extra;
    private javax.swing.JPanel extra_2;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTabbedPane mainMenu;
    private javax.swing.JComboBox<String> pCategory;
<<<<<<< HEAD
    private javax.swing.JTextField pCode;
    private javax.swing.JTextField pID;
    private javax.swing.JTextField pName;
    private javax.swing.JTable pTable;
    private javax.swing.JButton pUpdate;
=======
    private javax.swing.JButton pClear;
    private javax.swing.JButton pDelete;
    private javax.swing.JButton pEdit;
    private javax.swing.JTextField pID;
    private javax.swing.JTextField pName;
    private javax.swing.JTextField pQuantity;
    private javax.swing.JButton pSave;
    private javax.swing.JTable pTable;
>>>>>>> 3e75df8fdb0b4676224633bbfa270e2dc98c5d6b
    private javax.swing.JPanel procuctManage;
    private javax.swing.JPanel productCategory;
    private javax.swing.JPanel productStocks;
    private javax.swing.JPanel productUpdate;
    private javax.swing.JButton sUpdate;
    private javax.swing.JPanel sales;
    private javax.swing.JTextField sellerActualPrice;
    private javax.swing.JTextField sellerCashReceive;
    private javax.swing.JTextField sellerCashReturn;
    private com.toedter.calendar.JDateChooser sellerDAte;
    private javax.swing.JTextField sellerDiscount;
    private javax.swing.JComboBox<String> sellerGender;
    private javax.swing.JTextField sellerId;
    private javax.swing.JTextField sellerName;
    private javax.swing.JTextField sellerQuantity;
    private javax.swing.JTable sellerTable;
    private javax.swing.JTextField sellerTotalPrice;
    private javax.swing.JTextField sellerUnitPrice;
    // End of variables declaration//GEN-END:variables
}

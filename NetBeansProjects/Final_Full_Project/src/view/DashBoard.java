/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.DbCon;

/**
 *
 * @author USER
 */
public class DashBoard extends javax.swing.JFrame {
    
    DbCon con = new DbCon();
    PreparedStatement ps;
    String sql =" ";
    ResultSet rs;

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        getAllSales();
        getAllProduct();
    }

    // Reset method create
    public void reset(){
    sName.setText(null);
    sUnitPrice.setText(null);
    sQuantity.setText(null);
    sTotalPrice.setText(null);
    sDiscount.setText(null);
    sActualPrice.setText(null);
    sCashReceive.setText(null);
    sCashReturn.setText(null);
    sDate.setDate(null);
    
    }
    
    // product method create
    
    String [] productColumns = {"Product_ID", "Product_Name", "Product_Category", "Product_Code"};
    public void getAllProduct(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(productColumns);
        pTable.setModel(model);
        sql="select * from product";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("Product_ID");
                String pName = rs.getString("Product_Name");
                String pCategory = rs.getString("Product_Category");
                String pCode = rs.getString("Product_Code");
                
                model.addRow(new Object[]{id, pName, pCategory,pCode});
            }
            
            ps.close();
            con.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // table e data show method
    String[] selerColumns = {"Seler_ID", "Seler_Name", "Unit_Price", "Quantity", "Total_Price", "Discount", "Actual_Price"};
    public void getAllSales() {
         sql = "select * from selertable";
         
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(selerColumns);

        sTable.setModel(model);

        try {

            ps = con.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                int Seler_ID = rs.getInt("Seler_ID");
                String Seler_Name = rs.getString("Seler_Name");
                Float Unit_Price = rs.getFloat("Unit_Price");
                Float Quantity = rs.getFloat("Quantity");
                Float Total_Price = rs.getFloat("Total_Price");
                Float Discount = rs.getFloat("Discount");
                Float Actual_Price = rs.getFloat("Actual_Price");
 
                model.addRow(new Object[]{Seler_ID, Seler_Name, Unit_Price, Quantity, Total_Price, Discount, Actual_Price});
            }

            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // calculate total Price 
    public float getTotalPrice() {

        float unitPrice = Float.parseFloat(sUnitPrice.getText().trim());
        float quantity = Float.parseFloat(sQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        return totalPrice;
    }

    // Actual Price method
    public float getActualPrice() {
        
        float totalPrice = getTotalPrice();
        float discount =Float.parseFloat(sDiscount.getText().trim());

        
        float discountamount =(totalPrice * discount / 100);

        float actualPrice = totalPrice - discountamount;

        return actualPrice;
    }
    
    // Discount method
    public float getDiscount() {
        return getTotalPrice() - getActualPrice();
    }

     // Date method
    public java.sql.Date convertUtilDateToSqlDate(java.util.Date utilDate) {
        if (utilDate != null) {
            return new java.sql.Date(utilDate.getTime());
        }
        return null;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dSales = new javax.swing.JButton();
        dHome = new javax.swing.JButton();
        dReport = new javax.swing.JButton();
        dPurchase = new javax.swing.JButton();
        dStock = new javax.swing.JButton();
        dProduct = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        mainmenu = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        sales = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sQuantity = new javax.swing.JTextField();
        sUnitPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sDiscount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sTotalPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sActualPrice = new javax.swing.JTextField();
        sDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        sTable = new javax.swing.JTable();
        sReset = new javax.swing.JButton();
        sSave = new javax.swing.JButton();
        sDelete = new javax.swing.JButton();
        sUpdate = new javax.swing.JButton();
        sCashReceive = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sCashReturn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        purchase = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        stock = new javax.swing.JPanel();
        product = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        pCode = new javax.swing.JTextField();
        pID = new javax.swing.JTextField();
        pName = new javax.swing.JTextField();
        pReset = new javax.swing.JButton();
        pSave = new javax.swing.JButton();
        pUpdate = new javax.swing.JButton();
        pDelete = new javax.swing.JButton();
        pCategory = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        report = new javax.swing.JPanel();
        extra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 205, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dSales.setBackground(new java.awt.Color(153, 153, 153));
        dSales.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dSales.setText("SALES");
        dSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dSalesMouseExited(evt);
            }
        });
        dSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dSalesActionPerformed(evt);
            }
        });
        jPanel2.add(dSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 50));

        dHome.setBackground(new java.awt.Color(153, 153, 153));
        dHome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dHome.setText("HOME");
        dHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dHomeMouseExited(evt);
            }
        });
        dHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dHomeActionPerformed(evt);
            }
        });
        jPanel2.add(dHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 50));

        dReport.setBackground(new java.awt.Color(153, 153, 153));
        dReport.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dReport.setText("REPORT");
        dReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dReportMouseExited(evt);
            }
        });
        dReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dReportActionPerformed(evt);
            }
        });
        jPanel2.add(dReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 160, 50));

        dPurchase.setBackground(new java.awt.Color(153, 153, 153));
        dPurchase.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dPurchase.setText("PURCHASE");
        dPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dPurchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dPurchaseMouseExited(evt);
            }
        });
        dPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPurchaseActionPerformed(evt);
            }
        });
        jPanel2.add(dPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 50));

        dStock.setBackground(new java.awt.Color(153, 153, 153));
        dStock.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dStock.setText("STOCK");
        dStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dStockMouseExited(evt);
            }
        });
        dStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dStockActionPerformed(evt);
            }
        });
        jPanel2.add(dStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 50));

        dProduct.setBackground(new java.awt.Color(153, 153, 153));
        dProduct.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dProduct.setText("PRODUCT");
        dProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dProductMouseExited(evt);
            }
        });
        dProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dProductActionPerformed(evt);
            }
        });
        jPanel2.add(dProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 160, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 660));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBORD");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1020, 110));

        jPanel4.setBackground(new java.awt.Color(102, 250, 247));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab1", home);

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SALES");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Sale ID");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        sID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(sID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Sale Name");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 30));

        sName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 200, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 30));

        sQuantity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sQuantityFocusLost(evt);
            }
        });
        jPanel5.add(sQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, -1));

        sUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sUnitPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sUnitPriceFocusLost(evt);
            }
        });
        jPanel5.add(sUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Unit Price");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 30));

        sDiscount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sDiscount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sDiscountFocusLost(evt);
            }
        });
        jPanel5.add(sDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 200, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Total Price");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        sTotalPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sTotalPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(sTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 200, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Discount");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Date");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 120, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Actual Price");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 110, 30));

        sActualPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sActualPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(sActualPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 200, -1));

        sDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(sDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 200, -1));

        sTable.setModel(new javax.swing.table.DefaultTableModel(
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
        sTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 600, 300));

        sReset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sReset.setText("RESET");
        sReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sResetMouseClicked(evt);
            }
        });
        jPanel5.add(sReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 80, 30));

        sSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sSave.setText("SAVE");
        sSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sSaveMouseClicked(evt);
            }
        });
        jPanel5.add(sSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 90, 30));

        sDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sDelete.setText("DELETE");
        sDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sDeleteMouseClicked(evt);
            }
        });
        jPanel5.add(sDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 90, 30));

        sUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sUpdate.setText("UPDATE");
        sUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sUpdateMouseClicked(evt);
            }
        });
        jPanel5.add(sUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 100, 30));

        sCashReceive.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sCashReceive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sCashReceive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sCashReceiveFocusLost(evt);
            }
        });
        jPanel5.add(sCashReceive, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 200, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Cash Receive");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 30));

        sCashReturn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sCashReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(sCashReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 200, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Cash Return");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 30));

        javax.swing.GroupLayout salesLayout = new javax.swing.GroupLayout(sales);
        sales.setLayout(salesLayout);
        salesLayout.setHorizontalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        salesLayout.setVerticalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab2", sales);

        jPanel7.setBackground(new java.awt.Color(153, 250, 218));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 250, 218));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PURCHASE");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        javax.swing.GroupLayout purchaseLayout = new javax.swing.GroupLayout(purchase);
        purchase.setLayout(purchaseLayout);
        purchaseLayout.setHorizontalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        purchaseLayout.setVerticalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab3", purchase);

        javax.swing.GroupLayout stockLayout = new javax.swing.GroupLayout(stock);
        stock.setLayout(stockLayout);
        stockLayout.setHorizontalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        stockLayout.setVerticalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab4", stock);

        jPanel9.setBackground(new java.awt.Color(153, 255, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(153, 255, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PRODUCT");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Product ID");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 50));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Product ID");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 50));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Product Name");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 50));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("Category");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 50));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Product Code");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 150, 50));

        pCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(pCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 190, 40));

        pID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(pID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 190, 40));

        pName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 190, 40));

        pReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pReset.setText("RESET");
        jPanel9.add(pReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 110, 40));

        pSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pSave.setText("SAVE");
        pSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSaveMouseClicked(evt);
            }
        });
        jPanel9.add(pSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 110, 40));

        pUpdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pUpdate.setText("UPDATE");
        jPanel9.add(pUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 130, 40));

        pDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pDelete.setText("DELETE");
        pDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDeleteMouseClicked(evt);
            }
        });
        jPanel9.add(pDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 130, 40));

        pCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mouse", "Key Board", "Monitor", "Printer", "Mother Board", "Ram", "Rom" }));
        jPanel9.add(pCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 190, 40));

        pTable.setModel(new javax.swing.table.DefaultTableModel(
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
        pTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pTable);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 500, 280));

        javax.swing.GroupLayout productLayout = new javax.swing.GroupLayout(product);
        product.setLayout(productLayout);
        productLayout.setHorizontalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productLayout.setVerticalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab5", product);

        javax.swing.GroupLayout reportLayout = new javax.swing.GroupLayout(report);
        report.setLayout(reportLayout);
        reportLayout.setHorizontalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        reportLayout.setVerticalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab6", report);

        javax.swing.GroupLayout extraLayout = new javax.swing.GroupLayout(extra);
        extra.setLayout(extraLayout);
        extraLayout.setHorizontalGroup(
            extraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        extraLayout.setVerticalGroup(
            extraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab7", extra);

        jPanel4.add(mainmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1020, 580));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 1020, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dHomeActionPerformed
        // TODO add your handling code here:
        mainmenu.setSelectedIndex(0);
    }//GEN-LAST:event_dHomeActionPerformed

    private void dSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dSalesActionPerformed
        // TODO add your handling code here:
        mainmenu.setSelectedIndex(1);
    }//GEN-LAST:event_dSalesActionPerformed

    private void dPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPurchaseActionPerformed
        // TODO add your handling code here:
        mainmenu.setSelectedIndex(2);
    }//GEN-LAST:event_dPurchaseActionPerformed

    private void dStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dStockActionPerformed
        // TODO add your handling code here:
        mainmenu.setSelectedIndex(3);
    }//GEN-LAST:event_dStockActionPerformed

    private void dProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dProductActionPerformed
        // TODO add your handling code here:
        mainmenu.setSelectedIndex(4);
    }//GEN-LAST:event_dProductActionPerformed

    private void dReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dReportActionPerformed
        // TODO add your handling code here:
        mainmenu.setSelectedIndex(5);
    }//GEN-LAST:event_dReportActionPerformed
    
    // unit price focus lost
    private void sUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sUnitPriceFocusLost
        // TODO add your handling code here:
                try {
            if (!sUnitPrice.getText().trim().isEmpty()) {
                // your code when the text field is not empty
            } else {
                JOptionPane.showMessageDialog(rootPane, "Unit Price cannot be Empty");
                sUnitPrice.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error occurred :" + e.getMessage());
        }
    }//GEN-LAST:event_sUnitPriceFocusLost

    // quantity price focus lost
    private void sQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sQuantityFocusLost
        // TODO add your handling code here:
          try {
            if (sUnitPrice.getText().trim().isEmpty()) {
                sUnitPrice.requestFocus();
            } else if (!sQuantity.getText().trim().isEmpty()) {
                sTotalPrice.setText(getTotalPrice() + " ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Quantity can not be Empty");
                sQuantity.requestFocus();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error :" + e.getMessage());
        }
    }//GEN-LAST:event_sQuantityFocusLost

    // discount fosus lost
    private void sDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sDiscountFocusLost
        // TODO add your handling code here:
        float actualPrice = getActualPrice();
        sActualPrice.setText(actualPrice + " ");
    }//GEN-LAST:event_sDiscountFocusLost

    // Save method create
    private void sSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sSaveMouseClicked
        // TODO add your handling code here:
        sql = "insert into selertable( Seler_Name, Unit_Price, Quantity, Total_Price, Discount, Actual_Price,  Cash_Receive, Cash_Return, Date) values (?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.getCon().prepareStatement(sql);
            
            ps.setString(1, sName.getText());
            ps.setFloat(2, Float.parseFloat(sUnitPrice.getText()));
            ps.setFloat(3, Float.parseFloat(sQuantity.getText()));
            ps.setFloat(4, getTotalPrice());
            ps.setFloat(5, getDiscount());
            ps.setFloat(6, getActualPrice()); 
            ps.setFloat(7, Float.parseFloat(sCashReceive.getText()));
            ps.setFloat(8, Float.parseFloat(sCashReturn.getText()));
            ps.setDate(9, convertUtilDateToSqlDate(sDate.getDate()));
            
           
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Data Successfully");
            reset();
            getAllSales();
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data Not Successfully");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sSaveMouseClicked

    
    private void sDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sDeleteMouseClicked
        // TODO add your handling code here:
        sql="delete from selertable where Seler_ID=?";
        try {
            ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(sID.getText()));
            
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
    }//GEN-LAST:event_sDeleteMouseClicked

    // UPdate method create
    private void sUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sUpdateMouseClicked
        // TODO add your handling code here:
         sql = "update selertable set Seler_Name=?, Unit_price=?, Quantity=?, Total_Price=?, Discount=?, Actual_Price=? where Seler_ID=?";
        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setString(1, sName.getText().trim());
            ps.setFloat(2, Float.parseFloat(sUnitPrice.getText().trim()));
            ps.setFloat(3, Float.parseFloat(sQuantity.getText().trim()));
            ps.setFloat(4, Float.parseFloat(sTotalPrice.getText().trim()));
            ps.setFloat(5, Float.parseFloat(sDiscount.getText().trim()));
            ps.setFloat(6, Float.parseFloat(sActualPrice.getText().trim()));
            ps.setInt(7, Integer.parseInt(sID.getText().toString()));

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

    private void sCashReceiveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sCashReceiveFocusLost
        // TODO add your handling code here:
         float actualPrice = getActualPrice();
        float cashReceive = Float.parseFloat(sCashReceive.getText().trim());
        float cashReturn = actualPrice - cashReceive;
        sCashReturn.setText(cashReturn + " ");
    
    }//GEN-LAST:event_sCashReceiveFocusLost

    private void sTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sTableMouseClicked
        // TODO add your handling code here:
        
         int rowIndex = sTable.getSelectedRow();

        //int roll=tblStudent.getModel().getValueAt(rowIndex, 0).toString();
        String Seller_ID = sTable.getModel().getValueAt(rowIndex, 0).toString();
        String Seller_Name = sTable.getModel().getValueAt(rowIndex, 1).toString();
        String unit_Price =sTable .getModel().getValueAt(rowIndex, 2).toString();
        String Quantity = sTable.getModel().getValueAt(rowIndex, 3).toString();
        String Total_Price = sTable.getModel().getValueAt(rowIndex, 4).toString();
        String Discount = sTable.getModel().getValueAt(rowIndex, 5).toString();
        String Actual_Price = sTable.getModel().getValueAt(rowIndex, 6).toString();

        sID.setText(Seller_ID);
        sName.setText(Seller_Name);
        sUnitPrice.setText(unit_Price);
        sQuantity.setText(Quantity);
        sTotalPrice.setText(Total_Price);
        sDiscount.setText(Discount);
        sActualPrice.setText(Actual_Price);
    
    }//GEN-LAST:event_sTableMouseClicked

    private void sResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sResetMouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_sResetMouseClicked

    private void dHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dHomeMouseEntered
        // TODO add your handling code here:
        dHome.setBackground(new Color(153,250,218));
    }//GEN-LAST:event_dHomeMouseEntered

    private void dHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dHomeMouseExited
        // TODO add your handling code here:
        dHome.setBackground(Color.WHITE);
  
    }//GEN-LAST:event_dHomeMouseExited

    private void dSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dSalesMouseEntered
        // TODO add your handling code here:
        dSales.setBackground(new Color(153,250,218));
    }//GEN-LAST:event_dSalesMouseEntered

    private void dSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dSalesMouseExited
        // TODO add your handling code here:
        dSales.setBackground(Color.WHITE);
    }//GEN-LAST:event_dSalesMouseExited

    private void dPurchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPurchaseMouseEntered
        // TODO add your handling code here:
        dPurchase.setBackground(new Color(153,250,218));
    }//GEN-LAST:event_dPurchaseMouseEntered

    private void dPurchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPurchaseMouseExited
        // TODO add your handling code here:
        dPurchase.setBackground(Color.WHITE);
    }//GEN-LAST:event_dPurchaseMouseExited

    private void dStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dStockMouseEntered
        // TODO add your handling code here:
        dStock.setBackground(new Color(153,250,218));
    }//GEN-LAST:event_dStockMouseEntered

    private void dStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dStockMouseExited
        // TODO add your handling code here:
        dStock.setBackground(Color.WHITE);
    }//GEN-LAST:event_dStockMouseExited

    private void dProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dProductMouseEntered
        // TODO add your handling code here:
        dProduct.setBackground(new Color(153,250,218));
    }//GEN-LAST:event_dProductMouseEntered

    private void dProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dProductMouseExited
        // TODO add your handling code here:
        dProduct.setBackground(Color.WHITE);
    }//GEN-LAST:event_dProductMouseExited

    private void dReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dReportMouseEntered
        // TODO add your handling code here:
       dReport.setBackground(new Color(153,250,218)); 
       
    }//GEN-LAST:event_dReportMouseEntered

    private void dReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dReportMouseExited
        // TODO add your handling code here:
        dReport.setBackground(Color.WHITE);
    }//GEN-LAST:event_dReportMouseExited

    private void pSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSaveMouseClicked
        // TODO add your handling code here:
        sql ="insert into product (Product_Name, Product_Category, Product_Code) values (?,?,?)";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            
            ps.setString(1, pName.getText().trim());
            ps.setString(2, pCategory.getSelectedItem().toString());
            ps.setString(3, pCode.getText().trim());
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Product is Save");
            getAllProduct();
            reset();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Product is Not Save");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pSaveMouseClicked

    private void pTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = pTable.getSelectedRow();

        String id = pTable.getModel().getValueAt(rowIndex, 0).toString();
        String Name = pTable.getModel().getValueAt(rowIndex, 1).toString();
        String Category =pTable .getModel().getValueAt(rowIndex, 2).toString();
        String Code = pTable.getModel().getValueAt(rowIndex, 3).toString();
        
        pID.setText(id);
        pName.setText(Name);
        pCategory.setSelectedItem(Category);
        pCode.setText(Code);
       
    }//GEN-LAST:event_pTableMouseClicked

    private void pDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDeleteMouseClicked
        // TODO add your handling code here:
        sql = " delete from product where Product_ID=?";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            
            ps.setInt(1, Integer.parseInt(pID.getText().trim()));
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Product is Delete");
            reset();
            getAllProduct();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Product is Not Delete");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pDeleteMouseClicked


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
    private javax.swing.JButton dHome;
    private javax.swing.JButton dProduct;
    private javax.swing.JButton dPurchase;
    private javax.swing.JButton dReport;
    private javax.swing.JButton dSales;
    private javax.swing.JButton dStock;
    private javax.swing.JPanel extra;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane mainmenu;
    private javax.swing.JComboBox<String> pCategory;
    private javax.swing.JTextField pCode;
    private javax.swing.JButton pDelete;
    private javax.swing.JTextField pID;
    private javax.swing.JTextField pName;
    private javax.swing.JButton pReset;
    private javax.swing.JButton pSave;
    private javax.swing.JTable pTable;
    private javax.swing.JButton pUpdate;
    private javax.swing.JPanel product;
    private javax.swing.JPanel purchase;
    private javax.swing.JPanel report;
    private javax.swing.JTextField sActualPrice;
    private javax.swing.JTextField sCashReceive;
    private javax.swing.JTextField sCashReturn;
    private com.toedter.calendar.JDateChooser sDate;
    private javax.swing.JButton sDelete;
    private javax.swing.JTextField sDiscount;
    private javax.swing.JTextField sID;
    private javax.swing.JTextField sName;
    private javax.swing.JTextField sQuantity;
    private javax.swing.JButton sReset;
    private javax.swing.JButton sSave;
    private javax.swing.JTable sTable;
    private javax.swing.JTextField sTotalPrice;
    private javax.swing.JTextField sUnitPrice;
    private javax.swing.JButton sUpdate;
    private javax.swing.JPanel sales;
    private javax.swing.JPanel stock;
    // End of variables declaration//GEN-END:variables
}

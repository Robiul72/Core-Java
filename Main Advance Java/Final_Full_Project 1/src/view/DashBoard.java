/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    String sql = " ";
    ResultSet rs;
    static String ppName = " ";  // product table name field declear
    
    static Float sttFloat =0.00f;
    static String sttName = " ";

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        getAllSales();
        getAllProduct();
        getPurchaseComboName();
        getAllPurchase();
        getSelesComboName();
        getAllStockTable();

    }

    // Reset sales method create
    public void reset() {
        sName.setSelectedItem(null);
        sUnitPrice.setText(null);
        sQuantity.setText(null);
        sTotalPrice.setText(null);
        sDiscount.setText(null);
        sActualPrice.setText(null);
        sCashReceive.setText(null);
        sCashReturn.setText(null);
        sID.setText(null);
        sDate.setDate(null);
    }

    


    // table e data show method****************
    String[] selerColumns = {"Seler_ID", "Seler_Name", "Unit_Price", "Quantity", "Total_Price", "Discount", "Actual_Price", "Cash_Receive", "Cash_Return", "Date"};

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
                Float cash_Receive = rs.getFloat("Cash_Receive");
                Float cash_Return = rs.getFloat("Cash_Return");
                java.util.Date date = rs.getDate("Date");
                
                

                model.addRow(new Object[]{Seler_ID, Seler_Name, Unit_Price, Quantity, Total_Price, Discount, Actual_Price, cash_Receive, cash_Return, date});
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
        float discount = Float.parseFloat(sDiscount.getText().trim());

        float discountamount = (totalPrice * discount / 100);

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
        dReport = new javax.swing.JButton();
        dHome = new javax.swing.JButton();
        dPurchase = new javax.swing.JButton();
        dStock = new javax.swing.JButton();
        dProduct = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
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
        sDate = new com.toedter.calendar.JDateChooser();
        sName = new javax.swing.JComboBox<>();
        purchase = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        prID = new javax.swing.JTextField();
        prUnitPrice = new javax.swing.JTextField();
        prCompanyName = new javax.swing.JTextField();
        prQuantity = new javax.swing.JTextField();
        prTotalPrice = new javax.swing.JTextField();
        PrCashPay = new javax.swing.JTextField();
        prDueAmount = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        prTable = new javax.swing.JTable();
        prReset = new javax.swing.JButton();
        prSave = new javax.swing.JButton();
        prUpdate = new javax.swing.JButton();
        prDelete = new javax.swing.JButton();
        prName = new javax.swing.JComboBox<>();
        prDate = new com.toedter.calendar.JDateChooser();
        stock = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        stQuantity = new javax.swing.JTextField();
        stID = new javax.swing.JTextField();
        stName = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        stTable = new javax.swing.JTable();
        jPanel39 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        stDate = new com.toedter.calendar.JDateChooser();
        stReset = new javax.swing.JButton();
        stSave = new javax.swing.JButton();
        stDelete = new javax.swing.JButton();
        stUpdate = new javax.swing.JButton();
        product = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
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
        jPanel19 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assit/mini logo.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 140, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 660));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("F.P.S.M");
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

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SALES");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 70));

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
        sReset.setBorder(null);
        sReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sResetMouseExited(evt);
            }
        });
        jPanel5.add(sReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 80, 30));

        sSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sSave.setText("SAVE");
        sSave.setBorder(null);
        sSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sSaveMouseExited(evt);
            }
        });
        jPanel5.add(sSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 90, 30));

        sDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sDelete.setText("DELETE");
        sDelete.setBorder(null);
        sDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sDeleteMouseExited(evt);
            }
        });
        jPanel5.add(sDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 90, 30));

        sUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sUpdate.setText("UPDATE");
        sUpdate.setBorder(null);
        sUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sUpdateMouseExited(evt);
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
        jPanel5.add(sDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 210, -1));

        sName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 200, -1));

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

        jPanel11.setBackground(new java.awt.Color(153, 255, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Date");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 30));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Purchase ID");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 30));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Purchase Name");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 30));

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel30.setText("Unit Price");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 30));

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setText("Company Name");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 30));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel31.setText("Quantity");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 30));

        jPanel26.setBackground(new java.awt.Color(153, 255, 204));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Purchase");
        jPanel26.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1040, 60));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 30));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 30));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 30));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 30));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, 30));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jPanel11.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1050, 70));

        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel33.setText("Due Amount");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 30));

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel32.setText("Total Price");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, 30));

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Cash Pay");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 30));
        jPanel11.add(prID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 150, 30));

        prUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prUnitPriceFocusLost(evt);
            }
        });
        jPanel11.add(prUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 150, 30));
        jPanel11.add(prCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 150, 30));

        prQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prQuantityFocusLost(evt);
            }
        });
        jPanel11.add(prQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 150, 30));
        jPanel11.add(prTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 150, 30));

        PrCashPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PrCashPayFocusLost(evt);
            }
        });
        jPanel11.add(PrCashPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, 30));
        jPanel11.add(prDueAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 150, 30));

        prTable.setModel(new javax.swing.table.DefaultTableModel(
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
        prTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(prTable);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 600, 340));

        prReset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prReset.setText("Reset");
        prReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prResetMouseClicked(evt);
            }
        });
        jPanel11.add(prReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));

        prSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prSave.setText("Save");
        prSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prSaveMouseClicked(evt);
            }
        });
        jPanel11.add(prSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 80, -1));

        prUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prUpdate.setText("Update");
        prUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prUpdateMouseClicked(evt);
            }
        });
        jPanel11.add(prUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        prDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prDelete.setText("Delete");
        prDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prDeleteMouseClicked(evt);
            }
        });
        jPanel11.add(prDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        jPanel11.add(prName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, 30));
        jPanel11.add(prDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 150, 30));

        javax.swing.GroupLayout purchaseLayout = new javax.swing.GroupLayout(purchase);
        purchase.setLayout(purchaseLayout);
        purchaseLayout.setHorizontalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        purchaseLayout.setVerticalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab3", purchase);

        jPanel13.setBackground(new java.awt.Color(153, 255, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Stock");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 80));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText("Stock ID");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 160, 40));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setText("Stock Name");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 160, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setText("Stock Quantity");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 160, -1));

        stQuantity.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel13.add(stQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, 40));

        stID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel13.add(stID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 200, 40));

        stName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel13.add(stName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 40));

        stTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(stTable);

        jPanel13.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 500, 240));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("Stock Date");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));
        jPanel13.add(stDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 200, 40));

        stReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        stReset.setText("Reset");
        jPanel13.add(stReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 110, 40));

        stSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        stSave.setText("Save");
        jPanel13.add(stSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 110, 40));

        stDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        stDelete.setText("Delete");
        jPanel13.add(stDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 110, 40));

        stUpdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        stUpdate.setText("Update");
        jPanel13.add(stUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 110, 40));

        javax.swing.GroupLayout stockLayout = new javax.swing.GroupLayout(stock);
        stock.setLayout(stockLayout);
        stockLayout.setHorizontalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        stockLayout.setVerticalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        mainmenu.addTab("tab4", stock);

        jPanel9.setBackground(new java.awt.Color(153, 255, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(153, 255, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PRODUCT");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Product ID");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 40));

        pCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(pCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 190, 40));

        pID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(pID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 190, 40));

        pName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel9.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 190, 40));

        pReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pReset.setText("RESET");
        pReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pResetMouseExited(evt);
            }
        });
        jPanel9.add(pReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 110, 40));

        pSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pSave.setText("SAVE");
        pSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pSaveMouseExited(evt);
            }
        });
        jPanel9.add(pSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 110, 40));

        pUpdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pUpdate.setText("UPDATE");
        pUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pUpdateMouseExited(evt);
            }
        });
        jPanel9.add(pUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 130, 40));

        pDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pDelete.setText("DELETE");
        pDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pDeleteMouseExited(evt);
            }
        });
        jPanel9.add(pDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 130, 40));

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

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 520, 280));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Product ID");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Product ID");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Product ID");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Product ID");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel9.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, 40));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Product Name");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Category");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 40));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Product Code");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        javax.swing.GroupLayout productLayout = new javax.swing.GroupLayout(product);
        product.setLayout(productLayout);
        productLayout.setHorizontalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productLayout.setVerticalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
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
        getAllStockTable();
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

    // colponick stock table create 
    String[] stockColumns = {"stockID", "stockName", "stockQuantity"};

    public void getAllStockTable() {
        sql = "select * from stock";

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(stockColumns);

        stTable.setModel(model);

        try {
            ps = con.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                int ID = rs.getInt("stockID");
                String name = rs.getString("stockName");
                Float quantity = rs.getFloat("stockQuantity");
                model.addRow(new Object[]{ID, name, quantity});
            }

            ps.executeQuery();
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // stock method create Seles add contain to stock
    public void getAllStockToSeles() {
        sql = "update stock set stockQuantity = stockQuantity - ? where stockName=?";

        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setFloat(1, sttFloat);

//            ps.setString(2, sName.getSelectedItem().toString());
            ps.setString(2, sttName);   

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(prCompanyName, "Stock Data is Update and Decreament");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(prCompanyName, "Stock Data is Not Update and Decreament");

            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Seles combo field er method
    public void getSelesComboName() {

        sql = "select Product_Name from product";

        sName.removeAllItems();

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Product_Name");
                sName.addItem(name);
            }

            ps.close();
            rs.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Save method create
    private void sSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sSaveMouseClicked
        // TODO add your handling code here:
        sql = "insert into selertable( Seler_Name, Unit_Price, Quantity, Total_Price, Discount, Actual_Price,  Cash_Receive, Cash_Return, Date) values (?,?,?,?,?,?,?,?,?)";
        
        sttFloat = Float.parseFloat(sQuantity.getText().toString());
        sttName = sName.getSelectedItem().toString();
        
        try {
            ps = con.getCon().prepareStatement(sql);

//            ps.setString(1, sName.getSelectedItem().toString());
            ps.setString(1, sttName);
            ps.setFloat(2, Float.parseFloat(sUnitPrice.getText()));
//            ps.setFloat(3, Float.parseFloat(sQuantity.getText()));
            ps.setFloat(3, sttFloat);
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
            
            getAllStockTable();
        
//            addProductToStock(); // stock tabel theke

            getAllStockToSeles();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data Not Successfully");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sSaveMouseClicked


    private void sDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sDeleteMouseClicked
        // TODO add your handling code here:
        sql = "delete from selertable where Seler_ID=?";
        try {
            ps = con.getCon().prepareStatement(sql);
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

            ps.setString(1, sName.getSelectedItem().toString());
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
        String unit_Price = sTable.getModel().getValueAt(rowIndex, 2).toString();
        String Quantity = sTable.getModel().getValueAt(rowIndex, 3).toString();
        String Total_Price = sTable.getModel().getValueAt(rowIndex, 4).toString();
        String Discount = sTable.getModel().getValueAt(rowIndex, 5).toString();
        String Actual_Price = sTable.getModel().getValueAt(rowIndex, 6).toString();
        String cash_Receive = sTable.getModel().getValueAt(rowIndex, 7).toString();
        String cash_Return = sTable.getModel().getValueAt(rowIndex, 8).toString();
        String date = sTable.getModel().getValueAt(rowIndex, 9).toString();
        

        sID.setText(Seller_ID);
        sName.setSelectedItem(Seller_Name);
        sUnitPrice.setText(unit_Price);
        sQuantity.setText(Quantity);
        sTotalPrice.setText(Total_Price);
        sDiscount.setText(Discount);
        sActualPrice.setText(Actual_Price);
        sCashReceive.setText(cash_Receive);
        sCashReturn.setText(cash_Return);
        sDate.setDate(convertStringToDate(date));

    }//GEN-LAST:event_sTableMouseClicked

    private void sResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sResetMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Sales is Reset");
        reset();
    }//GEN-LAST:event_sResetMouseClicked

    private void dHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dHomeMouseEntered
        // TODO add your handling code here:
        dHome.setBackground(new Color(153, 250, 218));
    }//GEN-LAST:event_dHomeMouseEntered

    private void dHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dHomeMouseExited
        // TODO add your handling code here:
        dHome.setBackground(Color.WHITE);

    }//GEN-LAST:event_dHomeMouseExited

    private void dSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dSalesMouseEntered
        // TODO add your handling code here:
        dSales.setBackground(new Color(153, 250, 218));
    }//GEN-LAST:event_dSalesMouseEntered

    private void dSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dSalesMouseExited
        // TODO add your handling code here:
        dSales.setBackground(Color.WHITE);
    }//GEN-LAST:event_dSalesMouseExited

    private void dPurchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPurchaseMouseEntered
        // TODO add your handling code here:
        dPurchase.setBackground(new Color(153, 250, 218));
    }//GEN-LAST:event_dPurchaseMouseEntered

    private void dPurchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPurchaseMouseExited
        // TODO add your handling code here:
        dPurchase.setBackground(Color.WHITE);
    }//GEN-LAST:event_dPurchaseMouseExited

    private void dStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dStockMouseEntered
        // TODO add your handling code here:
        dStock.setBackground(new Color(153, 250, 218));
    }//GEN-LAST:event_dStockMouseEntered

    private void dStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dStockMouseExited
        // TODO add your handling code here:
        dStock.setBackground(Color.WHITE);
    }//GEN-LAST:event_dStockMouseExited

    private void dProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dProductMouseEntered
        // TODO add your handling code here:
        dProduct.setBackground(new Color(153, 250, 218));
    }//GEN-LAST:event_dProductMouseEntered

    private void dProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dProductMouseExited
        // TODO add your handling code here:
        dProduct.setBackground(Color.WHITE);
    }//GEN-LAST:event_dProductMouseExited

    private void dReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dReportMouseEntered
        // TODO add your handling code here:
        dReport.setBackground(new Color(153, 250, 218));

    }//GEN-LAST:event_dReportMouseEntered

    private void dReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dReportMouseExited
        // TODO add your handling code here:
        dReport.setBackground(Color.WHITE);
    }//GEN-LAST:event_dReportMouseExited

    
    
    
    
    
    // stock method create purchase add contain to stock*************
    public void getStock() {
        sql = "update stock set stockQuantity = stockQuantity + ? where stockName=?";

        try {
            ps = con.getCon().prepareStatement(sql);
            
            ps.setFloat(1, Float.parseFloat(prQuantity.getText().trim()));
            ps.setString(2, prName.getSelectedItem().toString());

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(prCompanyName, "Stock Data is Update and Increament");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(prCompanyName, "Stock Data is Not Update and Increament");

            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
    
    
    // purchase barar jonno method*************
    public void addProductToStock() {
        sql = " insert into stock (stockName, stockQuantity) values (?,?)";

        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setString(1, ppName);

            ps.setFloat(2, 0.0f);

            ps.executeUpdate();

            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
    // Product method Reset****************
    public void reset1() {

        pName.setText(null);
        pCategory.setSelectedItem(null);
        pCode.setText(null);

    }

    
    
    
        // product method create******************
    String[] productColumns = {"Product_Id", "Product_Name", "Product_Category", "Product_Code"};

    public void getAllProduct() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(productColumns);
        pTable.setModel(model);
        sql = "select * from product";

        try {
            ps = con.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("Product_Id");
                String pName = rs.getString("Product_Name");
                String pCategory = rs.getString("Product_Category");
                String pCode = rs.getString("Product_Code");

                model.addRow(new Object[]{id, pName, pCategory, pCode});
            }

            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    // product insert play*************
    private void pSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSaveMouseClicked
        // TODO add your handling code here:
        sql = "insert into product (Product_Name, Product_Category, Product_Code) values (?,?,?)";

        ppName = pName.getText().trim();   // variable theke data asche
        
        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setString(1, pName.getText().trim());
            ps.setString(2, pCategory.getSelectedItem().toString());
            ps.setString(3, pCode.getText().trim());

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Product is Save");

            getAllProduct();  // create method theke asche
            reset1();
            getPurchaseComboName(); // pruchase method theke asche
            addProductToStock();  // data pass korar jonno method
            getSelesComboName();
            getAllStockTable();    // stock table

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
        String Category = pTable.getModel().getValueAt(rowIndex, 2).toString();
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
            ps = con.getCon().prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(pID.getText().trim()));

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Product is Delete");
            reset1();
            getAllProduct();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Product is Not Delete");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pDeleteMouseClicked

    private void pUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUpdateMouseClicked
        // TODO add your handling code here:
        sql = "update product set  Product_Name=?, Product_Category=?, Product_Code=? where Product_Id=?";

        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setString(1, pName.getText());
            ps.setString(2, pCategory.getSelectedItem().toString());
            ps.setString(3, pCode.getText().trim());
            ps.setInt(4, Integer.parseInt(pID.getText()));

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Product is Update");
            getAllProduct();
            reset1();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Product is Not Update");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pUpdateMouseClicked

    private void pResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pResetMouseClicked
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(rootPane, "Product is Reset");
        reset1();
    }//GEN-LAST:event_pResetMouseClicked

    private void sSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sSaveMouseEntered
        // TODO add your handling code here:
        sSave.setBackground(new Color(153, 250, 2));
    }//GEN-LAST:event_sSaveMouseEntered

    private void sSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sSaveMouseExited
        // TODO add your handling code here:
        sSave.setBackground(Color.WHITE);
    }//GEN-LAST:event_sSaveMouseExited

    private void sDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sDeleteMouseEntered
        // TODO add your handling code here:
        sDelete.setBackground(Color.red);
    }//GEN-LAST:event_sDeleteMouseEntered

    private void sDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sDeleteMouseExited
        // TODO add your handling code here:
        sDelete.setBackground(Color.WHITE);
    }//GEN-LAST:event_sDeleteMouseExited

    private void sUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sUpdateMouseEntered
        // TODO add your handling code here:
        sUpdate.setBackground(Color.CYAN);
    }//GEN-LAST:event_sUpdateMouseEntered

    private void sUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sUpdateMouseExited
        // TODO add your handling code here:
        sUpdate.setBackground(Color.WHITE);
    }//GEN-LAST:event_sUpdateMouseExited

    private void sResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sResetMouseEntered
        // TODO add your handling code here:
        sReset.setBackground(Color.PINK);
    }//GEN-LAST:event_sResetMouseEntered

    private void sResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sResetMouseExited
        // TODO add your handling code here:
        sReset.setBackground(Color.WHITE);
    }//GEN-LAST:event_sResetMouseExited

    // product method botton color change
    private void pSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSaveMouseEntered
        // TODO add your handling code here:
        pSave.setBackground(new Color(153, 250, 2));

    }//GEN-LAST:event_pSaveMouseEntered

    private void pSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSaveMouseExited
        // TODO add your handling code here:
        pSave.setBackground(Color.WHITE);
    }//GEN-LAST:event_pSaveMouseExited

    private void pUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUpdateMouseEntered
        // TODO add your handling code here:
        pUpdate.setBackground(Color.CYAN);
    }//GEN-LAST:event_pUpdateMouseEntered

    private void pUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUpdateMouseExited
        // TODO add your handling code here:
        pUpdate.setBackground(Color.WHITE);
    }//GEN-LAST:event_pUpdateMouseExited

    private void pDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDeleteMouseEntered
        // TODO add your handling code here:
        pDelete.setBackground(Color.red);
    }//GEN-LAST:event_pDeleteMouseEntered

    private void pDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDeleteMouseExited
        // TODO add your handling code here:
        pDelete.setBackground(Color.WHITE);
    }//GEN-LAST:event_pDeleteMouseExited

    private void pResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pResetMouseEntered
        // TODO add your handling code here:
        pReset.setBackground(Color.PINK);
    }//GEN-LAST:event_pResetMouseEntered

    private void pResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pResetMouseExited
        // TODO add your handling code here:
        pReset.setBackground(Color.WHITE);
    }//GEN-LAST:event_pResetMouseExited

    // purchase combo field er method
    public void getPurchaseComboName() {

        sql = "select Product_Name from product";
        prName.removeAllItems();

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Product_Name");
                prName.addItem(name);
            }

            ps.close();
            rs.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    // purchase table calculate  ************* 
    public float getTotalPurchase() {
        float pUnitPrice = Float.parseFloat(prUnitPrice.getText().trim());
        float pQuantity = Float.parseFloat(prQuantity.getText().trim());

        float pTotalPrice = pUnitPrice * pQuantity;

        return pTotalPrice;
    }

    // purchase Table calponic table create**********
    String[] purchaseColumns = {"purchaseID", "purchaseName",  "purchaseUnitPrice", "purchaseQuantity", "purchaseTotalPrice", "purchaseCashPay", "purchaseDueAmount", "purchaseDate"};

    public void getAllPurchase() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(purchaseColumns);
        prTable.setModel(model);

        sql = "select * from purchase";

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("purchaseID");
                String name = rs.getString("purchaseName");
//                String company = rs.getString("purchaseCompanyName");
                float unitPrice = rs.getFloat("purchaseUnitPrice");
                float quantity = rs.getFloat("purchaseQuantity");
                
                float totalPrice = rs.getFloat("purchaseTotalPrice");
                float cashPay = rs.getFloat("purchaseCashPay");
                float dueAmount = rs.getFloat("purchaseDueAmount");
                java.util.Date date = rs.getDate("purchaseDate");

                model.addRow(new Object[]{id, name,  unitPrice, quantity, totalPrice, cashPay, dueAmount, date});
            }

            ps.executeQuery();
            rs.close();
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // purchase method create play
    private void prSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prSaveMouseClicked
        // TODO add your handling code here:

        sql = "insert into purchase (purchaseName, purchaseQuantity, purchaseUnitPrice, purchaseDate) values (?,?,?,?)";

        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setString(1, prName.getSelectedItem().toString());
            ps.setFloat(2, Float.parseFloat(prQuantity.getText()));
            ps.setFloat(3, Float.parseFloat(prUnitPrice.getText()));
            ps.setDate(4, convertUtilDateToSqlDate(prDate.getDate()));

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(prCompanyName, "Purchase Data is Save");
            getStock();
            getAllPurchase();
            getAllStockTable();  // stock table
            prReset();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(prCompanyName, "Purchase Data is not Save");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_prSaveMouseClicked

    private void prUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prUnitPriceFocusLost
        // TODO add your handling code here:
        try {
            if (!prUnitPrice.getText().trim().isEmpty()) {
                // your code when the text field is not empty
            } else {
                JOptionPane.showMessageDialog(rootPane, "Unit Price cannot be Empty");
                prUnitPrice.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error occurred :" + e.getMessage());
        }
    }//GEN-LAST:event_prUnitPriceFocusLost

    private void prQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prQuantityFocusLost
        // TODO add your handling code here:
        try {
            if (prUnitPrice.getText().trim().isEmpty()) {
                sUnitPrice.requestFocus();
            } else if (!prQuantity.getText().trim().isEmpty()) {
                prTotalPrice.setText(getTotalPurchase() + " ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Quantity can not be Empty");
                prQuantity.requestFocus();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error :" + e.getMessage());
        }
    }//GEN-LAST:event_prQuantityFocusLost

    private void PrCashPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrCashPayFocusLost
        // TODO add your handling code here:

        float prActualPrice = getTotalPurchase();
        float prCashReceive = Float.parseFloat(PrCashPay.getText().trim());
        float prCashReturn = prActualPrice - prCashReceive;
        prDueAmount.setText(prCashReturn + " ");


    }//GEN-LAST:event_PrCashPayFocusLost

    // purchase Update create
    private void prUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prUpdateMouseClicked
        // TODO add your handling code here:
        
        sql = "update purchase set purchaseName=?,  purchaseUnitPrice=?, purchaseQuantity=?, purchaseTotalPrice=?, purchaseCashPay=?, purchaseDueAmount=?, purchaseDate=? where purchaseID=? ";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            
            
            ps.setString(1, prName.getSelectedItem().toString());
//            ps.setString(2, prCompanyName.getText());
            ps.setFloat(3, Float.parseFloat(prUnitPrice.getText()));
            ps.setFloat(4, Float.parseFloat(prQuantity.getText()));
            ps.setFloat(5, Float.parseFloat(prTotalPrice.getText()));
            ps.setFloat(6, Float.parseFloat(PrCashPay.getText()));
            ps.setFloat(7, Float.parseFloat(prDueAmount.getText()));
            ps.setDate(8, convertUtilDateToSqlDate(prDate.getDate()));
            ps.setInt(9, Integer.parseInt(prID.getText()));
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(prCompanyName, "Purchase Data is Update");
            getAllPurchase();
            prReset();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(prCompanyName, "Purchase Data is not Update");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_prUpdateMouseClicked

    // Date method create **************
    public java.util.Date convertStringToDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       
        try {
            return dateFormat.parse(dateString);
        } 
        catch (ParseException e) {
            System.err.println("Parsing failed: " + e.getMessage());
            return null; // Handle the exception by returning null
        }
    }

    
    // ********* Table to field Data pass******
    
    private void prTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prTableMouseClicked
        // TODO add your handling code here:
        int row = prTable.getSelectedRow();

        String id = prTable.getModel().getValueAt(row, 0).toString();
        String name = prTable.getModel().getValueAt(row, 1).toString();
    //    String companyName = prTable.getModel().getValueAt(row, 2).toString();
        
        String unitPrice = prTable.getModel().getValueAt(row, 2).toString();
        String quantity = prTable.getModel().getValueAt(row, 3).toString();
        String totalPrice = prTable.getModel().getValueAt(row, 4).toString();
        String cashPay = prTable.getModel().getValueAt(row, 5).toString();
        String dueAmount = prTable.getModel().getValueAt(row, 6).toString();
        String date = prTable.getModel().getValueAt(row, 7).toString();

        prID.setText(id);
        prName.setSelectedItem(name);
    //    prCompanyName.setText(companyName);
        prUnitPrice.setText(quantity);
        prQuantity.setText(unitPrice);
        prTotalPrice.setText(totalPrice);
        PrCashPay.setText(cashPay);
        prDueAmount.setText(dueAmount);
        prDate.setDate(convertStringToDate(date));
        
    }//GEN-LAST:event_prTableMouseClicked

    private void prDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prDeleteMouseClicked
        // TODO add your handling code here:
        
        sql="delete from purchase where purchaseID=?";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            
            ps.setInt(1, Integer.parseInt(prID.getText()));
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(prCompanyName, "Purchase Data is Delete");
            getAllPurchase();
            prReset();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(prCompanyName, "Purchase Data is Not Delete");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_prDeleteMouseClicked

    // **** Reset method create *************
    
    public void prReset(){
        
        prID.setText(null);
        prName.setSelectedItem(null);
        prCompanyName.setText(null);
        prUnitPrice.setText(null);
        prQuantity.setText(null);
        prTotalPrice.setText(null);
        PrCashPay.setText(null);
        prDueAmount.setText(null);
        prDate.setDate(null);
        
    }
    
    private void prResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prResetMouseClicked
        // TODO add your handling code here:
        prReset();
        
    }//GEN-LAST:event_prResetMouseClicked

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
    private javax.swing.JTextField PrCashPay;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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
    private javax.swing.JTextField prCompanyName;
    private com.toedter.calendar.JDateChooser prDate;
    private javax.swing.JButton prDelete;
    private javax.swing.JTextField prDueAmount;
    private javax.swing.JTextField prID;
    private javax.swing.JComboBox<String> prName;
    private javax.swing.JTextField prQuantity;
    private javax.swing.JButton prReset;
    private javax.swing.JButton prSave;
    private javax.swing.JTable prTable;
    private javax.swing.JTextField prTotalPrice;
    private javax.swing.JTextField prUnitPrice;
    private javax.swing.JButton prUpdate;
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
    private javax.swing.JComboBox<String> sName;
    private javax.swing.JTextField sQuantity;
    private javax.swing.JButton sReset;
    private javax.swing.JButton sSave;
    private javax.swing.JTable sTable;
    private javax.swing.JTextField sTotalPrice;
    private javax.swing.JTextField sUnitPrice;
    private javax.swing.JButton sUpdate;
    private javax.swing.JPanel sales;
    private com.toedter.calendar.JDateChooser stDate;
    private javax.swing.JButton stDelete;
    private javax.swing.JTextField stID;
    private javax.swing.JTextField stName;
    private javax.swing.JTextField stQuantity;
    private javax.swing.JButton stReset;
    private javax.swing.JButton stSave;
    private javax.swing.JTable stTable;
    private javax.swing.JButton stUpdate;
    private javax.swing.JPanel stock;
    // End of variables declaration//GEN-END:variables
}

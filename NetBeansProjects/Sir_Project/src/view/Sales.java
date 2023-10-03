
package view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.DbCon;


public class Sales extends javax.swing.JFrame {
    
    DbCon con = new DbCon();

    PreparedStatement ps;
    String sql = " ";
    ResultSet rs;

    
    

    public Sales() {
        initComponents();
        getAllSales();
    }
    
    // Reset method create
    public void reset(){
    sName.setText(null);
    sUnitPrice.setText(null);
    sQuantity.setText(null);
    sTotalPrice.setText(null);
    sDiscount.setText(null);
    sActualPrice.setText(null);
    sDate.setDate(null);
    sGender.setSelectedItem(null);
    }
    
    // table e data show method
    String[] salerColumns = {"Seler_ID", "sName", "unitPrice", "quantity", "totalPrice", "discount", "actualPrice"};
    public void getAllSales() {

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(salerColumns);

        sTable.setModel(model);

        sql = "select * from sales";

        try {

            ps = con.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("Seler_ID");
                String Seller_Name = rs.getString("sName");
                Float Unit_Price = rs.getFloat("unitPrice");
                Float Quantity = rs.getFloat("quantity");
                Float Total_Price = rs.getFloat("totalPrice");
                Float Discount = rs.getFloat("discount");
                Float Actual_Price = rs.getFloat("actualPrice");
//                 int sID= rs.getInt();
                 
                model.addRow(new Object[]{id, Seller_Name, Unit_Price, Quantity, Total_Price, Discount, Actual_Price});
            }
            rs.close();
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sID = new javax.swing.JTextField();
        sName = new javax.swing.JTextField();
        sQuantity = new javax.swing.JTextField();
        sUnitPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sDiscount = new javax.swing.JTextField();
        sTotalPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sActualPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sTable = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        sDate = new com.toedter.calendar.JDateChooser();
        sGender = new javax.swing.JComboBox<>();
        sReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 217, 172));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jLabel2.setText("S_ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel3.setText("S_Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        sID.setEditable(false);
        jPanel1.add(sID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, -1));
        jPanel1.add(sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 240, -1));

        sQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sQuantityFocusLost(evt);
            }
        });
        jPanel1.add(sQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 240, -1));

        sUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sUnitPriceFocusLost(evt);
            }
        });
        sUnitPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sUnitPriceMouseClicked(evt);
            }
        });
        jPanel1.add(sUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 240, -1));

        jLabel4.setText("Unit Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        sDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sDiscountFocusLost(evt);
            }
        });
        jPanel1.add(sDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 240, -1));
        jPanel1.add(sTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 240, -1));

        jLabel6.setText("Total Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel7.setText("Discount");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));
        jPanel1.add(sActualPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 240, -1));

        jLabel8.setText("Actual Price");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel9.setText("S_Date");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel10.setText("S_Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 750, 310));

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));
        jPanel1.add(sDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 240, -1));

        sGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        jPanel1.add(sGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 260, -1));

        sReset.setText("Reset");
        sReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sResetMouseClicked(evt);
            }
        });
        jPanel1.add(sReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sUnitPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sUnitPriceMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_sUnitPriceMouseClicked
    // Unit Price method
    private void sUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sUnitPriceFocusLost
        // TODO add your handling code here
        
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

    private void sDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sDiscountFocusLost
        // TODO add your handling code here:
        float actualPrice = getActualPrice();
        sActualPrice.setText(actualPrice + " ");
    }//GEN-LAST:event_sDiscountFocusLost

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        sql = "insert into sales( sName, unitPrice, quantity, totalPrice, discount,actualPrice, sDate,  sGender, seler_id) values (?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, sName.getText());
            ps.setFloat(2, Float.parseFloat(sUnitPrice.getText()));
            ps.setFloat(3, Float.parseFloat(sQuantity.getText()));
            ps.setFloat(4, getTotalPrice());
            ps.setFloat(5, getDiscount());
            ps.setFloat(6, getActualPrice());        
            ps.setDate(7, convertUtilDateToSqlDate(sDate.getDate()));
            ps.setString(8, sGender.getSelectedItem().toString());
            ps.setInt(9, Integer.parseInt(sID.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Data Successfully");
            getAllSales();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    // table to row data pass
    private void sTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = sTable.getSelectedRow();
        
        String Name = sTable.getModel().getValueAt(rowIndex, 0).toString();
        String unitPrice = sTable.getModel().getValueAt(rowIndex, 1).toString();
        String quantity = sTable.getModel().getValueAt(rowIndex, 2).toString();
        String totalPrice = sTable.getModel().getValueAt(rowIndex, 3).toString();
        String discount = sTable.getModel().getValueAt(rowIndex, 4).toString();
        String actualPrice = sTable.getModel().getValueAt(rowIndex, 5).toString();
              
        sName.setText(Name);
        sUnitPrice.setText(unitPrice);
        sQuantity.setText(quantity);
        sTotalPrice.setText(totalPrice);
        sDiscount.setText(discount);
        sActualPrice.setText(actualPrice);       
    }//GEN-LAST:event_sTableMouseClicked

    // update method create
    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        
        sql = "update sales set sName=?, unitPrice=?, quantity=?, totalPrice=?, discount=? where actualPrice=?";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            
            ps.setString(1, sName.getText().trim());
            ps.setFloat(2, Float.parseFloat(sUnitPrice.getText().trim()));
            ps.setFloat(3, Float.parseFloat(sQuantity.getText().trim()));
            ps.setFloat(4, Float.parseFloat(sTotalPrice.getText().trim()));
            ps.setFloat(5, Float.parseFloat(sDiscount.getText().trim()));
            ps.setFloat(6, Float.parseFloat(sActualPrice.getText().trim()));
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Sales Data is Update");
            reset();
            getAllSales();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Sales Data Not Update");
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    // Reset method create only reset method call
    private void sResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sResetMouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_sResetMouseClicked

    // Delete method create 
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        sql="delete from sales where sID=?";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(sID.getText()));
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Data is Delete");
            reset();
            getAllSales();
            
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sActualPrice;
    private com.toedter.calendar.JDateChooser sDate;
    private javax.swing.JTextField sDiscount;
    private javax.swing.JComboBox<String> sGender;
    private javax.swing.JTextField sID;
    private javax.swing.JTextField sName;
    private javax.swing.JTextField sQuantity;
    private javax.swing.JButton sReset;
    private javax.swing.JTable sTable;
    private javax.swing.JTextField sTotalPrice;
    private javax.swing.JTextField sUnitPrice;
    // End of variables declaration//GEN-END:variables
}

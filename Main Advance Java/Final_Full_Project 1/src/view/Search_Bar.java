
package view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import util.DbCon;

public class Search_Bar extends javax.swing.JFrame {

    DbCon con = new DbCon();
    PreparedStatement ps;
    String sql = " ";
    ResultSet rs;
    DefaultTableModel model;
    
    public Search_Bar() {
        initComponents();
        setRecordToTable();
    }

    public void setRecordToTable(){
               
        sql = "select * from selertable";
    
        try {
            ps=con.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
             String id = rs.getString("ID");
             String name = rs.getString("Seler_Name");
             float unit = rs.getFloat("Unit_Price");
             float quantity = rs.getFloat("Quantity");
             float total = rs.getFloat("Total_Price");
             
             Object [] search = {id, name, unit, quantity, total};
             model =(DefaultTableModel) searchTable.getModel();
             model.addRow(search);
            
            }
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            Logger.getLogger(Search_Bar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search(String str){
        
        model =(DefaultTableModel) searchTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        searchTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Seler Name", "Unit Ppice", "Quantity", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(searchTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1500, 500));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, -1));

        searchBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });
        jPanel1.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 270, 40));

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

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        String searchName =searchBox.getText();
        search(searchName);
    }//GEN-LAST:event_searchBoxKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Bar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}

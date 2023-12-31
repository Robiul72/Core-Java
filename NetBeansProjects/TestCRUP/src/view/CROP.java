/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author USER
 */
public class CROP extends javax.swing.JFrame {

    /**
     * Creates new form CROP
     */
    public CROP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        txtSubject = new javax.swing.JComboBox<>();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtFemale = new javax.swing.JRadioButton();
        txtWriting = new javax.swing.JCheckBox();
        txtMale = new javax.swing.JRadioButton();
        txtReading = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NAME :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 110, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student From");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 90));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DATE OF BIRTH :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("GENDER :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("SUBJECT :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("HOBBY :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 110, 30));

        txtReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtReset.setText("RESET");
        jPanel1.add(txtReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, -1, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setText("SAVE");
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        txtDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDelete.setText("DELETE");
        jPanel1.add(txtDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        txtTable.setAutoCreateRowSorter(true);
        txtTable.setBackground(new java.awt.Color(204, 204, 204));
        txtTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTable.setModel(new javax.swing.table.DefaultTableModel(
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
        txtTable.setFocusCycleRoot(true);
        txtTable.setGridColor(new java.awt.Color(51, 51, 51));
        txtTable.setInheritsPopupMenu(true);
        txtTable.setName(""); // NOI18N
        txtTable.setRowHeight(30);
        txtTable.setRowMargin(1);
        txtTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        txtTable.setSelectionForeground(new java.awt.Color(255, 255, 51));
        txtTable.setShowGrid(true);
        txtTable.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(txtTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 1070, 360));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 220, -1));

        txtSubject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDD", "JEE", "PHP", "C#", " " }));
        jPanel1.add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 220, 30));
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 220, 30));

        buttonGroup1.add(txtFemale);
        txtFemale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFemale.setText("FEMALE");
        jPanel1.add(txtFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        txtWriting.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtWriting.setText("READING");
        txtWriting.setActionCommand("WRITING");
        jPanel1.add(txtWriting, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, -1, -1));

        buttonGroup1.add(txtMale);
        txtMale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMale.setText("MALE");
        jPanel1.add(txtMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        txtReading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtReading.setText("READING");
        jPanel1.add(txtReading, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("ID :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 30));

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CROP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CROP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CROP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CROP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CROP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JButton txtDelete;
    private javax.swing.JRadioButton txtFemale;
    private javax.swing.JTextField txtId;
    private javax.swing.JRadioButton txtMale;
    private javax.swing.JTextField txtName;
    private javax.swing.JCheckBox txtReading;
    private javax.swing.JButton txtReset;
    private javax.swing.JComboBox<String> txtSubject;
    private javax.swing.JTable txtTable;
    private javax.swing.JCheckBox txtWriting;
    // End of variables declaration//GEN-END:variables
}

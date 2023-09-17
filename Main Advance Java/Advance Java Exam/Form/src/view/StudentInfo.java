/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class StudentInfo extends javax.swing.JFrame {
    
    Table tab= new Table();
    

    /**
     * Creates new form StudentInfo
     */
    public StudentInfo() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMother = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtFather = new javax.swing.JTextField();
        txtFemale = new javax.swing.JRadioButton();
        txtMale = new javax.swing.JRadioButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtSubject = new javax.swing.JComboBox<>();
        txtTravel = new javax.swing.JCheckBox();
        txtRead = new javax.swing.JCheckBox();
        txtwrite = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 229, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Form");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 90));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mother's Name :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Hobby :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Father's Name :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Name :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Gender :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Date of Birth :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Subject :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 500));

        txtMother.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 360, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 360, -1));

        txtFather.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 360, -1));

        buttonGroup1.add(txtFemale);
        txtFemale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFemale.setText("Female");
        txtFemale.setActionCommand("");
        jPanel1.add(txtFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        buttonGroup1.add(txtMale);
        txtMale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMale.setText("Male");
        jPanel1.add(txtMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 360, -1));

        txtSubject.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selected-", "JEE", "DDD", "PHP" }));
        jPanel1.add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 120, 30));

        txtTravel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTravel.setText("Traveling");
        txtTravel.setActionCommand("Traveling");
        txtTravel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        txtRead.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtRead.setText("Reading");
        txtRead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        txtwrite.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtwrite.setText("Writing");
        txtwrite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtwrite, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        String name = txtName.getText();
        String fatherName = txtFather.getText();
        String motherName = txtMother.getText();
        
        String gender = " ";
        if(txtMale.isSelected()){
            gender="Male";
        }
        else if(txtFemale.isSelected()){
            gender= "Female";
            
        }
        else{
            gender="Nothing Selected";
        }
        
        String date = txtDate.getDate().toString();
        String subject =txtSubject.getSelectedItem().toString();
        
        List <String> hobby = new ArrayList<>();
        
        if(txtRead.isSelected()){
            hobby.add("Reading");
        }
        
        if(txtwrite.isSelected()){
            hobby.add("Writing");
        }
        
        if(txtTravel.isSelected()){
            hobby.add("Traveling");
        }
        
        try {
            PrintWriter write = new PrintWriter("Student.txt");
            write.print(" Name          : "+name+"\n");
            write.print(" Father's Name : "+fatherName+"\n");
            write.print(" Mother's Name : "+motherName+"\n");
            write.print(" Gender        : "+gender+"\n");
            write.print(" Date of Birth : "+date+"\n");
            write.print(" Subject       : "+subject+"\n");
            write.print(" Hobby         : "+hobby);
            
            write.close();
            
            dispose();
            tab.setLocationRelativeTo(null);
            tab.setVisible(true);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnSubmitMouseClicked
    
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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtFather;
    private javax.swing.JRadioButton txtFemale;
    private javax.swing.JRadioButton txtMale;
    private javax.swing.JTextField txtMother;
    private javax.swing.JTextField txtName;
    private javax.swing.JCheckBox txtRead;
    private javax.swing.JComboBox<String> txtSubject;
    private javax.swing.JCheckBox txtTravel;
    private javax.swing.JCheckBox txtwrite;
    // End of variables declaration//GEN-END:variables
}

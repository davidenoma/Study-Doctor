/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.ui;

/**
 *
 * @author EVAN
 */
public class RegisterStudent extends javax.swing.JDialog {

    /**
     * Creates new form RegisterStudent
     */
    public RegisterStudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lastName = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txt_OtherName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_DateOfBirh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Class = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Country = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_PhoneNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register a new Student");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        lastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastName.setText("Last Name");
        getContentPane().add(lastName);
        lastName.setBounds(20, 150, 83, 22);

        firstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstName.setText("First Name");
        getContentPane().add(firstName);
        firstName.setBounds(20, 210, 84, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Other Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 250, 95, 22);

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtLastName);
        txtLastName.setBounds(170, 150, 440, 28);

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtFirstName);
        txtFirstName.setBounds(170, 200, 440, 28);

        txt_OtherName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_OtherName);
        txt_OtherName.setBounds(170, 250, 440, 28);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("UserName");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 300, 80, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 350, 74, 22);

        txt_UserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_UserName);
        txt_UserName.setBounds(170, 300, 440, 28);

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_Password);
        txt_Password.setBounds(170, 340, 440, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Date Of Birth");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 390, 104, 22);

        txt_DateOfBirh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_DateOfBirh);
        txt_DateOfBirh.setBounds(170, 390, 440, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Class");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 430, 40, 22);

        txt_Class.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_Class);
        txt_Class.setBounds(170, 430, 440, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Country");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 480, 62, 22);

        txt_Country.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_Country);
        txt_Country.setBounds(170, 470, 440, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("PhoneNumber");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 520, 111, 22);

        txt_PhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_PhoneNumber);
        txt_PhoneNumber.setBounds(170, 520, 440, 28);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setText("Register");
        getContentPane().add(jButton1);
        jButton1.setBounds(345, 560, 270, 33);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\EVAN UGORJI\\Desktop\\StudyDoctor\\STUDY DOCTOR.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 810, 680);

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
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterStudent dialog = new RegisterStudent(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txt_Class;
    private javax.swing.JTextField txt_Country;
    private javax.swing.JTextField txt_DateOfBirh;
    private javax.swing.JTextField txt_OtherName;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_PhoneNumber;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}
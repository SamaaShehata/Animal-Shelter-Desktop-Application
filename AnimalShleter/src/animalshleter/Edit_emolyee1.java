/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshleter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BT
 */
public class Edit_emolyee1 extends javax.swing.JFrame {

    Connection con;
    
    public Edit_emolyee1() {
       initComponents();
        createConnection();
        fillcombon();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        e_name = new javax.swing.JTextField();
        empName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        e_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        e_password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("animal shelter");
        setMinimumSize(new java.awt.Dimension(650, 640));
        setPreferredSize(new java.awt.Dimension(650, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/go-back-icon.png"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 550, 65, 41);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("edit empolyee");
        jPanel1.add(jLabel5);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 90);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 100, 150, 80);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("name");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 40, 110, 40);

        e_name.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(e_name);
        e_name.setBounds(260, 120, 170, 40);

        empName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameActionPerformed(evt);
            }
        });
        jPanel2.add(empName);
        empName.setBounds(260, 50, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 190, 120, 60);

        e_email.setBackground(new java.awt.Color(204, 204, 204));
        e_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_emailActionPerformed(evt);
            }
        });
        jPanel2.add(e_email);
        e_email.setBounds(260, 200, 170, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 260, 170, 60);

        e_password.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(e_password);
        e_password.setBounds(260, 280, 170, 40);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/edit th.png"))); // NOI18N
        jButton1.setText("edit");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(255, 153, 0), null, null));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(230, 380, 220, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 650, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void e_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_emailActionPerformed

    private void empNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameActionPerformed
       Object obj = evt.getSource();
        if(obj==empName)
        {
        String email=null;
        String pass=null;
        try {
            String sql = "select employee_email , employee_password from animalsshelter.employees_info where employee_name = '"+(empName.getSelectedItem().toString())+"'";
            Statement prep = con.createStatement();
            ResultSet rst =  prep.executeQuery(sql);//resultset contain 2 coloumns the email and password
            
            while(rst.next())
            {
                email = rst.getString(1);
                pass = rst.getString(2);
            }
            prep.close();
            rst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Edit_emolyee1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        e_name.setText(empName.getSelectedItem().toString());
        e_email.setText(email);
        e_password.setText(pass);
        }
    }                                       

    private void fillcombon()
     {
        try {
            String sqll = "SELECT * FROM animalsshelter.employees_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String employeeNAME = rst.getString("employee_name");
                empName.addItem(employeeNAME);
                
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(Edit_emolyee1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_empNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int empId = 0;        
        try {
            String qury = "select employee_id from animalsshelter.employees_info where employee_name = '"+(empName.getSelectedItem().toString())+"'";
            Statement pss;
            pss = con.createStatement();
            ResultSet rst =  pss.executeQuery(qury);//resultset contain the employee id
            while(rst.next()){
            empId = rst.getInt(1);}
            pss.close();
            rst.close();
            
            String nname= e_name.getText();
            String eemial = e_email.getText();
            String ppas = e_password.getText();
            String query = "update animalsshelter.employees_info  set employee_name ='"+nname+"' , employee_email = '"+eemial+"', employee_password = '"+ppas+"' where employee_id ="+empId;
        
            Statement stt = con.createStatement();
            stt.execute(query);
            stt.close();
            JOptionPane.showMessageDialog(null, "edited successfully.");
        }
        catch (SQLException ex) {
            Logger.getLogger(Edit_emolyee1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    void createConnection()
    {
         String url = "jdbc:mysql://127.0.0.1:3306/animalsshelter";
        try {
            con = DriverManager.getConnection(url, "root", "4434544345");
        } catch (SQLException ex) {
            Logger.getLogger(Edit_emolyee1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
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
            java.util.logging.Logger.getLogger(Edit_emolyee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_emolyee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_emolyee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_emolyee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_emolyee1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField e_email;
    private javax.swing.JTextField e_name;
    private javax.swing.JTextField e_password;
    private javax.swing.JComboBox<String> empName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

   
}

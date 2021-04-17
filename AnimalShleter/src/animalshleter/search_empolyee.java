/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshleter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;  
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class search_empolyee extends javax.swing.JFrame {

    Connection con;
    public search_empolyee() {
        initComponents();
        createConnection();
        fillnamecombon();
        fillemailcombon();
        fillidcombon();
        autofill();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namecombo = new javax.swing.JComboBox<>();
        emailcombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        serEmplo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        idcombo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("animal shelter");
        setMinimumSize(new java.awt.Dimension(1280, 524));
        setPreferredSize(new java.awt.Dimension(1279, 519));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 230, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("email");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 40, 220, 29);

        namecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namecomboActionPerformed(evt);
            }
        });
        jPanel2.add(namecombo);
        namecombo.setBounds(210, 10, 120, 22);

        emailcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailcomboActionPerformed(evt);
            }
        });
        jPanel2.add(emailcombo);
        emailcombo.setBounds(210, 50, 120, 22);

        serEmplo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "empolyee id", "name", "email", "password"
            }
        ));
        jScrollPane1.setViewportView(serEmplo);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 1280, 360);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("empolyee id");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(360, 0, 160, 29);

        idcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcomboActionPerformed(evt);
            }
        });
        jPanel2.add(idcombo);
        idcombo.setBounds(590, 10, 120, 22);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("search empolyee");
        jPanel1.add(jLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namecomboActionPerformed
         Object obj = evt.getSource();
        if (obj == namecombo) {

            DefaultTableModel tablemodel = (DefaultTableModel) serEmplo.getModel();
            tablemodel.getDataVector().removeAllElements();
            try {
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.employees_info where employee_name = '" + namecombo.getSelectedItem().toString() + "'");
                while (rs.next()) {
                    int empID = rs.getInt("employee_id");
                    String empNAme = rs.getString("employee_name");
                    String empEmail = rs.getString("employee_email");
                    String empPass = rs.getString("employee_password");

                    tablemodel.addRow(new Object[]{empID, empNAme, empEmail, empPass});
                }

                stat.close();
            } catch (SQLException ex) {
                Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_namecomboActionPerformed

    private void idcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcomboActionPerformed
          Object obj = evt.getSource();
        if (obj == idcombo) {

            DefaultTableModel tablemodel = (DefaultTableModel) serEmplo.getModel();
            tablemodel.getDataVector().removeAllElements();
            try {
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.employees_info where employee_id = " +Integer.parseInt( idcombo.getSelectedItem().toString()));
                while (rs.next()) {
                    int empID = rs.getInt("employee_id");
                    String empNAme = rs.getString("employee_name");
                    String empEmail = rs.getString("employee_email");
                    String empPass = rs.getString("employee_password");

                    tablemodel.addRow(new Object[]{empID, empNAme, empEmail, empPass});
                }

                stat.close();
            } catch (SQLException ex) {
                Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_idcomboActionPerformed

    private void emailcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailcomboActionPerformed
          Object obj = evt.getSource();
        if (obj == emailcombo) {

            DefaultTableModel tablemodel = (DefaultTableModel) serEmplo.getModel();
            tablemodel.getDataVector().removeAllElements();
            try {
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.employees_info where employee_email = '" +emailcombo.getSelectedItem().toString()+"'");
                while (rs.next()) {
                    int empID = rs.getInt("employee_id");
                    String empNAme = rs.getString("employee_name");
                    String empEmail = rs.getString("employee_email");
                    String empPass = rs.getString("employee_password");

                    tablemodel.addRow(new Object[]{empID, empNAme, empEmail, empPass});
                }

                stat.close();
            } catch (SQLException ex) {
                Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_emailcomboActionPerformed

     void fillnamecombon()
     {
        try {
            String sqll = "SELECT employee_name FROM animalsshelter.employees_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String employeeNAME = rst.getString("employee_name");
                namecombo.addItem(employeeNAME);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void fillemailcombon()
     {
        try {
            String sqll = "SELECT employee_email FROM animalsshelter.employees_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String employeeEmail = rst.getString("employee_email");
                emailcombo.addItem(employeeEmail);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void fillidcombon()
     {
        try {
            String sqll = "SELECT employee_id FROM animalsshelter.employees_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String employeeID = rst.getString("employee_id");
                idcombo.addItem(employeeID);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void autofill()
     {
         
            DefaultTableModel tablemodel = (DefaultTableModel) serEmplo.getModel();
            tablemodel.getDataVector().removeAllElements();
            try {
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.employees_info ");
                while (rs.next()) {
                    int empID = rs.getInt("employee_id");
                    String empNAme = rs.getString("employee_name");
                    String empEmail = rs.getString("employee_email");
                    String empPass = rs.getString("employee_password");

                    tablemodel.addRow(new Object[]{empID, empNAme, empEmail, empPass});
                }

                stat.close();
            } catch (SQLException ex) {
                Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
            }

     }
     
     void createConnection()
    {
         String url = "jdbc:mysql://127.0.0.1:3306/animalsshelter";
        try {
            con = DriverManager.getConnection(url, "root", "4434544345");
        } catch (SQLException ex) {
            Logger.getLogger(search_empolyee.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(search_empolyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_empolyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_empolyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_empolyee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_empolyee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> emailcombo;
    private javax.swing.JComboBox<String> idcombo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> namecombo;
    private javax.swing.JTable serEmplo;
    // End of variables declaration//GEN-END:variables
}
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
public class search_clients extends javax.swing.JFrame {

    Connection con;
    public search_clients() {
        initComponents();
        createConnection();
        fillfirstnamecombon();
        fillemailcombon();
        fillidcombon();
        fillphonecombon();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienttable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        idcombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        firstnamecombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phonecombo = new javax.swing.JComboBox<>();
        lastnamecombo = new javax.swing.JComboBox<>();
        emailcombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("animal shelter");
        setMinimumSize(new java.awt.Dimension(1280, 524));
        setPreferredSize(new java.awt.Dimension(1279, 519));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("search clients");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 80);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        clienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "membership id", "client id", "first name", "last name", "birth date", "phone number", "email", "adress", "meddical state"
            }
        ));
        jScrollPane1.setViewportView(clienttable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 1280, 342);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("email");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(400, 50, 90, 29);

        idcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcomboActionPerformed(evt);
            }
        });
        jPanel2.add(idcombo);
        idcombo.setBounds(540, 10, 120, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("phone number");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(680, 0, 180, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(400, 0, 120, 29);

        firstnamecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamecomboActionPerformed(evt);
            }
        });
        jPanel2.add(firstnamecombo);
        firstnamecombo.setBounds(260, 10, 120, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" last name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 40, 220, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" first name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 230, 29);

        phonecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonecomboActionPerformed(evt);
            }
        });
        jPanel2.add(phonecombo);
        phonecombo.setBounds(890, 10, 120, 22);

        lastnamecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamecomboActionPerformed(evt);
            }
        });
        jPanel2.add(lastnamecombo);
        lastnamecombo.setBounds(260, 50, 120, 22);

        emailcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailcomboActionPerformed(evt);
            }
        });
        jPanel2.add(emailcombo);
        emailcombo.setBounds(540, 60, 120, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 1280, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstnamecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamecomboActionPerformed
          Object obj = evt.getSource();
        if (obj == firstnamecombo) {
            fillLasttnamecombon();

        }
    }//GEN-LAST:event_firstnamecomboActionPerformed

    private void lastnamecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamecomboActionPerformed
 
         Object obj = evt.getSource();
        if (obj == lastnamecombo) {
        DefaultTableModel tablemodel = (DefaultTableModel) clienttable.getModel();
        tablemodel.getDataVector().removeAllElements();

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.clients_info where first_name = '"+firstnamecombo.getSelectedItem().toString()+"' and last_name = '"+lastnamecombo.getSelectedItem().toString()+"'");
            while (rs.next()) {
                long clientID = rs.getLong("clients_id");
                int memberID = rs.getInt("membership_id");
                int meddicalstat = rs.getInt("medical_state");
                String firstn = rs.getString("first_name");
                String last = rs.getString("last_name");
                String phonee = rs.getString("phone_number");
                String birth = rs.getString("birth_date");
                String address = rs.getString("adress");
                String email = rs.getString("email");
                String medical = null;
                 switch (meddicalstat) {
                case 1:
                    medical = "No allergy";
                    break;
                case 2:
                    medical="Dog allergy";
                    break;
                case 3:
                    medical = "Cat allergy";
                    break;
                case 4:
                    medical = "Bird allergy";
                    break;
            }

                tablemodel.addRow(new Object[]{memberID, clientID, firstn, last,birth,phonee,email,address,medical});
            }

            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_lastnamecomboActionPerformed

    private void idcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcomboActionPerformed
        
         Object obj = evt.getSource();
        if (obj == idcombo) {
        DefaultTableModel tablemodel = (DefaultTableModel) clienttable.getModel();
        tablemodel.getDataVector().removeAllElements();

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.clients_info where clients_id = "+ Long.parseLong(idcombo.getSelectedItem().toString() ));
            while (rs.next()) {
                long clientID = rs.getLong("clients_id");
                int memberID = rs.getInt("membership_id");
                int meddicalstat = rs.getInt("medical_state");
                String firstn = rs.getString("first_name");
                String last = rs.getString("last_name");
                String phonee = rs.getString("phone_number");
                String birth = rs.getString("birth_date");
                String address = rs.getString("adress");
                String email = rs.getString("email");
                String medical = null;
                 switch (meddicalstat) {
                case 1:
                    medical = "No allergy";
                    break;
                case 2:
                    medical="Dog allergy";
                    break;
                case 3:
                    medical = "Cat allergy";
                    break;
                case 4:
                    medical = "Bird allergy";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error! No Meddical Statement Found.");
                    break;
            }

                tablemodel.addRow(new Object[]{memberID, clientID, firstn, last,birth,phonee,email,address,medical});
            }

            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
 
    }//GEN-LAST:event_idcomboActionPerformed

    private void emailcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailcomboActionPerformed
          Object obj = evt.getSource();
        if (obj == emailcombo) {
        DefaultTableModel tablemodel = (DefaultTableModel) clienttable.getModel();
        tablemodel.getDataVector().removeAllElements();

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.clients_info where email = '"+ emailcombo.getSelectedItem().toString()+"'");
            while (rs.next()) {
                long clientID = rs.getLong("clients_id");
                int memberID = rs.getInt("membership_id");
                int meddicalstat = rs.getInt("medical_state");
                String firstn = rs.getString("first_name");
                String last = rs.getString("last_name");
                String phonee = rs.getString("phone_number");
                String birth = rs.getString("birth_date");
                String address = rs.getString("adress");
                String email = rs.getString("email");
                String medical = null;
                 switch (meddicalstat) {
                case 1:
                    medical = "No allergy";
                    break;
                case 2:
                    medical="Dog allergy";
                    break;
                case 3:
                    medical = "Cat allergy";
                    break;
                case 4:
                    medical = "Bird allergy";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error! No Meddical Statement Found.");
                    break;
            }

                tablemodel.addRow(new Object[]{memberID, clientID, firstn, last,birth,phonee,email,address,medical});
            }

            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
    }//GEN-LAST:event_emailcomboActionPerformed

    private void phonecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonecomboActionPerformed
           Object obj = evt.getSource();
        if (obj == phonecombo) {
        DefaultTableModel tablemodel = (DefaultTableModel) clienttable.getModel();
        tablemodel.getDataVector().removeAllElements();

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.clients_info where phone_number = '"+ phonecombo.getSelectedItem().toString()+"'");
            while (rs.next()) {
                long clientID = rs.getLong("clients_id");
                int memberID = rs.getInt("membership_id");
                int meddicalstat = rs.getInt("medical_state");
                String firstn = rs.getString("first_name");
                String last = rs.getString("last_name");
                String phonee = rs.getString("phone_number");
                String birth = rs.getString("birth_date");
                String address = rs.getString("adress");
                String email = rs.getString("email");
                String medical = null;
                 switch (meddicalstat) {
                case 1:
                    medical = "No allergy";
                    break;
                case 2:
                    medical="Dog allergy";
                    break;
                case 3:
                    medical = "Cat allergy";
                    break;
                case 4:
                    medical = "Bird allergy";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error! No Meddical Statement Found.");
                    break;
            }

                tablemodel.addRow(new Object[]{memberID, clientID, firstn, last,birth,phonee,email,address,medical});
            }

            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
    }//GEN-LAST:event_phonecomboActionPerformed

    void fillfirstnamecombon()
     {
        try {
            String sqll = "SELECT first_name FROM animalsshelter.clients_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String clientNAME = rst.getString("first_name");
                firstnamecombo.addItem(clientNAME);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void fillLasttnamecombon()
     {
        try {
            String sqll = "SELECT last_name FROM animalsshelter.clients_info where first_name = '"+firstnamecombo.getSelectedItem().toString()+"'";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String clientlastNAME = rst.getString("last_name");
                lastnamecombo.addItem(clientlastNAME);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void fillidcombon()
     {
        try {
            String sqll = "SELECT clients_id FROM animalsshelter.clients_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String clientid = rst.getString("clients_id");
                idcombo.addItem(clientid);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void fillemailcombon()
     {
        try {
            String sqll = "SELECT email FROM animalsshelter.clients_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String clienemail = rst.getString("email");
                emailcombo.addItem(clienemail);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void fillphonecombon()
     {
        try {
            String sqll = "SELECT phone_number FROM animalsshelter.clients_info";
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String clientphone = rst.getString("phone_number");
                phonecombo.addItem(clientphone);
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void autofill()
     {
         DefaultTableModel tablemodel = (DefaultTableModel) clienttable.getModel();
        tablemodel.getDataVector().removeAllElements();

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.clients_info");
            while (rs.next()) {
                long clientID = rs.getLong("clients_id");
                int memberID = rs.getInt("membership_id");
                int meddicalstat = rs.getInt("medical_state");
                String firstn = rs.getString("first_name");
                String last = rs.getString("last_name");
                String phonee = rs.getString("phone_number");
                String birth = rs.getString("birth_date");
                String address = rs.getString("adress");
                String email = rs.getString("email");
                String medical = null;
                 switch (meddicalstat) {
                case 1:
                    medical = "No allergy";
                    break;
                case 2:
                    medical="Dog allergy";
                    break;
                case 3:
                    medical = "Cat allergy";
                    break;
                case 4:
                    medical = "Bird allergy";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error! No Meddical Statement Found.");
                    break;
            }

                tablemodel.addRow(new Object[]{memberID, clientID, firstn, last,birth,phonee,email,address,medical});
            }

            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
        }


     }
     
     void createConnection()
    {
         String url = "jdbc:mysql://127.0.0.1:3306/animalsshelter";
        try {
            con = DriverManager.getConnection(url, "root", "4434544345");
        } catch (SQLException ex) {
            Logger.getLogger(search_clients.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(search_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clienttable;
    private javax.swing.JComboBox<String> emailcombo;
    private javax.swing.JComboBox<String> firstnamecombo;
    private javax.swing.JComboBox<String> idcombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lastnamecombo;
    private javax.swing.JComboBox<String> phonecombo;
    // End of variables declaration//GEN-END:variables
}

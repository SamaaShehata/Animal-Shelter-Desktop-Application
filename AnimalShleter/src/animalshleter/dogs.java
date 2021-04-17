/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshleter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class dogs extends javax.swing.JFrame {

    /**
     * Creates new form dogs
     */Connection con;
    public dogs() {
        initComponents();
        createConnection();
        autofillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dogtable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dogcombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("animal shelter");
        setMinimumSize(new java.awt.Dimension(1279, 519));
        setPreferredSize(new java.awt.Dimension(1300, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        dogtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "pet_name", "birth_date", "gender", "size", "color", "intake_date", "adoption_state"
            }
        ));
        jScrollPane1.setViewportView(dogtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 134, 1260, 390);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("dogs");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 70);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        dogcombo.setMaximumRowCount(19);
        dogcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "afador", "Affenpinscher", "Alaskan Klee Kai", "Origi", "valverde", "Auggie", "Beagle", "Belgian", "Cavapoo", "Daniff", "BOXER", "Docker", "Doxle", "French Terrier", "Gordon", "Goldendoodle", "Irish Wolfhound", "Lowchen", "pitsky" }));
        dogcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogcomboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("breed");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(134, 134, 134)
                .addComponent(dogcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(429, 429, 429))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(397, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 1280, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dogcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogcomboActionPerformed
          Object obj = evt.getSource();
        if(obj==dogcombo)
        {
            fillTable();
        }
    }//GEN-LAST:event_dogcomboActionPerformed

     void createConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/animalsshelter";
        try {
            con = DriverManager.getConnection(url, "root", "4434544345");
        } catch (SQLException ex) {
            Logger.getLogger(dogs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    void fillTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) dogtable.getModel();
        tablemodel.getDataVector().removeAllElements();

        try {
            int breedID =0;
            String adoption = null;
            Statement state = con.createStatement();
            ResultSet rst = state.executeQuery("SELECT brees_id FROM animalsshelter.breeds where  breed_name = '"+dogcombo.getSelectedItem().toString()+"'");
            while (rst.next()) { breedID = rst.getInt("brees_id"); }
            state.close();
            rst.close();
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.pets where specie_id = 1 and breed_id = "+breedID);
            while (rs.next()) {
                String rabitName = rs.getString("pet_name");
                String rabitbirth = rs.getString("birth_date");
                String rabitgendr = rs.getString("gender");
                String size = rs.getString("size");
                String color = rs.getString("color");
                String intakedate = rs.getString("intake_date");
                int adoptionstat = rs.getInt("adoption_state");
                
                if(adoptionstat==0)
                    adoption="Not Adopted";
                else 
                    adoption="Adopted";

                tablemodel.addRow(new Object[]{rabitName, rabitbirth, rabitgendr, size,color,intakedate,adoption});
            }

            stat.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(dogs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     void autofillTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) dogtable.getModel();
        tablemodel.getDataVector().removeAllElements();

        try {
            String adoption =null;
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM animalsshelter.pets where specie_id = 1 ");
            while (rs.next()) {
                String rabitName = rs.getString("pet_name");
                String rabitbirth = rs.getString("birth_date");
                String rabitgendr = rs.getString("gender");
                String size = rs.getString("size");
                String color = rs.getString("color");
                String intakedate = rs.getString("intake_date");
                int adoptionstat = rs.getInt("adoption_state");
                
                if(adoptionstat==0)
                    adoption="Not Adopted";
                else 
                    adoption="Adopted";

                tablemodel.addRow(new Object[]{rabitName, rabitbirth, rabitgendr, size,color,intakedate,adoption});
            }

            stat.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(dogs.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(dogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dogcombo;
    private javax.swing.JTable dogtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
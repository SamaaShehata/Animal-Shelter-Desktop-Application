/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshleter;

//import project.add_client.convertUtilToSql;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class add_animal1 extends javax.swing.JFrame {

    String size;
    int specie;
    int adoptionState;
    String gender;
    Connection con;
    public add_animal1() {
        initComponents();
        createConnection();
        fillcombo();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        petNamepanel = new javax.swing.JPanel();
        petName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        breednamesCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        birth = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        colour = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adoptDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        inDate1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("animal shelter");
        setMinimumSize(new java.awt.Dimension(650, 690));
        setPreferredSize(new java.awt.Dimension(650, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add animal");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 70);

        petNamepanel.setBackground(new java.awt.Color(0, 51, 51));
        petNamepanel.setForeground(new java.awt.Color(255, 255, 255));
        petNamepanel.setLayout(null);

        petName.setBackground(new java.awt.Color(204, 204, 204));
        petName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petNameActionPerformed(evt);
            }
        });
        petNamepanel.add(petName);
        petName.setBounds(230, 20, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("pet name");
        petNamepanel.add(jLabel2);
        jLabel2.setBounds(20, 10, 230, 50);

        jRadioButton4.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton4.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Not Adopted");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton4);
        jRadioButton4.setBounds(380, 430, 160, 25);

        jRadioButton8.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("birds");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton8);
        jRadioButton8.setBounds(450, 330, 75, 39);

        petNamepanel.add(breednamesCombo);
        breednamesCombo.setBounds(220, 372, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("birth date");
        petNamepanel.add(jLabel3);
        jLabel3.setBounds(20, 70, 260, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("gender");
        petNamepanel.add(jLabel4);
        jLabel4.setBounds(20, 120, 160, 50);

        birth.setBackground(new java.awt.Color(204, 204, 204));
        birth.setToolTipText("yyyy/mm/dd");
        birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthActionPerformed(evt);
            }
        });
        petNamepanel.add(birth);
        birth.setBounds(230, 70, 140, 30);

        jRadioButton1.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton1);
        jRadioButton1.setBounds(230, 130, 73, 39);

        jRadioButton2.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton2);
        jRadioButton2.setBounds(350, 130, 120, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("size");
        petNamepanel.add(jLabel5);
        jLabel5.setBounds(20, 180, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("color");
        petNamepanel.add(jLabel6);
        jLabel6.setBounds(20, 230, 80, 30);

        colour.setBackground(new java.awt.Color(204, 204, 204));
        petNamepanel.add(colour);
        colour.setBounds(230, 220, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("intake date");
        petNamepanel.add(jLabel7);
        jLabel7.setBounds(20, 280, 210, 40);

        adoptDate.setBackground(new java.awt.Color(204, 204, 204));
        petNamepanel.add(adoptDate);
        adoptDate.setBounds(220, 460, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Adoption Date");
        petNamepanel.add(jLabel9);
        jLabel9.setBounds(20, 450, 180, 50);

        jRadioButton9.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("small");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton9);
        jRadioButton9.setBounds(230, 180, 90, 39);

        jRadioButton10.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("meduem");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton10);
        jRadioButton10.setBounds(350, 180, 107, 39);

        jRadioButton11.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("large");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton11);
        jRadioButton11.setBounds(470, 180, 90, 39);

        jRadioButton5.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("dogs");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton5);
        jRadioButton5.setBounds(350, 330, 71, 39);

        jRadioButton7.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("cats");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton7);
        jRadioButton7.setBounds(560, 330, 71, 39);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("species");
        petNamepanel.add(jLabel11);
        jLabel11.setBounds(20, 320, 110, 50);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/add th_1.png"))); // NOI18N
        jButton1.setText("add");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(255, 153, 0), null, null));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        petNamepanel.add(jButton1);
        jButton1.setBounds(230, 510, 140, 70);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Adoption State");
        petNamepanel.add(jLabel10);
        jLabel10.setBounds(20, 410, 190, 50);

        inDate1.setBackground(new java.awt.Color(204, 204, 204));
        petNamepanel.add(inDate1);
        inDate1.setBounds(230, 280, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("breeds");
        petNamepanel.add(jLabel12);
        jLabel12.setBounds(20, 360, 110, 50);

        jRadioButton12.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("rabbits");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton12);
        jRadioButton12.setBounds(220, 340, 107, 25);

        jRadioButton3.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton3.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Adopted");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        petNamepanel.add(jRadioButton3);
        jRadioButton3.setBounds(220, 430, 130, 25);

        getContentPane().add(petNamepanel);
        petNamepanel.setBounds(0, 70, 650, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void petNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petNameActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        gender = "Male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        adoptionState = 0;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void birthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //fillcombo();
        try {
            PreparedStatement state;
            java.sql.Date sDate = null;
            java.sql.Date sDate2 = null;
            try {
                Date birthd = new SimpleDateFormat("dd/MM/YYYY").parse(birth.getText());
                sDate = convertUtilToSql(birthd); // to convert from javaDate to sqlDate
                Date inD = new SimpleDateFormat("dd/MM/YYYY").parse(inDate1.getText());
                sDate2 = convertUtilToSql(inD);
            }
            catch (ParseException parseException)
            {
                JOptionPane.showMessageDialog(null, "Please Fill The Date Field!");
            }
            String strDate = adoptDate.getText();
            java.sql.Date sDate3 =null;
            Date adoptD=new Date();
            //check only on the text field of the adoption date
            /*if(strDate.isEmpty()) 
            {
                sDate3 =null;
                JOptionPane.showConfirmDialog(null, "No Adoption Date For This Animal");
            }
            else 
            {
            adoptD=new SimpleDateFormat("dd/MM/yyyy").parse(adoptDate.getText());
            sDate3 = convertUtilToSql(adoptD);
            }*/
            if(adoptionState == 0)
            {
                sDate3 = null;
                JOptionPane.showConfirmDialog(null, "No Adoption Date For This Animal");
            }
            else
            {
                if(strDate.isBlank())
                {
                    JOptionPane.showMessageDialog(null, "You Did Not Entered an Adoption Date!!");
                    JOptionPane.showMessageDialog(null, "Auto Date Inserted.");
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    dateFormat.format(date);
                    sDate3 = convertUtilToSql(date);
                }
                
            }
           // (specie_id,breed_id,pet_name,birth_date,gender,size,color, intake_date,adoption_state,adoption_date)
            String value = breednamesCombo.getSelectedItem().toString();//get the breed name from combobox
            
            String sql= "select brees_id from animalsshelter.breeds WHERE breed_name = '"+value+"'";//get the breedId from table using the breed name from the combobox 
            Statement prep = con.createStatement();
            ResultSet rst =  prep.executeQuery(sql);//resultset contain the breedId
            int brId=0;
            while(rst.next()){
            brId = rst.getInt(1);}
            prep.close();
            rst.close();
           
           state = con.prepareStatement("insert into animalsshelter.pets "
                   + " (specie_id,breed_id,pet_name,birth_date,gender,size,color,intake_date,adoption_state,adoption_date)"
                   + " VALUES("+specie+",?,?,?,?,?,?,?,?,?)");
            state.setInt(1,brId);
            state.setString(2, petName.getText());
            state.setDate(3, sDate);
            state.setString(4, gender);
            state.setString(5, size);
            state.setString(6, colour.getText());
            state.setDate(7, sDate2);
            state.setInt(8, adoptionState);
            state.setDate(9, sDate3);
            state.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added Successfully.");
            state.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(add_animal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        gender = "Female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        size = "Small";
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
         size = "Medium";
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        size = "Large";
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        specie = 1;
       fillcombo();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
       specie = 2;
        fillcombo();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        specie = 3;
        fillcombo();
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        specie = 4;
        fillcombo();
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
         adoptionState = 1;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    public static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
     
     private void fillcombo()
     {
         breednamesCombo.removeAllItems();
        try {
            String sqll = "select * from animalsshelter.breeds where specieID = "+specie;
            PreparedStatement prep = con.prepareStatement(sqll);
            ResultSet rst =  prep.executeQuery();
            
            while (rst.next()){
                String breddName = rst.getString("breed_name");
                breednamesCombo.addItem(breddName);
                
            }
            prep.close();
            rst.close();
            
            }
        catch (SQLException ex) {
            Logger.getLogger(add_animal1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     void createConnection()
    {
         String url = "jdbc:mysql://127.0.0.1:3306/animalsshelter";
        try {
            con = DriverManager.getConnection(url, "root", "4434544345");
        } catch (SQLException ex) {
            Logger.getLogger(add_animal1.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(add_animal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_animal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_animal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_animal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_animal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adoptDate;
    private javax.swing.JTextField birth;
    private javax.swing.JComboBox<String> breednamesCombo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField colour;
    private javax.swing.JTextField inDate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField petName;
    private javax.swing.JPanel petNamepanel;
    // End of variables declaration//GEN-END:variables
}

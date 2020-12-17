
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Admin_MainForm extends javax.swing.JFrame {

    
    public Admin_MainForm() {
        initComponents();
        GetText();
    }
    
    //Update tis one to our project
    
   public void GetText(){
        AUser.setText(Login.UserNameTxt.getText());
        ACategory.setText(Login.CombSelect.getSelectedItem().toString());
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AUser = new javax.swing.JLabel();
        ACategory = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Admin Main Form");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(219, 103, 451, 136);

        AUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(AUser);
        AUser.setBounds(90, 560, 150, 20);

        ACategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ACategory);
        ACategory.setBounds(90, 590, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Category :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 590, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 560, 40, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACategory;
    private javax.swing.JLabel AUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

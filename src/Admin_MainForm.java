
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Admin_MainForm extends javax.swing.JFrame {

    
    public Admin_MainForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Admin Main Form");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        

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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

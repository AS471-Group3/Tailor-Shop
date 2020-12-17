
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Employee_MainForm extends javax.swing.JFrame {

    
    public Employee_MainForm() {
        initComponents();
        GetText();
    }

    public void GetText(){
        EUser.setText(Login.UserNameTxt.getText());
        ECategory.setText(Login.CombSelect.getSelectedItem().toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EUser = new javax.swing.JLabel();
        ECategory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Employee Main Form");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(153, 103, 517, 136);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Category :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 560, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 530, 40, 17);

        EUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(EUser);
        EUser.setBounds(90, 530, 150, 0);

        ECategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ECategory);
        ECategory.setBounds(90, 560, 150, 0);

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
            new Employee_MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ECategory;
    private javax.swing.JLabel EUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

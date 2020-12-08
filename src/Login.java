
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserName = new javax.swing.JLabel();
        UserNameTxt1 = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        UserPasswordField = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CombSelect = new javax.swing.JComboBox<>();
        UserName1 = new javax.swing.JLabel();
        LoginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        UserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("Select Categary");
        getContentPane().add(UserName);
        UserName.setBounds(1000, 460, 200, 40);

        UserNameTxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserNameTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTxt1ActionPerformed(evt);
            }
        });
        getContentPane().add(UserNameTxt1);
        UserNameTxt1.setBounds(190, 230, 300, 50);

        Password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("User Name :");
        getContentPane().add(Password);
        Password.setBounds(30, 240, 150, 40);
        getContentPane().add(UserPasswordField);
        UserPasswordField.setBounds(710, 230, 320, 50);

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("  Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(790, 300, 160, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1160, 0, 70, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1260, 0, 70, 50);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        jLabel1.setText(" Log In");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1090, 230, 180, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1090, 230, 180, 100);

        jLabel4.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel4.setText("  Sign Up");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 370, 190, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 370, 190, 50);

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Forgot Password");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 370, 410, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 370, 410, 50);

        jLabel8.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Exit");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 500, 750, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 500, 750, 50);

        jLabel10.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" Reset Password");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(740, 370, 370, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        jLabel9.setText("jLabel2");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(740, 370, 370, 50);

        CombSelect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CombSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Admin", "Employee", "Customer" }));
        CombSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombSelectActionPerformed(evt);
            }
        });
        getContentPane().add(CombSelect);
        CombSelect.setBounds(1000, 510, 270, 40);

        UserName1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserName1.setForeground(new java.awt.Color(255, 255, 255));
        UserName1.setText("Password :");
        getContentPane().add(UserName1);
        UserName1.setBounds(570, 240, 140, 40);

        LoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N
        getContentPane().add(LoginBackground);
        LoginBackground.setBounds(0, 0, 1330, 650);

        setSize(new java.awt.Dimension(1327, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTxt1ActionPerformed
        
    }//GEN-LAST:event_UserNameTxt1ActionPerformed

    private void CombSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombSelectActionPerformed
        
    }//GEN-LAST:event_CombSelectActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        String x = CombSelect.getSelectedItem().toString();
        switch (x) {
            case "Choose":
                JOptionPane.showMessageDialog(null,"Please Select Category");
                break;
            case "Admin":
                JOptionPane.showMessageDialog(null,"You Cannot sign up by select Admin\nPlease change the category to Employee");
                break;
            default:
                setVisible(false);
                Sign_up su = new Sign_up();
                su.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        String x = CombSelect.getSelectedItem().toString();
        if(x.equals("Choose")){
        JOptionPane.showMessageDialog(null,"Please Select Category");
        }else{
        setVisible(false);
        Forgot_Password fp = new Forgot_Password();
        fp.setVisible(true);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String x = CombSelect.getSelectedItem().toString();
        if(x.equals("Choose")){
        JOptionPane.showMessageDialog(null,"Please Select Category");
        }else{
        setVisible(false);
        Reset_Password rp = new Reset_Password();
        rp.setVisible(true);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombSelect;
    private javax.swing.JLabel LoginBackground;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel UserName1;
    private javax.swing.JTextField UserNameTxt1;
    private javax.swing.JPasswordField UserPasswordField;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

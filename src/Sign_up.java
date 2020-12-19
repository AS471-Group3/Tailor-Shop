
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Sign_up extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int xMouse;
    int yMouse;
    
    public Sign_up() throws SQLException {
        super("Sign_Up");
        initComponents();
        conn = DataBase.DbConnect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoveBar = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        Save0 = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        Clear0 = new javax.swing.JLabel();
        Cancel = new javax.swing.JLabel();
        Cancel0 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Exit0 = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        LastNameTxt = new javax.swing.JTextField();
        NICno = new javax.swing.JLabel();
        NICnoTxt = new javax.swing.JTextField();
        DOB = new javax.swing.JLabel();
        DOBTxt = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JPasswordField();
        ShowPassword = new javax.swing.JCheckBox();
        Address = new javax.swing.JLabel();
        Addresstxt = new javax.swing.JTextField();
        PhoneNo = new javax.swing.JLabel();
        phoneNoTxt = new javax.swing.JTextField();
        Mail = new javax.swing.JLabel();
        MailTxt = new javax.swing.JTextField();
        Selectcategory = new javax.swing.JLabel();
        CombSelect = new javax.swing.JComboBox<>();
        SignupBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        MoveBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MoveBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveBarMouseDragged(evt);
            }
        });
        MoveBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveBarMousePressed(evt);
            }
        });
        getContentPane().add(MoveBar);
        MoveBar.setBounds(0, 0, 810, 40);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(880, 0, 50, 40);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(830, 0, 50, 40);

        Register.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 0, 0));
        Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register.setText("Register");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        getContentPane().add(Register);
        Register.setBounds(510, 510, 170, 50);

        Save0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Save0.setText("jLabel11");
        getContentPane().add(Save0);
        Save0.setBounds(510, 510, 170, 50);

        Clear.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 0, 0));
        Clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Clear);
        Clear.setBounds(720, 510, 170, 50);

        Clear0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Clear0.setText("jLabel11");
        getContentPane().add(Clear0);
        Clear0.setBounds(720, 510, 170, 50);

        Cancel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Cancel.setForeground(new java.awt.Color(0, 0, 0));
        Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel.setText("Cancel");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Cancel);
        Cancel.setBounds(510, 580, 170, 50);

        Cancel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Cancel0.setText("jLabel11");
        getContentPane().add(Cancel0);
        Cancel0.setBounds(510, 580, 170, 50);

        Home.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 0, 0));
        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setText("Home");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home);
        Home.setBounds(720, 580, 170, 50);

        Exit0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Exit0.setText("jLabel11");
        getContentPane().add(Exit0);
        Exit0.setBounds(720, 580, 170, 50);

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name :");
        getContentPane().add(FirstName);
        FirstName.setBounds(30, 220, 120, 40);

        FirstNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        FirstNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(FirstNameTxt);
        FirstNameTxt.setBounds(150, 220, 300, 40);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name :");
        getContentPane().add(LastName);
        LastName.setBounds(30, 270, 120, 40);

        LastNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        LastNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LastNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LastNameTxt);
        LastNameTxt.setBounds(150, 270, 300, 40);

        NICno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NICno.setForeground(new java.awt.Color(255, 255, 255));
        NICno.setText("NIC No       :  ");
        getContentPane().add(NICno);
        NICno.setBounds(30, 320, 120, 40);

        NICnoTxt.setBackground(new java.awt.Color(255, 255, 255));
        NICnoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NICnoTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(NICnoTxt);
        NICnoTxt.setBounds(150, 320, 300, 40);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DOB.setForeground(new java.awt.Color(255, 255, 255));
        DOB.setText("DOB            :");
        getContentPane().add(DOB);
        DOB.setBounds(30, 370, 120, 40);

        DOBTxt.setBackground(new java.awt.Color(255, 255, 255));
        DOBTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DOBTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(DOBTxt);
        DOBTxt.setBounds(150, 370, 300, 40);

        UserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Name :");
        getContentPane().add(UserName);
        UserName.setBounds(30, 470, 120, 40);

        UserNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        UserNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(UserNameTxt);
        UserNameTxt.setBounds(150, 470, 300, 40);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password  :");
        getContentPane().add(Password);
        Password.setBounds(30, 520, 120, 40);

        PasswordTxt.setBackground(new java.awt.Color(255, 255, 255));
        PasswordTxt.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTxtActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordTxt);
        PasswordTxt.setBounds(150, 520, 300, 40);

        ShowPassword.setBackground(new java.awt.Color(0, 0, 0));
        ShowPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("  Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassword);
        ShowPassword.setBounds(220, 570, 170, 20);

        Address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address     :");
        getContentPane().add(Address);
        Address.setBounds(490, 210, 120, 40);

        Addresstxt.setBackground(new java.awt.Color(255, 255, 255));
        Addresstxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Addresstxt.setForeground(new java.awt.Color(0, 0, 0));
        Addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Addresstxt);
        Addresstxt.setBounds(610, 210, 300, 100);

        PhoneNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNo.setText("Phone No :");
        getContentPane().add(PhoneNo);
        PhoneNo.setBounds(490, 320, 120, 40);

        phoneNoTxt.setBackground(new java.awt.Color(255, 255, 255));
        phoneNoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneNoTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(phoneNoTxt);
        phoneNoTxt.setBounds(610, 320, 300, 40);

        Mail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Mail.setForeground(new java.awt.Color(255, 255, 255));
        Mail.setText("E-Mail       :");
        getContentPane().add(Mail);
        Mail.setBounds(490, 370, 120, 40);

        MailTxt.setBackground(new java.awt.Color(255, 255, 255));
        MailTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MailTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(MailTxt);
        MailTxt.setBounds(610, 370, 300, 40);

        Selectcategory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Selectcategory.setForeground(new java.awt.Color(255, 255, 255));
        Selectcategory.setText("Categary    :");
        getContentPane().add(Selectcategory);
        Selectcategory.setBounds(30, 420, 130, 40);

        CombSelect.setBackground(new java.awt.Color(255, 255, 255));
        CombSelect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CombSelect.setForeground(new java.awt.Color(0, 0, 0));
        CombSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Admin", "Employee", "Customer" }));
        CombSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombSelectActionPerformed(evt);
            }
        });
        getContentPane().add(CombSelect);
        CombSelect.setBounds(150, 420, 300, 40);

        SignupBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup.png"))); // NOI18N
        getContentPane().add(SignupBackground);
        SignupBackground.setBounds(0, 0, 930, 647);

        setSize(new java.awt.Dimension(925, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        try {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Sign_up.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Sign_up.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MoveBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MoveBarMouseDragged

    private void MoveBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveBarMousePressed

    private void CombSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombSelectActionPerformed

    }//GEN-LAST:event_CombSelectActionPerformed

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        try{
            String sql = "insert into Account (First_Name,Last_Name,NICno,DOB,Address,P_No,E_Mail,Category,User_Name,Password)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, FirstNameTxt.getText());
            pst.setString(2, LastNameTxt.getText());
            pst.setString(3, NICnoTxt.getText());
            pst.setString(4, DOBTxt.getText());
            pst.setString(5, Addresstxt.getText());
            pst.setString(6, phoneNoTxt.getText());
            pst.setString(7, MailTxt.getText());
            pst.setString(8, CombSelect.getSelectedItem().toString());
            pst.setString(9, UserNameTxt.getText());           
            pst.setString(10, PasswordTxt.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registered Successfully");         
            
            /*String confirm = Password.getText();
            if(CPasswordTxt.getText().equals(confirm)){
            pst.setString(10, PasswordTxt.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            }else{
            JOptionPane.showMessageDialog(null, "Password Doesn't Match");
            }*/
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_RegisterMouseClicked

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if(ShowPassword.isSelected()){
            PasswordTxt.setEchoChar((char)0);
        }else{
            PasswordTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void PasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTxtActionPerformed
    
     
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Sign_up().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Sign_up.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField Addresstxt;
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel Cancel0;
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Clear0;
    private javax.swing.JLabel Close;
    private javax.swing.JComboBox<String> CombSelect;
    private javax.swing.JLabel DOB;
    private javax.swing.JTextField DOBTxt;
    private javax.swing.JLabel Exit0;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JLabel Mail;
    private javax.swing.JTextField MailTxt;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel NICno;
    private javax.swing.JTextField NICnoTxt;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JLabel PhoneNo;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Save0;
    private javax.swing.JLabel Selectcategory;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel SignupBackground;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JTextField phoneNoTxt;
    // End of variables declaration//GEN-END:variables
}

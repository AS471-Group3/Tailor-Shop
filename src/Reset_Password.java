
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Reset_Password extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int xMouse;
    int yMouse;
    
    public Reset_Password() throws SQLException {
        super("Reset Password");
        initComponents();
        conn = DataBase.DbConnect();
        
        OldPasswordtxt.setEnabled(false);
        NewPasswordTxt.setEnabled(false);
        CPasswordTxt.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoveBar = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        RCategoryTxt = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        RFnameTxt = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        RLNameTxt = new javax.swing.JLabel();
        NICno = new javax.swing.JLabel();
        RnicTxt = new javax.swing.JLabel();
        Dob = new javax.swing.JLabel();
        RdobTxt = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        RUNametxt = new javax.swing.JTextField();
        OldPassword = new javax.swing.JLabel();
        OldPasswordtxt = new javax.swing.JTextField();
        NewPassword = new javax.swing.JLabel();
        CPasswordTxt = new javax.swing.JPasswordField();
        CPassword = new javax.swing.JLabel();
        NewPasswordTxt = new javax.swing.JPasswordField();
        Search = new javax.swing.JLabel();
        Search0 = new javax.swing.JLabel();
        Reset = new javax.swing.JLabel();
        Reset0 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Home0 = new javax.swing.JLabel();
        ShowPassword = new javax.swing.JCheckBox();
        RPasswordBckgrnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        MoveBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        Category.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Category.setForeground(new java.awt.Color(255, 255, 255));
        Category.setText("Category            :");
        getContentPane().add(Category);
        Category.setBounds(30, 200, 170, 40);

        RCategoryTxt.setBackground(new java.awt.Color(0, 0, 0));
        RCategoryTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RCategoryTxt.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(RCategoryTxt);
        RCategoryTxt.setBounds(210, 200, 300, 40);

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name         :");
        getContentPane().add(FirstName);
        FirstName.setBounds(30, 250, 170, 40);

        RFnameTxt.setBackground(new java.awt.Color(0, 0, 0));
        RFnameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RFnameTxt.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(RFnameTxt);
        RFnameTxt.setBounds(210, 250, 300, 40);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name         :");
        getContentPane().add(LastName);
        LastName.setBounds(30, 300, 170, 40);

        RLNameTxt.setBackground(new java.awt.Color(0, 0, 0));
        RLNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RLNameTxt.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(RLNameTxt);
        RLNameTxt.setBounds(210, 300, 300, 40);

        NICno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NICno.setForeground(new java.awt.Color(255, 255, 255));
        NICno.setText("NIC No               :  ");
        getContentPane().add(NICno);
        NICno.setBounds(30, 350, 170, 40);

        RnicTxt.setBackground(new java.awt.Color(0, 0, 0));
        RnicTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RnicTxt.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(RnicTxt);
        RnicTxt.setBounds(210, 350, 300, 40);

        Dob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Dob.setForeground(new java.awt.Color(255, 255, 255));
        Dob.setText("DOB                    :");
        getContentPane().add(Dob);
        Dob.setBounds(30, 400, 170, 40);

        RdobTxt.setBackground(new java.awt.Color(0, 0, 0));
        RdobTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RdobTxt.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(RdobTxt);
        RdobTxt.setBounds(210, 400, 300, 40);

        UserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Name        :");
        getContentPane().add(UserName);
        UserName.setBounds(30, 140, 170, 40);

        RUNametxt.setBackground(new java.awt.Color(255, 255, 255));
        RUNametxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RUNametxt.setForeground(new java.awt.Color(0, 0, 0));
        RUNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RUNametxtKeyPressed(evt);
            }
        });
        getContentPane().add(RUNametxt);
        RUNametxt.setBounds(210, 140, 300, 40);

        OldPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OldPassword.setForeground(new java.awt.Color(255, 255, 255));
        OldPassword.setText("Old Password   :");
        getContentPane().add(OldPassword);
        OldPassword.setBounds(30, 450, 170, 40);

        OldPasswordtxt.setBackground(new java.awt.Color(255, 255, 255));
        OldPasswordtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OldPasswordtxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(OldPasswordtxt);
        OldPasswordtxt.setBounds(210, 454, 300, 40);

        NewPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewPassword.setForeground(new java.awt.Color(255, 255, 255));
        NewPassword.setText("New Password :");
        getContentPane().add(NewPassword);
        NewPassword.setBounds(30, 500, 170, 40);

        CPasswordTxt.setBackground(new java.awt.Color(255, 255, 255));
        CPasswordTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CPasswordTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(CPasswordTxt);
        CPasswordTxt.setBounds(210, 550, 300, 40);

        CPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CPassword.setForeground(new java.awt.Color(255, 255, 255));
        CPassword.setText("Confirm Password:");
        getContentPane().add(CPassword);
        CPassword.setBounds(30, 550, 180, 40);

        NewPasswordTxt.setBackground(new java.awt.Color(255, 255, 255));
        NewPasswordTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewPasswordTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(NewPasswordTxt);
        NewPasswordTxt.setBounds(210, 500, 300, 40);

        Search.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Search.setForeground(new java.awt.Color(0, 0, 0));
        Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Search.setText("Search");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(560, 140, 170, 40);

        Search0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Search0.setText("jLabel11");
        getContentPane().add(Search0);
        Search0.setBounds(560, 140, 170, 40);

        Reset.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Reset.setForeground(new java.awt.Color(0, 0, 0));
        Reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reset.setText("Reset");
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        getContentPane().add(Reset);
        Reset.setBounds(560, 570, 170, 60);

        Reset0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Reset0.setText("jLabel11");
        getContentPane().add(Reset0);
        Reset0.setBounds(560, 570, 170, 60);

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
        Home.setBounds(750, 570, 150, 60);

        Home0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Home0.setText("jLabel11");
        getContentPane().add(Home0);
        Home0.setBounds(750, 570, 150, 60);

        ShowPassword.setBackground(new java.awt.Color(0, 0, 0));
        ShowPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("  Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassword);
        ShowPassword.setBounds(250, 600, 210, 40);

        RPasswordBckgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reset.png"))); // NOI18N
        getContentPane().add(RPasswordBckgrnd);
        RPasswordBckgrnd.setBounds(0, 0, 930, 650);

        setSize(new java.awt.Dimension(923, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Reset_Password.ICONIFIED);
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

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        try {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Sign_up.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        String user = RUNametxt.getText();
        try{
            String sql = "select * from Account where User_Name = '"+user+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String c = rs.getString("Category");
                RCategoryTxt.setText(c);
                String f = rs.getString("First_Name");
                RFnameTxt.setText(f);
                String l = rs.getString("Last_Name");
                RLNameTxt.setText(l);
                String n = rs.getString("NICno");
                RnicTxt.setText(n);
                String d = rs.getString("DOB");
                RdobTxt.setText(d);
                String p = rs.getString("P_No");
                
                JOptionPane.showMessageDialog(null, "If Your Details Are Correct, Reset Your Password");
                
                OldPasswordtxt.setEnabled(true);
                NewPasswordTxt.setEnabled(true);
                CPasswordTxt.setEnabled(true);
                
                
                rs.close();
                pst.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(SQLException e){

            }
        }

    }//GEN-LAST:event_SearchMouseClicked

    private void RUNametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RUNametxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        try{
            String sql = "select * from Account where User_Name=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, RUNametxt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                RUNametxt.setEnabled(false);
                JOptionPane.showMessageDialog(null, "This is a Valid User Name, Hit Search");
            }else{
                JOptionPane.showMessageDialog(null, "This is a Invalid User Name");
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{
            rs.close();
            pst.close();
            }catch(SQLException e){
            
            }
        }
        }
    }//GEN-LAST:event_RUNametxtKeyPressed

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        String newpass = NewPasswordTxt.getText();
        String confirm = CPasswordTxt.getText();
        String user = RUNametxt.getText();
        try{
            String sql = "select * from Account where User_Name='"+user+"'and Password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, OldPasswordtxt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                if(newpass.equals(confirm)){
                String sq = "update Account set Password='"+confirm+"'where User_Name='"+user+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Password Changed Successfully");
                }else{
                JOptionPane.showMessageDialog(null, "New and Confirm Passwords Doesn't Match!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Old Password is Incorrect");
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
            rs.close();
            pst.close();
            }catch(SQLException e){
            
            }
        }
        
    }//GEN-LAST:event_ResetMouseClicked

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if(ShowPassword.isSelected()){
            NewPasswordTxt.setEchoChar((char)0);
            CPasswordTxt.setEchoChar((char)0);
        }else{
            NewPasswordTxt.setEchoChar('*');
            CPasswordTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Reset_Password().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reset_Password.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPassword;
    private javax.swing.JPasswordField CPasswordTxt;
    private javax.swing.JLabel Category;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Dob;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home0;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel NICno;
    private javax.swing.JLabel NewPassword;
    private javax.swing.JPasswordField NewPasswordTxt;
    private javax.swing.JLabel OldPassword;
    private javax.swing.JTextField OldPasswordtxt;
    private javax.swing.JLabel RCategoryTxt;
    private javax.swing.JLabel RFnameTxt;
    private javax.swing.JLabel RLNameTxt;
    private javax.swing.JLabel RPasswordBckgrnd;
    private javax.swing.JTextField RUNametxt;
    private javax.swing.JLabel RdobTxt;
    private javax.swing.JLabel Reset;
    private javax.swing.JLabel Reset0;
    private javax.swing.JLabel RnicTxt;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel Search0;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel UserName;
    // End of variables declaration//GEN-END:variables
}

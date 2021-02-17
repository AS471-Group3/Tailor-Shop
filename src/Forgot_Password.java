
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Forgot_Password extends javax.swing.JFrame {
   
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int xMouse;
    int yMouse;
   
    public Forgot_Password() throws SQLException {
        super("Forgot Password");
        initComponents();
        conn = DataBase.DbConnect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoveBar = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        Category = new javax.swing.JLabel();
        CategoryTxt = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        LastNameTxt = new javax.swing.JLabel();
        NICno = new javax.swing.JLabel();
        NICnoTxt = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        DOBTxt = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        Search0 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Home0 = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        MailTxt = new javax.swing.JLabel();
        PhoneNo = new javax.swing.JLabel();
        PNOTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        UserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Name        :");
        getContentPane().add(UserName);
        UserName.setBounds(40, 160, 170, 40);

        TxtUser.setBackground(new java.awt.Color(255, 255, 255));
        TxtUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TxtUser.setForeground(new java.awt.Color(0, 0, 0));
        TxtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUserKeyPressed(evt);
            }
        });
        getContentPane().add(TxtUser);
        TxtUser.setBounds(220, 160, 300, 40);

        Category.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Category.setForeground(new java.awt.Color(255, 255, 255));
        Category.setText("Category            :");
        getContentPane().add(Category);
        Category.setBounds(40, 220, 170, 40);

        CategoryTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CategoryTxt.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(CategoryTxt);
        CategoryTxt.setBounds(220, 220, 300, 40);

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name         :");
        getContentPane().add(FirstName);
        FirstName.setBounds(40, 280, 170, 40);

        FirstNameTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FirstNameTxt.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(FirstNameTxt);
        FirstNameTxt.setBounds(220, 280, 300, 40);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name         :");
        getContentPane().add(LastName);
        LastName.setBounds(40, 330, 170, 40);

        LastNameTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LastNameTxt.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(LastNameTxt);
        LastNameTxt.setBounds(220, 330, 300, 40);

        NICno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NICno.setForeground(new java.awt.Color(255, 255, 255));
        NICno.setText("NIC No               :  ");
        getContentPane().add(NICno);
        NICno.setBounds(40, 380, 170, 40);

        NICnoTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NICnoTxt.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(NICnoTxt);
        NICnoTxt.setBounds(220, 380, 300, 40);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DOB.setForeground(new java.awt.Color(255, 255, 255));
        DOB.setText("DOB                    :");
        getContentPane().add(DOB);
        DOB.setBounds(40, 430, 170, 40);

        DOBTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DOBTxt.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(DOBTxt);
        DOBTxt.setBounds(220, 430, 300, 40);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password          :");
        getContentPane().add(Password);
        Password.setBounds(40, 580, 170, 40);

        PasswordTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(PasswordTxt);
        PasswordTxt.setBounds(220, 580, 300, 40);

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
        Search.setBounds(550, 160, 170, 50);

        Search0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Search0.setText("jLabel11");
        getContentPane().add(Search0);
        Search0.setBounds(550, 160, 170, 50);

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
        Home.setBounds(740, 160, 170, 50);

        Home0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Home0.setText("jLabel11");
        getContentPane().add(Home0);
        Home0.setBounds(740, 160, 170, 50);

        Mail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Mail.setForeground(new java.awt.Color(255, 255, 255));
        Mail.setText("E-Mail                :");
        getContentPane().add(Mail);
        Mail.setBounds(40, 530, 160, 40);

        MailTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MailTxt.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MailTxt);
        MailTxt.setBounds(220, 530, 300, 40);

        PhoneNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNo.setText("Phone No          :");
        getContentPane().add(PhoneNo);
        PhoneNo.setBounds(40, 480, 160, 40);

        PNOTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PNOTxt.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(PNOTxt);
        PNOTxt.setBounds(220, 480, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Forgot.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 925, 650);

        setSize(new java.awt.Dimension(924, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
       setVisible(false);
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Forgot_Password.ICONIFIED);
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

    private void TxtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUserKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        try{
            String sql = "select * from Account where User_Name=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, TxtUser.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                TxtUser.setEnabled(false);
                JOptionPane.showMessageDialog(null, "This is a Valid User Name, Hit Search");
            }else{
                JOptionPane.showMessageDialog(null, "This is a Invalid User Name!");
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
        
    }//GEN-LAST:event_TxtUserKeyPressed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
       String user = TxtUser.getText();
       try{
       String sql = "select * from Account where User_Name = '"+user+"'";
       pst = conn.prepareStatement(sql);
       rs = pst.executeQuery();
       if(rs.next()){
           String c = rs.getString("Category");
           CategoryTxt.setText(c);
           String f = rs.getString("First_Name");
           FirstNameTxt.setText(f);
           String l = rs.getString("Last_Name");
           LastNameTxt.setText(l);
           String n = rs.getString("NICno");
           NICnoTxt.setText(n);
           String d = rs.getString("DOB");
           DOBTxt.setText(d);
           String p = rs.getString("P_No");
           PNOTxt.setText(p);
           String m = rs.getString("E_Mail");
           MailTxt.setText(m);
           String s = rs.getString("Password");
           PasswordTxt.setText(s);
           
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

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Forgot_Password().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Forgot_Password.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.JLabel CategoryTxt;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel DOBTxt;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel FirstNameTxt;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home0;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel LastNameTxt;
    private javax.swing.JLabel Mail;
    private javax.swing.JLabel MailTxt;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel NICno;
    private javax.swing.JLabel NICnoTxt;
    private javax.swing.JLabel PNOTxt;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel PasswordTxt;
    private javax.swing.JLabel PhoneNo;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel Search0;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}


public class Reset_Password extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    
    public Reset_Password() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoveBar = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        LastNameTxt = new javax.swing.JTextField();
        NICno = new javax.swing.JLabel();
        NICnoTxt = new javax.swing.JTextField();
        Dob = new javax.swing.JLabel();
        DOBTxt = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        UserNametxt = new javax.swing.JTextField();
        OldPassword = new javax.swing.JLabel();
        OldPasswordtxt = new javax.swing.JTextField();
        NewPassword = new javax.swing.JLabel();
        NewPasswordtxt = new javax.swing.JTextField();
        CPassword = new javax.swing.JLabel();
        CPAsswordTxt = new javax.swing.JTextField();
        Reset = new javax.swing.JLabel();
        Reset0 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Home0 = new javax.swing.JLabel();
        RPasswordBckgrnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name         :");
        getContentPane().add(FirstName);
        FirstName.setBounds(30, 170, 170, 40);

        FirstNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(FirstNameTxt);
        FirstNameTxt.setBounds(210, 170, 300, 40);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name         :");
        getContentPane().add(LastName);
        LastName.setBounds(30, 220, 170, 40);

        LastNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(LastNameTxt);
        LastNameTxt.setBounds(210, 220, 300, 40);

        NICno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NICno.setForeground(new java.awt.Color(255, 255, 255));
        NICno.setText("NIC No               :  ");
        getContentPane().add(NICno);
        NICno.setBounds(30, 270, 170, 40);

        NICnoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(NICnoTxt);
        NICnoTxt.setBounds(210, 270, 300, 40);

        Dob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Dob.setForeground(new java.awt.Color(255, 255, 255));
        Dob.setText("DOB                    :");
        getContentPane().add(Dob);
        Dob.setBounds(30, 320, 170, 40);

        DOBTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(DOBTxt);
        DOBTxt.setBounds(210, 320, 300, 40);

        UserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Name        :");
        getContentPane().add(UserName);
        UserName.setBounds(30, 370, 170, 40);

        UserNametxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(UserNametxt);
        UserNametxt.setBounds(210, 370, 300, 40);

        OldPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OldPassword.setForeground(new java.awt.Color(255, 255, 255));
        OldPassword.setText("Old Password   :");
        getContentPane().add(OldPassword);
        OldPassword.setBounds(30, 420, 170, 40);

        OldPasswordtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(OldPasswordtxt);
        OldPasswordtxt.setBounds(210, 420, 300, 40);

        NewPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewPassword.setForeground(new java.awt.Color(255, 255, 255));
        NewPassword.setText("New Password :");
        getContentPane().add(NewPassword);
        NewPassword.setBounds(30, 470, 170, 40);

        NewPasswordtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(NewPasswordtxt);
        NewPasswordtxt.setBounds(210, 470, 300, 40);

        CPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CPassword.setForeground(new java.awt.Color(255, 255, 255));
        CPassword.setText("Confirm Password:");
        getContentPane().add(CPassword);
        CPassword.setBounds(30, 520, 180, 40);

        CPAsswordTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(CPAsswordTxt);
        CPAsswordTxt.setBounds(210, 520, 300, 40);

        Reset.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reset.setText("Reset");
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Reset);
        Reset.setBounds(560, 570, 170, 60);

        Reset0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Reset0.setText("jLabel11");
        getContentPane().add(Reset0);
        Reset0.setBounds(560, 570, 170, 60);

        Home.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setText("Home");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Home);
        Home.setBounds(750, 570, 150, 60);

        Home0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Home0.setText("jLabel11");
        getContentPane().add(Home0);
        Home0.setBounds(750, 570, 150, 60);

        RPasswordBckgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reset.png"))); // NOI18N
        getContentPane().add(RPasswordBckgrnd);
        RPasswordBckgrnd.setBounds(-2, -4, 930, 660);

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

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reset_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPAsswordTxt;
    private javax.swing.JLabel CPassword;
    private javax.swing.JLabel Close;
    private javax.swing.JTextField DOBTxt;
    private javax.swing.JLabel Dob;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home0;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel NICno;
    private javax.swing.JTextField NICnoTxt;
    private javax.swing.JLabel NewPassword;
    private javax.swing.JTextField NewPasswordtxt;
    private javax.swing.JLabel OldPassword;
    private javax.swing.JTextField OldPasswordtxt;
    private javax.swing.JLabel RPasswordBckgrnd;
    private javax.swing.JLabel Reset;
    private javax.swing.JLabel Reset0;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNametxt;
    // End of variables declaration//GEN-END:variables
}

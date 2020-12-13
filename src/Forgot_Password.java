
public class Forgot_Password extends javax.swing.JFrame {
   
    int xMouse;
    int yMouse;
   
    public Forgot_Password() {
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
        DOB = new javax.swing.JLabel();
        DOBTxt = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();
        Search0 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Home0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        FirstName.setBounds(40, 180, 170, 40);

        FirstNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(FirstNameTxt);
        FirstNameTxt.setBounds(220, 180, 300, 40);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name         :");
        getContentPane().add(LastName);
        LastName.setBounds(40, 230, 170, 40);

        LastNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(LastNameTxt);
        LastNameTxt.setBounds(220, 230, 300, 40);

        NICno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NICno.setForeground(new java.awt.Color(255, 255, 255));
        NICno.setText("NIC No               :  ");
        getContentPane().add(NICno);
        NICno.setBounds(40, 280, 170, 40);

        NICnoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(NICnoTxt);
        NICnoTxt.setBounds(220, 280, 300, 40);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DOB.setForeground(new java.awt.Color(255, 255, 255));
        DOB.setText("DOB                    :");
        getContentPane().add(DOB);
        DOB.setBounds(40, 330, 170, 40);

        DOBTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(DOBTxt);
        DOBTxt.setBounds(220, 330, 300, 40);

        UserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Name        :");
        getContentPane().add(UserName);
        UserName.setBounds(40, 380, 170, 40);

        UserNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(UserNameTxt);
        UserNameTxt.setBounds(220, 380, 300, 40);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password          :");
        getContentPane().add(Password);
        Password.setBounds(40, 430, 170, 40);

        Passwordtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Passwordtxt);
        Passwordtxt.setBounds(220, 430, 300, 40);

        Search.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Search.setText("Search");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Search);
        Search.setBounds(330, 560, 230, 60);

        Search0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Search0.setText("jLabel11");
        getContentPane().add(Search0);
        Search0.setBounds(330, 560, 230, 60);

        Home.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setText("Home");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Home);
        Home.setBounds(680, 560, 210, 60);

        Home0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Home0.setText("jLabel11");
        getContentPane().add(Home0);
        Home0.setBounds(680, 560, 210, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Forgot.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 925, 650);

        setSize(new java.awt.Dimension(925, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
       System.exit(0);
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

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel DOB;
    private javax.swing.JTextField DOBTxt;
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
    private javax.swing.JLabel Password;
    private javax.swing.JTextField Passwordtxt;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel Search0;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

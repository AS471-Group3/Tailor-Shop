
import Admin.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Admin_MainForm extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public Admin_MainForm() {
        initComponents();
        GetText();
    }

   public void GetText(){
        AUser.setText(Login.UserNameTxt.getText());
        ACategory.setText(Login.CombSelect.getSelectedItem().toString());
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AUser = new javax.swing.JLabel();
        ACategory = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        MoveBar = new javax.swing.JLabel();
        Cus0 = new javax.swing.JLabel();
        Cus1 = new javax.swing.JLabel();
        Emp1 = new javax.swing.JLabel();
        Emp0 = new javax.swing.JLabel();
        Ord1 = new javax.swing.JLabel();
        Ord0 = new javax.swing.JLabel();
        Pay0 = new javax.swing.JLabel();
        Pay1 = new javax.swing.JLabel();
        Set1 = new javax.swing.JLabel();
        Set0 = new javax.swing.JLabel();
        Quite1 = new javax.swing.JLabel();
        Quit0 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Exit0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        AUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AUser.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(AUser);
        AUser.setBounds(950, 80, 150, 20);

        ACategory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ACategory.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(ACategory);
        ACategory.setBounds(950, 110, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category  :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(850, 110, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User  :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(890, 80, 60, 22);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(1050, 0, 60, 50);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(1000, 0, 50, 50);

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
        MoveBar.setBounds(0, 0, 990, 50);

        Cus0.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Cus0.setForeground(new java.awt.Color(0, 0, 0));
        Cus0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cus0.setText("Customer");
        Cus0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cus0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cus0MouseClicked(evt);
            }
        });
        getContentPane().add(Cus0);
        Cus0.setBounds(90, 250, 240, 110);

        Cus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Cus1.setText("jLabel2");
        getContentPane().add(Cus1);
        Cus1.setBounds(90, 250, 240, 110);

        Emp1.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Emp1.setForeground(new java.awt.Color(0, 0, 0));
        Emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Emp1.setText(" Employee");
        Emp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Emp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emp1MouseClicked(evt);
            }
        });
        getContentPane().add(Emp1);
        Emp1.setBounds(460, 250, 240, 110);

        Emp0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Emp0.setText("jLabel2");
        getContentPane().add(Emp0);
        Emp0.setBounds(460, 250, 240, 110);

        Ord1.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Ord1.setForeground(new java.awt.Color(0, 0, 0));
        Ord1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ord1.setText("Order");
        Ord1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ord1MouseClicked(evt);
            }
        });
        getContentPane().add(Ord1);
        Ord1.setBounds(810, 250, 240, 110);

        Ord0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Ord0.setText("jLabel2");
        getContentPane().add(Ord0);
        Ord0.setBounds(810, 250, 240, 110);

        Pay0.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Pay0.setForeground(new java.awt.Color(0, 0, 0));
        Pay0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pay0.setText("Payment");
        Pay0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pay0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pay0MouseClicked(evt);
            }
        });
        getContentPane().add(Pay0);
        Pay0.setBounds(80, 470, 240, 110);

        Pay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Pay1.setText("jLabel2");
        getContentPane().add(Pay1);
        Pay1.setBounds(80, 470, 240, 110);

        Set1.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Set1.setForeground(new java.awt.Color(0, 0, 0));
        Set1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Set1.setText("Settings");
        Set1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Set1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Set1MouseClicked(evt);
            }
        });
        getContentPane().add(Set1);
        Set1.setBounds(450, 470, 240, 110);

        Set0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Set0.setText("jLabel2");
        getContentPane().add(Set0);
        Set0.setBounds(450, 470, 240, 110);

        Quite1.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Quite1.setForeground(new java.awt.Color(0, 0, 0));
        Quite1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Quite1.setText("Quite");
        Quite1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Quite1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quite1MouseClicked(evt);
            }
        });
        getContentPane().add(Quite1);
        Quite1.setBounds(900, 660, 170, 50);

        Quit0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit0.setText("jLabel2");
        getContentPane().add(Quit0);
        Quit0.setBounds(900, 660, 170, 50);

        Home.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
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
        Home.setBounds(690, 660, 170, 50);

        Exit0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Exit0.setText("jLabel11");
        getContentPane().add(Exit0);
        Exit0.setBounds(690, 660, 170, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\TSMS\\Pic\\Admin.png")); // NOI18N
        jLabel1.setText("Admin Main Form");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 750);

        setSize(new java.awt.Dimension(1111, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        /*try {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jLabel1MouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Admin_MainForm.ICONIFIED);
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

    private void Cus0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cus0MouseClicked
        try {
            //setVisible(false);
            Customer l;
            l = new Admin.Customer();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Cus0MouseClicked

    private void Emp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emp1MouseClicked
        //setVisible(false);
        Employee l;
        l = new Admin.Employee();
        l.setVisible(true);
    }//GEN-LAST:event_Emp1MouseClicked

    private void Ord1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ord1MouseClicked
        //setVisible(false);
        Order l = new Order();
        l.setVisible(true);
    }//GEN-LAST:event_Ord1MouseClicked

    private void Pay0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pay0MouseClicked
        //setVisible(false);
        Payment l = new Payment();
        l.setVisible(true);
    }//GEN-LAST:event_Pay0MouseClicked

    private void Set1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Set1MouseClicked
        //setVisible(false);
        Settings l = new Settings();
        l.setVisible(true);
    }//GEN-LAST:event_Set1MouseClicked

    private void Quite1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quite1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Quite1MouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        try {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Sign_up.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HomeMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACategory;
    private javax.swing.JLabel AUser;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Cus0;
    private javax.swing.JLabel Cus1;
    private javax.swing.JLabel Emp0;
    private javax.swing.JLabel Emp1;
    private javax.swing.JLabel Exit0;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel Ord0;
    private javax.swing.JLabel Ord1;
    private javax.swing.JLabel Pay0;
    private javax.swing.JLabel Pay1;
    private javax.swing.JLabel Quit0;
    private javax.swing.JLabel Quite1;
    private javax.swing.JLabel Set0;
    private javax.swing.JLabel Set1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

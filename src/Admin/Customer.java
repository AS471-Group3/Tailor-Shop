package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Customer extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    int xMouse;
    int yMouse;
    
    public Customer() throws SQLException {
        super("Customer");
        initComponents();
        conn = DataBase.DbConnect();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoveBar = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Pno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Nic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Dob = new javax.swing.JTextField();
        Rup = new javax.swing.JRadioButton();
        Radd = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        Shorts = new javax.swing.JTextField();
        Chest = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Shoulder = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Sleeve = new javax.swing.JTextField();
        Waist = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Length = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Thigh = new javax.swing.JTextField();
        Knee = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Tlength = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Bottom = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Hip = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Twaist = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Sother = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Tother = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        BShorts = new javax.swing.JCheckBox();
        Collar = new javax.swing.JTextField();
        Bshirt = new javax.swing.JCheckBox();
        Shirt = new javax.swing.JTextField();
        BTrouser = new javax.swing.JCheckBox();
        Trouser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        Quit0 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Quit1 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        Quit2 = new javax.swing.JLabel();
        Update = new javax.swing.JLabel();
        Quit3 = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        Quit4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        DDate = new javax.swing.JTextField();
        ODate = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Find1 = new javax.swing.JLabel();
        Quit5 = new javax.swing.JLabel();
        Find2 = new javax.swing.JLabel();
        Quit6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        MoveBar.setBounds(0, 0, 990, 40);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(1000, 0, 50, 40);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(1050, 0, 60, 40);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cus ID    :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 290, 100, 30);

        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Id.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Id);
        Id.setBounds(170, 290, 220, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name      :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 360, 100, 30);

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Name);
        Name.setBounds(170, 360, 330, 30);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 420, 100, 30);

        Address.setBackground(new java.awt.Color(255, 255, 255));
        Address.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Address.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Address);
        Address.setBounds(170, 410, 330, 50);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("P.No        :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 480, 100, 30);

        Pno.setBackground(new java.awt.Color(255, 255, 255));
        Pno.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Pno.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Pno);
        Pno.setBounds(170, 480, 330, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIC          :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 530, 100, 30);

        Nic.setBackground(new java.awt.Color(255, 255, 255));
        Nic.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Nic.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Nic);
        Nic.setBounds(170, 530, 330, 30);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOB        :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 580, 100, 30);

        Dob.setBackground(new java.awt.Color(255, 255, 255));
        Dob.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Dob.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Dob);
        Dob.setBounds(170, 580, 330, 30);

        Rup.setBackground(new java.awt.Color(0, 0, 0));
        Rup.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Rup.setForeground(new java.awt.Color(255, 255, 255));
        Rup.setText("Update Customer");
        Rup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RupActionPerformed(evt);
            }
        });
        getContentPane().add(Rup);
        Rup.setBounds(270, 250, 170, 28);

        Radd.setBackground(new java.awt.Color(0, 0, 0));
        Radd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Radd.setForeground(new java.awt.Color(255, 255, 255));
        Radd.setText("Add Customer");
        Radd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaddActionPerformed(evt);
            }
        });
        getContentPane().add(Radd);
        Radd.setBounds(110, 250, 150, 28);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Collar    :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(580, 180, 100, 40);

        Shorts.setBackground(new java.awt.Color(255, 255, 255));
        Shorts.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Shorts.setForeground(new java.awt.Color(0, 0, 0));
        Shorts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Shorts);
        Shorts.setBounds(950, 670, 100, 30);

        Chest.setBackground(new java.awt.Color(255, 255, 255));
        Chest.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Chest.setForeground(new java.awt.Color(0, 0, 0));
        Chest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Chest);
        Chest.setBounds(690, 230, 120, 40);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Chest    :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(580, 230, 100, 40);

        Shoulder.setBackground(new java.awt.Color(255, 255, 255));
        Shoulder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Shoulder.setForeground(new java.awt.Color(0, 0, 0));
        Shoulder.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Shoulder);
        Shoulder.setBounds(690, 280, 120, 40);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Shoulder :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(580, 280, 100, 40);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sleeve :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(850, 280, 100, 40);

        Sleeve.setBackground(new java.awt.Color(255, 255, 255));
        Sleeve.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Sleeve.setForeground(new java.awt.Color(0, 0, 0));
        Sleeve.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Sleeve);
        Sleeve.setBounds(960, 280, 120, 40);

        Waist.setBackground(new java.awt.Color(255, 255, 255));
        Waist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Waist.setForeground(new java.awt.Color(0, 0, 0));
        Waist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Waist);
        Waist.setBounds(960, 230, 120, 40);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Waist    :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(850, 230, 100, 40);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Length  :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(850, 180, 100, 40);

        Length.setBackground(new java.awt.Color(255, 255, 255));
        Length.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Length.setForeground(new java.awt.Color(0, 0, 0));
        Length.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Length);
        Length.setBounds(960, 180, 120, 40);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 58)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Details");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 60, 290, 100);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Thigh    :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(850, 460, 100, 40);

        Thigh.setBackground(new java.awt.Color(255, 255, 255));
        Thigh.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Thigh.setForeground(new java.awt.Color(0, 0, 0));
        Thigh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Thigh);
        Thigh.setBounds(960, 460, 120, 40);

        Knee.setBackground(new java.awt.Color(255, 255, 255));
        Knee.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Knee.setForeground(new java.awt.Color(0, 0, 0));
        Knee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Knee);
        Knee.setBounds(960, 510, 120, 40);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Length  :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(850, 410, 100, 40);

        Tlength.setBackground(new java.awt.Color(255, 255, 255));
        Tlength.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Tlength.setForeground(new java.awt.Color(0, 0, 0));
        Tlength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Tlength);
        Tlength.setBounds(960, 410, 120, 40);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Knee    :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(850, 510, 100, 40);

        Bottom.setBackground(new java.awt.Color(255, 255, 255));
        Bottom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Bottom.setForeground(new java.awt.Color(0, 0, 0));
        Bottom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Bottom);
        Bottom.setBounds(690, 510, 120, 40);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Bottom :");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(580, 510, 100, 40);

        Hip.setBackground(new java.awt.Color(255, 255, 255));
        Hip.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Hip.setForeground(new java.awt.Color(0, 0, 0));
        Hip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Hip);
        Hip.setBounds(690, 460, 120, 40);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Hip        :");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(580, 460, 100, 40);

        Twaist.setBackground(new java.awt.Color(255, 255, 255));
        Twaist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Twaist.setForeground(new java.awt.Color(0, 0, 0));
        Twaist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Twaist);
        Twaist.setBounds(690, 410, 120, 40);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Waist    :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(580, 410, 100, 40);

        Sother.setBackground(new java.awt.Color(255, 255, 255));
        Sother.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Sother.setForeground(new java.awt.Color(0, 0, 0));
        Sother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Sother);
        Sother.setBounds(690, 340, 390, 40);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Other    :");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(580, 340, 100, 40);

        Tother.setBackground(new java.awt.Color(255, 255, 255));
        Tother.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Tother.setForeground(new java.awt.Color(0, 0, 0));
        Tother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Tother);
        Tother.setBounds(690, 570, 390, 40);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Other    :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(580, 570, 100, 40);

        BShorts.setBackground(new java.awt.Color(0, 0, 0));
        BShorts.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BShorts.setForeground(new java.awt.Color(255, 255, 255));
        BShorts.setText("Shorts");
        BShorts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BShortsActionPerformed(evt);
            }
        });
        getContentPane().add(BShorts);
        BShorts.setBounds(950, 630, 110, 28);

        Collar.setBackground(new java.awt.Color(255, 255, 255));
        Collar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Collar.setForeground(new java.awt.Color(0, 0, 0));
        Collar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Collar);
        Collar.setBounds(690, 180, 120, 40);

        Bshirt.setBackground(new java.awt.Color(0, 0, 0));
        Bshirt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Bshirt.setForeground(new java.awt.Color(255, 255, 255));
        Bshirt.setText("Shirt");
        Bshirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BshirtActionPerformed(evt);
            }
        });
        getContentPane().add(Bshirt);
        Bshirt.setBounds(630, 630, 110, 28);

        Shirt.setBackground(new java.awt.Color(255, 255, 255));
        Shirt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Shirt.setForeground(new java.awt.Color(0, 0, 0));
        Shirt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Shirt);
        Shirt.setBounds(620, 670, 100, 30);

        BTrouser.setBackground(new java.awt.Color(0, 0, 0));
        BTrouser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BTrouser.setForeground(new java.awt.Color(255, 255, 255));
        BTrouser.setText("Trouser");
        BTrouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTrouserActionPerformed(evt);
            }
        });
        getContentPane().add(BTrouser);
        BTrouser.setBounds(780, 630, 110, 28);

        Trouser.setBackground(new java.awt.Color(255, 255, 255));
        Trouser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Trouser.setForeground(new java.awt.Color(0, 0, 0));
        Trouser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Trouser);
        Trouser.setBounds(780, 670, 100, 30);

        jLabel9.setFont(new java.awt.Font("High Tower Text", 1, 58)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 0, 290, 100);

        clear.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("Clear");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(360, 710, 170, 50);

        Quit0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit0.setText("jLabel2");
        getContentPane().add(Quit0);
        Quit0.setBounds(360, 710, 170, 50);

        Back.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 0));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("Back");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(130, 710, 170, 50);

        Quit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit1.setText("jLabel2");
        getContentPane().add(Quit1);
        Quit1.setBounds(130, 710, 170, 50);

        add.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(130, 640, 170, 50);

        Quit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit2.setText("jLabel2");
        getContentPane().add(Quit2);
        Quit2.setBounds(130, 640, 170, 50);

        Update.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 0, 0));
        Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Update.setText("Update");
        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(360, 640, 170, 50);

        Quit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit3.setText("jLabel2");
        getContentPane().add(Quit3);
        Quit3.setBounds(360, 640, 170, 50);

        search.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(410, 290, 130, 30);

        Quit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit4.setText("jLabel2");
        getContentPane().add(Quit4);
        Quit4.setBounds(410, 290, 130, 30);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Order Date :");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(570, 720, 110, 40);

        DDate.setBackground(new java.awt.Color(255, 255, 255));
        DDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DDate.setForeground(new java.awt.Color(0, 0, 0));
        DDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(DDate);
        DDate.setBounds(970, 720, 120, 40);

        ODate.setBackground(new java.awt.Color(255, 255, 255));
        ODate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ODate.setForeground(new java.awt.Color(0, 0, 0));
        ODate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ODate);
        ODate.setBounds(690, 720, 120, 40);

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Delivery Date :");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(830, 720, 140, 40);

        Find1.setFont(new java.awt.Font("High Tower Text", 1, 14)); // NOI18N
        Find1.setForeground(new java.awt.Color(0, 0, 0));
        Find1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Find1.setText("Find");
        Find1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Find1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Find1MouseClicked(evt);
            }
        });
        getContentPane().add(Find1);
        Find1.setBounds(510, 480, 40, 30);

        Quit5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit5.setText("jLabel2");
        getContentPane().add(Quit5);
        Quit5.setBounds(510, 480, 40, 30);

        Find2.setFont(new java.awt.Font("High Tower Text", 1, 14)); // NOI18N
        Find2.setForeground(new java.awt.Color(0, 0, 0));
        Find2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Find2.setText("Find");
        Find2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Find2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Find2MouseClicked(evt);
            }
        });
        getContentPane().add(Find2);
        Find2.setBounds(510, 530, 40, 30);

        Quit6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        Quit6.setText("jLabel2");
        getContentPane().add(Quit6);
        Quit6.setBounds(510, 530, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add cus.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 780);

        setSize(new java.awt.Dimension(1109, 779));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MoveBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MoveBarMouseDragged

    private void MoveBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveBarMousePressed

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Customer.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
       setVisible(false);
    }//GEN-LAST:event_CloseMouseClicked

    private void RupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RupActionPerformed
        if(Rup.isSelected()){
            add.setEnabled(false);           
        }else{
            add.setEnabled(true);
        }
    }//GEN-LAST:event_RupActionPerformed

    private void RaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaddActionPerformed
        if(Radd.isSelected()){
            Update.setEnabled(false);
        }else{
            Update.setEnabled(true);
        }
    }//GEN-LAST:event_RaddActionPerformed

    private void BShortsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BShortsActionPerformed
        if(BShorts.isSelected()){
            Shorts.setEditable(true);
        }else{
            Shorts.setEditable(false);
        }
    }//GEN-LAST:event_BShortsActionPerformed

    private void BshirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BshirtActionPerformed
        if(Bshirt.isSelected()){
            Shirt.setEditable(true);
        }else{
            Shirt.setEditable(false);
        }
    }//GEN-LAST:event_BshirtActionPerformed

    private void BTrouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTrouserActionPerformed
        if(BTrouser.isSelected()){
            Trouser.setEditable(true);
        }else{
            Trouser.setEditable(false);
        }
    }//GEN-LAST:event_BTrouserActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        Id.setText("");
        Name.setText("");
        Address.setText("");
        Pno.setText("");
        Nic.setText("");
        Dob.setText("");
        Collar.setText("");
        Length.setText("");
        Chest.setText("");
        Waist.setText("");
        Shoulder.setText("");
        Sleeve.setText("");
        Sother.setText("");
        Twaist.setText("");
        Tlength.setText("");
        Hip.setText("");
        Thigh.setText("");
        Bottom.setText("");
        Knee.setText("");
        Tother.setText("");
        Shirt.setText("");
        Trouser.setText("");
        Shorts.setText("");
        ODate.setText("");
        DDate.setText("");
        
    }//GEN-LAST:event_clearMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        /*setVisible(false);
        Admin_MainForm l = new Admin_MainForm();
        l.setVisible(true);*/
    }//GEN-LAST:event_BackMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
        try{
            
            String sql = "insert into Customer (CusID,Name,Address,Pno,NIC,DOB,Collar,Length,Chest,Waist,Shoulder,Sleeve,SOther,Twaist,Tlength,Hip,Thigh,Bottom,Knee,Tother,Shirt,Trouser,Shorts,ODate,DDate)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, Id.getText());
            pst.setString(2, Name.getText());
            pst.setString(3, Address.getText());
            pst.setString(4, Pno.getText());
            pst.setString(5, Nic.getText());
            pst.setString(6, Dob.getText());
            pst.setString(7, Collar.getText());
            pst.setString(8, Length.getText());
            pst.setString(9, Chest.getText());           
            pst.setString(10, Waist.getText());
            pst.setString(11, Shoulder.getText());
            pst.setString(12, Sleeve.getText());
            pst.setString(13, Sother.getText());
            pst.setString(14, Twaist.getText());
            pst.setString(15, Tlength.getText());
            pst.setString(16, Hip.getText());
            pst.setString(17, Thigh.getText());
            pst.setString(18, Bottom.getText());
            pst.setString(19, Knee.getText());           
            pst.setString(20, Tother.getText());
            pst.setString(21, Shirt.getText());
            pst.setString(22, Trouser.getText());           
            pst.setString(23, Shorts.getText());
            pst.setString(24, ODate.getText());
            pst.setString(25, DDate.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added Successfully");         
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Sorry, Details Not Added To The DataBase./n Try Again");
        }
    }//GEN-LAST:event_addMouseClicked

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
       String id = Id.getText();
       try{
       String sql = "select * from Customer where CusID = '"+id+"'";
       pst = conn.prepareStatement(sql);
       rs = pst.executeQuery();
       if(rs.next()){
           String a = rs.getString("Name");
           Name.setText(a);
           String b = rs.getString("Address");
           Address.setText(b);
           String c = rs.getString("Pno");
           Pno.setText(c);
           String d = rs.getString("NIC");
           Nic.setText(d);
           String e = rs.getString("DOB");
           Dob.setText(e);
           String f = rs.getString("Collar");
           Collar.setText(f);
           String g = rs.getString("Length");
           Length.setText(g);
           String h = rs.getString("Chest");
           Chest.setText(h);
           String i = rs.getString("Waist");
           Waist.setText(i);
           String j = rs.getString("Shoulder");
           Shoulder.setText(j);
           String k = rs.getString("Sleeve");
           Sleeve.setText(k);
           String l = rs.getString("SOther");
           Sother.setText(l);
           String m = rs.getString("TWaist");
           Twaist.setText(m);
           String n = rs.getString("Tlenght");
           Tlength.setText(n);
           String o = rs.getString("Hip");
           Hip.setText(o);
           String p = rs.getString("Thigh");
           Thigh.setText(p);
           String q = rs.getString("Bottom");
           Bottom.setText(q);
           String r = rs.getString("Knee");
           Knee.setText(r);
           String s = rs.getString("Tother");
           Tother.setText(s);
           String t = rs.getString("Shirt");
           Shirt.setText(t);
           String u = rs.getString("Trouser");
           Trouser.setText(u);
           String v = rs.getString("Shorts");
           Shorts.setText(v);
           String w = rs.getString("ODate");
           ODate.setText(w);
           String x = rs.getString("DDate");
           DDate.setText(x);
           
           rs.close();
           pst.close();
       }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No Data Found");
       }finally{
            try{
            rs.close();
            pst.close();
            }catch(SQLException e){
            
            }
        }
    }//GEN-LAST:event_searchMouseClicked

    private void Find1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find1MouseClicked
        String no = Pno.getText();
       try{
       String sql = "select * from Customer where Pno = '"+no+"'";
       pst = conn.prepareStatement(sql);
       rs = pst.executeQuery();
       if(rs.next()){
           String a = rs.getString("Name");
           Name.setText(a);
           String b = rs.getString("Address");
           Address.setText(b);
           String c = rs.getString("Pno");
           Pno.setText(c);
           String d = rs.getString("NIC");
           Nic.setText(d);
           String e = rs.getString("DOB");
           Dob.setText(e);
           String f = rs.getString("Collar");
           Collar.setText(f);
           String g = rs.getString("Length");
           Length.setText(g);
           String h = rs.getString("Chest");
           Chest.setText(h);
           String i = rs.getString("Waist");
           Waist.setText(i);
           String j = rs.getString("Shoulder");
           Shoulder.setText(j);
           String k = rs.getString("Sleeve");
           Sleeve.setText(k);
           String l = rs.getString("SOther");
           Sother.setText(l);
           String m = rs.getString("TWaist");
           Twaist.setText(m);
           String n = rs.getString("Tlenght");
           Tlength.setText(n);
           String o = rs.getString("Hip");
           Hip.setText(o);
           String p = rs.getString("Thigh");
           Thigh.setText(p);
           String q = rs.getString("Bottom");
           Bottom.setText(q);
           String r = rs.getString("Knee");
           Knee.setText(r);
           String s = rs.getString("Tother");
           Tother.setText(s);
           String t = rs.getString("Shirt");
           Shirt.setText(t);
           String u = rs.getString("Trouser");
           Trouser.setText(u);
           String v = rs.getString("Shorts");
           Shorts.setText(v);
           String w = rs.getString("ODate");
           ODate.setText(w);
           String x = rs.getString("DDate");
           DDate.setText(x);
           
           rs.close();
           pst.close();
       }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No Data Found");
       }finally{
            try{
            rs.close();
            pst.close();
            }catch(SQLException e){
            
            }
        }
    }//GEN-LAST:event_Find1MouseClicked

    private void Find2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Find2MouseClicked
        String IcNo = Nic.getText();
       try{
       String sql = "select * from Customer where NIC = '"+IcNo+"'";
       pst = conn.prepareStatement(sql);
       rs = pst.executeQuery();
       if(rs.next()){
           String a = rs.getString("Name");
           Name.setText(a);
           String b = rs.getString("Address");
           Address.setText(b);
           String c = rs.getString("Pno");
           Pno.setText(c);
           String d = rs.getString("NIC");
           Nic.setText(d);
           String e = rs.getString("DOB");
           Dob.setText(e);
           String f = rs.getString("Collar");
           Collar.setText(f);
           String g = rs.getString("Length");
           Length.setText(g);
           String h = rs.getString("Chest");
           Chest.setText(h);
           String i = rs.getString("Waist");
           Waist.setText(i);
           String j = rs.getString("Shoulder");
           Shoulder.setText(j);
           String k = rs.getString("Sleeve");
           Sleeve.setText(k);
           String l = rs.getString("SOther");
           Sother.setText(l);
           String m = rs.getString("TWaist");
           Twaist.setText(m);
           String n = rs.getString("Tlenght");
           Tlength.setText(n);
           String o = rs.getString("Hip");
           Hip.setText(o);
           String p = rs.getString("Thigh");
           Thigh.setText(p);
           String q = rs.getString("Bottom");
           Bottom.setText(q);
           String r = rs.getString("Knee");
           Knee.setText(r);
           String s = rs.getString("Tother");
           Tother.setText(s);
           String t = rs.getString("Shirt");
           Shirt.setText(t);
           String u = rs.getString("Trouser");
           Trouser.setText(u);
           String v = rs.getString("Shorts");
           Shorts.setText(v);
           String w = rs.getString("ODate");
           ODate.setText(w);
           String x = rs.getString("DDate");
           DDate.setText(x);
           
           rs.close();
           pst.close();
       }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No Data Found");
       }finally{
            try{
            rs.close();
            pst.close();
            }catch(SQLException e){
            
            }
        }
    }//GEN-LAST:event_Find2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Customer().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JCheckBox BShorts;
    private javax.swing.JCheckBox BTrouser;
    private javax.swing.JLabel Back;
    private javax.swing.JTextField Bottom;
    private javax.swing.JCheckBox Bshirt;
    private javax.swing.JTextField Chest;
    private javax.swing.JLabel Close;
    private javax.swing.JTextField Collar;
    private javax.swing.JTextField DDate;
    private javax.swing.JTextField Dob;
    private javax.swing.JLabel Find1;
    private javax.swing.JLabel Find2;
    private javax.swing.JTextField Hip;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Knee;
    private javax.swing.JTextField Length;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Nic;
    private javax.swing.JTextField ODate;
    private javax.swing.JTextField Pno;
    private javax.swing.JLabel Quit0;
    private javax.swing.JLabel Quit1;
    private javax.swing.JLabel Quit2;
    private javax.swing.JLabel Quit3;
    private javax.swing.JLabel Quit4;
    private javax.swing.JLabel Quit5;
    private javax.swing.JLabel Quit6;
    private javax.swing.JRadioButton Radd;
    private javax.swing.JRadioButton Rup;
    private javax.swing.JTextField Shirt;
    private javax.swing.JTextField Shorts;
    private javax.swing.JTextField Shoulder;
    private javax.swing.JTextField Sleeve;
    private javax.swing.JTextField Sother;
    private javax.swing.JTextField Thigh;
    private javax.swing.JTextField Tlength;
    private javax.swing.JTextField Tother;
    private javax.swing.JTextField Trouser;
    private javax.swing.JTextField Twaist;
    private javax.swing.JLabel Update;
    private javax.swing.JTextField Waist;
    private javax.swing.JLabel add;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel search;
    // End of variables declaration//GEN-END:variables
}



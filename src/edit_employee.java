
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class edit_employee extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6 = null;
    PreparedStatement ps,ps1,ps2,ps3,ps4,ps5,ps6 = null;
    
     private Vector<Vector<String>>data,data1,data2,data3;
     private Vector<String>header,header1,header2,header3;
    
    public edit_employee() {
        Image img = getToolkit().getImage("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\lg.png");
        Image newimg = img.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH);
        this.setIconImage(newimg);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/6,dim.height/200);
        this.setTitle("Employee Personal Details");
        try {
          data = new table().getBranch();
        } catch (Exception ex) {
          Logger.getLogger(Employee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        header = new Vector<String>();
        header.add("");
        header.add("");
        
        try {
          data1 = new table().getDepartment();
        } catch (Exception ex) {
          Logger.getLogger(Employee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        header1 = new Vector<String>();
        header1.add("");
        header1.add("");
        
        try {
          data2 = new table().getJobGroup();
        } catch (Exception ex) {
          Logger.getLogger(Employee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        header2 = new Vector<String>();
        header2.add("");
        header2.add("");
        
        try {
          data3 = new table().getType();
        } catch (Exception ex) {
          Logger.getLogger(Employee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        header3 = new Vector<String>();
        header3.add("");
        header3.add("");
        
        initComponents();
        conn = javaConnect.ConnectDb();
        combo();
        ed();
       path.setVisible(false);
       sign_path.setVisible(false);
        employeeDetails();
    }

    public void close(){
     WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        status = new javax.swing.JComboBox();
        yob = new com.toedter.calendar.JDateChooser();
        citizen = new javax.swing.JComboBox();
        ed_level = new javax.swing.JComboBox();
        signature = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        sign_path = new javax.swing.JTextField();
        path = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ssec = new javax.swing.JCheckBox();
        itax = new javax.swing.JCheckBox();
        taxrelief = new javax.swing.JCheckBox();
        hosins = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cash = new javax.swing.JComboBox();
        bbranch = new javax.swing.JTextField();
        bacc = new javax.swing.JTextField();
        eft = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        bank_name = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        week = new javax.swing.JTextField();
        sun = new javax.swing.JTextField();
        sat = new javax.swing.JTextField();
        hol = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        sun1 = new javax.swing.JTextField();
        week1 = new javax.swing.JTextField();
        nom1 = new javax.swing.JTextField();
        sat1 = new javax.swing.JTextField();
        hol1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        smoker = new javax.swing.JCheckBox();
        disability = new javax.swing.JTextField();
        bgroup = new javax.swing.JTextField();
        mconditions = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        otel = new javax.swing.JTextField();
        omail = new javax.swing.JTextField();
        mobphone = new javax.swing.JTextField();
        otelext = new javax.swing.JTextField();
        pemail = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        paddress = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        pzip = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        otel2 = new javax.swing.JTextField();
        pemail2 = new javax.swing.JTextField();
        mobphone2 = new javax.swing.JTextField();
        otelext2 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        more2 = new javax.swing.JTextField();
        more1 = new javax.swing.JTextField();
        more4 = new javax.swing.JTextField();
        more3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pfn = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nssfno = new javax.swing.JTextField();
        nhifno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        permit = new javax.swing.JTextField();
        jtitle = new javax.swing.JTextField();
        date_joined = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dept = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        branch = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        emp_type = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jgrp = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        bf = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        annual = new javax.swing.JTextField();
        active = new javax.swing.JCheckBox();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel17.setText("Gender:");

        jLabel18.setText("Marital Status:");

        jLabel19.setText("Year of Birth:");

        jLabel20.setText("Citizenship:");

        jLabel21.setText("Education:");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Married", "Divorced", "Separated", "Widowed", "Other" }));

        citizen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kenyan", "Ugandan", "Tanzanian", "Others" }));

        signature.setBackground(new java.awt.Color(255, 255, 255));
        signature.setForeground(new java.awt.Color(0, 0, 0));
        signature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign9.jpg"))); // NOI18N
        signature.setPreferredSize(new java.awt.Dimension(100, 152));
        signature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signatureMouseClicked(evt);
            }
        });

        photo.setBackground(new java.awt.Color(255, 255, 255));
        photo.setForeground(new java.awt.Color(0, 0, 0));
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.jpg"))); // NOI18N
        photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photoMouseClicked(evt);
            }
        });

        jLabel47.setText("Signature:");

        jLabel49.setText("(Click to upload)");

        jLabel48.setText("Employee Photo (Click to upload)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(signature, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(citizen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ed_level, 0, 152, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sign_path, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sign_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(yob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(citizen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ed_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signature, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Personal", jPanel1);

        ssec.setText("Social Security");

        itax.setText("Income Tax");

        taxrelief.setText("Apply Income Tax Relief");

        hosins.setText("Hospital Insuarance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itax)
                    .addComponent(hosins)
                    .addComponent(taxrelief)
                    .addComponent(ssec))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(itax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxrelief)
                .addGap(18, 18, 18)
                .addComponent(ssec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hosins)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Deductions", jPanel2);

        jLabel23.setText("Pay Via :");

        jLabel24.setText("Bank :");

        jLabel25.setText("Bank Branch :");

        jLabel26.setText("Bank Account :");

        jLabel27.setText("Bank EFT Code :");

        jLabel28.setText("Mobile Money Account :");

        cash.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CASH", "BANK", "CHEQUE", "MOBILE" }));

        bank_name.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                bank_namePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eft)
                    .addComponent(bacc)
                    .addComponent(bbranch)
                    .addComponent(cash, 0, 213, Short.MAX_VALUE)
                    .addComponent(mobile)
                    .addComponent(bank_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(bbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(bacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(eft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Payment", jPanel3);

        jLabel29.setText("HOURLY");

        jLabel30.setText("DAILY");

        jLabel31.setText("Normal :");

        jLabel32.setText("Weekday :");

        jLabel33.setText("Saturday :");

        jLabel34.setText("Sunday :");

        jLabel35.setText("Holiday :");

        week.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        week.setText("0");

        sun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sun.setText("0");

        sat.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sat.setText("0");

        hol.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        hol.setText("0");
        hol.setToolTipText("");

        nom.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        nom.setText("0");

        sun1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sun1.setText("0");

        week1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        week1.setText("0");

        nom1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        nom1.setText("0");

        sat1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sat1.setText("0");

        hol1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        hol1.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(106, 106, 106)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(sat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(week, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel32)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sun, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hol, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(sun1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(week1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sat1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hol1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(week, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(week1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(sat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(sun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(hol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Pay Rate", jPanel4);

        jLabel36.setText("Bloof Group :");

        jLabel37.setText("Physical Disabilities :");

        jLabel38.setText("Medical Conditions :");

        smoker.setText("Smoker");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(smoker))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disability, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mconditions, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(smoker)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(bgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(disability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(mconditions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Medical", jPanel5);

        jLabel39.setText("Office Email :");

        jLabel40.setText("Personal Email :");

        jLabel41.setText("Office Telephone :");

        jLabel42.setText("Office Telephone Ext :");

        jLabel43.setText("Mobile Telephone :");

        jLabel45.setText("Postal Address:");

        jLabel46.setText("Postal zip :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(omail, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(pemail)
                    .addComponent(otel)
                    .addComponent(otelext)
                    .addComponent(mobphone)
                    .addComponent(paddress)
                    .addComponent(pzip))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(omail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(pemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(otel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(otelext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(mobphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(paddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(pzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Contacts", jPanel6);

        otel2.setEnabled(false);

        pemail2.setEnabled(false);

        mobphone2.setEnabled(false);

        otelext2.setEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(otelext2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(otel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pemail2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobphone2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pemail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(otel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(otelext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mobphone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(more3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(more2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(more1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(more4))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(more1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(more2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(more3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(more4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("More", jPanel7);

        jLabel1.setText("Personal File Number:");

        pfn.setEnabled(false);

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Other Names:");

        jLabel5.setText("Identity Number:");

        jLabel6.setText("Passport Number:");

        jLabel7.setText("KRA PIn:");

        jLabel8.setText("Social Security:");

        jLabel9.setText("Hospital Insuarance:");

        jLabel10.setText("Work Permit:");

        jLabel11.setText("Job Title:");

        jLabel12.setText("Date Joined:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setText("Branch:");

        dept.setBackground(new java.awt.Color(255, 255, 255));
        dept.setForeground(new java.awt.Color(0, 0, 0));
        dept.setModel(new javax.swing.table.DefaultTableModel(
            data1,header1
        ));
        dept.setGridColor(new java.awt.Color(255, 255, 255));
        dept.setPreferredSize(new java.awt.Dimension(100, 64));
        dept.setTableHeader(null);
        dept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deptMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dept);

        jLabel14.setText("Department:");

        branch.setBackground(new java.awt.Color(255, 255, 255));
        branch.setForeground(new java.awt.Color(0, 0, 0));
        branch.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        branch.setGridColor(new java.awt.Color(255, 255, 255));
        branch.setPreferredSize(new java.awt.Dimension(100, 64));
        branch.setTableHeader(null);
        branch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(branch);

        jLabel15.setText("Job Group:");

        jLabel16.setText("Type:");

        emp_type.setBackground(new java.awt.Color(255, 255, 255));
        emp_type.setForeground(new java.awt.Color(0, 0, 0));
        emp_type.setModel(new javax.swing.table.DefaultTableModel(
            data3,header3
        ));
        emp_type.setGridColor(new java.awt.Color(255, 255, 255));
        emp_type.setPreferredSize(new java.awt.Dimension(100, 64));
        emp_type.setTableHeader(null);
        emp_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_typeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(emp_type);

        jgrp.setBackground(new java.awt.Color(255, 255, 255));
        jgrp.setForeground(new java.awt.Color(0, 0, 0));
        jgrp.setModel(new javax.swing.table.DefaultTableModel(
            data2,header2
        ));
        jgrp.setGridColor(new java.awt.Color(255, 255, 255));
        jgrp.setPreferredSize(new java.awt.Dimension(100, 64));
        jgrp.setTableHeader(null);
        jgrp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jgrpMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jgrp);

        jLabel22.setText("B/F Leave Days:");

        jLabel44.setText("Annual Leave:");

        active.setText("IN EMPLOYMENT");

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nssfno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhifno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(permit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_joined, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(pfn)))
                    .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(active)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(82, 82, 82))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(644, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(kra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nssfno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nhifno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(permit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(date_joined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(bf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)
                            .addComponent(annual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(active)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(ok))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(551, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bank_namePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bank_namePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_namePopupMenuWillBecomeInvisible

    
    static final File dir = new File("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\photo");
    
    private void combo(){
    try{
    String sql =  "select * from employee_bank";
    ps = conn.prepareStatement(sql);
    rs = ps.executeQuery();
    
    while(rs.next()){
    String name = rs.getString("bank_name");
    bank_name.addItem(name);
    }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    
    private void ed(){
    try{
    String sql =  "select * from education_level";
    ps = conn.prepareStatement(sql);
    rs = ps.executeQuery();
    
    while(rs.next()){
    String name = rs.getString("education_level_name");
    ed_level.addItem(name);
    }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    
    public void employeeDetails(){
    try{
            String id = New_Employee.EmployeeID();
            String b_id = "select * from employee left join education_level on employee.education_level_id=education_level.id left join employee_bank on employee.employee_bank_id=employee_bank.id where employee.personal_file_number = '"+id+"'";
            ps = conn.prepareStatement(b_id);
            rs = ps.executeQuery();
            if(rs.next()){            
        String add1=rs.getString("personal_file_number");
        pfn.setText(add1);
        String add2=rs.getString("first_name");
        fname.setText(add2);
        String add3=rs.getString("last_name");
        lname.setText(add3);

        String add4=rs.getString("middle_name");
        mname.setText(add4);
        String add5=rs.getString("identity_number");
        idno.setText(add5);
        String add6=rs.getString("passport_number");
        pno.setText(add6);
        String add7=rs.getString("pin");
        kra.setText(add7);
        String add8=rs.getString("social_security_number");
        nssfno.setText(add8);
        String add9=rs.getString("hospital_insurance_number");
        nhifno.setText(add9);
        String add10=rs.getString("work_permit_number");
        permit.setText(add10);
        String add11=rs.getString("job_title");
        jtitle.setText(add11);
        String dateValue = rs.getString("date_joined"); 
        java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
        date_joined.setDate(date);
        String add12=rs.getString("gender");
        gender.setSelectedItem(add12);
        String add13=rs.getString("marital_status");
        status.setSelectedItem(add13);
        String dateValue1 = rs.getString("yob"); 
        java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue1);
        yob.setDate(date1);
        String add14=rs.getString("citizenship");
        citizen.setSelectedItem(add14);
        String add15=rs.getString("education_level_name");
        ed_level.setSelectedItem(add15);
        if("1".equals(rs.getString("income_tax_applicable"))){
        itax.setSelected(true);
        }else{
        itax.setSelected(false);
        }
        if("1".equals(rs.getString("income_tax_relief_applicable"))){
        taxrelief.setSelected(true);
        }else{
        taxrelief.setSelected(false);
        }
        if("1".equals(rs.getString("social_security_applicable"))){
        ssec.setSelected(true);
        }else{
        ssec.setSelected(false);
        }
        if("1".equals(rs.getString("hospital_insurance_applicable"))){
        hosins.setSelected(true);
        }else{
        hosins.setSelected(false);
        }
        String add16=rs.getString("mode_of_payment");
        cash.setSelectedItem(add16);
        String add17=rs.getString("bank_name");
        bank_name.setSelectedItem(add17);
        String add18=rs.getString("bank_branch");
        bbranch.setText(add18);
        String add19=rs.getString("bank_account_number");
        bacc.setText(add19);
        String add20=rs.getString("bank_eft_code");
        eft.setText(add20);
        String add21=rs.getString("mobile_account_number");
        mobile.setText(add21);
        String add22=rs.getString("time_clock_rate_normal");
        nom.setText(add22);
        String add23=rs.getString("day_clock_rate_normal");
        nom1.setText(add23);
        String add24=rs.getString("time_clock_rate_weekday");
        week.setText(add24);
        String add25=rs.getString("day_clock_rate_weekday");
        week1.setText(add25);
        String add26=rs.getString("time_clock_rate_saturday");
        sat.setText(add26);
        String add27=rs.getString("day_clock_rate_saturday");
        sat1.setText(add27);
        String add28=rs.getString("time_clock_rate_sunday");
        sun.setText(add28);
        String add29=rs.getString("day_clock_rate_sunday");
        sun1.setText(add29);
        String add30=rs.getString("time_clock_rate_holiday");
        hol.setText(add30);
        String add31=rs.getString("day_clock_rate_holiday");
        hol1.setText(add31);
        if("1".equals(rs.getString("medical_smoker"))){
        smoker.setSelected(true);
        }else{
        smoker.setSelected(false);
        }
        String add32=rs.getString("medical_blood_group");
        bgroup.setText(add32);
        String add33=rs.getString("medical_disabilities");
        disability.setText(add33);
        String add34=rs.getString("medical_conditions");
        mconditions.setText(add34);
        String add35=rs.getString("email_office");
        omail.setText(add35);
        String add36=rs.getString("email_personal");
        pemail.setText(add36);
        String add37=rs.getString("telephone_office");
        otel.setText(add37);
        String add38=rs.getString("telephone_extension_office");
        otelext.setText(add38);
        String add39=rs.getString("telephone_mobile");
        mobphone.setText(add39);
        String add40=rs.getString("postal_address");
        paddress.setText(add40);
        String add41=rs.getString("postal_zip");
        pzip.setText(add41);
        String add42=rs.getString("custom_field1");
        more1.setText(add42);
        String add43=rs.getString("custom_field2");
        more2.setText(add43);
        String add44=rs.getString("custom_field3");
        more3.setText(add44);
        String add45=rs.getString("custom_field4");
        more4.setText(add45);
        selectBranch();
        selectDept();
        selectGroup();
        selectType();
        String add46=rs.getString("bf_leave_days");
        more4.setText(add46);
        String add47=rs.getString("annual_leave_days");
        more4.setText(add47);
        if("Y".equals(rs.getString("in_employment"))){
        active.setSelected(true);
        }else{
        active.setSelected(false);
        }
        //JOptionPane.showMessageDialog(null, rs.getString("photo"));
        File url = new File(rs.getString("photo"));
        BufferedImage imgImage = ImageIO.read(url);
        Image newimg = imgImage.getScaledInstance(159, 150,  java.awt.Image.SCALE_SMOOTH);
        if(!"".equals(rs.getString("photo"))){
        photo.setIcon(new ImageIcon(newimg)); 
        }else{
        photo.setIcon(new ImageIcon(getClass().getResource("/user.jpg")));
        }
        File url1 = new File(rs.getString("signature"));
        BufferedImage imgImage1 = ImageIO.read(url1);
        Image newimg1 = imgImage1.getScaledInstance(150, 53,  java.awt.Image.SCALE_SMOOTH);
        if(!"".equals(rs.getString("signature"))){
        signature.setIcon(new ImageIcon(newimg1)); 
        }else{
        signature.setIcon(new ImageIcon(getClass().getResource("/signature/sign9.jpg")));
        }
        String add48=rs.getString("photo");
        path.setText(add48);
        String add49=rs.getString("signature");
        path.setText(add49);
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    
   
    private void selectBranch(){
        try{
    String word = rs.getString("branch_id"); // from a text field
        ArrayList list = new ArrayList(); 
        String brn = "select * from branch";
        ps1 = conn.prepareStatement(brn);
        rs1 = ps1.executeQuery();
        
        while(rs1.next()) {
        list.add(rs1.getString("id"));
        }
        
        for (int row = 0; row < list.size(); ++row){
        String t = String.valueOf(list.get(row));
        if (t.equals(word)){ // select matched cell
            System.out.println(t+"true");
         branch.getSelectionModel().setSelectionInterval(row, row);
        }
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
   }
    
    private void selectDept(){
        try{
    String word = rs.getString("department_id"); // from a text field
        ArrayList list = new ArrayList(); 
        String brn = "select * from department";
        ps1 = conn.prepareStatement(brn);
        rs1 = ps1.executeQuery();
        
        while(rs1.next()) {
        list.add(rs1.getString("id"));
        }
        
        for (int row = 0; row < list.size(); ++row){
        String t = String.valueOf(list.get(row));
        if (t.equals(word)){ // select matched cell
         dept.getSelectionModel().setSelectionInterval(row, row);
        }
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
   }
    
    private void selectGroup(){
        try{
    String word = rs.getString("job_group_id"); // from a text field
        ArrayList list = new ArrayList(); 
        String brn = "select * from employee_job_group";
        ps1 = conn.prepareStatement(brn);
        rs1 = ps1.executeQuery();
        
        while(rs1.next()) {
        list.add(rs1.getString("id"));
        }
        
        for (int row = 0; row < list.size(); ++row){
        String t = String.valueOf(list.get(row));
        if (t.equals(word)){ // select matched cell
         jgrp.getSelectionModel().setSelectionInterval(row, row);
        }
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
   }
    
    
    private void selectType(){
        try{
    String word = rs.getString("employee_type_id"); // from a text field
        ArrayList list = new ArrayList(); 
        String brn = "select * from employee_type";
        ps1 = conn.prepareStatement(brn);
        rs1 = ps1.executeQuery();
        
        while(rs1.next()) {
        list.add(rs1.getString("id"));
        }
        
        for (int row = 0; row < list.size(); ++row){
        String t = String.valueOf(list.get(row));
        if (t.equals(word)){ // select matched cell
         emp_type.getSelectionModel().setSelectionInterval(row, row);
        }
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
   }
    
    
    private void deptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deptMouseClicked

    private void branchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_branchMouseClicked

    private void emp_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_typeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_typeMouseClicked

    private void jgrpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jgrpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jgrpMouseClicked

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        try{
            String id = New_Employee.EmployeeID();
            String pdet = "update employee set personal_file_number=?,first_name=?,last_name=?,middle_name=?,"
            + "identity_number=?,passport_number=?,pin=?,"
            + "social_security_number=?,hospital_insurance_number=?,work_permit_number=?,job_title=?,date_joined=?,"
            + "gender=?,marital_status=?,yob=?,citizenship=?,education_level_id=?,"
            + "income_tax_applicable=?,income_tax_relief_applicable=?,social_security_applicable=?,"
            + "hospital_insurance_applicable=?,"
            + "mode_of_payment=?,time_clock_rate_normal=?,day_clock_rate_normal=?,time_clock_rate_weekday=?,"
            + "day_clock_rate_weekday=?,"
            + "time_clock_rate_saturday=?,day_clock_rate_saturday=?,"
            + "time_clock_rate_sunday=?,day_clock_rate_sunday=?,"
            + "time_clock_rate_holiday=?,day_clock_rate_holiday=?,in_employment=?,mobile_account_number=?,"
            + "branch_id=?,department_id=?,job_group_id=?,employee_type_id=?,"
            + "employee_bank_id=?,bank_branch=?,bank_account_number=?,bank_eft_code=?,"
            + "medical_smoker=?,medical_blood_group=?,medical_disabilities=?,medical_conditions=?,"
            + "email_office=?,email_personal=?,telephone_office=?,telephone_extension_office=?,telephone_mobile=?,"
            + "postal_address=?,postal_zip=?,updated_on=?,custom_field1=?,custom_field2=?,custom_field3=?,custom_field4=?,"
            + "photo=?,signature=?,bf_leave_days=?,annual_leave_days=?"
            + " where personal_file_number=?";
      
        ps = conn.prepareStatement(pdet);
        ps.setString(1, pfn.getText());
        ps.setString(2, fname.getText());
        ps.setString(3, lname.getText());
        ps.setString(4, mname.getText());
        ps.setString(5, idno.getText());
        ps.setString(6, pno.getText());
        ps.setString(7, kra.getText());
        ps.setString(8, nssfno.getText());
        ps.setString(9, nhifno.getText());
        ps.setString(10, permit.getText());
        ps.setString(11, jtitle.getText());
        ps.setString(12, ((JTextField)date_joined.getDateEditor().getUiComponent()).getText());
        ps.setString(13, (String)gender.getSelectedItem());
        ps.setString(14, (String)status.getSelectedItem());
        ps.setString(15, ((JTextField)yob.getDateEditor().getUiComponent()).getText());
        ps.setString(16, (String)citizen.getSelectedItem());
       String ed_id = "select * from education_level where education_level_name = ?";
            ps5 = conn.prepareStatement(ed_id);
            ps5.setString(1, (String)ed_level.getSelectedItem());
            rs5 = ps5.executeQuery();
            if(rs5.next()){
            String bid = rs5.getString("id"); 
        ps.setString(17, bid);
            }
        if(itax.isSelected()){
        ps.setString(18, "1");
        }else{
         ps.setString(18, "0");
        }
        if(taxrelief.isSelected()){
        ps.setString(19, "1");
        }else{
         ps.setString(19, "0");
        }
        if(ssec.isSelected()){
        ps.setString(20, "1");
        }else{
         ps.setString(20, "0");
        }
        if(hosins.isSelected()){
        ps.setString(21, "1");
        }else{
        ps.setString(21, "0");
        }
        ps.setString(22, (String)cash.getSelectedItem());
        ps.setString(23, nom.getText());
        ps.setString(24, nom1.getText());
        ps.setString(25, week.getText());
        ps.setString(26, week1.getText());
        ps.setString(27, sat.getText());
        ps.setString(28, sat1.getText());
        ps.setString(29, sun.getText());
        ps.setString(30, sun.getText());
        ps.setString(31, hol.getText());
        ps.setString(32, hol.getText());
        if(taxrelief.isSelected()){
        ps.setString(33, "Y");
        }else{
         ps.setString(33, "N");
        }
        ps.setString(34, mobile.getText());
       int row1 = branch.getSelectedRow();
       String table_click = (branch.getModel().getValueAt(row1, 0).toString()); 
        
        String b_id = "select * from branch where branch_shortname = '"+table_click+"'";
        ps1 = conn.prepareStatement(b_id);
        rs1 = ps1.executeQuery();

        if(rs1.next()){
        String bid1 = rs1.getString("id");
        ps.setString(35, bid1);
        }
        int row2 = dept.getSelectedRow();
        String table_click1 = (dept.getModel().getValueAt(row2, 0).toString()); 
        
        String dpt_id = "select * from department where department_shortname = ?";
        ps2 = conn.prepareStatement(dpt_id);
        ps2.setString(1, table_click1);
        rs2 = ps2.executeQuery();
        if(rs2.next()){
        String bid2 = rs2.getString("id");
        ps.setString(36, bid2);
        }
        
        int row3 = jgrp.getSelectedRow();
        String table_click2 = (jgrp.getModel().getValueAt(row3, 0).toString());
        
        String grp_id = "select * from employee_job_group where job_group_name = ?";
        ps3 = conn.prepareStatement(grp_id);
        ps3.setString(1, table_click2);
        rs3 = ps3.executeQuery();
        if(rs3.next()){
        String bid3 = rs3.getString("id");
        ps.setString(37, bid3);
        }
        
        int row4 = emp_type.getSelectedRow();
        String table_click3 = (emp_type.getModel().getValueAt(row4, 0).toString());
        String type_id = "select * from employee_type where employee_type_name = ?";
        ps4 = conn.prepareStatement(type_id);
        ps4.setString(1, table_click3);
        rs4 = ps4.executeQuery();
        if(rs4.next()){
        String bid4 = rs4.getString("id");
        ps.setString(38, bid4);
        }
        String sel = "select * from employee_bank where bank_name = ?";
        ps6 = conn.prepareStatement(sel);
        ps6.setString(1, (String)bank_name.getSelectedItem());
        rs6 = ps6.executeQuery();
        if(rs6.next()){
        String bid5 = rs6.getString("id");
        ps.setString(39, bid5);
        }
        ps.setString(40, bbranch.getText());
        ps.setString(41, bacc.getText());
        ps.setString(42, eft.getText());
       
       if(smoker.isSelected()){
        ps.setString(43, "1");
        }else{
        ps.setString(43, "0");
        }
       ps.setString(44, bgroup.getText());
       ps.setString(45, disability.getText());
       ps.setString(46, mconditions.getText());
       
       //ps7 = conn.prepareStatement(conct);
      // ps.setString(1, pfn.getText());
       ps.setString(47, omail.getText());
       ps.setString(48, pemail.getText());
       ps.setString(49, otel.getText());
       ps.setString(50, otelext.getText());
       ps.setString(51, mobphone.getText());
       ps.setString(52, paddress.getText());
       ps.setString(53, pzip.getText());
       java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
       ps.setTimestamp(54, date);
       ps.setString(55, more1.getText());
       ps.setString(56, more2.getText());
       ps.setString(57, more3.getText());
       ps.setString(58, more4.getText());
       ps.setString(59, "C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\photo\\employee_"+pfn.getText()+".jpg");
       ps.setString(60, "C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\signature\\employee_signature_"+pfn.getText()+".jpg");
       ps.setString(61, bf.getText());
       ps.setString(62, annual.getText());
       ps.setString(63, id);
            //ps8 = conn.prepareStatement(med);

       String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
       String regex = "[0-9]+";
       
            if("".equals(fname.getText())){
                JOptionPane.showMessageDialog(null, "Please fill in Employee Firstname!");
            }
            else if("".equals(lname.getText())){
                JOptionPane.showMessageDialog(null, "Please fill in Employee Lastname!");
            }else if("".equals(pfn.getText())){
                JOptionPane.showMessageDialog(null, "Please fill in Employee number!");
            }
            else{
                ps.execute();
                JOptionPane.showMessageDialog(null,"Successfully updated employee!");
                new New_Employee().reloadEmployee();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();

        }
        new New_Employee().reloadEmployee();
    }//GEN-LAST:event_okActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_cancelActionPerformed

    private void signatureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signatureMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        //File f = chooser.getSelectedFile();
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        Image img = getToolkit().getImage(f.getPath());
        Image newimg = img.getScaledInstance(150, 50,  java.awt.Image.SCALE_SMOOTH);

        sign_path.setText(filename);
        if(!"".equals(path.getText())){
            signature.setIcon(new ImageIcon(newimg));
        }else{
            signature.setIcon(new ImageIcon(newimg));
        }
    }//GEN-LAST:event_signatureMouseClicked

    private void photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        //File f = chooser.getSelectedFile();
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        Image img = getToolkit().getImage(f.getPath());
        Image newimg = img.getScaledInstance(148, 130,  java.awt.Image.SCALE_SMOOTH);

        path.setText(filename);
        if(!"".equals(path.getText())){
            photo.setIcon(new ImageIcon(newimg));
            try{
                File file = new File("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\photo\\"+f);
                    OutputStream out = new FileOutputStream(file);
                    // Write your data
                    out.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else{
                photo.setIcon(new ImageIcon(newimg));
            }
    }//GEN-LAST:event_photoMouseClicked

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
            java.util.logging.Logger.getLogger(edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox active;
    private javax.swing.JTextField annual;
    private javax.swing.JTextField bacc;
    private javax.swing.JComboBox bank_name;
    private javax.swing.JTextField bbranch;
    private javax.swing.JTextField bf;
    private javax.swing.JTextField bgroup;
    private javax.swing.JTable branch;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox cash;
    private javax.swing.JComboBox citizen;
    private com.toedter.calendar.JDateChooser date_joined;
    private javax.swing.JTable dept;
    private javax.swing.JTextField disability;
    private javax.swing.JComboBox ed_level;
    private javax.swing.JTextField eft;
    private javax.swing.JTable emp_type;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox gender;
    private javax.swing.JTextField hol;
    private javax.swing.JTextField hol1;
    private javax.swing.JCheckBox hosins;
    private javax.swing.JTextField idno;
    private javax.swing.JCheckBox itax;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTable jgrp;
    private javax.swing.JTextField jtitle;
    private javax.swing.JTextField kra;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mconditions;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField mobphone;
    private javax.swing.JTextField mobphone2;
    private javax.swing.JTextField more1;
    private javax.swing.JTextField more2;
    private javax.swing.JTextField more3;
    private javax.swing.JTextField more4;
    private javax.swing.JTextField nhifno;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nom1;
    private javax.swing.JTextField nssfno;
    private javax.swing.JButton ok;
    private javax.swing.JTextField omail;
    private javax.swing.JTextField otel;
    private javax.swing.JTextField otel2;
    private javax.swing.JTextField otelext;
    private javax.swing.JTextField otelext2;
    private javax.swing.JTextField paddress;
    private javax.swing.JTextField path;
    private javax.swing.JTextField pemail;
    private javax.swing.JTextField pemail2;
    private javax.swing.JTextField permit;
    private javax.swing.JTextField pfn;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField pno;
    private javax.swing.JTextField pzip;
    private javax.swing.JTextField sat;
    private javax.swing.JTextField sat1;
    private javax.swing.JTextField sign_path;
    private javax.swing.JLabel signature;
    private javax.swing.JCheckBox smoker;
    private javax.swing.JCheckBox ssec;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField sun;
    private javax.swing.JTextField sun1;
    private javax.swing.JCheckBox taxrelief;
    private javax.swing.JTextField week;
    private javax.swing.JTextField week1;
    private com.toedter.calendar.JDateChooser yob;
    // End of variables declaration//GEN-END:variables
}

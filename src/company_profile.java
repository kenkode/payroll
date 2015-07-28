import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class company_profile extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs,rs1,rs2 = null;
    PreparedStatement ps,ps1,ps2 = null;
    public company_profile() {
     Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
     this.setLocation(dim.width/6,dim.height/50);
        initComponents();
        this.setTitle("Edit Profile");
        path.setVisible(false);
        path1.setVisible(false);
        conn = javaConnect.ConnectDb();
        info();
        Image img = getToolkit().getImage("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\lg.png");
        Image newimg = img.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH);
        this.setIconImage(newimg);
      pic_logo.setOpaque(true);
    }

    private void info(){
    try{
      String sql = "select * from company_details";  
      ps1 = conn.prepareStatement(sql);
      rs1 = ps1.executeQuery();
      if(rs1.next()){
      String add1 = rs1.getString("company_name");
      cname.setText(add1);
      File url = new File("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\logo\\company_logo.jpg");
        BufferedImage imgImage = ImageIO.read(url);
        //Image newimg = imgImage.getScaledInstance(287, 101,  java.awt.Image.SCALE_SMOOTH);
        if(!"".equals(rs1.getString("company_logo"))){
        pic_logo.setIcon(new ImageIcon(imgImage)); 
        }else{
        pic_logo.setIcon(new ImageIcon(getClass().getResource("/logo1.png")));
        }
      String add3 = rs1.getString("company_desc");
      desc.setText(add3);
      String add4 = rs1.getString("company_address");
      address.setText(add4);
      String add6 = rs1.getString("company_email");
      email.setText(add6);
      String add7 = rs1.getString("company_logo");
      path.setText(add7);
      }
    }catch(Exception e){
    e.printStackTrace();
    }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        logo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        pic_logo = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        path1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Company Profile");

        jLabel2.setText("Company name:");

        jLabel3.setText("Company Logo:");

        logo.setText("Browse");
        logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoActionPerformed(evt);
            }
        });

        jLabel4.setText("Description:");

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        jLabel5.setText("Address:");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jLabel6.setText("Company Email:");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        pic_logo.setBackground(new java.awt.Color(255, 255, 255));
        pic_logo.setForeground(new java.awt.Color(0, 0, 0));
        pic_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.png"))); // NOI18N
        pic_logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pic_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_logoMouseClicked(evt);
            }
        });

        path1.setText("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\logo\\company_logo.jpg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cname)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(email))
                                .addGap(18, 18, 18)
                                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pic_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(path1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(13, 13, 13))))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(path1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(logo))
                        .addComponent(pic_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(update)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
         java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        
        String ins = "INSERT INTO company_details(id,company_name,company_logo,company_desc,company_address,company_email,created_at)"
                + "values(?,?,?,?,?,?,?) ON DUPLICATE KEY "
                + "UPDATE company_name=VALUES(company_name),company_desc=VALUES(company_desc),company_address=VALUES(company_address),"
                + "company_email=VALUES(company_email),updated_at='"+date+"'";
        ps = conn.prepareStatement(ins);
        ps.setString(1, "1");
        ps.setString(2, cname.getText());
        ps.setString(3, path.getText());
        ps.setString(4, desc.getText());
        ps.setString(5, address.getText());
        ps.setString(6, email.getText());
        ps.setTimestamp(7, date);
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String regex = "[0-9]+";
            
        if(!email.getText().equals("") && !email.getText().matches(EMAIL_REGEX)) {
                JOptionPane.showMessageDialog(null,"Please write a valid email!");
        }
       
       else{
       ps.execute();
       File f = new File("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\logo\\company_logo.jpg");
       if(f.exists() && !f.isDirectory()){
       f.delete();
       BufferedImage imgImage = null;

    String[] extensions = { "jpg", "png", "gif", "bmp" };

        for (String extension : extensions) {
            try {
                File url = new File(path.getText());
                imgImage = ImageIO.read(url);

                try {
                    ImageIO.write(imgImage, extension, new File("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\logo\\company_logo.jpg"));
                    System.out.println("Write successful");

                } catch (Exception e) {
                    System.out.println("Error on save the image");
                }

            } catch (IOException e) {
                System.out.println("File not found! ." + extension);

            }
        }
    
    System.out.println("Done");

        }else{
       
       BufferedImage imgImage = null;

    String[] extensions = { "jpg", "png", "gif", "bmp" };

        for (String extension : extensions) {
            try {
                File url = new File(path.getText());
                imgImage = ImageIO.read(url);

                try {
                    ImageIO.write(imgImage, extension, new File("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\logo\\company_logo.jpg"));
                    System.out.println("Write successful");

                } catch (Exception e) {
                    System.out.println("Error on save the image");
                }

            } catch (IOException e) {
                System.out.println("File not found! ." + extension);

            }
        }
    
    System.out.println("Done");
          }
       JOptionPane.showMessageDialog(null, "Successfully updated company profile");
        }
      }catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void logoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        //File f = chooser.getSelectedFile();
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        Image img = getToolkit().getImage(f.getPath());
        //Image newimg = img.getScaledInstance(287, 101,  java.awt.Image.SCALE_SMOOTH);
        
        //path.setText(filename);
        path.setText(filename);
        if(!"".equals(path.getText())){
        pic_logo.setIcon(new ImageIcon(img)); 
        }else{
        pic_logo.setIcon(new ImageIcon("logo2.png"));
        }
    }//GEN-LAST:event_logoActionPerformed

    private void pic_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_logoMouseClicked
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        //File f = chooser.getSelectedFile();
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        Image img = getToolkit().getImage(f.getPath());
        //Image newimg = img.getScaledInstance(287, 101,  java.awt.Image.SCALE_SMOOTH);
        
        //path.setText(filename);
        path.setText(filename);
        if(!"".equals(path.getText())){
        pic_logo.setIcon(new ImageIcon(img)); 
        }else{
        pic_logo.setIcon(new ImageIcon("logo2.png"));
        }
    }//GEN-LAST:event_pic_logoMouseClicked

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
            java.util.logging.Logger.getLogger(company_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(company_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(company_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(company_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new company_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField cname;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logo;
    private javax.swing.JTextField path;
    private javax.swing.JTextField path1;
    private javax.swing.JLabel pic_logo;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

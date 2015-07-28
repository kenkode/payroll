import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class basic_allowances extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6 = null;
    PreparedStatement ps,ps1,ps2,ps3,ps4,ps5,ps6 = null;
    public basic_allowances() {
        Image img = getToolkit().getImage("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\lg.png");
        Image newimg = img.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH);
        this.setIconImage(newimg);
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/4,dim.height/4);
        this.setTitle("Allowances");
        initComponents();
        conn = javaConnect.ConnectDb();
        employeeList();
        combo();
    }

    private void combo(){
    try{
    String sql =  "select * from employee_allowance";
    ps = conn.prepareStatement(sql);
    rs = ps.executeQuery();
    
    while(rs.next()){
    String name = rs.getString("allowance_name");
    type.addItem(name);
    }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    
    private void employeeList(){
    DefaultListModel lm = new DefaultListModel();
    
    try {
    String sql = "SELECT * FROM employee";
    ps = conn.prepareStatement(sql);
    rs = ps.executeQuery();
    
    while(rs.next()){
        String add = rs.getString("personal_file_number");
        String add1 = rs.getString("first_name");
        String add2 = rs.getString("last_name");
        String concat = add+"                             |" +add1+ "                                   |"  + add2;
        lm.addElement(concat);
    }
      jList1.setModel(lm);
      DefaultListCellRenderer r = (DefaultListCellRenderer)jList1.getCellRenderer();
        r.setHorizontalAlignment(SwingConstants.LEFT);
    } catch (Exception e) {
    e.printStackTrace();
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        allowance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        type = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Employee :");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Earned Amount :");

        allowance.setText("0.00");
        allowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                allowanceKeyReleased(evt);
            }
        });

        jLabel3.setText("Allowance Type: ");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(cancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(allowance, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        try{
            String ename = jList1.getSelectedValue().toString();
          
            String[] parts = ename.split(" ",2);
            String part1 = parts[0]; // 004
            String part2 = parts[1]; 

            String e_id = "select * from employee_allowances left join employee_allowance on employee_allowances.allowance_id=employee_allowance.id left join employee_allowances.employee_id=employee.id where employee.personal_file_number = '"+part1+"'";
            ps5 = conn.prepareStatement(e_id);
            rs5 = ps5.executeQuery();
            if(rs5.next()){
                String add1=rs5.getString("amount");
                allowance.setText(add1);
                String add2=rs5.getString("allowance_name");
                type.setSelectedItem(add2);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        // TODO add your handling code here:
         try{
            int ename = jList1.getSelectedIndex();

            String list_click = (jList1.getModel().getElementAt(ename).toString());

            String e_id = "select * from employee_allowances left join employee_allowance on employee_allowances.allowance_id=employee_allowance.id left join employee_allowances.employee_id=employee.id where employee.personal_file_number = '"+list_click+"'";
            ps5 = conn.prepareStatement(e_id);
            rs5 = ps5.executeQuery();
            if(rs5.next()){
                String add1=rs5.getString("amount");
                allowance.setText(add1);
                String add2=rs5.getString("allowance_name");
                type.setSelectedItem(add2);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jList1KeyPressed

    private void allowanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allowanceKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           try{
            if(jList1.isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "Please select Employee!");
            }else{
                String ename = jList1.getSelectedValue().toString();

                String[] parts = ename.split(" ",2);
                String part1 = parts[0]; // 004
                String part2 = parts[1];
                String e_id = "select * from employee where personal_file_number = '"+part1+"'";
                ps1 = conn.prepareStatement(e_id);
                rs1 = ps1.executeQuery();

                if(rs1.next()){
                    String eid = rs1.getString("id");
                    if(allowance.getText().matches("\\-?\\d+") == false && allowance.getText().matches("^[-+]?\\d+(\\.{0,1}(\\d+?))?$") == false) {
                        JOptionPane.showMessageDialog(null,"Please provide numbers only for basic pay!");
                    }else{
                       String sel = "select * from employee_allowance where allowance_name = ?";
                       ps6 = conn.prepareStatement(sel);
                       ps6.setString(1, (String)type.getSelectedItem());
                       rs6 = ps6.executeQuery();
                       if(rs6.next()){
                       String bid5 = rs6.getString("id");
                        
                        String emp_exist = "select * from employee_allowances where employee_id='"+eid+"'";
                        ps2 = conn.prepareStatement(emp_exist);
                        rs2 = ps2.executeQuery();
                        if(rs2.next() && part1.equals(eid)){
                            String upd = "update employee_allowances set employee_id='"+eid+"',allowance_id='"+bid5+"',amount='"+allowance.getText()+"',updated_at=NOW() where employee_id = '"+eid+"'";
                            ps3 = conn.prepareStatement(upd);
                            ps3.execute();

                            JOptionPane.showMessageDialog(null, "Successfully updated employee allowance!");
                        }else{
                            String ins = "insert into employee_allowances (employee_id,allowance_id,amount,created_at)values('"+eid+"','"+bid5+"','"+allowance.getText()+"',NOW())";
                            ps4 = conn.prepareStatement(ins);
                            ps4.execute();
                            JOptionPane.showMessageDialog(null, "Successfully inserted employee allowance!");
                        }
                    }
                }
            }
         }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_allowanceKeyReleased

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        try{
            if(jList1.isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "Please select Employee!");
            }else{
                String ename = jList1.getSelectedValue().toString();

                String[] parts = ename.split(" ",2);
                String part1 = parts[0]; // 004
                String part2 = parts[1];
                String e_id = "select * from employee where personal_file_number = '"+part1+"'";
                ps1 = conn.prepareStatement(e_id);
                rs1 = ps1.executeQuery();

                if(rs1.next()){
                    String eid = rs1.getString("id");
                    if(allowance.getText().matches("\\-?\\d+") == false && allowance.getText().matches("^[-+]?\\d+(\\.{0,1}(\\d+?))?$") == false) {
                        JOptionPane.showMessageDialog(null,"Please provide numbers only for basic pay!");
                    }else{
                       String sel = "select * from employee_allowance where allowance_name = ?";
                       ps6 = conn.prepareStatement(sel);
                       ps6.setString(1, (String)type.getSelectedItem());
                       rs6 = ps6.executeQuery();
                       if(rs6.next()){
                       String bid5 = rs6.getString("id");
                        
                        String emp_exist = "select * from employee_allowances where employee_id='"+eid+"'";
                        ps2 = conn.prepareStatement(emp_exist);
                        rs2 = ps2.executeQuery();
                        if(rs2.next() && part1.equals(eid)){
                            String upd = "update employee_allowances set employee_id='"+eid+"',allowance_id='"+bid5+"',amount='"+allowance.getText()+"',updated_at=NOW() where employee_id = '"+eid+"'";
                            ps3 = conn.prepareStatement(upd);
                            ps3.execute();

                            JOptionPane.showMessageDialog(null, "Successfully updated employee allowance!");
                        }else{
                            String ins = "insert into employee_allowances (employee_id,allowance_id,amount,created_at)values('"+eid+"','"+bid5+"','"+allowance.getText()+"',NOW())";
                            ps4 = conn.prepareStatement(ins);
                            ps4.execute();
                            JOptionPane.showMessageDialog(null, "Successfully inserted employee allowance!");
                        }
                    }
                }
            }
         }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_okActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_cancelActionPerformed

    public void close(){
     WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }
    
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
            java.util.logging.Logger.getLogger(basic_allowances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(basic_allowances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(basic_allowances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(basic_allowances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new basic_allowances().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField allowance;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox type;
    // End of variables declaration//GEN-END:variables
}

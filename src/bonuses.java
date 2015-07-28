import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;


public class bonuses extends javax.swing.JFrame {

    private Vector<Vector<String>>data,data1;
    private Vector<String>header;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    public bonuses() {
        Image img = getToolkit().getImage("C:\\Users\\Wango\\Documents\\NetBeansProjects\\payroll\\src\\lg.png");
        Image newimg = img.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH);
        this.setIconImage(newimg);
       try {
             data = new table().getEmployee();
        } catch (Exception ex) {
            Logger.getLogger(Employee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        header = new Vector<String>();
        header.add("FILE NUMBER");
        header.add("FIRST NAME");
        header.add("LAST NAME");
        header.add("ID NUMBER");
        this.setTitle("XARA - PAYROLL");
        initComponents();
        table();
        
        conn = javaConnect.ConnectDb();
        Payroll.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                System.out.println(e.getPath().toString());
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Payroll.getLastSelectedPathComponent();
               if((selectedNode.getUserObject().toString()).equals("Personal Details")){
               new New_Employee().setVisible(true);
               }else if((selectedNode.getUserObject().toString()).equals("Basic Pay")){
               new pay().setVisible(true);
               close();
               }else if((selectedNode.getUserObject().toString()).equals("Commissions")){
               new comission().setVisible(true);
               close();
               }else if((selectedNode.getUserObject().toString()).equals("Allowances")){
               new allowances().setVisible(true);
               close();
               }else if((selectedNode.getUserObject().toString()).equals("Bonuses")){
               new bonuses().setVisible(true);
               close();
               }
                else if((selectedNode.getUserObject().toString()).equals("Non-Taxable Earnings")){
               new non_taxable().setVisible(true);
               close();
               }
                else if((selectedNode.getUserObject().toString()).equals("Non-Cash Benefits")){
               new non_cash_benefits().setVisible(true);
               close();
               }
                else if((selectedNode.getUserObject().toString()).equals("Taxable-Income Relief")){
               new tax_income_relief().setVisible(true);
               close();
               }
                else if((selectedNode.getUserObject().toString()).equals("Deduction")){
               new deductions().setVisible(true);
               close();
               }
                else if((selectedNode.getUserObject().toString()).equals("Pension-Employee")){
               new pension().setVisible(true);
               close();
               }
                else if((selectedNode.getUserObject().toString()).equals("Pension-Employer")){
               new pension_employer().setVisible(true);
               close();
               }
            }
        });
    }

    public void close(){
     WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        add = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        emp_table = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Payroll = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem27 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 900));

        add.setText("new");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jButton1.setText("Edit...");

        jButton2.setText("Delete");

        emp_table.setAutoCreateRowSorter(true);
        emp_table.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        emp_table.setShowHorizontalLines(false);
        emp_table.setShowVerticalLines(false);
        emp_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp_tableMouseClicked(evt);
            }
        });
        emp_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emp_tableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(emp_table);

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator10)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1340, 1340, 1340)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(17, 17, 17))
        );

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Payroll");
        DefaultMutableTreeNode employee = new DefaultMutableTreeNode("EMPLOYEE");
        DefaultMutableTreeNode earning = new DefaultMutableTreeNode("EARNING");
        DefaultMutableTreeNode tax = new DefaultMutableTreeNode("TAX");
        DefaultMutableTreeNode deductions = new DefaultMutableTreeNode("DEDUCTIONS");
        DefaultMutableTreeNode details = new DefaultMutableTreeNode("Personal Details");
        DefaultMutableTreeNode kin = new DefaultMutableTreeNode("Next of Kin");
        DefaultMutableTreeNode leave = new DefaultMutableTreeNode("Leave Taken");
        DefaultMutableTreeNode property = new DefaultMutableTreeNode("Company Property");
        DefaultMutableTreeNode docs = new DefaultMutableTreeNode("Employee Documents");
        DefaultMutableTreeNode workplace = new DefaultMutableTreeNode("Workplace Occurences");
        DefaultMutableTreeNode appraisal = new DefaultMutableTreeNode("Appraisal Score");
        DefaultMutableTreeNode pay = new DefaultMutableTreeNode("Basic Pay");
        DefaultMutableTreeNode hour = new DefaultMutableTreeNode("Time Earnings - Hour");
        DefaultMutableTreeNode day = new DefaultMutableTreeNode("Time Earnings - Day");
        DefaultMutableTreeNode commission = new DefaultMutableTreeNode("Commisions");
        DefaultMutableTreeNode allowance = new DefaultMutableTreeNode("Allowances");
        DefaultMutableTreeNode bonus = new DefaultMutableTreeNode("Bonuses");
        DefaultMutableTreeNode non_tax = new DefaultMutableTreeNode("Non-Taxable Earnings");
        DefaultMutableTreeNode non_cash = new DefaultMutableTreeNode("Non-Cash Benefits");
        DefaultMutableTreeNode tax_relief = new DefaultMutableTreeNode("Taxable-Income Relief");
        DefaultMutableTreeNode deduction = new DefaultMutableTreeNode("Deduction");
        DefaultMutableTreeNode pension_employee = new DefaultMutableTreeNode("Pension-Employee");
        DefaultMutableTreeNode pension_employer = new DefaultMutableTreeNode("Pension-Employer");

        root.add(employee);
        root.add(earning);
        root.add(tax);
        root.add(deductions);
        employee.add(details);
        employee.add(kin);
        employee.add(leave);
        employee.add(property);
        employee.add(docs);
        employee.add(workplace);
        employee.add(appraisal);
        earning.add(pay);
        earning.add(hour);
        earning.add(day);
        earning.add(commission);
        earning.add(allowance);
        earning.add(bonus);
        earning.add(non_tax);
        tax.add(non_cash);
        tax.add(tax_relief);
        deductions.add(deduction);
        deductions.add(pension_employee);
        deductions.add(pension_employer);

        Payroll = new javax.swing.JTree(root);
        add(Payroll);
        Payroll.setMaximumSize(new java.awt.Dimension(74, 450));
        Payroll.setPreferredSize(new java.awt.Dimension(74, 450));
        Payroll.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                PayrollValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(Payroll);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 850));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("BONUSES");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setMinimumSize(new java.awt.Dimension(1350, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu3.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Log Off......");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Change Password...");
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Settings...");
        jMenu3.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Backup...");
        jMenu3.add(jMenuItem3);
        jMenu3.add(jSeparator2);

        jMenu6.setText("Admin Functions");

        jMenu7.setText("Run Process");

        jMenuItem31.setText("End of Month Payroll...");
        jMenu7.add(jMenuItem31);

        jMenu6.add(jMenu7);

        jMenuItem32.setText("Company Profile");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem32);

        jMenuItem5.setText("System Users...");
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Restore Data...");
        jMenu6.add(jMenuItem6);

        jMenu3.add(jMenu6);
        jMenu3.add(jSeparator9);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem30.setText("Exit");
        jMenu3.add(jMenuItem30);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reports");

        jMenu5.setText("Payroll");

        jMenu8.setText("Human Resource");

        jMenuItem7.setText("Employee File Details");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenuItem8.setText("List of Employees...");
        jMenu8.add(jMenuItem8);
        jMenu8.add(jSeparator4);

        jMenuItem9.setText("Leave Report....");
        jMenu8.add(jMenuItem9);

        jMenuItem10.setText("Company Property List...");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        jMenuItem11.setText("Appraisal Report");
        jMenu8.add(jMenuItem11);

        jMenuItem12.setText("Occurence Report");
        jMenu8.add(jMenuItem12);

        jMenu5.add(jMenu8);
        jMenu5.add(jSeparator5);

        jMenuItem13.setText("Monthly Payslip...");
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Annual Payslip...");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Payroll Summary...");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Salary Journal...");
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("Tax Returns...");
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Social Security Returns...");
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("Hospital Insuarance returns...");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setText("Pay Remmitance...");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);
        jMenu5.add(jSeparator6);

        jMenuItem21.setText("Allowances Report...");
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("Deductions Report...");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Pension Report...");
        jMenu5.add(jMenuItem23);

        jMenuItem24.setText("Payroll Quartely Returns...");
        jMenu5.add(jMenuItem24);

        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        jMenu9.setText("Help");

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem25.setText("User Manual...");
        jMenu9.add(jMenuItem25);

        jMenuItem26.setText("Email Support...");
        jMenu9.add(jMenuItem26);
        jMenu9.add(jSeparator7);

        jMenuItem27.setText("Configure Settings...");
        jMenu9.add(jMenuItem27);
        jMenu9.add(jSeparator8);

        jMenuItem28.setText("License...");
        jMenu9.add(jMenuItem28);

        jMenuItem29.setText("About...");
        jMenu9.add(jMenuItem29);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1385, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        new bonus_pay().setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void emp_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_tableMouseClicked

    private void emp_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_tableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_tableKeyReleased

        private void table(){
           try {
             data = new table().getEmployee();
        } catch (Exception ex) {
            Logger.getLogger(Employee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        header = new Vector<String>();
        header.add("FILE NUMBER");
        header.add("FIRST NAME");
        header.add("LAST NAME");
        header.add("ID NUMBER");  
    try{
      ps = conn.prepareStatement("select personal_file_number, first_name,last_name,identity_number from employee");
      rs = ps.executeQuery();
while(rs.next()){
    
emp_table.setModel(new javax.swing.table.DefaultTableModel(
    data,header
));
}
       }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    DefaultTableModel model = (DefaultTableModel)emp_table.getModel();
        model.fireTableDataChanged();
    }
        
        private Vector searchEmployee()throws Exception{
Vector<Vector<String>>employeeVector = new Vector<Vector<String>>();
 ps = conn.prepareStatement("");
        
PreparedStatement ps1 = conn.prepareStatement("SELECT * FROM employee WHERE (personal_file_number LIKE '%"+search.getText()+"%') OR (first_name LIKE '%"+search.getText()+"%') OR (last_name LIKE '%"+search.getText()+"%') OR (identity_number LIKE '%"+search.getText()+"%')");
ResultSet rs1 = ps1.executeQuery();
int i = 1;
while(rs1.next()){
    i++;
Vector<String>employee = new Vector<String>();
employee.add(rs1.getString("personal_file_number"));
employee.add(rs1.getString("first_name"));
employee.add(rs1.getString("last_name"));
employee.add(rs1.getString("identity_number"));
employeeVector.add(employee);
}

return employeeVector;
}
    
    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        try {
            data1 = searchEmployee();
        } catch (Exception ex) {
            Logger.getLogger(Employee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        header = new Vector<String>();
        header.add("FILE NUMBER");
        header.add("FIRST NAME");
        header.add("LAST NAME");
        header.add("ID NUMBER");
    }//GEN-LAST:event_searchKeyReleased

    private void PayrollValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_PayrollValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_PayrollValueChanged

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        // TODO add your handling code here:
        new company_details().setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Successfully logout");
        new login().setVisible(true);
        close();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(bonuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bonuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bonuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bonuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bonuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Payroll;
    private javax.swing.JButton add;
    private javax.swing.JTable emp_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}

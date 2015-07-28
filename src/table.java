import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
public class table {

public Connection dbConnection()throws Exception{
Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/xara","root","");
    //JOptionPane.showMessageDialog(null, "Connection Established!");
    return conn;
}
public Vector getEmployee()throws Exception{
Vector<Vector<String>>employeeVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select personal_file_number, first_name,last_name,identity_number from employee");
ResultSet rs = ps.executeQuery();
int i = 1;
while(rs.next()){
    i++;
Vector<String>employee = new Vector<String>();
employee.add(rs.getString("personal_file_number"));
employee.add(rs.getString("first_name"));
employee.add(rs.getString("last_name"));
employee.add(rs.getString("identity_number"));
employeeVector.add(employee);
}
if(conn!=null)
conn.close();

return employeeVector;
}

public Vector getBranch()throws Exception{
Vector<Vector<String>>branchVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select branch_name,branch_shortname from branch");
ResultSet rs = ps.executeQuery();
int i = 1;
while(rs.next()){
    i++;
Vector<String>branch = new Vector<String>();
branch.add(rs.getString("branch_shortname"));
branch.add(rs.getString("branch_name"));
branchVector.add(branch);
}
if(conn!=null)
conn.close();

return branchVector;
}

public Vector getDepartment()throws Exception{
Vector<Vector<String>>deptVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select department_name,department_shortname from department");
ResultSet rs = ps.executeQuery();
int i = 1;
while(rs.next()){
    i++;
Vector<String>dept = new Vector<String>();
dept.add(rs.getString("department_shortname"));
dept.add(rs.getString("department_name"));
deptVector.add(dept);
}
if(conn!=null)
conn.close();

return deptVector;
}

public Vector getJobGroup()throws Exception{
Vector<Vector<String>>groupVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select job_group_name,job_group_narrative from employee_job_group");
ResultSet rs = ps.executeQuery();
int i = 1;
while(rs.next()){
    i++;
Vector<String>group = new Vector<String>();
group.add(rs.getString("job_group_name"));
group.add(rs.getString("job_group_narrative"));
groupVector.add(group);
}
if(conn!=null)
conn.close();

return groupVector;
}

public Vector getType()throws Exception{
Vector<Vector<String>>typeVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select employee_type_name from employee_type");
ResultSet rs = ps.executeQuery();
int i = 1;
while(rs.next()){
    i++;
Vector<String>type= new Vector<String>();
type.add(rs.getString("employee_type_name"));
typeVector.add(type);
}
if(conn!=null)
conn.close();

return typeVector;
}

public Vector getPay()throws Exception{
Vector<Vector<String>>payVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select personal_file_number, concat_ws(' ',first_name,middle_name,last_name) as name,basic_pay from employee");
ResultSet rs = ps.executeQuery();
int i = 1;
while(rs.next()){
    i++;
Vector<String>pay = new Vector<String>();
pay.add(rs.getString("personal_file_number"));
pay.add(rs.getString("name"));
pay.add(rs.getString("basic_pay"));
payVector.add(pay);
}
if(conn!=null)
conn.close();

return payVector;
}

public Vector getEarnings()throws Exception{
Vector<Vector<String>>earningVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select * from earnings");
ResultSet rs = ps.executeQuery();
while(rs.next()){
Vector<String>earning = new Vector<String>();
earning.add(rs.getString(1));
earning.add(rs.getString(2));
earning.add(rs.getString(3));
earning.add(rs.getString(4));
earning.add(rs.getString(5));
earning.add(rs.getString(6));
earning.add(rs.getString(7));

earningVector.add(earning);
}
if(conn!=null)
conn.close();

return earningVector;
}

public Vector getBenefits()throws Exception{
Vector<Vector<String>>benefitVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select * from benefits");
ResultSet rs = ps.executeQuery();
int i = 1;
while(rs.next()){
    i++;
Vector<String>benefit = new Vector<String>();
benefit.add(rs.getString(1));
benefit.add(rs.getString(2));
benefit.add(rs.getString(3));
benefit.add(rs.getString(4));
benefit.add(rs.getString(5));
benefit.add(rs.getString(6));
benefit.add(rs.getString(7));

benefitVector.add(benefit);
}
if(conn!=null)
conn.close();

return benefitVector;
}

public Vector getDeductions()throws Exception{
Vector<Vector<String>>deductionVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement ps = conn.prepareStatement("select * from deduction");
ResultSet rs = ps.executeQuery();
while(rs.next()){
Vector<String>deduction = new Vector<String>();
deduction.add(rs.getString(1));
deduction.add(rs.getString(2));
deduction.add(rs.getString(3));
deduction.add(rs.getString(4));
deduction.add(rs.getString(5));
deduction.add(rs.getString(6));
deduction.add(rs.getString(7));

deductionVector.add(deduction);
}
if(conn!=null)
conn.close();

return deductionVector;
}

public static void main(String [] args){
}    
}

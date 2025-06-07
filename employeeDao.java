package employee.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class employeeDao {

	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DBNAME = "jdbc:mysql://localhost:3306/employee";    
	private final String USERNAME = "root";
	private final String PASS = "root";
	
	//getConnection -->  to create a connection bcaus we need every time to create a connection 
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(DBNAME, USERNAME, PASS);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
//--------------------------------------------------------------------------------------------------
	
	public void insert(employee emp) {
		
		try {
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("insert into employee (f_name,l_name,gender,dob,age)values(?,?,?,?,?)");
			
//			pst.setInt(1, emp.getId());
			pst.setString(1, emp.getFname());
			pst.setString(2, emp.getLname());
			pst.setString(3, emp.getGend());
			pst.setString(4, emp.getDob());
			pst.setInt(5, emp.getAge());
			
			int i = pst.executeUpdate();
			
			if(i !=0)
				System.out.println("Scucess...");
			else
				System.out.println("error..");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------
	
	public void Delete(employee emp) {
		
		try {
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("delete from employee where did = ? ");
			
			pst.setInt(1, emp.getId());
			
			
			int i = pst.executeUpdate();
			
			if( i != 0) {
				System.out.println("Deleted sucessfully");
			}else {
				System.out.println("Error");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
//-------------------------------------------------------------------------------------------------------------------------------
	
	public void Update(employee emp) {
		
		try {
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("Update employee set f_name = ? l_name = ? gender = ? dob = ? age = ?  where id = ?");
			
//			pst.setInt(1, emp.getId());
			pst.setString(2, emp.getFname());
			pst.setString(3, emp.getLname());
			pst.setString(4, emp.getGend());
			pst.setString(5, emp.getDob());
			pst.setInt(6, emp.getAge());

		int i = pst.executeUpdate();
		if(i != 0) {
			System.out.println("Sucessfully updated ");
		}else {
			System.out.println("Error");
		}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ArrayList<employee>showData(){
		ArrayList<employee> ar = new ArrayList<employee>();
	try {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from employee");
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("did");
			String fname = rs.getString("f_name");
			String lname = rs.getString("l_name");
			String gend = rs.getString("gender");
			String dob = rs.getString("dob");
			int age = rs.getInt("age");
			ar.add(new employee(id, fname, lname, gend, dob, age));
		}
		
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return ar;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

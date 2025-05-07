package self_dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dept {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@//localhost:1521/orcl";
		String username="c##java";
		String userpass="1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,userpass);
			Statement stmt=con.createStatement();
			String sql="select deptno,dname,loc from dept";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(
						rs.getString("deptno")+
						rs.getString("dname")+
						rs.getString("loc")
						);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}

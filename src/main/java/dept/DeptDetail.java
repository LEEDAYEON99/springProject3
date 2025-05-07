package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptDetail {

	public static void main(String[] args) {
	String url ="jdbc:oracle:thin:@//localhost:1521/orcl";
	String username ="c##java";
	String userpass ="1234";
	
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,userpass);
		Statement stmt = con.createStatement();
		
		String sql="select deptno,dname,loc from dept where deptno=10"; // 조건추가
		ResultSet rs = stmt.executeQuery(sql); 
		// 한줄출력시 while문 사용X
		
		if(rs.next()) { 

		String dno = rs.getString("deptno");
		String dnm = 	rs.getString("dname");
		String loc =  rs.getString("loc");
		
		System.out.println(dno+ " "+dnm+ " "+loc);
		}else {
			System.out.println("출력내용이 없습니다"); // 해당내용없을때 출력
		}
		
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	}

}

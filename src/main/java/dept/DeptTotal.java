package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptTotal {

	public static void main(String[] args) {
	String url ="jdbc:oracle:thin:@//localhost:1521/orcl";
	String username ="c##java";
	String userpass ="1234";
	
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,userpass);
		Statement stmt = con.createStatement();
		
		String sql="select count(*)total from dept"; 

		ResultSet rs = stmt.executeQuery(sql); 
		
		if(rs.next()) { 

		String total = rs.getString("total"); // as 이용
		// int total2 = rs.getInt("total2"); // as 이용

		System.out.println("총갯수: "+total+"개");
		}else {
			System.out.println("출력내용이 없습니다"); // 해당내용없을때 출력
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	}

}

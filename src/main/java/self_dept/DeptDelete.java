package self_dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeptDelete {

	public static void main(String[] args) {
	String url ="jdbc:oracle:thin:@//localhost:1521/orcl";
	String userid="c##java";
	String userpass="1234";
	
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url,userid,userpass);
		Statement stmt = con.createStatement();

		String sql ="delete from dept3 where deptno=10";
		int insertCnt = stmt.executeUpdate(sql);
		if(insertCnt == 1) {
			System.out.println("삭제완료");
			
		}else {
			System.out.println("삭제실패");
		}
		
	} catch (Exception e) {
	
		System.out.println("개발자문의");
	}
	

	}

}

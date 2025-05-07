package self_dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeptModify {

	public static void main(String[] args) {
	String url ="jdbc:oracle:thin:@//localhost:1521/orcl";
	String username="c##java";
	String userpass="1234";
	
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,userpass);
		Statement stmt=con.createStatement();		
		String sql="update dept3 set dname='경리부',loc='광주' where deptno='10'";
		int insertCnt = stmt.executeUpdate(sql);
		if(insertCnt ==1) {
			System.out.println("업데이트완료");
		}else {
			System.out.println("업데이트실패");
		}
	} catch (Exception e) {
		
		System.out.println("접속오류 관리자에게 연락주세요");
	}
	
		
	}

}

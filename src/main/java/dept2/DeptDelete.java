package dept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeptDelete {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		Statement stmt = DbConn.OracleConn(); // 주소 받기 ;
		
		System.out.print("1.삭제할 부서지역 입력>>");
		String loc=scn.next();
		
		String sql="delete from dept2 where loc='"+loc+"'";
		
		int cnt = stmt.executeUpdate(sql);
		System.out.println("삭제갯수: "+cnt);
	
		if(cnt>0) { // 삭제갯수가 1개 이상일수있어서
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패");
		}
		
	
	}

}

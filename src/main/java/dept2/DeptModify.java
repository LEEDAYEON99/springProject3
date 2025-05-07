package dept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeptModify {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		Statement stmt = DbConn.OracleConn(); // 주소 받기 ;
		
		System.out.print("1. 부서번호 >>");
		String deptno = scn.next();
		
		System.out.print("2. 부서이름 >>");
		String dname = scn.next();
		
		System.out.print("3. 부서위치 >>");
		String loc = scn.next();
		
		String sql="update dept2 set dname='"
					+dname+
					"',loc='"
					+loc+
					"' where deptno="
					+deptno;
		
		int insertCnt = stmt.executeUpdate(sql); // insert,update,delete 만 가능 
		if(insertCnt==1) {
			System.out.println("업데이트 완료");
		}else {
			System.out.println("없는 부서번호입니다");
		}
		
		
	
	}

}

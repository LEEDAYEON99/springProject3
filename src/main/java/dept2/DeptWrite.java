package dept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeptWrite {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		Statement stmt = DbConn.OracleConn(); // 주소 받기 
		
		System.out.print("1. 부서이름 >>");
		String dname = scn.next();
		
		System.out.print("2. 부서위치 >>");
		String loc = scn.next();
		
		String sql="insert into dept2(deptno,dname,loc)"+
					"values((select max(deptno)+10 from dept2),'"+dname+"','"+loc+"')";
		
		int insertCnt = stmt.executeUpdate(sql); 
		if(insertCnt==1) {
			System.out.println("저장 완료");
		}else {
			System.out.println("저장 실패");
		}
		
		
		
	}

}

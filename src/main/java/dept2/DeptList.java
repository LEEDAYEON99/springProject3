package dept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptList {

	public static void main(String[] args) throws Exception{
	
			Statement stmt = DbConn.OracleConn(); // 주소 받기 
			
			String sql1 ="select count(*) total from dept2";
			ResultSet rs1 =stmt.executeQuery(sql1);
			rs1.next();
			int total = rs1.getInt("total");
			String sql="select deptno,dname,loc from dept2"; 
			System.out.println("총 데이터 수: "+total);
			System.out.println("==============");
		
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()) { // 존재여부 확인
				String dno =rs.getString("deptno");
				String dnm =rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(dno+ " "+dnm+ " "+loc);
			}
		
		}
}

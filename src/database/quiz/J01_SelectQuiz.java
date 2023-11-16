package database.quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_SelectQuiz {

	/*
		DB로 부터 모든 사원의 사번/이름/부서명/직책명을 읽어 파일형태로 저장해보세요
	*/
	public static void main(String[] args) {
		
		File f = new File("myfiles/quiz/employees.txt");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로딩 실패");
			e.printStackTrace();
		}
		
		try(
			FileWriter fout = new FileWriter(f);
			BufferedWriter bout = new BufferedWriter(fout);
			PrintWriter out = new PrintWriter(bout);
			) {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");
			System.out.println("연결 확인" + conn);
			
			String sql = "SELECT employee_id, first_name, department_name, job_title "
					+ "FROM employees e, jobs j, departments d "
					+ "WHERE e.job_id = j.job_id "
					+ "AND e.department_id = d.department_id(+) "
					+ "ORDER BY employee_id";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%d / %s / %s / %s\n", rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("department_name"), rs.getString("job_title"));
				
				out.printf("%d / %s / %s / %s\n", rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("department_name"), rs.getString("job_title"));
			}
			
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}

package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class J05_Metadata {

	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try (
			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			// 조회한 ResultSet에 대한 정보를 볼 수 있다. (유사시)
			ResultSetMetaData meta =  rs.getMetaData();
			
			System.out.println("컬럼이 몇개인가 " + meta.getColumnCount());
			System.out.println("첫 번째 컬럼의 이름은 무엇인가? " + meta.getColumnLabel(1));
			System.out.println("두 번째 컬럼의 이름은 무엇인가? " + meta.getColumnLabel(2));
			
			System.out.println("----------------------------");
			
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				System.out.printf("%-20s\t%s(%d)\n",
						meta.getColumnName(i), meta.getColumnTypeName(i), meta.getColumnDisplaySize(i));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

package principal;

import java.sql.*;

public class Program {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection base = DriverManager.getConnection("jdbc:mysql://localhost:3306/base1", 
					                    				"root",
					                    				"");
			System.out.println("connecté!");
			
			Statement request = base.createStatement();
			
			ResultSet rs = request.executeQuery("SELECT * FROM article");
			
			while (rs.next()) {
				System.out.println(rs.getString("nom") + " -> " + rs.getString("prix"));
			}
			
			base.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

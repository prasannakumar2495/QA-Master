import java.sql.*;

public class Connection {
	
	Connection cnt;
	Statement stmt;
	ResultSet rslt;
	
	private void databaseConnection() {
		try {
			
			//creating the connection to the database
			cnt = (Connection) DriverManager.getConnection("jdbc:derby:C:\\Users\\prasannaan\\MyDB;create=true",
					"PrasannaKumar", "1234");
			
			//writing a statement to create a query
			stmt = ((java.sql.Connection) cnt).createStatement();
			
			//statement to execute the query
			rslt= stmt.executeQuery("SELECT *\r\n" + 
					"FROM TABLEOFC");
			
			while(rslt.next())
			{
				System.out.println(rslt.getString("LOCATION"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection cnc = new Connection();
		cnc.databaseConnection();
	}
}

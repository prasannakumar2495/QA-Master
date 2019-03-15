
import java.io.Closeable;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class DRIVER {
	Connection cnt;
	Statement stmt;
	ResultSet rslt;

	private void createTable() throws ClassNotFoundException {
		try {
			// Class.forName("something.jdbc.driver.YourFubarDriver");
			cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "2495@Apple");

			stmt = ((java.sql.Connection) cnt).createStatement();
			String code = "call SelectAllCustomers";
			rslt = stmt.executeQuery(code);
			while (rslt.next()) {
				System.out.print(rslt.getString("name")+" ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void CreateData() {
		try {
			String VIEW = "SELECT * FROM sys.PK_VIEW;";
			rslt = stmt.executeQuery(VIEW);
			while (rslt.next()) {
				System.out.println();
				System.out.println(rslt.getString("location")+"--->"+rslt.getString("id_num")+"--->"+rslt.getString("name"));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void validateData() throws SQLException {
		String Function = "select sys.PK();";
		rslt = stmt.executeQuery(Function);
		System.out.println("done");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DRIVER d = new DRIVER();
		d.createTable();
		d.CreateData();
		d.validateData();
	}
}

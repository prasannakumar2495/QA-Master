
import java.io.Closeable;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;


public class DRIVER {
	Connection cnt;
	Statement stmt;
	ResultSet rslt;

	private void createTable() {
		try {
			cnt = (Connection) DriverManager.getConnection("jdbc:derby:/Users/prasannakumaranisetti/MyDB;create=true",
					"PrasannaKumar", "12345");

			stmt = ((java.sql.Connection) cnt).createStatement();
			
			rslt = stmt.executeQuery("CREATE TABLE TableA/C (\n" + 
					"    UserName varchar(255),\n" + 
					"    PWD varchar(255),\n" + 
					");");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void CreateData() {
		try {
			rslt = stmt
					.executeQuery("INSERT INTO TableA/C (UserName, PWD)\n" + "VALUES ('PrasannaKumar', '2495@Apple');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void validateData() {
		Scanner scr = new Scanner(System.in);
		String UserName = scr.next();
		String PWD = scr.next();
		try {
			rslt = stmt.executeQuery("select *\n" + "from TableA/C");
			while (rslt.next()) {
				String UserNameIP = rslt.getString("UserName");
				String PWDIP = rslt.getString("PWD");
				if (UserName.equals(UserNameIP) && PWD.equals(PWDIP)) {
					System.out.println(UserNameIP + "--->" + UserName);
					System.out.println(PWD + "--->" + PWDIP);
				}
			}
			((Closeable) cnt).close();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		DRIVER d = new DRIVER();
		d.createTable();
		d.CreateData();
		d.validateData();
	}
}

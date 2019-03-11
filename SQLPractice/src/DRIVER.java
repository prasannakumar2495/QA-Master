
import java.io.Closeable;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class DRIVER {
	Connection cnt;
	Statement stmt;
	ResultSet rslt;

	private void createTable() throws ClassNotFoundException {
		try {
			//Class.forName("something.jdbc.driver.YourFubarDriver");
			cnt = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sys",
					"root", "2495@Apple");

			stmt = ((java.sql.Connection) cnt).createStatement();
			String code = "call SelectAllCustomers";
			rslt = stmt.executeQuery(code);
			while(rslt.next())
			{
				System.out.println(rslt.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
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
	public static void main(String[] args) throws ClassNotFoundException {
		DRIVER d = new DRIVER();
		d.createTable();
		//d.CreateData();
		//d.validateData();
	}
}

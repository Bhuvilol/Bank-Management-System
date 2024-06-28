package bank;
import java.sql.*;

public class Conn {
	Connection c;
	public Statement s;
	public Conn() {
		try {
			c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Bhabesh@123");
			s = c.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

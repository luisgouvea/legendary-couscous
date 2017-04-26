package Principal;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionDB {
	public ConnectionDB(){
		
	}
	
	public Connection getConnection() throws SQLException, FileNotFoundException {
		try {

			Connection con = null;

			String DRIVER = "oracle.jdbc.driver.OracleDriver";
			String DRIVERURL = "jdbc:oracle:thin:@camburi.pucrs.br";
			String PORT = "1521";
			String SID = "FACIN11G";
			String USER = "BD109323";
			String PASSWORD = "bd109323";
			String URL = DRIVERURL + ":" + PORT + ":" + SID;
			try {
				Class.forName(DRIVER);
				con = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return con;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}	
}

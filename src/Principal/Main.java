package Principal;

import java.io.FileNotFoundException;
import java.sql.*;


import Persistencia.ConnectionDB;

public class Main {
	public static void main(String [] args) throws FileNotFoundException, SQLException{
		ConnectionDB connection = new ConnectionDB();
		Connection con = connection.getConnection();
		connection.executarSQL(con);
	}
}

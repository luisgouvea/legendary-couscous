package Principal;

import java.io.FileNotFoundException;
import java.sql.*;

import DAO.DAOProdutos;

public class Main {
	public static void main(String [] args) throws FileNotFoundException, SQLException{
		ConnectionDB connection = new ConnectionDB();
		Connection con = connection.getConnection();
		DAOProdutos daoProdutos = new DAOProdutos();
		daoProdutos.executarSQL(con);
	}
}

package DAO;

import java.sql.*;

public class DAOProdutos {
	private Connection connection;

	public DAOProdutos(Connection con) {
		this.connection = con;
	}

	public void executarSQL() throws SQLException {
		String sql = "SELECT * FROM PRODUTOS";
		java.sql.Statement comando = this.connection.createStatement();
		try (ResultSet resultado = ((java.sql.Statement) comando).executeQuery(sql)) {
			while (resultado.next()) {
				System.out.println("GENERO:" + resultado.getString("genero"));
			}
		}
	}
}

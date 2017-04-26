package DAO;

import java.sql.*;

public class DAOProdutos {
	
	public void executarSQL(Connection con) throws SQLException{
		String sql = "SELECT * FROM PRODUTOS";
		java.sql.Statement comando = con.createStatement();
		try (ResultSet resultado = ((java.sql.Statement) comando).executeQuery(sql)) {
            while (resultado.next()) {
                System.out.println("GENERO:" + resultado.getString("genero"));
            }
        }
	}
}

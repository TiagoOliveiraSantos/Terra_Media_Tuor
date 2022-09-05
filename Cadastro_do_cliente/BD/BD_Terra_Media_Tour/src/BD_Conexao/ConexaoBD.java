package BD_Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	//Conectando ao Banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bd_terra_media_tour";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "DBA#2913@Dev";
	
	public Connection getConnection() { 
	    try {
			return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		} catch (SQLException exececao) {
			// TODO Auto-generated catch block
			throw new RuntimeException(exececao);
		}
	}

	public static Connection createConnectionToMysql() {
		// TODO Auto-generated method stub
		return null;
	}

}
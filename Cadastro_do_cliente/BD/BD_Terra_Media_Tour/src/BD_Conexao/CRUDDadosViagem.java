package BD_Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CRUDDadosViagem {
	
	private Connection connection;
	
	public CRUDDadosViagem() {
		this.connection = new ConexaoBD().getConnection();
	}
	
	//Criando os dados da tabela
	public void insere (Dados_Viagem viagem) {
		String sql = "INSERT INTO Dados_Viagem (Origem, Destino, DataHora_Ida,"
				+ " DataHora_Volta,Qt_Passagens,TipoPassagem, Bagagem, "
				+ "CompanhiaAerea,ValorPassagem) VALUES(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1,viagem.getOrigem());
				stmt.setString(2,viagem.getDestino());
				stmt.setString(3,viagem.getDataHoraIda());
				stmt.setString(4,viagem.getDataHoraVolta());
				stmt.setInt(5,viagem.getQtPassagens());
				stmt.setString(6,viagem.getTipoPassagem());
				stmt.setString(7,viagem.getBagagem());
				stmt.setString(8,viagem.getCompanhiaAerea());
				stmt.setDouble(9,viagem.getValorPassagem());
				stmt.execute();
				stmt.close();
			
		}catch (SQLException excecao){
			
			excecao.printStackTrace();	
		}
		
	}
	//Lendo os dados da tabela
	public ResultSet getViagem() throws SQLException{
		String sql ="SELECT * FROM dados_viagem;";
		Statement stmt = null;
		ResultSet resultado = null;
		
		try {
			stmt = connection.createStatement();
			resultado = stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return resultado;
		
	}
	//Atualizando os dados da tabela
	public void atulizar (Dados_Viagem viagem) {
		String sql = "UPDATE Dados_Viagem SET Origem= ?, Destino= ?, DataHora_Ida= ?,"
				+ " DataHora_Volta= ?,Qt_Passagens= ?,TipoPassagem= ?,"
				+ " Bagagem= ?, CompanhiaAerea=?,ValorPassagem=? WHERE idViagem = ?";
		try {
			
		PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,viagem.getOrigem());
			stmt.setString(2,viagem.getDestino());
			stmt.setString(3,viagem.getDataHoraIda());
			stmt.setString(4,viagem.getDataHoraVolta());
			stmt.setInt(5,viagem.getQtPassagens());
			stmt.setString(6,viagem.getTipoPassagem());
			stmt.setString(7,viagem.getBagagem());
			stmt.setString(8,viagem.getCompanhiaAerea());
			stmt.setDouble(9,viagem.getValorPassagem());
			stmt.setInt(10,viagem.getIdViagem());
			stmt.execute();
			stmt.close();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Removendo dados a tabela
	public void remove (int idViagem) {
		String sql = "DELETE FROM Dados_Viagem  WHERE idViagem=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, idViagem);
			stmt.execute();
			stmt.close();
			
		}catch (SQLException excecao){
			//TODO Auto-generated catch block
			excecao.printStackTrace();	
		}
		
	}

}

package BD_Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CRUDCadastro {
	
	private Connection connection;
	
	public CRUDCadastro() {
		this.connection = new ConexaoBD().getConnection();
	}
	
	//Criando os dados da tabela
	public void insere (Cadastro cadastro) {
		String sql = "INSERT INTO cadastro (Nome, CPF, RG, Data_Nascimento, Rua, Ncasa,Bairro, Cidade, Estado, CEP,"
				+ " Email,Telefone, Login, Senha) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,md5(?))";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, cadastro.getNome());
				stmt.setInt(2, cadastro.getCpf());
				stmt.setInt(3, cadastro.getRg());
				stmt.setString(4, cadastro.getDataNascimento());
				stmt.setString(5, cadastro.getRua());
				stmt.setInt(6, cadastro.getNCasa());
				stmt.setString(7, cadastro.getBairro());
				stmt.setString(8, cadastro.getCidade());
				stmt.setString(9, cadastro.getEstado());
				stmt.setString(10, cadastro.getCep());
				stmt.setString(11, cadastro.geteMail());
				stmt.setString(12, cadastro.getTelefone());
				stmt.setString(13, cadastro.getLogin());
				stmt.setString(14, cadastro.getSenha());
				stmt.execute();
				stmt.close();
			
		}catch (SQLException excecao){
			
			excecao.printStackTrace();	
		}
		
	}
	//Lendo os dados da tabela
	public ResultSet getCadastro() throws SQLException{
		String sql ="SELECT * FROM cadastro";
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
	public void atulizar (Cadastro cadastro) {
		String sql = "UPDATE cadastro SET Nome = ?,CPF= ?,RG= ?,Data_Nascimento= ?,Rua= ?,Ncasa= ?,Bairro= ?,"
				+ "Cidade= ?,Estado= ?, CEP= ?, Email= ?,Telefone= ?, Login= ?, Senha=(md5(?)) WHERE idCliente = ?";
		try {
			
		PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cadastro.getNome());
			stmt.setInt(2, cadastro.getCpf());
			stmt.setInt(3, cadastro.getRg());
			stmt.setString(4, cadastro.getDataNascimento());
			stmt.setString(5, cadastro.getRua());
			stmt.setInt(6, cadastro.getNCasa());
			stmt.setString(7, cadastro.getBairro());
			stmt.setString(8, cadastro.getCidade());
			stmt.setString(9, cadastro.getEstado());
			stmt.setString(10, cadastro.getCep());
			stmt.setString(11, cadastro.geteMail());
			stmt.setString(12, cadastro.getTelefone());
			stmt.setString(13, cadastro.getLogin());
			stmt.setString(14, cadastro.getSenha());
			stmt.setInt(15, cadastro.getIdCliente());
			stmt.execute();
			stmt.close();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Removendo dados a tabela
	public void remove (int idCliente) {
		String sql = "DELETE FROM cadastro WHERE idCliente=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, idCliente);
			stmt.execute();
			stmt.close();
			
		}catch (SQLException excecao){
			//TODO Auto-generated catch block
			excecao.printStackTrace();	
		}
		
	}

}

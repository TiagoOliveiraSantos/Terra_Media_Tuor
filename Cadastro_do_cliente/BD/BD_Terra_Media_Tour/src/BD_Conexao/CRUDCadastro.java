package BD_Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDCadastro {
	
	private Connection connection;
	
	public CRUDCadastro() {
		this.connection = new ConexaoBD().getConnection();
	}
	
	//Adionando dados a tabela
	public void save (Cadastro cadastro) {
		String sql = "INSERT INTO cadastro (Nome, CPF, RG, Data_Nascimento, Rua, Ncasa,Bairro, Cidade, Estado, CEP, Email,Telefone, Login, Senha) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,md5(?))";
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
			//TODO Auto-generated catch block
			excecao.printStackTrace();	
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

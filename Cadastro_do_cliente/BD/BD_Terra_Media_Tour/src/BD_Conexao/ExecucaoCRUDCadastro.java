package BD_Conexao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecucaoCRUDCadastro {

	public static void main(String[] args) {
		// Excecutando o CRUD Com cadastro
		
		Cadastro cadastro = new Cadastro();
			cadastro.setNome("Frodo");
			cadastro.setCpf(280146);
			cadastro.setRg(123008);
			cadastro.setDataNascimento("1999-01-09");
			cadastro.setRua("Novo");
			cadastro.setNCasa(15);
			cadastro.setBairro("Rua do lado direito");
			cadastro.setCidade("Salvador");
			cadastro.setEstado("Bahia");
			cadastro.setCep("41008900");
			cadastro.seteMail("email@hotmail.com");
			cadastro.setTelefone("7199999777");
			cadastro.setLogin("Hobbit");
			cadastro.setSenha("255556");
		
		CRUDCadastro adiciona = new CRUDCadastro ();
		adiciona.insere(cadastro);
		System.out.println("Cadastro salvo!");
		
		//Lendo os dados
		CRUDCadastro leitura = new CRUDCadastro();
		
		try {
			ResultSet  resultado = leitura.getCadastro();
				while (resultado.next()) {
					System.out.println(resultado.getInt(1));
					System.out.println(resultado.getString(2));
					System.out.println(resultado.getInt(3));
					System.out.println(resultado.getString(4));
					System.out.println(resultado.getString(5));
					System.out.println(resultado.getString(6));
					System.out.println(resultado.getInt(7));
					System.out.println(resultado.getString(8));
					System.out.println(resultado.getString(9));
					System.out.println(resultado.getString(10));
					System.out.println(resultado.getString(11));
					System.out.println(resultado.getString(12));
					System.out.println(resultado.getString(13));
					System.out.println(resultado.getString(14));
					System.out.println(resultado.getString(15));
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Atualizando
		CRUDCadastro atualiza = new CRUDCadastro();
			cadastro.setIdCliente(1);
			cadastro.setNome("Presuntinho da Silva");
			cadastro.setCpf(8889777);
			cadastro.setRg(88889888);
			cadastro.setDataNascimento("1999-07-02");
			cadastro.setRua("Mudei de novo");
			cadastro.setNCasa(07);
			cadastro.setBairro("Rua da Direita");
			cadastro.setCidade("Lauro");
			cadastro.setEstado("Bahia");
			cadastro.setCep("41000091");
			cadastro.seteMail("email@gmail.com");
			cadastro.setTelefone("7133388844");
			cadastro.setLogin("Porco");
			cadastro.setSenha("479715");
			
		atualiza.atulizar(cadastro);	
		System.out.println("Cadastro Atualizado!");
		
		//Removendo os dados
		CRUDCadastro retira = new CRUDCadastro ();
		
			retira.remove(27);
			System.out.println("Cadastro removido!");

	}

}

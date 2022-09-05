package BD_Conexao;

public class ExecucaoCRUDCadastro {

	public static void main(String[] args) {
		// Excecutando o CRUD Com cadastro
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.setNome("Silvia");
		cadastro.setCpf(123456);
		cadastro.setRg(1235489);
		cadastro.setDataNascimento("1991-01-01");
		cadastro.setRua("Seila");
		cadastro.setNCasa(2);
		cadastro.setBairro("Rua de cima");
		cadastro.setCidade("Salvador");
		cadastro.setEstado("Bahia");
		cadastro.setCep("41000000");
		cadastro.seteMail("email@hotmail.com");
		cadastro.setTelefone("7199895998");
		cadastro.setLogin("Carlos");
		cadastro.setSenha("252456");
		
		CRUDCadastro adiciona = new CRUDCadastro ();
		
		adiciona.save(cadastro);
		System.out.println("Cadastro salvo!");
		
		//Removendo os dados
		CRUDCadastro retira = new CRUDCadastro ();
		
		retira.remove(2);
		System.out.println("Cadastro removido!");

	}

}

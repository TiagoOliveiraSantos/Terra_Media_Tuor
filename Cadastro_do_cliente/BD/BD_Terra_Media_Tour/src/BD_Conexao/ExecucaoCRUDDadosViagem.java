package BD_Conexao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecucaoCRUDDadosViagem {

	public static void main(String[] args) {
		// Inclindo os dados no BD
		Dados_Viagem  viagem = new Dados_Viagem();

			viagem.setOrigem("Rio Grande do Sul");
			viagem.setDestino("Salvador");
			viagem.setDataHoraIda("2022-12-15 10:10:00");
			viagem.setDataHoraVolta("2023-01-25 12:30:00");
			viagem.setQtPassagens(1);
			viagem.setTipoPassagem("Executiva");
			viagem.setBagagem("Não");
			viagem.setCompanhiaAerea("Azul");
			viagem.setValorPassagem(500.00);
			
		
			CRUDDadosViagem adiciona = new CRUDDadosViagem ();
			adiciona.insere(viagem);
			System.out.println("Dados da viagem salvos!");
		
		//Lendo os dados
		CRUDDadosViagem leitura = new CRUDDadosViagem();
		
		try {
			ResultSet  resultado = leitura.getViagem();
				while (resultado.next()) {
					System.out.println(resultado.getInt(1));
					System.out.println(resultado.getString(2));
					System.out.println(resultado.getString(3));
					System.out.println(resultado.getString(4));
					System.out.println(resultado.getString(5));
					System.out.println(resultado.getString(6));
					System.out.println(resultado.getString(7));
					System.out.println(resultado.getString(8));
					System.out.println(resultado.getString(9));
					System.out.println(resultado.getDouble(10));
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Atualizando
		CRUDDadosViagem atualiza = new CRUDDadosViagem();
			viagem.setIdViagem(19);
			viagem.setOrigem("Porto Alegre");
			viagem.setDestino("Rio de Janeiro");
			viagem.setDataHoraIda("2023-01-07 10:05:00");
			viagem.setDataHoraVolta("2023-01-20 15:15:00");
			viagem.setQtPassagens(1);
			viagem.setTipoPassagem("Econômica");
			viagem.setBagagem("Sim");
			viagem.setCompanhiaAerea("Gol");
			viagem.setValorPassagem(400.00);
			
			
		atualiza.atulizar(viagem);	
		System.out.println("Dados da viagem Atualizados!");
		
		//Removendo os dados
		CRUDDadosViagem retira = new CRUDDadosViagem ();
		
		retira.remove(20);
		System.out.println("Dados da viagem removidos!");

	}

}

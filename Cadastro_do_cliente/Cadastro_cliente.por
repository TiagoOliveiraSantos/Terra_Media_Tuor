programa {
    inclua biblioteca Texto --> t
	funcao inicio() {
	   cadeia resposta, consulta
		/*Dados do cliente*/
		cadeia dadosSolicitados []= {"Nome completo","CPF","RG","Telefone","E-mail","Rua com N","Bairro","Cidade Estado","CEP"}
		cadeia dadosInformados[] = {"Nome completo","CPF","RG","Telefone","E-mail","Rua com N","Bairro","Cidade Estado","CEP"}
        /*Dados do Destino*/
        cadeia dadosSolicitadosDaViagem []= {"Origem","Destino","Data de ida","Data de vinda"}
        cadeia dadosDaViagem []= {"Origem","Destino","Data de ida","Data de vinda"}
        
    escreva("**********Vamos iniciar o seu cadastro**********")
    para (inteiro i = 0; i<=8; i++){
	escreva("\n"+dadosInformados[i]+": ")
	leia(dadosInformados[i])
	limpa()
    }
    escreva("**********Vamos escolher o seu destino*********")
    para (inteiro i = 0; i<=3; i++){
	escreva("\n"+dadosSolicitadosDaViagem[i]+": ")
	leia(dadosSolicitadosDaViagem[i])
	limpa()
    }
    
    escreva("Deseja consultar os do cadastro e da viagem?[S/N] ")
    leia(resposta)
    limpa()
    se(t.caixa_alta(resposta) == "S"){
        escreva("*********Dados do cadastro**********\n")
           para (inteiro i = 0; i<=8 ; i++){
    	escreva("--> "+dadosSolicitados[i]+ ": "+dadosInformados[i]+"\n")
            }
         escreva("\n*********Dados da viagem**********\n")
        para (inteiro i = 0; i<=3; i++){
    	escreva("--> "+dadosDaViagem[i]+ ": "+dadosSolicitadosDaViagem[i]+"\n")
        }
        escreva("Obrigado por viajar conosco! Tenha uma otima viagem")
    }senao{
        escreva("Obrigado por viajar conosco! Tenha uma otima viagem")
    }
        
    //escreva("Dados do Embarque: 1254848")
    }
}

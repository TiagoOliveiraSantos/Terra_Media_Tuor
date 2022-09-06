package BD_Conexao;

public class Dados_Viagem {
	private int idViagem;
	private String origem;
	private String destino;
	private String dataHoraIda;
	private String dataHoraVolta;
	private int qtPassagens;
	private String tipoPassagem;
	private String bagagem;
	private String companhiaAerea;
	private Double valorPassagem;

	
	public int getIdViagem() {
		return idViagem;
	}
	public void setIdViagem(int idViagem) {
		this.idViagem = idViagem;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDataHoraIda() {
		return dataHoraIda;
	}
	public void setDataHoraIda(String dataHoraIda) {
		this.dataHoraIda = dataHoraIda;
	}
	public String getDataHoraVolta() {
		return dataHoraVolta;
	}
	public void setDataHoraVolta(String dataHoraVolta) {
		this.dataHoraVolta = dataHoraVolta;
	}
	public int getQtPassagens() {
		return qtPassagens;
	}
	public void setQtPassagens(int qtPassagens) {
		this.qtPassagens = qtPassagens;
	}
	public String getTipoPassagem() {
		return tipoPassagem;
	}
	public void setTipoPassagem(String tipoPassagem) {
		this.tipoPassagem = tipoPassagem;
	}
	public String getBagagem() {
		return bagagem;
	}
	public void setBagagem(String bagagem) {
		this.bagagem = bagagem;
	}
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}
	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
	public Double getValorPassagem() {
		return valorPassagem;
	}
	public void setValorPassagem(Double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}
	
	
}

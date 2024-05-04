package model;

public abstract class Empresa {
	private String cnpj;
	private String nome_oficial;
	private String nome_divulgacao;
	private Data data_criacao;
	
	public Empresa(String cnpj, String nome_oficial, String nome_divulgacao, Data data_criacao) {
		this.cnpj = cnpj;
		this.nome_oficial = nome_oficial;
		this.nome_divulgacao = nome_divulgacao;
		this.data_criacao = data_criacao;
	}
	
	
	
	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", nome_oficial=" + nome_oficial + ", nome_divulgacao=" + nome_divulgacao
				+ ", data_criacao=" + data_criacao + "]";
	}



	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome_oficial() {
		return nome_oficial;
	}
	public void setNome_oficial(String nome_oficial) {
		this.nome_oficial = nome_oficial;
	}
	public String getNome_divulgacao() {
		return nome_divulgacao;
	}
	public void setNome_divulgacao(String nome_divulgacao) {
		this.nome_divulgacao = nome_divulgacao;
	}
	public Data getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(Data data_criacao) {
		this.data_criacao = data_criacao;
	}
	
	
	
	
}

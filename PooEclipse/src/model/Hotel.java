/*Busca por hoteis, ATRIBUTOS: CNPJ, 
 *nome oficial, nome divulgacao, endereco completo, ano de criacao, 
 *nro de estrelas, aceita pets,nro total de quartos, horario do check-in e check-out. 
 *MÉTODOS: msg divulgacao exibida na busca e descricao(breve).*/
package model;

import java.util.ArrayList;

public class Hotel extends Empresa {
	private String end_completo;
	private int nmr_estrelas;
	private boolean pets;
	private int nmr_quartos;
	private Tempo check_in;
	private Tempo check_out;
	private String cidade;
	private String msg_divulgacao;
	private boolean cancelamento;
	private Funcionario_Parceiro funcionario;
	private ArrayList<Quartos> quartos = new ArrayList<Quartos>();
	private static float taxa_udi_decola = 100f; //taxa fixa que o hotel paga a udi-decola por cada diaria vendida

	public static float getTaxa_udi_decola() {
		return taxa_udi_decola;
	}

	
	public String mostrarDados() {
		return toString() + super.toString();
	}
	
	@Override
	public String toString() {
		return "Hotel [end_completo=" + end_completo + ", nmr_estrelas=" + nmr_estrelas + ", pets=" + pets + ", nmr_quartos=" + nmr_quartos + ", check_in=" + check_in.formatarTempo() + ", check_out=" + check_out.formatarTempo() + ", cidade="+ cidade + "\n msg_divulgacao=" + msg_divulgacao + "\n cancelamento=" + cancelamento + ", funcionario="+ funcionario + "\n quartos=" + quartos.toString() + "]";
	}

	public static void setTaxa_udi_decola(float taxa_udi_decola) {
		Hotel.taxa_udi_decola = taxa_udi_decola;
	}

	public Hotel(String cnpj, String nome_oficial, String nome_divulgacao, Data data_criacao, String end_completo,
			int nmr_estrelas, boolean pets, Tempo check_in, Tempo check_out, String cidade, String msg_divulgacao,
			boolean cancelamento, Quartos quartos) {
		super(cnpj, nome_oficial, nome_divulgacao, data_criacao);
		this.end_completo = end_completo;
		setNmr_estrelas(nmr_estrelas);
		this.pets = pets;
		this.nmr_quartos = quartos.totalQuartos();
		this.check_in = check_in;
		this.check_out = check_out;
		this.cidade = cidade;
		this.msg_divulgacao = msg_divulgacao;
		this.cancelamento = cancelamento;
		this.addQuartos(quartos);
	}

	public void addQuartos(Quartos quartos) { //Adiciona 356 quartos, cada elemento representa um dia
		for(int i = 0;i < 355;i++) {
			this.quartos.add(quartos); //add quartos em certa data
			quartos.setData(quartos.getData().proximoDia()); //atualiza a data para adicionar os mesmo quartos
		}
		
	}
	
	public Funcionario_Parceiro getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario_Parceiro funcionario) {
		this.funcionario = funcionario;
	}

	public boolean reservar(Data data, int dias, int tipo) {
		int count = 0;	
		for (Quartos q : this.quartos) {
			if (q.getData().equals(data)) { // verifica se existe quartos para esse data
				int r = q.reservarDia(tipo);
				if (r != 0) {
					System.out.println("Quarto indisponivel no dia: " + data.formatarData());
					return false;
				}
				data = data.proximoDia();
				if(data.getAno() > q.getData().getAno())
				{
					System.out.println("Quarto indisponivel nesse ano: " + data.formatarData());
					return false;
				}
				count++;
			}
			if(count == dias) {
				return true;
			}
		}
		return false;
	}
	
	public void liberar(Data data, int dias, int tipo) {
		int count = 0;
		for (Quartos q : this.quartos) {
			if (q.getData().equals(data)) { // verifica se existe quartos para esse data
				int r = q.liberarDia(tipo);
				if (r != 0) {
					System.out.println("Quarto indisponivel no dia: " + data.formatarData());
				}
				data = data.proximoDia();
				if(data.getAno() > q.getData().getAno())
				{
					System.out.println("Quarto indisponivel nesse ano: " + data.formatarData());
					break;
				}
				count++;
			}
			if(count == dias) {
				break;
			}
		}
	}

	public int getNmr_quartos() {
		return nmr_quartos;
	}

	public ArrayList<Quartos> getQuartos() {
		return quartos;
	}

	public void setNmr_quartos(int nmr_quartos) {
		this.nmr_quartos = nmr_quartos;
	}

	public void setQuartos(ArrayList<Quartos> quartos) {
		this.quartos = quartos;
	}

	public String msg_descricao() {
		return ("Endereço: " + getEnd_completo() + "\tCidade: " + getCidade() + "\nPermitido PETS:" + isPets()
				+ "\tEstrelas: " + getNmr_estrelas() + "\nCheck-in: " + getCheck_in().formatarTempo() + "\tCheck-out: "
				+ getCheck_out().formatarTempo());
	}

	public String getEnd_completo() {
		return end_completo;
	}

	public void setEnd_completo(String end_completo) {
		this.end_completo = end_completo;
	}

	public int getNmr_estrelas() {
		return nmr_estrelas;
	}

	public void setNmr_estrelas(int nmr_estrelas) {
		if (nmr_estrelas < 0)
			this.nmr_estrelas = 0;
		else if (nmr_estrelas >= 5)
			this.nmr_estrelas = 5;
		else
			this.nmr_estrelas = nmr_estrelas;
	}

	public boolean isPets() {
		return pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public Tempo getCheck_in() {
		return check_in;
	}

	public void setCheck_in(Tempo check_in) {
		this.check_in = check_in;
	}

	public Tempo getCheck_out() {
		return check_out;
	}

	public void setCheck_out(Tempo check_out) {
		this.check_out = check_out;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getMsg_divulgacao() {
		return msg_divulgacao;
	}

	public void setMsg_divulgacao(String msg_divulgacao) {
		this.msg_divulgacao = msg_divulgacao;
	}

	public ArrayList<Quartos> getQuarto() {
		return quartos;
	}

	public void setQuarto(ArrayList<Quartos> quarto) {
		this.quartos = quarto;
	}

	public boolean isCancelamento() {
		return cancelamento;
	}

	public void setCancelamento(boolean cancelamento) {
		this.cancelamento = cancelamento;
	}

}

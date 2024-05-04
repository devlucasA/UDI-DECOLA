package model;
import java.time.LocalDateTime;

public class Compra {

	private Cliente cliente;
	private float valorFinal; // valor final da compra

	private Voo voo; // Armazenando a passagem aérea
	private int qtd_passagem; //Quantidade de passagem
	private Hotel hotel; // Armazenando o hotel, a diaria
	private int qtd_diarias; // Quantidade de DIARIAS 
	private int tipo_Quarto;
	private Data inicio;
	private Data fim;
	private String forma_de_pagamento; //Podendo ser Pix, credito,debito...
	private LocalDateTime data_e_hora_compra;
	private float comissao; //Isso é a Comissão que deve ser paga a udi-decola.
	
	private String ID_Compra;
    
	
	/*
	public void calcularValorComissaoHotelUdiDecola() {
	    // Somar o valor da comissão a ser paga para UDI-decola
	    comissao += (qtd_passagem * voo.getTrecho().getCompanhia().getTaxa_da_udi_decola()) + (qtd_diarias * hotel.getTaxa_udi_decola());
	    //Aqui poderá ter qtd quartos...
	}
	*/

	
	public String mostrarDados() {
		return toString();
	}
	
	
	@Override
	public String toString() {
		return "Compra [cliente=" + cliente + ", valorFinal=" + valorFinal + ", voo=" + voo + ", qtd_passagem="
				+ qtd_passagem + ", hotel=" + hotel + ", qtd_diarias=" + qtd_diarias + ", tipo_Quarto=" + tipo_Quarto
				+ ", inicio=" + inicio + ", fim=" + fim + ", forma_de_pagamento=" + forma_de_pagamento
				+ ", data_e_hora_compra=" + data_e_hora_compra + ", comissao=" + comissao + ", ID_Compra=" + ID_Compra
				+ "]";
	}


	public int getQtd_passagem() {
		return qtd_passagem;
	}


	public void setQtd_passagem(int qtd_passagem) {
		this.qtd_passagem = qtd_passagem;
	}


	public int getQtd_diarias() {
		return qtd_diarias;
	}


	public void setQtd_diarias(int qtd_diarias) {
		this.qtd_diarias = qtd_diarias;
	}


	public String getID_Compra() {
		return ID_Compra;
	}


	public void setID_Compra(String iD_Compra) {
		ID_Compra = iD_Compra;
	}


	public Compra(Cliente cliente, Voo voo, Hotel hotel, int tipo_Quarto, Data inicio, Data fim,
			int qtd_passagem, String forma_pagar, String ID) {
		if(hotel != null) {
			this.qtd_diarias = 0;
			this.hotel = hotel;
			this.tipo_Quarto = tipo_Quarto;
			this.inicio = inicio;
			this.fim = fim;
			this.ID_Compra = ID;
			reservarHotel(hotel,inicio,fim,tipo_Quarto);
			
		}else {
			this.qtd_diarias = 0;
			this.hotel = null;
			this.tipo_Quarto = 0;
			this.inicio = null;
			this.fim = null;
		}
		this.qtd_passagem = 0;
		if(voo != null) {
			if(comprarPassagemAerea(voo)) {
				//Aqui seria a companhia pagando para a UDI decola
				this.qtd_passagem = qtd_passagem;
			}
		}
		this.cliente = cliente;
		this.data_e_hora_compra = LocalDateTime.now();
		this.forma_de_pagamento = forma_pagar;
		
		//calcularValorComissaoHotelUdiDecola();
		
	}


	public LocalDateTime getData_e_hora_compra() {
		return data_e_hora_compra;
	}

	public void setData_e_hora_compra(LocalDateTime data_e_hora_compra) {
		this.data_e_hora_compra = data_e_hora_compra;
	}

	public Boolean reservarHotel(Hotel hotel,Data inicio,Data fim,int tipo){
		setHotel(hotel);
    	setTipo_Quarto(tipo);
    	int count = 0;
    	int dias = inicio.diferencaDeDias(fim);
		float r = 0; // Preço a ser pago pelo quarto
		for (Quartos q : hotel.getQuartos()) {
			if(getTipo_Quarto() == 1) {
				r += q.getDiaria_single();
				count++;
			}else if (getTipo_Quarto() == 2) {
				r += q.getDiaria_duplo();
				count++;
			}else if (getTipo_Quarto() == 3) {
				r += q.getDiaria_triplo();
				count++;
			}else if (getTipo_Quarto() == 4) {
				r += q.getDiaria_luxo();
				count++;
			}
			if(count == dias) {
				hotel.reservar(inicio, dias, tipo); //decrementa os quartos disponiveis do hotel
				qtd_diarias = dias;
				break;
			}
		}
		if(count != dias) {
			return false; //não foi possivel alugar os quartos para todos os dias
		}
		setValorFinal(getValorFinal()+r);// somatoria do total a pagar pelos dias no hotel
		return true; 
    }
	
	public Boolean comprarPassagemAerea(Voo vooSelecionado) {
	    if (vooSelecionado.getNro_vagas_disponiveis() >= qtd_passagem && qtd_passagem > 0) {
	        // Atualiza o atributo voo com o voo selecionado
	        setVoo(vooSelecionado);
	        // Atualiza o número de vagas disponíveis no voo
	        vooSelecionado.setNro_vagas_disponiveis(vooSelecionado.getNro_vagas_disponiveis() - qtd_passagem);
	        // Atualiza o valor final da compra
	        setValorFinal(getValorFinal() + (qtd_passagem * vooSelecionado.getPreco_da_passagem()));
	        return true; // Compra realizada com sucesso
	    } else {
	        return false; // Não há vagas suficientes para a quantidade desejada de passagens
	    }
	}
	

    public String getForma_de_pagamento() {
		return forma_de_pagamento;
	}

	public void setForma_de_pagamento(String forma_de_pagamento) {
		this.forma_de_pagamento = forma_de_pagamento;
	}

	public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    public float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double d) {
		if (getCliente().isVip()) {
			this.valorFinal = (float) (0.9 * d);
		}
		this.valorFinal += d;
	}

    
	public int getTipo_Quarto() {
		return tipo_Quarto;
	}

	public void setTipo_Quarto(int tipo_Quarto) {
		this.tipo_Quarto = tipo_Quarto;
	}

	public Data getInicio() {
		return inicio;
	}

	public void setInicio(Data inicio) {
		this.inicio = inicio;
	}

	public Data getFim() {
		return fim;
	}

	public void setFim(Data fim) {
		this.fim = fim;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	
}

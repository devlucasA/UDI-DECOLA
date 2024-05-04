package model;

import java.util.ArrayList;

public class Voo {
	private Data data;
	private Tempo hora_programada_chegada;
	private Tempo hora_programada_partida;
	private int nro_vagas_disponiveis;
	private ArrayList<Trecho_de_Voo> trecho;
	private double preco_da_passagem;
	private String destino;
	private String origem;
		
	
	
	
    public ArrayList<Trecho_de_Voo> getTrecho() {
		return trecho;
	}

	public void setTrecho(ArrayList<Trecho_de_Voo> trecho) {
		this.trecho = trecho;
	}

	public void setPreco_da_passagem(double preco_da_passagem) {
		this.preco_da_passagem = preco_da_passagem;
	}

	public Voo(Data data,int nro_vagas_disponiveis,double preco_da_passagem, ArrayList<Trecho_de_Voo> trecho) {
		super();
		this.data = data;
		this.nro_vagas_disponiveis = nro_vagas_disponiveis;
		this.trecho = trecho;
		this.preco_da_passagem = preco_da_passagem;
		hora_programada_chegada = new Tempo(0,0);
		hora_programada_partida = new Tempo(trecho.get(0).getHorarioInicio().getHora(),trecho.get(0).getHorarioInicio().getMinuto());
		destino = trecho.get(trecho.size()-1).getDestino();
    	origem = trecho.get(0).getOrigem();
    	
		calculaHoraProgramada();		
	}

    public void calculaHoraProgramada() {
    		int sum = 0,sum2 = 0;
    		for(Trecho_de_Voo t : trecho) {
    			sum += t.getHorarioChegada().getHora() - t.getHorarioInicio().getHora();
    			sum2+= t.getHorarioChegada().getMinuto() - t.getHorarioInicio().getMinuto();
    		}
    		
    		this.hora_programada_chegada.setHora(sum);
    		this.hora_programada_chegada.setMinuto(sum2);
    		
    }

	public Voo(Data data,int nro_vagas_disponiveis,
    		float preco_da_passagem) {
		this.data = data;
		this.nro_vagas_disponiveis = nro_vagas_disponiveis;
		this.trecho = new ArrayList<Trecho_de_Voo>();
		this.preco_da_passagem = preco_da_passagem;
	}
    
    

    public String mostrarDados() {
    	return toString();
    }
    
 


	@Override
	public String toString() {
		return "Voo [data=" + data.formatarData() + ", hora_programada_chegada=" + hora_programada_chegada.formatarTempo()
				+ ", hora_programada_partida=" + hora_programada_partida.formatarTempo() + ", nro_vagas_disponiveis="
				+ nro_vagas_disponiveis + "\n trecho=" + trecho.toString() + "\npreco_da_passagem=" + preco_da_passagem
				+ ", destino=" + destino + ", origem=" + origem + "]";
	}



	public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Tempo getHora_programada_chegada() {
        return hora_programada_chegada;
    }

    public void setHora_programada_chegada(Tempo hora_programada_chegada) {
        this.hora_programada_chegada = hora_programada_chegada;
    }

    public Tempo getHora_programada_partida() {
        return hora_programada_partida;
    }

    public void setHora_programada_partida(Tempo hora_programada_partida) {
        this.hora_programada_partida = hora_programada_partida;
    }

    public int getNro_vagas_disponiveis() {
        return nro_vagas_disponiveis;
    }

    public void setNro_vagas_disponiveis(int nro_vagas_disponiveis) {
        this.nro_vagas_disponiveis = nro_vagas_disponiveis;
    }
    
    public double getPreco_da_passagem() {
        return preco_da_passagem;
    }

    public void setPreco_da_passagem(float preco_da_passagem) {
        this.preco_da_passagem = preco_da_passagem;
    }


	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
    
    
}

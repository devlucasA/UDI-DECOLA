package model;

public class Trecho_de_Voo {
	private String codigoID;
	private String origem;
	private String destino;
	private Tempo horarioInicio;
	private Tempo horarioChegada;

	
	public Trecho_de_Voo(String codigoID, String origem, String destino, Tempo horarioInicio,
			Tempo horarioChegada) {
		this.codigoID = codigoID;
		this.origem = origem;
		this.destino = destino;
		this.horarioInicio = horarioInicio;
		this.horarioChegada = horarioChegada;
	}
	
	
	
    public Tempo getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Tempo horarioInicio) {
		this.horarioInicio = horarioInicio;
	}




	public Tempo getHorarioChegada() {
		return horarioChegada;
	}




	public void setHorarioChegada(Tempo horarioChegada) {
		this.horarioChegada = horarioChegada;
	}




    
	
	public String mostrarDados() {
		return toString();
	}



	@Override
	public String toString() {
		return "Trecho_de_Voo [codigoID=" + codigoID + ", origem=" + origem +
				", destino=" + destino + ", horarioInicio=" + horarioInicio.formatarTempo() + 
				", horarioChegada=" + horarioChegada.formatarTempo() + "]";
	}




	public String getCodigoID() {
        return codigoID;
    }
    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
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
  
	
}

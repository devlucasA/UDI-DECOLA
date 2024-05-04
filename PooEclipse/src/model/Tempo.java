package model;

public class Tempo {
	private int hora, minuto;

	
	
	
	public Tempo(int hora, int minuto) {
		if (hora < 0 || hora > 23)
			this.hora = 0;
		else
			this.hora = hora;
		if(minuto < 0 || minuto > 59)
			this.minuto = 0;
		else
			this.minuto = minuto;
	}
	
	public String formatarTempo() {
		return String.format("%02d:%02d", hora, minuto % 100);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora < 0 || hora > 23)
			this.hora = 0;
		else
			this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto < 0 || minuto > 59)
			this.minuto = 0;
		else
			this.minuto = minuto;
	}	
}

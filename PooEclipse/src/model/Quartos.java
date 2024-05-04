package model;

public class Quartos {

	private Data data;

	private int single;
	private int duplo;
	private int triplo;
	private int luxo;

	private double diaria_single;
	private double diaria_duplo;
	private double diaria_triplo;
	private double diaria_luxo;

	private double desconto_single;
	private double desconto_duplo;
	private double desconto_triplo;
	private double desconto_luxo;
	
	

	@Override
	public String toString() {
		return "[data=" + data.formatarData() + ", single=" + single + ", duplo=" + duplo + ", triplo=" + triplo + ", luxo="+ luxo + "\ndiaria_single=" + diaria_single + ", diaria_duplo=" + diaria_duplo + ", diaria_triplo="+ diaria_triplo + ", diaria_luxo=" + diaria_luxo + "\ndesconto_single=" + desconto_single+ ", desconto_duplo=" + desconto_duplo + ", desconto_triplo=" + desconto_triplo + ", desconto_luxo="+ desconto_luxo + "]";
	}

	public Quartos(Data data, int single, int duplo, int triplo, int luxo, double diaria_single, double diaria_duplo,
			double diaria_triplo, double diaria_luxo, double desconto_single, double desconto_duplo,
			double desconto_triplo, double desconto_luxo) {
		this.data = data;
		setSingle(single);
		setDuplo(duplo);
		setTriplo(triplo);
		setLuxo(luxo);
		setDiaria_single(diaria_single);
		setDiaria_duplo(diaria_duplo);
		setDiaria_triplo(diaria_triplo);
		setDiaria_luxo(diaria_luxo);
		setDesconto_single(desconto_single);
		setDesconto_duplo(desconto_duplo);
		setDesconto_triplo(desconto_triplo);
		setDesconto_luxo(desconto_luxo);
	}
	
	public Quartos(int single, int duplo, int triplo, int luxo, double diaria_single, double diaria_duplo,
			double diaria_triplo, double diaria_luxo, double desconto_single, double desconto_duplo,
			double desconto_triplo, double desconto_luxo) {
		this.data = new Data(1,1,2024);
		setSingle(single);
		setDuplo(duplo);
		setTriplo(triplo);
		setLuxo(luxo);
		setDiaria_single(diaria_single);
		setDiaria_duplo(diaria_duplo);
		setDiaria_triplo(diaria_triplo);
		setDiaria_luxo(diaria_luxo);
		setDesconto_single(desconto_single);
		setDesconto_duplo(desconto_duplo);
		setDesconto_triplo(desconto_triplo);
		setDesconto_luxo(desconto_luxo);
	}

	public Data getData() {
		return data;
	}

	public int getSingle() {
		return single;
	}

	public int getDuplo() {
		return duplo;
	}

	public int getTriplo() {
		return triplo;
	}

	public int getLuxo() {
		return luxo;
	}

	public double getDiaria_single() {
		return diaria_single;
	}

	public double getDiaria_duplo() {
		return diaria_duplo;
	}

	public double getDiaria_triplo() {
		return diaria_triplo;
	}

	public double getDiaria_luxo() {
		return diaria_luxo;
	}

	public double getDesconto_single() {
		return desconto_single;
	}

	public double getDesconto_duplo() {
		return desconto_duplo;
	}

	public double getDesconto_triplo() {
		return desconto_triplo;
	}

	public double getDesconto_luxo() {
		return desconto_luxo;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void setSingle(int single) {
		if (single < 0)
			this.single = 0;
		else
			this.single = single;
	}

	public void setDuplo(int duplo) {
		if (duplo < 0)
			this.duplo = 0;
		else
			this.duplo = duplo;
	}

	public void setTriplo(int triplo) {
		if (triplo < 0)
			this.triplo = 0;
		else
			this.triplo = triplo;
	}

	public void setLuxo(int luxo) {
		if (luxo < 0)
			this.luxo = 0;
		else
			this.luxo = luxo;
	}

	public void setDiaria_single(double diaria_single) {
		if (diaria_single >= 0) {
			this.diaria_single = diaria_single;
		} else {
			System.out.println("Valor inválido para diária single. Valor não alterado.");
		}
	}

	public void setDiaria_duplo(double diaria_duplo) {
		if (diaria_duplo >= 0) {
			this.diaria_duplo = diaria_duplo;
		} else {
			System.out.println("Valor inválido para diária duplo. Valor não alterado.");
		}
	}

	public void setDiaria_triplo(double diaria_triplo) {
		if (diaria_triplo >= 0) {
			this.diaria_triplo = diaria_triplo;
		} else {
			System.out.println("Valor inválido para diária triplo. Valor não alterado.");
		}
	}

	public void setDiaria_luxo(double diaria_luxo) {
		if (diaria_luxo >= 0) {
			this.diaria_luxo = diaria_luxo;
		} else {
			System.out.println("Valor inválido para diária luxo. Valor não alterado.");
		}
	}

	public void setDesconto_single(double desconto_single) {
		if (desconto_single >= 0) {
			this.desconto_single = desconto_single;
		} else {
			System.out.println("Valor inválido para desconto single. Valor não alterado.");
		}
	}

	public void setDesconto_duplo(double desconto_duplo) {
		if (desconto_duplo >= 0) {
			this.desconto_duplo = desconto_duplo;
		} else {
			System.out.println("Valor inválido para desconto duplo. Valor não alterado.");
		}
	}

	public void setDesconto_triplo(double desconto_triplo) {
		if (desconto_triplo >= 0) {
			this.desconto_triplo = desconto_triplo;
		} else {
			System.out.println("Valor inválido para desconto triplo. Valor não alterado.");
		}
	}

	public void setDesconto_luxo(double desconto_luxo) {
		if (desconto_luxo >= 0) {
			this.desconto_luxo = desconto_luxo;
		} else {
			System.out.println("Valor inválido para desconto luxo. Valor não alterado.");
		}
	}

	public int totalQuartos() {
		return getSingle() + getDuplo() + getTriplo() + getLuxo();
	}

	public double getDiariaDescontoSingle() {
		double r = getDiaria_single() - (getDiaria_single() * getDesconto_single());
		if (r < 0)
			return 0;
		else
			return r;
	}

	public double getDiariaDescontoDuplo() {
		double r = getDiaria_duplo() - (getDiaria_duplo() * getDesconto_duplo());
		if (r < 0)
			return 0;
		else
			return r;
	}

	public double getDiariaDescontoTriplo() {
		double r = getDiaria_triplo() - (getDiaria_triplo() * getDesconto_triplo());
		if (r < 0)
			return 0;
		else
			return r;
	}

	public double getDiariaDescontoLuxo() {
		double r = getDiaria_luxo() - (getDiaria_luxo() * getDesconto_luxo());
		if (r < 0)
			return 0;
		else
			return r;
	}

	public int reservarDia(int tipo) {
		if (tipo == 1) {// single
			setSingle(getSingle() - 1);
			return 0;
		} else if (tipo == 2) {// duplo
			setDuplo(getDuplo() - 1);
			return 0;
		} else if (tipo == 3) {// triplo
			setTriplo(getTriplo() - 1);
			return 0;
		} else if (tipo == 4) {// luxo
			setLuxo(getLuxo() - 1);
			return 0;
		}
		return 1;
	}
	
	public int liberarDia(int tipo) {
		if (tipo == 1) {// single
			setSingle(getSingle() + 1);
			return 0;
		} else if (tipo == 2) {// duplo
			setDuplo(getDuplo() + 1);
			return 0;
		} else if (tipo == 3) {// triplo
			setTriplo(getTriplo() + 1);
			return 0;
		} else if (tipo == 4) {// luxo
			setLuxo(getLuxo() + 1);
			return 0;
		}
		return 1;
	}

}

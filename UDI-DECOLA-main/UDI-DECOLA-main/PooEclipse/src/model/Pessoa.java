package model;

public abstract class Pessoa {
	
	private String cpf;
	private String endereco;
	private String nome;
	private Data data_nasc;
	
	
	public Pessoa(String cpf, String endereco, String nome, Data data_nasc) {
		this.cpf = cpf;
		this.endereco = endereco;
		this.nome = nome;
		this.data_nasc = data_nasc;
	}

	
	
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", endereco=" + endereco + ", nome=" + nome + ", data_nasc=" + data_nasc.formatarData() + "]";
	}



	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Data getData_nasc() {
		return data_nasc;
	}


	public void setData_nasc(Data data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	
	
	public class ValidadorCPF {
	    public static boolean validarCPF(String cpf) {
	        cpf = cpf.replaceAll("[^0-9]", "");

	        if (cpf.length() != 11) {
	            return false;
	        }

	        if (cpf.matches("(\\d)\\1{10}")) {
	            return false;
	        }


	        int[] digitos = new int[11];
	        for (int i = 0; i < 11; i++) {
	            digitos[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
	        }

	        int soma1 = 0;
	        int soma2 = 0;

	        for (int i = 0; i < 9; i++) {
	            soma1 += digitos[i] * (10 - i);
	            soma2 += digitos[i] * (11 - i);
	        }

	        int digito1 = (soma1 % 11 < 2) ? 0 : (11 - (soma1 % 11));
	        int digito2 = (soma2 % 11 < 2) ? 0 : (11 - (soma2 % 11));

	        return (digito1 == digitos[9]) && (digito2 == digitos[10]);
	    }
	}
	
	
}

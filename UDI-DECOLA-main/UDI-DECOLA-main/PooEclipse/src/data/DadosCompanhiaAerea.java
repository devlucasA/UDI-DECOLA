package data;
import java.util.ArrayList;

import model.*;

public class DadosCompanhiaAerea {
	private ArrayList<CompanhiaAerea> vetFunc = new ArrayList<CompanhiaAerea>();
	
	
    public void cadastrar(CompanhiaAerea f) {
        this.vetFunc.add(f); // ADICIONA O Funcionário NO ARRAY
    }

    public void listar() {
        for (CompanhiaAerea objeto : this.vetFunc) {
        	objeto.mostrarDados();
            // método mostrarDados();
        }
    }

    // este método retorna o objeto Funcionario caso encontrado, ou null,
    // caso não encontrado
    public CompanhiaAerea buscar(String nome) {
        CompanhiaAerea f = null;
        for (CompanhiaAerea objeto : this.vetFunc) {
            if (objeto.getNome_oficial().equals(nome)) {
                f = objeto;
                break;
            }
        }
        return f;
    }

    // este método usa o método buscar já implementado
    public boolean excluir(String nome) {
        CompanhiaAerea f = this.buscar(nome);
        if (f != null) {
            this.vetFunc.remove(f);
            return true;
        } else {
            return false;
        }
    }
}

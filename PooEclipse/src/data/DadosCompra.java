package data;
import java.util.ArrayList;

import model.*;

public class DadosCompra {
	private ArrayList<Compra> vetFunc = new ArrayList<Compra>();

    public void cadastrar(Compra f) {
        this.vetFunc.add(f); // ADICIONA O Funcionário NO ARRAY
    }

    public void listar() {
        for (Compra objeto : this.vetFunc) {
        	objeto.mostrarDados();
            // método mostrarDados();
        }
    }

    // este método retorna o objeto Funcionario caso encontrado, ou null,
    // caso não encontrado
    public Compra buscar(String ID) {
        Compra f = null;
        for (Compra objeto : this.vetFunc) {
            if (objeto.getID_Compra().equals(ID)) {
                f = objeto;
                break;
            }
        }
        return f;
    }

    // este método usa o método buscar já implementado
    public boolean excluir(String ID) {
        Compra f = this.buscar(ID);
        if (f != null) {
            this.vetFunc.remove(f);
            return true;
        } else {
            return false;
        }
    }
}

package data;
import java.util.ArrayList;

import model.*;

public class DadosVoo {
    private ArrayList<Voo> vetVoos = new ArrayList<Voo>();

    public void cadastrar(Voo v) {
        this.vetVoos.add(v); // ADICIONA O Voo NO ARRAY
    }

    public void listar() {
        for (Voo objeto : this.vetVoos) {
            System.out.println(objeto.mostrarDados()); 
            // método mostrarDados();
        }
    }

    // Este método retorna o objeto Voo caso encontrado, ou null,
    // caso não encontrado
    public Voo buscar(String dest) {
        Voo v = null;
        for (Voo objeto : this.vetVoos) {
        	
            if (objeto.getDestino().equals(dest)) {
                v = objeto;
                break;
            }
        }
        return v;
    }

    // Este método usa o método buscar já implementado
    public boolean excluir(String codigoID) {
        Voo v = this.buscar(codigoID);
        if (v != null) {
            this.vetVoos.remove(v);
            return true;
        } else {
            return false;
        }
    }
}

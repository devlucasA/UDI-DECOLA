package data;
import java.util.ArrayList;

import model.*;

public class DadosHoteis {
    private ArrayList<Hotel> vetHoteis = new ArrayList<Hotel>();

    public void cadastrar(Hotel h) {
        this.vetHoteis.add(h); // ADICIONA O Hotel NO ARRAY
    }

    public void listar() {
        for (Hotel objeto : this.vetHoteis) {
        	if(objeto != null)
        		System.out.println(objeto.mostrarDados());
            // método mostrarDados();
        }
    }

    // este método retorna o objeto Hotel caso encontrado, ou null,
    // caso não encontrado
    public Hotel buscar(String enderecoCompleto) {
        Hotel h = null;
        for (Hotel objeto : this.vetHoteis) {
            if (objeto.getEnd_completo().equals(enderecoCompleto)) {
                h = objeto;
                break;
            }
        }
        return h;
    }

    // este método usa o método buscar já implementado
    public boolean excluir(String enderecoCompleto) {
        Hotel h = this.buscar(enderecoCompleto);
        if (h != null) {
            this.vetHoteis.remove(h);
            return true;
        } else {
            return false;
        }
    }
}

package data;
import java.util.ArrayList;

import model.*;

public class DadosTrechoVoo {
    private ArrayList<Trecho_de_Voo> vetTrechos = new ArrayList<Trecho_de_Voo>();

    public void cadastrar(Trecho_de_Voo t) {
        this.vetTrechos.add(t); // ADICIONA O TrechoVoo NO ARRAY
    }

    public void listar() {
        for (Trecho_de_Voo objeto : this.vetTrechos) {
            objeto.mostrarDados();
            // método mostrarDados();
        }
    }

    // este método retorna o objeto TrechoVoo caso encontrado, ou null,
    // caso não encontrado
    public Trecho_de_Voo buscar(String codigoID) {
        Trecho_de_Voo t = null;
        for (Trecho_de_Voo objeto : this.vetTrechos) {
            if (objeto.getCodigoID().equals(codigoID)) {
                t = objeto;
                break;
            }
        }
        return t;
    }

    // este método usa o método buscar já implementado
    public boolean excluir(String codigoID) {
        Trecho_de_Voo t = this.buscar(codigoID);
        if (t != null) {
            this.vetTrechos.remove(t);
            return true;
        } else {
            return false;
        }
    }
}

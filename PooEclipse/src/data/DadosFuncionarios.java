package data;
import java.util.ArrayList;

import model.*;

public class DadosFuncionarios {
    private ArrayList<Funcionario> vetFunc = new ArrayList<Funcionario>();

    public void cadastrar(Funcionario f) {
        this.vetFunc.add(f); // ADICIONA O Funcionário NO ARRAY
    }

    public void listar() {
        for (Funcionario objeto : this.vetFunc) {
            System.out.println(objeto.mostrarDados());
            // método mostrarDados();
        }
    }

    // este método retorna o objeto Funcionario caso encontrado, ou null,
    // caso não encontrado
    public Funcionario buscar(String cpf) {
        Funcionario f = null;
        for (Funcionario objeto : this.vetFunc) {
            if (objeto.getCpf().equals(cpf)) {
                f = objeto;
                break;
            }
        }
        return f;
    }

    // este método usa o método buscar já implementado
    public boolean excluir(String cpf) {
        Funcionario f = this.buscar(cpf);
        if (f != null) {
            this.vetFunc.remove(f);
            return true;
        } else {
            return false;
        }
    }
}

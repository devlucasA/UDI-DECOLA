package data;
import java.util.ArrayList;

import model.*;

public class DadosCliente {
    private ArrayList<Cliente> vetClientes = new ArrayList<Cliente>();

    public void cadastrar(Cliente c) {
        this.vetClientes.add(c); // ADICIONA O Cliente NO ARRAY
    }

    public void listar() {
        for (Cliente objeto : this.vetClientes) {
            System.out.println(objeto.mostrarDados()); 
            // método mostrarDados();
        }
    }

    // este método retorna o objeto Cliente caso encontrado, ou null,
    // caso não encontrado
    public Cliente buscar(String cpf) {
        Cliente c = null;
        for (Cliente objeto : this.vetClientes) {
            if (objeto.getCpf().equals(cpf)) {
                c = objeto;
                break;
            }
        }
        return c;
    }

    // este método usa o método buscar já implementado
    public boolean excluir(String cpf) {
        Cliente c = this.buscar(cpf);
        if (c != null) {
            this.vetClientes.remove(c);
            return true;
        } else {
            return false;
        }
    }

	public ArrayList<Cliente> getVetClientes() {
		return vetClientes;
	}

	public void setVetClientes(ArrayList<Cliente> vetClientes) {
		this.vetClientes = vetClientes;
	}
    
    
    
}

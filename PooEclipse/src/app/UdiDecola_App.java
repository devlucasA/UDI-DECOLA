package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import dao.*;
import data.*;
import model.*;
import view.InterfaceCadastroCArea;
import view.InterfaceCadastroCliente;
import view.InterfaceCadastroFuncionario;
import view.InterfaceCadastroHotel;
import view.InterfaceCadastroVoo;
import view.InterfaceConsultaCliente;

public class UdiDecola_App extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DadosCliente dadosCliente;
    private DadosFuncionarios dadosFuncionario;
    private DadosHoteis dadosHotel;
    private DadosVoo dadosVoo;
    private DadosCompanhiaAerea dadosCompanhiaAerea;
    
    public UdiDecola_App() {
        super("UdiDecola App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(562, 287);
        
        //Instanciando os dados:
        dadosCliente = new DadosCliente();
        dadosFuncionario = new DadosFuncionarios();
        dadosHotel = new DadosHoteis();
        dadosVoo = new DadosVoo();
        dadosCompanhiaAerea = new DadosCompanhiaAerea();
        
        
        // Crio a tabela, se nao existir
        ClienteDAO.criarTabelaCliente();

        JButton abrirJanelaButton = new JButton("Cadastro");
        abrirJanelaButton.setBounds(98, 11, 176, 32);
        abrirJanelaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirInterfaceCadastroCliente();
            }
        });
        
        JButton abrirJanelaFuncionarioButton = new JButton("Cadastro Funcionario");
        abrirJanelaFuncionarioButton.setBounds(98, 93, 379, 32); // Ajuste do posicionamento
        abrirJanelaFuncionarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirInterfaceCadastroFuncionario();
            }
        });
        
        JButton abrirJanelaHotel = new JButton("Cadastro Hotel");
        abrirJanelaHotel.setBounds(98, 54, 379, 32); // Ajuste do posicionamento
        abrirJanelaHotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirInterfaceCadastroHotel();
            }
        });



        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        panel.add(abrirJanelaButton);
        getContentPane().add(panel);
        
        // adicionando no panel
        panel.add(abrirJanelaFuncionarioButton);
        panel.add(abrirJanelaHotel);
        
        JLabel Cliente = new JLabel("Cliente:");
        Cliente.setFont(new Font("JetBrains Mono", Font.BOLD, 13));
        Cliente.setHorizontalAlignment(SwingConstants.CENTER);
        Cliente.setBounds(10, 20, 78, 14);
        panel.add(Cliente);
        
        JButton consultar = new JButton("Consultar ou Remover");
        consultar.setBounds(284, 11, 193, 32);
        consultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirInterfaceConsultar();
            }
        });
        panel.add(consultar);
        
        JButton cadastroCompanhia = new JButton("Cadastro Companhia Aerea");
        cadastroCompanhia.setBounds(98, 136, 379, 32);
        cadastroCompanhia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	abrirInterfaceCadastroCompanhiaAerea();
            }
        });
        panel.add(cadastroCompanhia);
        
        JButton cadastroVoo = new JButton("Cadastro Voo");
        cadastroVoo.setBounds(98, 179, 379, 32);
        cadastroVoo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		abrirInterfaceCadastroVoo();
        	}
        });
        panel.add(cadastroVoo);
        
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
 // -------------------------------------Métodos ----------------------
    
    private void abrirInterfaceCadastroCompanhiaAerea() {
        InterfaceCadastroCArea interfaceCadastroCompanhiaAerea = new InterfaceCadastroCArea(this, dadosCompanhiaAerea);
        interfaceCadastroCompanhiaAerea.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Quando a janela de cadastro de voo for fechada, atualiza a exibição dos voos
            	atualizarExibicaoCompanhia();
            }
        });
    }
    
    public void atualizarExibicaoCompanhia() {
        System.out.println("Lista de Voos atualizada:");
        dadosVoo.listar();
    }
    
    private void abrirInterfaceCadastroVoo() {
        InterfaceCadastroVoo interfaceCadastroVoo = new InterfaceCadastroVoo(this, dadosVoo);
        interfaceCadastroVoo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Quando a janela de cadastro de voo for fechada, atualiza a exibição dos voos
                atualizarExibicaoVoos();
            }
        });
    }
    
    public void atualizarExibicaoVoos() {
        System.out.println("Lista de Voos atualizada:");
        dadosVoo.listar();
    }
    
    private void abrirInterfaceCadastroHotel() {
        InterfaceCadastroHotel interfaceCadastroHotel = new InterfaceCadastroHotel(this, dadosHotel);
        interfaceCadastroHotel.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Quando a janela de cadastro de hotel for fechada, atualiza a exibição dos hotéis
                atualizarExibicaoHotel();
                
            }
        });
    }

    
    public void atualizarExibicaoHotel() {
        System.out.println("Lista de hoteis atualizada:");
        dadosHotel.listar();
    }
    
    
    
    private void abrirInterfaceCadastroFuncionario() {
        InterfaceCadastroFuncionario interfaceCadastroFuncionario = new InterfaceCadastroFuncionario(this,dadosFuncionario);
        interfaceCadastroFuncionario.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Se chegou aqui, a janela já foi fechada.
            	atualizarExibicaoFuncionarios(); 
   

            }
        });
    }
    
    public void atualizarExibicaoFuncionarios() {
        System.out.println("Lista de funcionarios atualizada:");
        dadosFuncionario.listar();
    }
    
    // ------- metodos de CLIENTE -------
    
    
    
    
    private void abrirInterfaceConsultar() {
        InterfaceConsultaCliente interfaceConsulta = new InterfaceConsultaCliente(this, dadosCliente);
        interfaceConsulta.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
            	System.out.println("Lista de clientes atualizada:");
            	atualizarExibicaoClientes();
            	salvarBancoDados();
                salvarArquivos();
            }
        });
    }
    
    
    private void abrirInterfaceCadastroCliente() {
        InterfaceCadastroCliente interfaceCadastroCliente = new InterfaceCadastroCliente(this, dadosCliente);
        interfaceCadastroCliente.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
            	// Se chegou aqui, a janela já foi fechada.
                atualizarExibicaoClientes();           
                salvarBancoDados();
                salvarArquivos();
              
            }
        });
    }
    
    public void salvarArquivos() {
        try {
            int ultimoIndice = dadosCliente.getVetClientes().size() - 1;

            // Verificar se há pelo menos um cliente na lista
            if (ultimoIndice >= 0) {
                // Obter o último cliente da lista
                Cliente ultimoCliente = dadosCliente.getVetClientes().get(ultimoIndice);
                
                // Escrever as informações do cliente em um arquivo
                String path = "ArqClientes.txt";
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
                    bw.write(ultimoCliente.dadosArquivo()); // Aqui você pode ajustar o formato de saída conforme necessário
                    System.out.println("Informações do cliente salvas no arquivo: " + path);
                } catch (IOException e) {
                    // Lidar com exceção de E/S
                    System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
                }
            } else {
                System.out.println("Não há clientes na lista para salvar em arquivo.");
            }
        } catch (Exception e) {
            // Lidar com exceções gerais
            System.err.println("Erro ao salvar informações em arquivo: " + e.getMessage());
            e.printStackTrace(); // Imprimir rastreamento da pilha para depuração
        }
    }
    
    
    public void salvarBancoDados() {
        try {
            int ultimoIndice = dadosCliente.getVetClientes().size() - 1;

            // Verificar se há pelo menos um cliente na lista
            if (ultimoIndice >= 0) {
                // Obter o último cliente da lista
                Cliente ultimoCliente = dadosCliente.getVetClientes().get(ultimoIndice);
                
                // Usar o ClienteDAO para inserir o último cliente no banco de dados
                ClienteDAO.inserirCliente(ultimoCliente);
            } else {
                System.out.println("Não há clientes na lista para inserir.");
            }
        } catch (Exception e) {
            // Lidar com a exceção
            System.err.println("Erro ao salvar no banco de dados: " + e.getMessage());
            e.printStackTrace(); // Isso imprimirá o rastreamento da pilha para ajudar na depuração
        }
    }

    
    public void atualizarExibicaoClientes() {
        System.out.println("Lista de clientes atualizada:");
        dadosCliente.listar();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UdiDecola_App();
            }
        });
    }
}

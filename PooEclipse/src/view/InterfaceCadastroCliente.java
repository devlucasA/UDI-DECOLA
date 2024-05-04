package view;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import app.UdiDecola_App;
import data.DadosCliente;
import model.*;

public class InterfaceCadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CPFlabel;
	private JTextField EnderecoLabel;
	private JTextField NomeLabel;
	private JTextField dataDia;
	private JTextField dataMes;
	private JTextField dataAno;
	private JTextField EmailLabel;
	private JTextField SenhaLabel;
	
	private DadosCliente dadosCliente;
    private UdiDecola_App udiDecolaApp;
	
	/**
	 * Create the frame.
	 */
	public InterfaceCadastroCliente(UdiDecola_App udiDecolaApp, DadosCliente dadosCliente) {
		super("Interface de Cadastro de Cliente");
        this.udiDecolaApp = udiDecolaApp;
        this.dadosCliente = dadosCliente;
		
		setResizable(false);
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe seus Dados:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 209, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(20, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		CPFlabel = new JTextField();
		CPFlabel.setBounds(53, 33, 193, 20);
		contentPane.add(CPFlabel);
		CPFlabel.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endereço:");
		lblNewLabel_2.setBounds(20, 64, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		EnderecoLabel = new JTextField();
		EnderecoLabel.setBounds(84, 61, 325, 20);
		contentPane.add(EnderecoLabel);
		EnderecoLabel.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setBounds(20, 93, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		NomeLabel = new JTextField();
		NomeLabel.setBounds(76, 90, 333, 20);
		contentPane.add(NomeLabel);
		NomeLabel.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Data de Nascimento:");
		lblNewLabel_12.setBounds(299, 33, 137, 14);
		contentPane.add(lblNewLabel_12);
		
		dataDia = new JTextField();
		dataDia.setColumns(10);
		dataDia.setBounds(422, 30, 33, 20);
		contentPane.add(dataDia);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(459, 33, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		dataMes = new JTextField();
		dataMes.setColumns(10);
		dataMes.setBounds(465, 30, 33, 20);
		contentPane.add(dataMes);
		
		dataAno = new JTextField();
		dataAno.setColumns(10);
		dataAno.setBounds(508, 30, 33, 20);
		contentPane.add(dataAno);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(502, 33, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setBounds(20, 121, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		EmailLabel = new JTextField();
		EmailLabel.setBounds(76, 118, 303, 20);
		contentPane.add(EmailLabel);
		EmailLabel.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Senha:");
		lblNewLabel_6.setBounds(20, 166, 62, 14);
		contentPane.add(lblNewLabel_6);
		
		SenhaLabel = new JTextField();
		SenhaLabel.setBounds(69, 163, 150, 20);
		contentPane.add(SenhaLabel);
		SenhaLabel.setColumns(10);
		
		
		// -------- BOTAO CONFIRMAR -------------
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					cadastrarCliente();
					
					dispose();
			}
		});
		
		btnNewButton.setBounds(459, 229, 104, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(336, 229, 104, 23);
		contentPane.add(btnNewButton_1);
		setVisible(true);
		
	}

	
	 private void cadastrarCliente() {
	        // Simplesmente exemplo: Criar um cliente com dados fictícios
	        
		 	Cliente cliente = obterCliente();
		 	
	        // Adicionar o cliente à lista de clientes
		 	if(cliente != null) {
		 		dadosCliente.cadastrar(cliente);
		 		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		 	}

	  }
	 
	
	private Cliente obterCliente() {
		String cpf = CPFlabel.getText();
		String usuario = NomeLabel.getText();
		//String senha = SenhaLabel.getText();
		String email = EmailLabel.getText();
		String endereco = EnderecoLabel.getText();
		
		//Convertendo para inteiro para adicionar a DATA.
		int dia = Integer.parseInt(dataDia.getText());
		int mes = Integer.parseInt(dataMes.getText());
		int ano = Integer.parseInt(dataAno.getText());
		
		Data nascimento = new Data(dia,mes,ano);
		// Pegando data atual para data de criacao.
		
		LocalDate dataAtual = LocalDate.now();
		Data criacao = new Data(dataAtual.getDayOfMonth(),dataAtual.getMonthValue(),dataAtual.getYear());
		
        return new Cliente(cpf,usuario,email,criacao,endereco,nascimento,null);
    }
	
}

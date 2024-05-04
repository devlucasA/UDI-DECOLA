package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.UdiDecola_App;
import data.*;
import model.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InterfaceCadastroFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cpfLabel;
	private JTextField enderecoLabel;
	private JTextField nomeLabel;
	private JTextField diaLabel;
	private JTextField mesLabel;
	private JTextField anoLabel;
	private JTextField emailLabel;
	private JTextField userLabel;
	private JTextField senhaLabel;
	private JTextField carteiraLabel;
	private JTextField salario;

	
	private DadosFuncionarios dadosFuncionario;
    private UdiDecola_App udiDecolaApp;
	

	/**
	 * Create the frame.
	 */
	public InterfaceCadastroFuncionario(UdiDecola_App udiDecolaApp, DadosFuncionarios dadosFuncionario) {
		super("Interface de Cadastro de Funcionario");
        this.udiDecolaApp = udiDecolaApp;
        this.dadosFuncionario = dadosFuncionario;
		
		setResizable(false);
		setTitle("Cadastro de Funcionario Parceiro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 382);
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
		
		cpfLabel = new JTextField();
		cpfLabel.setBounds(53, 33, 193, 20);
		contentPane.add(cpfLabel);
		cpfLabel.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endereço:");
		lblNewLabel_2.setBounds(20, 64, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		enderecoLabel = new JTextField();
		enderecoLabel.setBounds(81, 61, 325, 20);
		contentPane.add(enderecoLabel);
		enderecoLabel.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setBounds(20, 93, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		nomeLabel = new JTextField();
		nomeLabel.setBounds(68, 89, 333, 20);
		contentPane.add(nomeLabel);
		nomeLabel.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Data de Nascimento:");
		lblNewLabel_12.setBounds(299, 33, 137, 14);
		contentPane.add(lblNewLabel_12);
		
		diaLabel = new JTextField();
		diaLabel.setColumns(10);
		diaLabel.setBounds(422, 30, 33, 20);
		contentPane.add(diaLabel);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(459, 33, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		mesLabel = new JTextField();
		mesLabel.setColumns(10);
		mesLabel.setBounds(465, 30, 33, 20);
		contentPane.add(mesLabel);
		
		anoLabel = new JTextField();
		anoLabel.setColumns(10);
		anoLabel.setBounds(508, 30, 33, 20);
		contentPane.add(anoLabel);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(502, 33, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setBounds(20, 121, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		emailLabel = new JTextField();
		emailLabel.setBounds(67, 118, 303, 20);
		contentPane.add(emailLabel);
		emailLabel.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Usuario:");
		lblNewLabel_5.setBounds(20, 220, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		userLabel = new JTextField();
		userLabel.setBounds(69, 217, 150, 20);
		contentPane.add(userLabel);
		userLabel.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Senha:");
		lblNewLabel_6.setBounds(20, 255, 62, 14);
		contentPane.add(lblNewLabel_6);
		
		senhaLabel = new JTextField();
		senhaLabel.setBounds(69, 252, 150, 20);
		contentPane.add(senhaLabel);
		senhaLabel.setColumns(10);
		// -------- BOTAO CONFIRMAR -------------
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					cadastrarFuncionario();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					dispose();
			}
		});
		
		
		btnNewButton.setBounds(459, 309, 104, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(332, 309, 104, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hotel", "Companinha Aerea"}));
		comboBox.setBounds(132, 180, 137, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Carteira de Trabalho:");
		lblNewLabel_7.setBounds(20, 152, 130, 14);
		contentPane.add(lblNewLabel_7);
		
		carteiraLabel = new JTextField();
		carteiraLabel.setBounds(150, 149, 185, 20);
		contentPane.add(carteiraLabel);
		carteiraLabel.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Salário:");
		lblNewLabel_8.setBounds(345, 152, 56, 14);
		contentPane.add(lblNewLabel_8);
		
		salario = new JTextField();
		salario.setBounds(397, 149, 86, 20);
		contentPane.add(salario);
		salario.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Local de Trabalho:");
		lblNewLabel_9.setBounds(20, 183, 115, 14);
		contentPane.add(lblNewLabel_9);
		
		setVisible(true);
	}
	

	public void cadastrarFuncionario() {
		Funcionario fp = obterFuncionario();
	 	
        // Adicionar o funcionario
        dadosFuncionario.cadastrar(fp);
        
	}
	
	
	private Funcionario_Parceiro obterFuncionario() {
	    String cpf = cpfLabel.getText();
	    String usuario = userLabel.getText();
	    // String senha = SenhaLabel.getText();  // Não está sendo usado
	    //String email = emailLabel.getText();
	    String endereco = enderecoLabel.getText();
	    String carteira = carteiraLabel.getText();
	    int dia = Integer.parseInt(diaLabel.getText());
	    int mes = Integer.parseInt(mesLabel.getText());
	    int ano = Integer.parseInt(anoLabel.getText());
	    Data nascimento = new Data(dia, mes, ano);
	    
	    return new Funcionario_Parceiro(cpf, endereco, usuario, nascimento, carteira);
	}

}

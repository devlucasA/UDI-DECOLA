package view;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import app.UdiDecola_App;
import data.DadosCompanhiaAerea;
import model.CompanhiaAerea;
import model.Data;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceCadastroCArea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enderecoLabel;
	private JTextField nomeOfcLabel;
	private JTextField nomeDivLabel;
	private JTextField cnpjLabel;
	private JTextField diaLabel;
	private JTextField mesLabel;
	private JTextField anoLabel;

	private UdiDecola_App udiDecolaApp;
	private DadosCompanhiaAerea dadosCompanhiaAerea;
	
	
	public InterfaceCadastroCArea(UdiDecola_App udiDecolaApp, DadosCompanhiaAerea dadosCompanhiaAerea) {
		super("Interface de Cadastro de Companhia Aerea");
		this.setUdiDecolaApp(udiDecolaApp);
        this.dadosCompanhiaAerea = dadosCompanhiaAerea;
        
        
		setTitle("Dados da Compania Area ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dados da Compania Area:");
		lblNewLabel.setBounds(10, 11, 234, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Endereço:");
		lblNewLabel_1.setBounds(16, 48, 70, 14);
		contentPane.add(lblNewLabel_1);

		enderecoLabel = new JTextField();
		enderecoLabel.setBounds(77, 45, 344, 20);
		contentPane.add(enderecoLabel);
		enderecoLabel.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel(" Nome Oficial:");
		lblNewLabel_9.setBounds(13, 78, 85, 14);
		contentPane.add(lblNewLabel_9);

		nomeOfcLabel = new JTextField();
		nomeOfcLabel.setBounds(108, 76, 136, 20);
		contentPane.add(nomeOfcLabel);
		nomeOfcLabel.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Nome Divulgação:");
		lblNewLabel_10.setBounds(262, 78, 111, 14);
		contentPane.add(lblNewLabel_10);

		nomeDivLabel = new JTextField();
		nomeDivLabel.setBounds(383, 76, 141, 20);
		contentPane.add(nomeDivLabel);
		nomeDivLabel.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("CNPJ:");
		lblNewLabel_11.setBounds(431, 48, 46, 14);
		contentPane.add(lblNewLabel_11);

		cnpjLabel = new JTextField();
		cnpjLabel.setBounds(469, 45, 160, 20);
		contentPane.add(cnpjLabel);
		cnpjLabel.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Data de Criação:");
		lblNewLabel_12.setBounds(13, 112, 95, 14);
		contentPane.add(lblNewLabel_12);

		diaLabel = new JTextField();
		diaLabel.setBounds(118, 107, 33, 20);
		contentPane.add(diaLabel);
		diaLabel.setColumns(10);

		mesLabel = new JTextField();
		mesLabel.setBounds(161, 107, 33, 20);
		contentPane.add(mesLabel);
		mesLabel.setColumns(10);

		anoLabel = new JTextField();
		anoLabel.setBounds(204, 107, 33, 20);
		contentPane.add(anoLabel);
		anoLabel.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(155, 110, 21, 14);
		contentPane.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(198, 110, 21, 14);
		contentPane.add(lblNewLabel_14);

		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarCompanhiaAerea();
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				dispose();
			}
		});
		btnNewButton.setBounds(556, 158, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(445, 158, 89, 23);
		contentPane.add(btnNewButton_1);
		
		setVisible(true);
	}

	public void cadastrarCompanhiaAerea() {
		CompanhiaAerea ca = obterCompanhiaAerea();
        // Adicionar o Companhia Aerea
        dadosCompanhiaAerea.cadastrar(ca);
        
	}
	
	private CompanhiaAerea obterCompanhiaAerea() {
		String endereco = enderecoLabel.getText();
		String cnpj = cnpjLabel.getText();
		String nome_oficial = nomeOfcLabel.getText();
		String nome_divulgacao = nomeDivLabel.getText();

		// Convertendo para inteiro para adicionar a DATA.
		int dia = Integer.parseInt(diaLabel.getText());
		int mes = Integer.parseInt(mesLabel.getText());
		int ano = Integer.parseInt(anoLabel.getText());

		Data data_criacao = new Data(dia, mes, ano);
		
		return new CompanhiaAerea(cnpj,nome_oficial,nome_divulgacao,data_criacao,endereco);
	}

	public UdiDecola_App getUdiDecolaApp() {
		return udiDecolaApp;
	}

	public void setUdiDecolaApp(UdiDecola_App udiDecolaApp) {
		this.udiDecolaApp = udiDecolaApp;
	}
}

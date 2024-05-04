package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import org.eclipse.wb.swing.FocusTraversalOnArray;

import app.UdiDecola_App;
import data.*;
import model.*;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceCadastroHotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enderecoLabel;
	private JTextField cidadeLabel;
	private JTextField qtdSingleLabel;
	private JTextField nomeOficialLabel;
	private JTextField nomeDivLabel;
	private JTextField cnpjLabel;
	private JTextField diaLabel;
	private JTextField mesLabel;
	private JTextField anoLabel;
	private JTextField qtdDuploLabel;
	private JTextField qtdTriploLabel;
	private JTextField qtdLuxoLabel;
	private JTextField diaSingleLabel;
	private JTextField diaDuploLabel;
	private JTextField diaTriploLabel;
	private JTextField diaLuxoLabel;
	private JTextField dSingleLabel;
	private JTextField dDuploLabel;
	private JTextField dTriploLabel;
	private JTextField dLuxoLabel;
	private JTextField horaInLabel;
	private JTextField minInLabel;
	private JTextField horaOutLabel;
	private JTextField minOutLabel;
	private JCheckBox permitidoPetsCheck;
	private JComboBox comboBox;
	private JCheckBox cancelamentoCheck;
	private JTextArea msgDivLabel;
	
	private DadosHoteis dadosHotel;
    private UdiDecola_App udiDecolaApp;


	/**
	 * Create the frame.
	 */
	public InterfaceCadastroHotel(UdiDecola_App udiDecolaApp, DadosHoteis dadosHotel) {
		super("Interface de Cadastro de Hotel");
        this.udiDecolaApp = udiDecolaApp;
        this.dadosHotel = dadosHotel;
		
        
		setResizable(false);
		setTitle("Dados do Hotel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Hotel:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 140, 11);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço:");
		lblNewLabel_1.setBounds(16, 48, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		enderecoLabel = new JTextField();
		enderecoLabel.setBounds(77, 45, 344, 20);
		contentPane.add(enderecoLabel);
		enderecoLabel.setColumns(10);
		
		permitidoPetsCheck = new JCheckBox("Permitido Pets");
		permitidoPetsCheck.setBounds(16, 140, 111, 23);
		contentPane.add(permitidoPetsCheck);
		
		JLabel lblNewLabel_2 = new JLabel("Número de Estrelas:");
		lblNewLabel_2.setBounds(139, 144, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(265, 140, 40, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Horário do Check-in:");
		lblNewLabel_3.setBounds(16, 113, 134, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Horário do Check-out:");
		lblNewLabel_4.setBounds(205, 113, 128, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cidade:");
		lblNewLabel_5.setBounds(431, 144, 57, 14);
		contentPane.add(lblNewLabel_5);
		
		cidadeLabel = new JTextField();
		cidadeLabel.setBounds(477, 141, 152, 20);
		contentPane.add(cidadeLabel);
		cidadeLabel.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Mensagem de \r\n");
		lblNewLabel_6.setBounds(39, 187, 111, 23);
		contentPane.add(lblNewLabel_6);
		
		msgDivLabel = new JTextArea();
		msgDivLabel.setBounds(155, 186, 474, 63);
		contentPane.add(msgDivLabel);
		
		JLabel lblNewLabel_7 = new JLabel("Informações sobre os Quartos:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 257, 241, 14);
		contentPane.add(lblNewLabel_7);
		
		qtdSingleLabel = new JTextField();
		qtdSingleLabel.setToolTipText("");
		qtdSingleLabel.setBounds(77, 309, 86, 20);
		contentPane.add(qtdSingleLabel);
		qtdSingleLabel.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("SINGLE");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(21, 312, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		cancelamentoCheck = new JCheckBox("Cancelamentos");
		cancelamentoCheck.setBounds(311, 140, 128, 23);
		contentPane.add(cancelamentoCheck);
		
		JLabel lblNewLabel_9 = new JLabel(" Nome Oficial:");
		lblNewLabel_9.setBounds(13, 78, 85, 14);
		contentPane.add(lblNewLabel_9);
		
		nomeOficialLabel = new JTextField();
		nomeOficialLabel.setBounds(108, 76, 136, 20);
		contentPane.add(nomeOficialLabel);
		nomeOficialLabel.setColumns(10);
		
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
		lblNewLabel_12.setBounds(410, 112, 95, 14);
		contentPane.add(lblNewLabel_12);
		
		diaLabel = new JTextField();
		diaLabel.setBounds(509, 109, 33, 20);
		contentPane.add(diaLabel);
		diaLabel.setColumns(10);
		
		mesLabel = new JTextField();
		mesLabel.setBounds(552, 109, 33, 20);
		contentPane.add(mesLabel);
		mesLabel.setColumns(10);
		
		anoLabel = new JTextField();
		anoLabel.setBounds(595, 109, 33, 20);
		contentPane.add(anoLabel);
		anoLabel.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(546, 112, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(589, 112, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("DUPLO");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(21, 334, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("TRIPLO");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(21, 359, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("LUXO");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_17.setBounds(21, 381, 46, 14);
		contentPane.add(lblNewLabel_17);
		
		qtdDuploLabel = new JTextField();
		qtdDuploLabel.setBounds(77, 332, 86, 20);
		contentPane.add(qtdDuploLabel);
		qtdDuploLabel.setColumns(10);
		
		qtdTriploLabel = new JTextField();
		qtdTriploLabel.setBounds(77, 355, 86, 20);
		contentPane.add(qtdTriploLabel);
		qtdTriploLabel.setColumns(10);
		
		qtdLuxoLabel = new JTextField();
		qtdLuxoLabel.setBounds(77, 378, 86, 20);
		contentPane.add(qtdLuxoLabel);
		qtdLuxoLabel.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Quantidade");
		lblNewLabel_18.setBounds(87, 284, 70, 14);
		contentPane.add(lblNewLabel_18);
		
		diaSingleLabel = new JTextField();
		diaSingleLabel.setToolTipText("");
		diaSingleLabel.setColumns(10);
		diaSingleLabel.setBounds(182, 309, 86, 20);
		contentPane.add(diaSingleLabel);
		
		diaDuploLabel = new JTextField();
		diaDuploLabel.setBounds(182, 332, 86, 20);
		contentPane.add(diaDuploLabel);
		diaDuploLabel.setColumns(10);
		
		diaTriploLabel = new JTextField();
		diaTriploLabel.setBounds(182, 355, 86, 20);
		contentPane.add(diaTriploLabel);
		diaTriploLabel.setColumns(10);
		
		diaLuxoLabel = new JTextField();
		diaLuxoLabel.setBounds(182, 378, 86, 20);
		contentPane.add(diaLuxoLabel);
		diaLuxoLabel.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Diária");
		lblNewLabel_19.setBounds(203, 284, 65, 14);
		contentPane.add(lblNewLabel_19);
		
		dSingleLabel = new JTextField();
		dSingleLabel.setBounds(287, 309, 86, 20);
		contentPane.add(dSingleLabel);
		dSingleLabel.setColumns(10);
		
		dDuploLabel = new JTextField();
		dDuploLabel.setBounds(287, 332, 86, 20);
		contentPane.add(dDuploLabel);
		dDuploLabel.setColumns(10);
		
		dTriploLabel = new JTextField();
		dTriploLabel.setBounds(287, 355, 86, 20);
		contentPane.add(dTriploLabel);
		dTriploLabel.setColumns(10);
		
		dLuxoLabel = new JTextField();
		dLuxoLabel.setBounds(287, 378, 86, 20);
		contentPane.add(dLuxoLabel);
		dLuxoLabel.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Desconto");
		lblNewLabel_20.setBounds(299, 284, 86, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Divulgação:");
		lblNewLabel_21.setBounds(39, 212, 88, 14);
		contentPane.add(lblNewLabel_21);
		
		
		// -------- BOTAO SALVAR ---------
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					cadastrarHotel();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					dispose();
			}
		});
		
		
		btnNewButton.setBounds(561, 416, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(462, 416, 89, 23);
		contentPane.add(btnNewButton_1);
		
		horaInLabel = new JTextField();
		horaInLabel.setColumns(10);
		horaInLabel.setBounds(135, 110, 33, 20);
		contentPane.add(horaInLabel);
		
		minInLabel = new JTextField();
		minInLabel.setColumns(10);
		minInLabel.setBounds(172, 110, 33, 20);
		contentPane.add(minInLabel);
		
		horaOutLabel = new JTextField();
		horaOutLabel.setColumns(10);
		horaOutLabel.setBounds(330, 110, 33, 20);
		contentPane.add(horaOutLabel);
		
		minOutLabel = new JTextField();
		minOutLabel.setColumns(10);
		minOutLabel.setBounds(367, 110, 33, 20);
		contentPane.add(minOutLabel);
		
		
		setVisible(true);
	}

	
	
	private void cadastrarHotel() {
		Hotel hh = obterHotel();
	 	hh.mostrarDados();
        // Adicionar o hotel em Hoteis
        dadosHotel.cadastrar(hh);
	}
	
	private Hotel obterHotel() {
		String end_completo = enderecoLabel.getText();
		String cnpj = cnpjLabel.getText();
		String nome_oficial = nomeOficialLabel.getText();
		String nome_divulgacao = nomeDivLabel.getText();
		String cidade = cidadeLabel.getText();
		
		int hrCheckIn = Integer.parseInt(horaInLabel.getText());
		int minCheckIn = Integer.parseInt(minInLabel.getText());
		int hrCheckOut = Integer.parseInt(horaOutLabel.getText());
		int minCheckOut = Integer.parseInt(minOutLabel.getText());
		Tempo check_in = new Tempo(hrCheckIn,minCheckIn);
		Tempo check_out = new Tempo(hrCheckOut,minCheckOut);
		
		int dia = Integer.parseInt(diaLabel.getText());
		int mes = Integer.parseInt(mesLabel.getText());
		int ano = Integer.parseInt(anoLabel.getText());
		Data data_criacao = new Data(dia,mes,ano);
		boolean pets;
		boolean cancelamento;
		int nmr_estrelas;
		if(permitidoPetsCheck != null || cancelamentoCheck != null || comboBox != null) {
			pets = permitidoPetsCheck.isSelected();
			cancelamento = cancelamentoCheck.isSelected();
			nmr_estrelas = Integer.parseInt((String) comboBox.getSelectedItem());
		}
		else {
			pets = false;
			cancelamento = false;
			nmr_estrelas = 1;
		}
		String  msg_divulgacao = msgDivLabel.getText();
		
		int qtdSingle = Integer.parseInt(qtdSingleLabel.getText());
		int qtdDuplo = Integer.parseInt(qtdDuploLabel.getText());
		int qtdTriplo = Integer.parseInt(qtdTriploLabel.getText());
		int qtdLuxo = Integer.parseInt(qtdLuxoLabel.getText());
		
		int diaSingle = Integer.parseInt(diaSingleLabel.getText());
		int diaDuplo = Integer.parseInt(diaDuploLabel.getText());
		int diaTriplo = Integer.parseInt(diaTriploLabel.getText());
		int diaLuxo = Integer.parseInt(diaLuxoLabel.getText());
		
		int dSingle = Integer.parseInt(dSingleLabel.getText());
		int dDuplo = Integer.parseInt(dDuploLabel.getText());
		int dTriplo = Integer.parseInt(dTriploLabel.getText());
		int dLuxo = Integer.parseInt(dLuxoLabel.getText());
		
		Quartos quartos = new Quartos(qtdSingle, qtdDuplo, qtdTriplo, qtdLuxo, diaSingle, diaDuplo,diaTriplo, diaLuxo, dSingle, dDuplo,dTriplo, dLuxo);
		
		return new Hotel(cnpj,nome_oficial, nome_divulgacao, data_criacao, end_completo, nmr_estrelas,pets,check_in, check_out, cidade, msg_divulgacao, cancelamento, quartos);
		
	}
	
	
}

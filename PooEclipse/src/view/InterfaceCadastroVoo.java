package view;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.UdiDecola_App;
import data.*;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

import model.*;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class InterfaceCadastroVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField diaField;
	private JTextField mesField;
	private JTextField anoField;
	private JTextField hpartidaField;
	private JTextField mpartidaField;
	private JTextField mchegadaField;
	private JTextField hchegadaField;
	private JTextField vagasField;
	private JTextField precoField;

	private DadosVoo dadosVoo;
    private UdiDecola_App udiDecolaApp;
    private JTextField origemField;
    private JTextField destinoField;
    private JTextField idField;
	private JLabel lblNewLabel_3;
	private Container lblNewLabel_3_1;
	private Component lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private Component lblNewLabel_7;
	private Component lblNewLabel_8;
	private JLabel lblNewLabel_9;
	
	private ArrayList<Trecho_de_Voo> Trechos = new ArrayList<Trecho_de_Voo>();
	

	/**
	 * Create the frame.
	 */
	public InterfaceCadastroVoo(UdiDecola_App udiDecolaApp,DadosVoo dadosVoo) {
		super("Interface de Cadastro de Voo");
        this.udiDecolaApp = udiDecolaApp;
        this.dadosVoo = dadosVoo;
        // Definindo.
        //Trechos = 
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Voo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 190, 20);
		contentPane.add(lblNewLabel);
		
		diaField = new JTextField();
		diaField.setColumns(10);
		diaField.setBounds(53, 42, 33, 20);
		contentPane.add(diaField);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(90, 45, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		mesField = new JTextField();
		mesField.setColumns(10);
		mesField.setBounds(96, 42, 33, 20);
		contentPane.add(mesField);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(133, 45, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		anoField = new JTextField();
		anoField.setColumns(10);
		anoField.setBounds(139, 42, 33, 20);
		contentPane.add(anoField);
		
		JLabel lblNewLabel_1 = new JLabel("Data:");
		lblNewLabel_1.setBounds(20, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horário de Partida:");
		lblNewLabel_2.setBounds(20, 73, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Horário de Chegada:");
		lblNewLabel_2_1.setBounds(20, 98, 134, 14);
		contentPane.add(lblNewLabel_2_1);
		
		hpartidaField = new JTextField();
		hpartidaField.setColumns(10);
		hpartidaField.setBounds(133, 70, 33, 20);
		contentPane.add(hpartidaField);
		
		lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(172, 72, 21, 14);
		contentPane.add(lblNewLabel_3);
		
		mpartidaField = new JTextField();
		mpartidaField.setColumns(10);
		mpartidaField.setBounds(182, 70, 33, 20);
		contentPane.add(mpartidaField);
		
		mchegadaField = new JTextField();
		mchegadaField.setColumns(10);
		mchegadaField.setBounds(192, 98, 33, 20);
		contentPane.add(mchegadaField);
		
		hchegadaField = new JTextField();
		hchegadaField.setColumns(10);
		hchegadaField.setBounds(143, 98, 33, 20);
		contentPane.add(hchegadaField);
		
		lblNewLabel_3_1 = new JLabel(":");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(182, 100, 21, 14);
		contentPane.add(lblNewLabel_3_1);
		
		lblNewLabel_4 = new JLabel("Vagas:");
		lblNewLabel_4.setBounds(20, 139, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		vagasField = new JTextField();
		vagasField.setBounds(64, 136, 46, 20);
		contentPane.add(vagasField);
		vagasField.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Preço:");
		lblNewLabel_5.setBounds(20, 164, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		precoField = new JTextField();
		precoField.setBounds(65, 164, 46, 20);
		contentPane.add(precoField);
		precoField.setColumns(10);
		
		JButton Finalizar = new JButton("Finalizar");
		Finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					cadastrarVoo();		
					dispose();
					
				
			}
		});
		Finalizar.setBounds(358, 181, 89, 23);
		contentPane.add(Finalizar);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(259, 181, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_6 = new JLabel("Dados do Trecho de Voo:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(222, 11, 182, 20);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Origem:");
		lblNewLabel_7.setBounds(246, 45, 59, 14);
		contentPane.add(lblNewLabel_7);
		
		origemField = new JTextField();
		origemField.setColumns(10);
		origemField.setBounds(296, 42, 151, 20);
		contentPane.add(origemField);
		
		lblNewLabel_8 = new JLabel("Destino:");
		lblNewLabel_8.setBounds(246, 75, 59, 14);
		contentPane.add(lblNewLabel_8);
		
		destinoField = new JTextField();
		destinoField.setColumns(10);
		destinoField.setBounds(296, 72, 151, 20);
		contentPane.add(destinoField);
		
		lblNewLabel_9 = new JLabel("ID:");
		lblNewLabel_9.setBounds(246, 105, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		idField = new JTextField();
		idField.setColumns(10);
		idField.setBounds(296, 102, 151, 20);
		contentPane.add(idField);
		
		JButton adicionarTrecho = new JButton("Adicionar Trecho");
		adicionarTrecho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// =====  adicionando trechos Voo    =====
				
				Trechos.add(obterTrecho());
				
			}
		});
		adicionarTrecho.setBounds(296, 135, 141, 23);
		contentPane.add(adicionarTrecho);
		
		setVisible(true);
	}
	
	
	
	private void cadastrarVoo() {
        // Simplesmente exemplo: Criar um cliente com dados fictícios
        
	 	Voo voo= obterVoo();
	 	
        // Adicionar o cliente à lista de clientes
	 	if(voo != null) {
	 		dadosVoo.cadastrar(voo);
	 		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
	 	}

  }
	
	
	public Voo obterVoo() {
	
		
		
		
		
		String id = idField.getText();
		String origem = origemField.getText();
		String destino = destinoField.getText();
		
		int dia,mes,ano;
		
		dia = Integer.parseInt(diaField.getText());
		mes = Integer.parseInt(mesField.getText());
		ano = Integer.parseInt(anoField.getText());
		
		Data d = new Data(dia,mes,ano);
		
		int h = Integer.parseInt(hpartidaField.getText());
		int m = Integer.parseInt(mpartidaField.getText());
		Tempo hInicio = new Tempo(h,m);
		
		h = Integer.parseInt(hchegadaField.getText());
		m = Integer.parseInt(mchegadaField.getText());
		Tempo hChegada = new Tempo(h,m);
		int vagas = Integer.parseInt(vagasField.getText());		
		double preco = Double.parseDouble(precoField.getText());
		
		
        return new Voo(d,vagas,preco,Trechos);
        
    }
	
	public Trecho_de_Voo obterTrecho() {
		String ID,  origem,  destino;// CompanhiaAerea companhia, Tempo horarioInicio,
		//Tempo horarioChegada;
		ID = idField.getText();
		origem = origemField.getText();
		destino = destinoField.getText();
		Tempo horaInicio = new Tempo(Integer.parseInt(hpartidaField.getText()),Integer.parseInt(mpartidaField.getText()));
		Tempo horaChegada = new Tempo(Integer.parseInt(hchegadaField.getText()),Integer.parseInt(mchegadaField.getText()));
		
		return new Trecho_de_Voo(ID,origem,destino,horaInicio,horaChegada);
	}
	
}

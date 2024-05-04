package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface01 frame = new Interface01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface01() {
		setTitle("UDI-Decola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo ao UDI-Decola");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 21, 254, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("O que é?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(30, 69, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(".");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(20, 65, 14, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrOUdidecola = new JTextArea();
		txtrOUdidecola.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrOUdidecola.setEditable(false);
		txtrOUdidecola.setText("O Udi-Decola é uma companhia que permite realizar buscas e compras de passagens \r\naéreas e diárias em hotéis. ");
		txtrOUdidecola.setBounds(20, 94, 526, 36);
		contentPane.add(txtrOUdidecola);
		
		JLabel lblNewLabel_2_1 = new JLabel(".");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(20, 147, 14, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Como podemos te ajudar?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(30, 151, 164, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(52, 210, 105, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(52, 176, 105, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel(".");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(20, 244, 14, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Deseja ser parceiro do UDI-Decola?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(30, 248, 244, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1_1 = new JButton("Login");
		btnNewButton_1_1.setBounds(52, 273, 105, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Cadastrar");
		btnNewButton_2.setBounds(52, 307, 105, 23);
		contentPane.add(btnNewButton_2);
	}
}

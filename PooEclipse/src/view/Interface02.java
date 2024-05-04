package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface02 frame = new Interface02();
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
	public Interface02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo, Fulano!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 236, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pesquisar:");
		lblNewLabel_1.setBounds(10, 61, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(83, 58, 470, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de Pesquisa:");
		lblNewLabel_2.setBounds(10, 86, 127, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 82, 136, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setBounds(440, 82, 112, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Hoteis que você pode gostar:");
		lblNewLabel_3.setBounds(10, 134, 189, 14);
		contentPane.add(lblNewLabel_3);
		
		JList list = new JList();
		list.setBounds(10, 159, 543, 62);
		contentPane.add(list);
		
		JLabel lblNewLabel_4 = new JLabel("Opções do Usuario:");
		lblNewLabel_4.setBounds(10, 233, 127, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Historico de Compras");
		btnNewButton_1.setBounds(10, 263, 157, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Seus Dados");
		btnNewButton_1_1.setBounds(181, 263, 157, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Desconectar");
		btnNewButton_2.setBounds(412, 316, 136, 23);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("New button");
		button.setBounds(20, 263, 89, 23);
		contentPane.add(button);
		
		JButton btnNewButton_1_2 = new JButton("Historico de Pesquisa");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setBounds(352, 263, 157, 23);
		contentPane.add(btnNewButton_1_2);
	}
}

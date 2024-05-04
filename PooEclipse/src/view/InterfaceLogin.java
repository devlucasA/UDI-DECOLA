package view;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class InterfaceLogin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel corpo;
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton logar; 
    private JPanel principal;
    private JButton noturno_modo;
    private JLabel usuario_label;
    private JLabel senha_label;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	InterfaceLogin frame = new InterfaceLogin();
                    frame.setLocationRelativeTo(null); //A tela inicia no meio.
                    frame.setResizable(isDefaultLookAndFeelDecorated());
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
    public InterfaceLogin() {
        setTitle("Login");
        setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        corpo = new JPanel();
        corpo.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(corpo);
        corpo.setLayout(null);
        Color[] colors = {Color.decode("#1A1A1A"), Color.decode("#F3F3F3")}; // Cores padrao
        corpo.setBackground(colors[1]); //COR PADRAO DE FUNDO
        
        
        noturno_modo = new JButton("Modo Noturno");
        noturno_modo.setBounds(129, 16, 165, 19);
        noturno_modo.setFont(new Font("Arial", Font.PLAIN, 18));
        noturno_modo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// BOTAO DE Modo noturno
                Color cor1 = (corpo.getBackground().equals(colors[0])) ? colors[1] : colors[0];
                Color cor2 = colors[0];
                if(cor1.equals(colors[0])) {
                    cor2 = colors[1];
                }
                corpo.setBackground(cor1);
                campoUsuario.setBackground(cor2);
                campoSenha.setBackground(cor2);
                noturno_modo.setBackground(cor2);
                logar.setBackground(cor2);
                principal.setBackground(cor1);
                
                corpo.setForeground(cor2);
                campoUsuario.setForeground(cor1);
                campoSenha.setForeground(cor1);
                noturno_modo.setForeground(cor1);
                logar.setForeground(cor1);
                usuario_label.setForeground(cor2);
                senha_label.setForeground(cor2);
                
                
            }
        });
        corpo.add(noturno_modo);
        
        principal = new JPanel();
        principal.setBounds(58, 38, 310, 207);
        corpo.add(principal);
        principal.setBackground(colors[0]); //DEFININDO COR PADRAO
        principal.setLayout(null);
        
        campoUsuario = new JTextField();
        campoUsuario.setToolTipText("");
        campoUsuario.setForeground(Color.WHITE);
        campoUsuario.setBounds(25, 36, 258, 26);
        principal.add(campoUsuario);
        campoUsuario.setColumns(10);
        campoUsuario.setBackground(colors[0]); // DEFININDO COR PADRAO
       
        campoSenha = new JPasswordField();
        campoSenha.setForeground(Color.WHITE);
        campoSenha.setBounds(25, 89, 258, 26);
        principal.add(campoSenha);
        campoSenha.setBackground(colors[0]); // DEFININDO COR PADRAO
        
        logar = new JButton("Login");
        logar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//QUANDO O BOTAO É CLICADO:
        		if(campoUsuario.getText()!=null && !campoUsuario.getText().isEmpty() &&
        				campoSenha.getText()!=null && !campoSenha.getText().isEmpty()) {
        			//tem coisa valida dentro da caixa 
        			JOptionPane.showMessageDialog(logar, "Informaçoes corretas", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        			
        			 InterfaceHotel inter = new InterfaceHotel();
        			 inter.setLocationRelativeTo(null);
        			 inter.setVisible(true); // Correção aqui
        			 dispose();
        		}
        		else {
        			JOptionPane.showMessageDialog(logar, "Informaçoes incorretas", "Aviso", JOptionPane.WARNING_MESSAGE);
        		}
        	}
        });
        logar.setBounds(97, 150, 115, 29);
        principal.add(logar);
        logar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
        logar.setBackground(colors[0]); // DEFININDO COR PADRAO
        
        usuario_label = new JLabel("Usuário");
        usuario_label.setBounds(25, 16, 115, 20);
        principal.add(usuario_label);
        
        senha_label = new JLabel("Senha");
        senha_label.setBounds(25, 66, 69, 20);
        principal.add(senha_label);
    }
}

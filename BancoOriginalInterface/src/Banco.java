import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Banco {

	private JFrame frame;
	private JTextField btDeposito;
	private JTextField btSaque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banco window = new Banco();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Banco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOpcoes = new JLabel("Selecione sua op\u00E7\u00E3o");
		lblOpcoes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOpcoes.setBounds(225, 151, 187, 25);
		frame.getContentPane().add(lblOpcoes);
		
		JLabel lblCliente = new JLabel("CLIENTE");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCliente.setBounds(166, 69, 64, 25);
		frame.getContentPane().add(lblCliente);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setBounds(372, 69, 64, 25);
		frame.getContentPane().add(lblCpf);
		
		JLabel lbCliente = new JLabel("0");
		lbCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCliente.setBounds(269, 71, 47, 21);
		frame.getContentPane().add(lbCliente);
		
		JLabel lbCpf = new JLabel("0");
		lbCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCpf.setBounds(475, 69, 47, 21);
		frame.getContentPane().add(lbCpf);
		
		JButton btnDepositar = new JButton("DEP\u00D3SITO");
		btnDepositar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDepositar.setBounds(45, 215, 99, 23);
		frame.getContentPane().add(btnDepositar);
		
		JButton btnSaque = new JButton("SAQUE");
		btnSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSaque.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaque.setBounds(200, 215, 89, 23);
		frame.getContentPane().add(btnSaque);
		
		JButton btnSaldo = new JButton("SALDO");
		btnSaldo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaldo.setBounds(345, 215, 89, 23);
		frame.getContentPane().add(btnSaldo);
		
		JButton btnExtrato = new JButton("EXTRATO");
		btnExtrato.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExtrato.setBounds(492, 215, 99, 23);
		frame.getContentPane().add(btnExtrato);
		
		btDeposito = new JTextField();
		btDeposito.setText("0");
		btDeposito.setBounds(45, 268, 99, 20);
		frame.getContentPane().add(btDeposito);
		btDeposito.setColumns(10);
		
		btSaque = new JTextField();
		btSaque.setText("0");
		btSaque.setColumns(10);
		btSaque.setBounds(200, 268, 89, 20);
		frame.getContentPane().add(btSaque);
		
		JLabel lbSaldo = new JLabel("0");
		lbSaldo.setBounds(345, 268, 89, 21);
		frame.getContentPane().add(lbSaldo);
		
		JLabel lblBemVindo = new JLabel("BEM VINDO AO NUBANCO");
		lblBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBemVindo.setBounds(207, 11, 246, 25);
		frame.getContentPane().add(lblBemVindo);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.setBounds(10, 69, 41, 33);
		frame.getContentPane().add(btnAnterior);
		
		JButton btnProximo = new JButton(">");
		btnProximo.setBounds(632, 69, 41, 33);
		frame.getContentPane().add(btnProximo);
		
		JButton btSair = new JButton("Sair");
		btSair.setBounds(587, 311, 89, 23);
		frame.getContentPane().add(btSair);
	}

}

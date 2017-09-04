package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(500, 200, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 594, 372);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Anti-calculadora");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 38));
		lblNewLabel.setBounds(122, 50, 345, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Obtener el n\u00FAmero en pantalla a partir de los");
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(91, 147, 438, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("operadores matemáticos permitidos.");
		lblNewLabel_2.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(91, 179, 438, 27);
		panel.add(lblNewLabel_2);
		
		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnEmpezar.setBounds(230, 269, 135, 37);
		panel.add(btnEmpezar);
		
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 594, 372);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel lblDif = new JLabel("Dificultad");
		lblDif.setFont(new Font("Georgia", Font.BOLD, 38));
		lblDif.setBounds(189, 50, 221, 49);
		panel2.add(lblDif);
		
		JButton btnfacil = new JButton("Fácil");
		btnfacil.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnfacil.setBounds(77, 127, 135, 37);
		panel2.add(btnfacil);
		
		JButton btnNormal = new JButton("Normal");
		btnNormal.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnNormal.setBounds(77, 193, 135, 37);
		panel2.add(btnNormal);
		
		JButton btnDificil = new JButton("Difícil");
		btnDificil.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnDificil.setBounds(77, 259, 135, 37);
		panel2.add(btnDificil);
		panel2.setVisible(false);
		
		JLabel lblfacil = new JLabel("números de 2 cifras y 1 operador.");
		lblfacil.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblfacil.setBounds(252, 130, 316, 37);
		panel2.add(lblfacil);
		
		JLabel lblnormal = new JLabel("números de 3 cifras y 2 operadores.");
		lblnormal.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblnormal.setBounds(252, 196, 316, 37);
		panel2.add(lblnormal);
		
		JLabel lbldificil = new JLabel("números de 4 cifras y 3 operadores.");
		lbldificil.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lbldificil.setBounds(252, 262, 316, 37);
		panel2.add(lbldificil);
		
		
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel2.setVisible(true);
			}
		});
		
	}
	
	
}

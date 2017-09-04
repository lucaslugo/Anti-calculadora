package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego window = new Juego();
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
	public Juego() {
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
//		Configuracion de la pantalla
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(500, 200, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(90, 93, 46, 14);
		frame.getContentPane().add(lblNmero);
		
		JLabel lblOperadores = new JLabel("Operador/es:");
		lblOperadores.setBounds(90, 148, 74, 14);
		frame.getContentPane().add(lblOperadores);
		
		JLabel label = new JLabel("55");
		label.setBounds(281, 93, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(281, 148, 46, 14);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(281, 237, 46, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.setBounds(383, 237, 124, 20);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 237, 46, 20);
		frame.getContentPane().add(textField_1);
		
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			int i = 0;
			String[] operadores = { "+", "-", "*", "/" };
			public void actionPerformed(ActionEvent e) {			
				if (i == 3)
					i = 0;
				else
					i++;
				btnNewButton_1.setText(operadores[i]);
			}
		});
		btnNewButton_1.setBounds(211, 237, 46, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int buscado = Integer.parseInt(label.getText());
				String operador = btnNewButton_1.getText();
				int num2 = Integer.parseInt(textField.getText());
				int num1 = Integer.parseInt(textField_1.getText());
				
				int resultado = 0;
				switch (operador) {
				case "+": resultado = num1 + num2; break;
				case "-": resultado = num1 - num2; break;
				case "*": resultado = num1 * num2; break;
				case "/": resultado = num1 / num2; break;
				}
				
				if (resultado == buscado)
					System.out.println("Enzo se la come mucho :,V");
				
			}
			});
	}
}

package ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPaneEj4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPaneEj4 frame = new JPaneEj4();
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
	public JPaneEj4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VALOR A");
		lblNewLabel.setBounds(76, 10, 96, 13);
		contentPane.add(lblNewLabel);
		// Textfield de VALOR A
		textField = new JTextField();
		textField.setBounds(76, 33, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// Textfield de VALOR B
		JLabel lblNewLabel_1 = new JLabel("VALOR B");
		lblNewLabel_1.setBounds(242, 10, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 33, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton botonSuma = new JButton("SUMA");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorA = textField.getText();
				Double valorAD = Double.parseDouble(valorA);
				String valorB = textField_1.getText();
				Double valorBD = Double.parseDouble(valorB);
				Double resultado = valorAD + valorBD;
				String resultadoStr = String.valueOf(resultado);
				textField_2.setText(resultadoStr);
			}
		});
		botonSuma.setBounds(37, 86, 85, 21);
		contentPane.add(botonSuma);
		
		JButton botonResta = new JButton("RESTA");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorA = textField.getText();
				Double valorAD = Double.parseDouble(valorA);
				String valorB = textField_1.getText();
				Double valorBD = Double.parseDouble(valorB);
				Double resultado = valorAD - valorBD;
				String resultadoStr = String.valueOf(resultado);
				textField_2.setText(resultadoStr);
			}
		});
		botonResta.setBounds(121, 86, 85, 21);
		contentPane.add(botonResta);
		
		JButton botonMultiplica = new JButton("MULTIPLICA");
		botonMultiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorA = textField.getText();
				Double valorAD = Double.parseDouble(valorA);
				String valorB = textField_1.getText();
				Double valorBD = Double.parseDouble(valorB);
				Double resultado = valorAD * valorBD;
				String resultadoStr = String.valueOf(resultado);
				textField_2.setText(resultadoStr);
			}
		});
		botonMultiplica.setBounds(203, 86, 128, 21);
		contentPane.add(botonMultiplica);
		
		JButton botonDivide = new JButton("DIVIDE");
		botonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorA = textField.getText();
				Double valorAD = Double.parseDouble(valorA);
				String valorB = textField_1.getText();
				Double valorBD = Double.parseDouble(valorB);
				Double resultado = valorAD / valorBD;
				String resultadoStr = String.valueOf(resultado);
				textField_2.setText(resultadoStr);
			}
		});
		botonDivide.setBounds(329, 86, 85, 21);
		contentPane.add(botonDivide);
		
		JLabel lblNewLabel_2 = new JLabel("RESULTADO");
		lblNewLabel_2.setBounds(162, 149, 96, 13);
		contentPane.add(lblNewLabel_2);
		
		// Textfield de RESULTADO
		textField_2 = new JTextField();
		textField_2.setBounds(76, 172, 255, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("About");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Autor: Borja Montseny");
			}
		});
		btnNewButton_4.setBounds(0, 220, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JButton botonSalir = new JButton("SALIR");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botonSalir.setBounds(351, 220, 85, 21);
		contentPane.add(botonSalir);
		

		

		
		
	}
}

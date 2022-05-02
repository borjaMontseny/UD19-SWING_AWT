package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class JPaneEj1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JTextField textField_2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPaneEj1 frame = new JPaneEj1();
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
	public JPaneEj1() {
		
		setTitle("Ejercicio 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("¿A quién quieres saludar?");
		lblNewLabel.setBounds(131, 10, 150, 13);
		contentPane.add(lblNewLabel);

		textField_2 = new JTextField();
		textField_2.setBounds(150, 33, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_1 = new JButton("Saludar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreUsuario = textField_2.getText();
				JOptionPane.showMessageDialog(null, "¡Saludos " + nombreUsuario + "!");
			}
		});
		btnNewButton_1.setBounds(150, 62, 85, 21);
		contentPane.add(btnNewButton_1);
		
		

	}
}

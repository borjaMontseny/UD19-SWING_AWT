package ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPaneEj2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPaneEj2 frame = new JPaneEj2();
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
	public JPaneEj2() {
		setTitle("Ejercicio 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Añadir película:");
		lblNewLabel.setBounds(10, 10, 91, 13);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(10, 33, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Películas");
		lblNewLabel_1.setBounds(168, 10, 63, 13);
		contentPane.add(lblNewLabel_1);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(168, 32, 223, 21);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("INTRODUCIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peliculaNueva = textField.getText();
				comboBox.addItem(peliculaNueva);
			}
		});
		btnNewButton.setBounds(10, 62, 104, 21);
		contentPane.add(btnNewButton);

	}
}

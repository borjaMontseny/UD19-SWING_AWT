package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPaneEj3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPaneEj3 frame = new JPaneEj3();
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
	public JPaneEj3() {
		setTitle("Ejercicio 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Seleccionar SO
		JLabel lblNewLabel = new JLabel("Seleccione SO:");
		lblNewLabel.setBounds(16, 10, 93, 13);
		contentPane.add(lblNewLabel);

		// Comienzan los radio buttons
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(16, 29, 103, 21);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(16, 54, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(16, 77, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		// /Seleccionar SO

		// Checkbox Especialidades
		JLabel lblNewLabel_1 = new JLabel("Especialidades:");
		lblNewLabel_1.setBounds(16, 122, 93, 13);
		contentPane.add(lblNewLabel_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(16, 142, 120, 21);
		contentPane.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño Gráfico");
		chckbxNewCheckBox_1.setBounds(16, 165, 120, 21);
		contentPane.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(16, 188, 120, 21);
		contentPane.add(chckbxNewCheckBox_2);

		// / Checkbox Especialidades

		// Slider Horas Ordenador
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador:");
		lblNewLabel_2.setBounds(140, 10, 213, 13);
		contentPane.add(lblNewLabel_2);

		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(140, 29, 200, 46);
		contentPane.add(slider);
		// / Slider Horas Ordenador

		// Botón TERMINAR
		JButton btnNewButton = new JButton("TERMINAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String formularioSO = "";
				if (rdbtnNewRadioButton.isSelected()) {
					formularioSO = rdbtnNewRadioButton.getText();
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					formularioSO = rdbtnNewRadioButton_1.getText();
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					formularioSO = rdbtnNewRadioButton_2.getText();
				}
				
				String especialidades = "";
				if (chckbxNewCheckBox.isSelected()) {
					especialidades += chckbxNewCheckBox.getText() + " ";
				}
				if(chckbxNewCheckBox_1.isSelected()) {
					especialidades += chckbxNewCheckBox_1.getText() + " ";
				}
				if(chckbxNewCheckBox_2.isSelected()) {
					especialidades += chckbxNewCheckBox_2.getText() + " ";
				}
				
				
				JOptionPane.showMessageDialog(null, "Sistema Operativo: " + formularioSO
						+ "\nEspecialidades: " + especialidades
						+"\n Horas Ordenador: " + slider.getValue());
			}
		});
		btnNewButton.setBounds(200, 165, 120, 21);
		contentPane.add(btnNewButton);
		// / Botón TERMINAR

	}
}

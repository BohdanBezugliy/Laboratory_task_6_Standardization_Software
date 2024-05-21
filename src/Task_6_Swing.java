import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Task_6_Swing {

	private JFrame frame;
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
					Task_6_Swing window = new Task_6_Swing();
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
	public Task_6_Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Лабораторна робота 6");
		frame.setBounds(100, 100, 349, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Змінна X1");
		lblNewLabel.setBounds(18, 36, 89, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Змінна X2");
		lblNewLabel_1.setBounds(18, 79, 89, 16);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(181, 31, 136, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 74, 136, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(18, 163, 299, 16);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Обчислити");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setText(null);
				try {
					double x1 = Double.parseDouble(textField.getText()),x2= Double.parseDouble(textField_1.getText());
					double result = Math.cos(x2/2) * Math.sin(x1) + 1/2;
					textField_2.setText(String.format("%.4f",result));
					lblNewLabel_2.setText(String.format("Середнє арифметичне X1 та X2: %.4f", (x1+x2)/2));
				}catch(NumberFormatException ex) {
					lblNewLabel_2.setText("Некоректно введені змінні!!!");
				}
			}
		});
		btnNewButton.setBounds(18, 191, 100, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Очистити");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				lblNewLabel_2.setText(null);
			}
		});
		btnNewButton_1.setBounds(116, 191, 100, 29);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Результат розрахунку Y");
		lblNewLabel_1_1.setBounds(18, 127, 151, 16);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Вихід");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setBounds(217, 191, 100, 29);
		panel.add(btnNewButton_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 122, 136, 26);
		panel.add(textField_2);
	}
}

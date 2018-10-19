import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.bind.ParseConversionEvent;

public class firstWindowbuilder {

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
					firstWindowbuilder window = new firstWindowbuilder();
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
	public firstWindowbuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 647, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		int val;
		
		JLabel lblNewLabel = new JLabel("value");
		lblNewLabel.setBounds(292, 240, 78, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(263, 111, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(263, 147, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textFieldValue = textField.getText();
				String textFieldValue1 = textField_1.getText();
				
				int val2 = Integer.parseInt(textFieldValue) + Integer.parseInt(textFieldValue1) ;
				lblNewLabel.setText(String.valueOf(val2));
			}
		});
		btnNewButton.setBounds(271, 182, 108, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblInput = new JLabel("Input1");
		lblInput.setBounds(215, 106, 78, 33);
		frame.getContentPane().add(lblInput);
		
		JLabel lblInput_1 = new JLabel("Input2");
		lblInput_1.setBounds(215, 142, 78, 33);
		frame.getContentPane().add(lblInput_1);
		

		
	}
}

package com.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame{
	/* Color Scheme */
	/* Text: 244, 236, 221 */
	/* Background: 12, 9, 4 */
	/* Primary: 222, 197, 149 */
	/* Secondary: 37, 57, 117 */
	/* Accent: 170, 77, 199 */

	CalculatorFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setTitle("Calculator");
		ImageIcon calculatorIcon = new ImageIcon("icon_calculator.png");
		this.setIconImage(calculatorIcon.getImage());
		this.getContentPane().setBackground(new Color(12, 9, 4));
		this.setVisible(true);
		
		// Text Field to Display Input & Results
		JTextField textField = new JTextField(20);
		textField.setEditable(false);
		textField.setText("0");
		textField.setPreferredSize(new Dimension(280, 50));
		textField.setFont(new Font("Arial", Font.BOLD, 18));
		textField.setBackground(new Color(12, 9, 4));
		textField.setForeground(new Color(244, 236, 221));
		textField.setBorder(BorderFactory.createEtchedBorder());

		textField.setHorizontalAlignment(JTextField.RIGHT);
		this.add(textField, BorderLayout.NORTH);
		
		// Create a panel for the buttons/ operators and add them to the frame.
		/* JButton divisionButton = new JButton();
		divisionButton.setSize(60, 60);
		divisionButton.setText("%");
		divisionButton.setBackground(new Color( 170, 77, 199));
		divisionButton.setForeground(new Color(244, 236, 221));
		divisionButton.setFocusable(false); */
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
		buttonPanel.setBackground(new Color(12, 9, 4));
		
		String[] buttons = {
				"7", "8", "9", "/",
				"4", "5", "6", "*",
				"1", "2", "3", "-",
				"0", ".", "=", "+"
		};
		
		for (String text : buttons) {
			JButton button = new JButton(text);
			button.setPreferredSize(new Dimension(70, 70));
			button.setBackground(new Color(37, 57, 117));
			button.setForeground(new Color(244, 236, 221));
			button.setBorder(BorderFactory.createEtchedBorder());
			button.setFocusable(false);
			buttonPanel.add(button);
		}
		
		this.add(buttonPanel, BorderLayout.CENTER);
	}
}

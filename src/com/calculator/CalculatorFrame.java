package com.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CalculatorFrame extends JFrame{
	/* Color Scheme */
	/* Text: 244, 236, 221 */
	/* Background: 12, 9, 4 */
	/* Primary: 222, 197, 149 */
	/* Secondary: 37, 57, 117 */
	/* Accent: 170, 77, 199 */

	CalculatorFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(300,400);
		this.setTitle("Calculator");
		ImageIcon calculatorIcon = new ImageIcon("icon_calculator.png");
		this.setIconImage(calculatorIcon.getImage());
		this.getContentPane().setBackground(new Color(12, 9, 4));
		this.setVisible(true);
		
		// Create 24 buttons
		JButton divisionButton = new JButton();
		divisionButton.setSize(60, 60);
		divisionButton.setText("%");
		// divisionButton.setBackground(new Color(239, 231, 218)); Alabaster
		divisionButton.setBackground(new Color(37, 57, 117));
		divisionButton.setForeground(new Color(244, 236, 221));
		divisionButton.setFocusable(false);
		
		// Add each button
		this.add(divisionButton);
	}
}

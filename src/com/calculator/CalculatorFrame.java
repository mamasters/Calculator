package com.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CalculatorFrame extends JFrame{

	CalculatorFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(300,400);
		this.setTitle("Calculator");
		ImageIcon calculatorIcon = new ImageIcon("icon_calculator.png");
		this.setIconImage(calculatorIcon.getImage());
		this.getContentPane().setBackground(new Color(95, 96, 98));
		this.setVisible(true);
		
		// Create 24 buttons
		JButton divisionButton = new JButton();
		divisionButton.setSize(60, 60);
		divisionButton.setText("%");
		divisionButton.setFocusable(false);
		
		// Add each button
		this.add(divisionButton);
	}
}

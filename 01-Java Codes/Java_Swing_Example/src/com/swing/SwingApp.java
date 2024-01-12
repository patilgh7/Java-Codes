package com.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingApp {

	public SwingApp() {
		
		JFrame f = new JFrame();
		
		JLabel firstName = new JLabel("First Name");   // for label
		firstName.setBounds(20, 50, 80, 20);           // setBounds(x, y, width, height)
		
		
		JTextField firstNameTF = new JTextField();    // for writing text
		firstNameTF.setBounds(120, 50, 100, 20);
		
		JLabel lastName = new JLabel("Last Name");   
		lastName.setBounds(20, 80, 80, 20);
		
		JTextField lastNameTF = new JTextField();
		lastNameTF.setBounds(120, 80, 100, 20);
		
		f.add(firstName);    
		f.add(firstNameTF);
		f.add(lastName);
		f.add(lastNameTF);
		
		
		
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		SwingApp s = new SwingApp();

	}
	
	

}

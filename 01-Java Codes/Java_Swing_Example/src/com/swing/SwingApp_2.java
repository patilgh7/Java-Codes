package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingApp_2 {

	public SwingApp_2() {
		
		JFrame f = new JFrame();
		
		JLabel firstName = new JLabel("First Name");  // for label
		firstName.setBounds(20, 50, 80, 20);          // setBounds(x, y, width, height)
		
		JLabel lastName = new JLabel("Last Name");
		lastName.setBounds(20, 80, 80, 20);
		
		JLabel dob = new JLabel("Date Of Birth");
		dob.setBounds(20, 110, 80, 20);
		
		JTextField firstNameTF = new JTextField();   // for writing text
		firstNameTF.setBounds(120, 50, 100, 20);
		
		JTextField lastNameTF = new JTextField();
		lastNameTF.setBounds(120, 80, 100, 20);
		
		JTextField dobTF = new JTextField();
		dobTF.setBounds(120, 110, 100, 20);
		
		
		// Reset And Submit Button
		JButton sbmt = new JButton("Submit");
		sbmt.setBounds(20, 160, 100, 30);
		
		JButton reset = new JButton("Reset");
		reset.setBounds(120, 160, 100, 30);
		
		// Add components
		f.add(firstName);
		f.add(lastName);
		f.add(dob);
		f.add(firstNameTF);
		f.add(lastNameTF);
		f.add(dobTF);
		f.add(sbmt);
		f.add(reset);
		
		// code for window size ,layout and show window on screen
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	
	}

	public static void main(String[] args) {
			
		SwingApp_2 swing = new SwingApp_2();
		
	}

}

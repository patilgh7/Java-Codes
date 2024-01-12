package com.awtcodes;

import java.awt.Frame;
import java.awt.Label;

// Creating Window frame by using frame class

public class Testawt {

	Testawt() {
		
		Frame fm = new Frame(); // Creating a frame
		Label lb = new Label("Welcome to java graphics");  // Creating a label
		
		
		fm.add(lb);  // adding label to the frame
		fm.setSize(300, 300);  // setting frame size
		fm.setVisible(true);   // set frame visibility true
		
	}
	
	public static void main(String[] args) {
		
		Testawt ta = new Testawt();

	}

}

package com.awtcodes;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

// Creating frame by extending frame class

/**
 * Points to Remember:

   1) While creating a frame (either by instantiating or extending Frame class), Following two attributes are must for visibility of the frame:
        setSize(int width, int height);
        setVisible(true);
   2) When you create other components like Buttons, TextFields, etc. Then you need to add it to the frame by using the method - add(Component's Object);
   3) You can add the following method also for resizing the frame - setResizable(true);
   
 */

public class Testawt_2 extends Frame{

	Testawt_2() {
	
		Button btn = new Button("Hello World");
		add(btn);  // adding new button
		setSize(400, 500);  // setting size
		setTitle("Gaurav Window");  // setting title
		setLayout(new FlowLayout());  // set default layout for frame
		setVisible(true);    // set frame visibility true
		
	}
	
	public static void main(String[] args) {
		
		Testawt_2 ta = new Testawt_2();

	}
	

}

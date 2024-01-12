package com.awtcodes;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceDemo {

	public ChoiceDemo() {
		
		Frame fm = new Frame();
		
		Choice obj = new Choice();
		obj.setBounds(80, 80, 100, 100);
		
		obj.add("Red");
		obj.add("Blue");
		obj.add("Black");
		obj.add("Pink");
		obj.add("White");
		obj.add("Green");
		
		fm.add(obj);
		fm.setSize(400, 400);
		fm.setLayout(null);
		fm.setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {

		ChoiceDemo cd = new ChoiceDemo();

	}

}

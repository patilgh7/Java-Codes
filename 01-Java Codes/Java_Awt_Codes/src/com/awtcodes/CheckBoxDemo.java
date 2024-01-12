package com.awtcodes;

import java.awt.Checkbox;
import java.awt.Frame;

public class CheckBoxDemo {

	public CheckBoxDemo() {

		Frame fm = new Frame("Gaurav");

		Checkbox ckbox1 = new Checkbox("Yes", true);
		ckbox1.setBounds(100, 100, 60, 60);
		
		Checkbox ckbox2 = new Checkbox("No");
		ckbox2.setBounds(100, 150, 60, 60);
		
		fm.add(ckbox1);
		fm.add(ckbox2);
		
		fm.setSize(300, 300);
		fm.setLayout(null);
		fm.setVisible(true);
		
	}

	public static void main(String[] args) {

		new CheckBoxDemo();
	}

}

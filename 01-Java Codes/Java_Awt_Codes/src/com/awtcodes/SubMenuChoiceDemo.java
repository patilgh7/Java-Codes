package com.awtcodes;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

 /*
  * MenuBar => Top MenuBar created
  * 
  * Menu => Menu list like Menu
  * 					   Red=> redMenu
  * 					   Green=> greenMenu
  * 
  * MenuItem => It is a subItems of menu like red, lightRed, darkRed
  * 
  * */


public class SubMenuChoiceDemo {

	public SubMenuChoiceDemo() {
		
		Frame fm = new Frame("Gaurav");
		
		MenuBar menuBar = new MenuBar();
		
		Menu menu = new Menu("Menu");
		
		Menu redMenu = new Menu("Red");
		
		Menu greenMenu = new Menu("Green");
		
		MenuItem red = new MenuItem("Red");
		MenuItem lightRed = new MenuItem("Light Red");
		MenuItem darkRed = new MenuItem("Dark Red");
		
		MenuItem green = new MenuItem("Green");
		MenuItem lightGreen = new MenuItem("Light Green");
		MenuItem darkGreen = new MenuItem("Dark Green");
		
		menuBar.add(menu);        // Very Important step  MenuBar added menu
		menu.add(redMenu);        // Adding red menu to menu ....It shows red subMenu tab
		menu.add(greenMenu);      // Adding green menu to menu ....It shows green subMenu tab
		
		redMenu.add(red);          // Adding subMenu of red
		redMenu.add(lightRed);
		redMenu.add(darkRed);
		
		greenMenu.add(green);      // Adding subMenu of green
		greenMenu.add(lightGreen);
		greenMenu.add(darkGreen);

		// Setting properties
		fm.setMenuBar(menuBar); // Setting menuBar
		fm.setSize(400, 400);
		fm.setLayout(null);
		fm.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		SubMenuChoiceDemo subMenu = new SubMenuChoiceDemo();

	}

}

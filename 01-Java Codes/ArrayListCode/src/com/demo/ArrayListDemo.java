package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Laxman");
		list.add("Arjun");
		list.add("Bheem");
		list.add("Nakul");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

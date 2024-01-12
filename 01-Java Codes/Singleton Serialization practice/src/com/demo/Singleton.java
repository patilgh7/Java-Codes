package com.demo;

import java.io.Serializable;

public class Singleton implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Singleton() {
		
	}

	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}else {
			return instance;
		}
		
		
		return instance;
		
	}
	
	// change
	protected Object readResolve() {
		return instance;
	}
	
	

}

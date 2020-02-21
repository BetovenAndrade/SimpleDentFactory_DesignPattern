package com.betoven.simpleFactory;

public class Main {

	public static void main(String[] args) {
		Dente dent= SimpleDentFactory.createDent(21); 
		//See: even if I program a new category of teeth, the main application (and the 'Dente' interface) will not know it.
		
		System.out.println(dent);
	}

}
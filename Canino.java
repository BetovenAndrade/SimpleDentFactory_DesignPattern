package com.betoven.simpleFactory;

public class Canino extends Dente{

	public Canino(int number) {
		super(number);
	}
	
	@Override
	public String getName() {
		if(getNumber()==13 || getNumber()==23 || getNumber()==33 || getNumber()==43)
			return "canino";
		else
			throw new IllegalArgumentException(); //The factory can do that
	}

	@Override
	public String getFunction() {
		return "rasgar";
	}

}

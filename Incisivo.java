package com.betoven.simpleFactory;

public class Incisivo extends Dente{

	public Incisivo(int number) {
		super(number);
	}

	@Override
	public String getName() {
		if(getNumber()==11 || getNumber()==21 || getNumber()==31 || getNumber()==41)
			return "incisivo central";
		else if(getNumber()==12 || getNumber()==22 || getNumber()==32 || getNumber()==42)
			return "incisivo lateral";
		else
			throw new IllegalArgumentException(); //The factory can do that
	}

	@Override
	public String getFunction() {
		return "cortar";
	}
		
}

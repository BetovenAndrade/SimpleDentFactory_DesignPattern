package com.betoven.simpleFactory;

public class Molar extends Dente{
	
	public Molar(int number) {
		super(number);
	}
	
	@Override
	public String getName() {
		if(getNumber()==14 || getNumber()==24 || getNumber()==34 || getNumber()==44)
			return "primeiro pré-molar";
		else if(getNumber()==15 || getNumber()==25 || getNumber()==35 || getNumber()==45)
			return "segundo pré-molar";
		else if(getNumber()==16 || getNumber()==26 || getNumber()==36 || getNumber()==46)
			return "primeiro molar";
		else if(getNumber()==17 || getNumber()==27 || getNumber()==37 || getNumber()==47)
			return "segundo molar";
		else if(getNumber()==18 || getNumber()==28 || getNumber()==38 || getNumber()==48)
			return "terceiro molar";
		else
			throw new IllegalArgumentException(); //The factory can do that
	}

	@Override
	public String getFunction() {
		return "triturar";
	}

}

package com.betoven.simpleFactory;

public abstract class Dente {
	private int number;
	private int quadrant;
	private String jaw;
	
	public Dente(int number) {
		if(number>=11 && number<=18) {
			quadrant=1;
			jaw= "superior";
		}
		else if (number>=21 && number<=28) {
			quadrant=2;
			jaw= "superior";
		}
		else if (number>=31 && number<=38) {
			quadrant=3;
			jaw= "inferior";
		}
		else if (number>=41 && number<=48) {
			quadrant=4;
			jaw= "inferior";
		}
		else
			throw new IllegalArgumentException(); //we can remove: exception handled in the factory!!!
			
		this.number = number;
	}
	
	public abstract String getName();
	public abstract String getFunction();
	
	public int getNumber() {
		return number;
	}
	public int getQuadrant() {
		return quadrant;
	}
	public String getJaw() {
		return jaw;
	}
	
	public String toString() {
		return String.format("\nNome: %s\nFunção: %s\nNúmero: %d\nQuadrante: %d\nMaxilar: %s", getName(),getFunction(),getNumber(),getQuadrant(),getJaw());
	}
}

/* 
 * In the SimpleFactory Design Pattern: variable code (such as instantiations) must be isolated in a factory.
 * When programming for interfaces the code will work for new classes via polymorphism
 * See: we could create the premolar class without changing the main application
 * Interfaces (with interface or abstract class) leaves the program flexible, uncoupled.
 */
 

package com.betoven.simpleFactory;

public class SimpleDentFactory {
	private static Dente dent; 
	
	public static Dente createDent(int number){
		if(number==11 || number==21 || number==31 || number==41 ||
		   number==12 || number==22 || number==32 || number==42) {
			dent= new Incisivo(number);
		}
		else if(number==13 || number==23 || number==33 || number==43) {
			dent= new Canino(number);
		}
		else if((number>=14 && number<=18) || (number>=24 && number<=28) || 
				(number>=34 && number<=38) || (number>=44 && number<=48)) {
			dent= new Molar(number);
		}
		else {
			throw new IllegalArgumentException("Número invátido para dentes");
		}
		return dent;
	}
}
package E03_Cafe_DecoratorPattern;

import E03_Cafe_DecoratorPattern.Getraenk.Groesse;

public class Espresso extends Getraenk {
	
	public static final double preis = 1.90;
		
	public Espresso() {
		beschreibung = "Espresso";
	}

	@Override
	public double preis() {
		
		return preis;
	}
	

}

package E03_Cafe_DecoratorPattern;

import E03_Cafe_DecoratorPattern.Getraenk.Groesse;

public class Hausmischung extends Getraenk {
	
	public static final double preis = 1.50;
	
	public Hausmischung() {
		beschreibung = "Hausmischung";
	}
	
	public Hausmischung(Groesse groesse) {
		setGroesse(groesse);
		beschreibung = "Hausmischung";
	}
	

	@Override
	public double preis() {
		
		return preis;
	}

}

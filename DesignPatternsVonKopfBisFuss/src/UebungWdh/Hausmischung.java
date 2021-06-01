package UebungWdh;

import E03_Cafe_DecoratorPattern.Getraenk.Groesse;

public class Hausmischung extends Getraenk {
	
	public Hausmischung() {
		beschreibung = "Hausmischung";
	}
	
	public Hausmischung(Groesse groesse) {
		setGroesse(groesse);
		beschreibung = "Hausmischung";
	}

	@Override
	public double preis() {
		return 2.10;
	}

}

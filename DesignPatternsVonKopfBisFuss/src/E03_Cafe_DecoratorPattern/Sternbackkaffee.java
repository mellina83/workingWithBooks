package E03_Cafe_DecoratorPattern;

import E03_Cafe_DecoratorPattern.Getraenk.Groesse;

public class Sternbackkaffee {

	public static void main(String[] args) {
		
		Getraenk getraenk = new Espresso();
		System.out.println(getraenk.getBeschreibung() + " " + getraenk.preis() + " Euro");

		Getraenk getraenk2 = new Hausmischung();
		getraenk2 = new Schoko(getraenk2);
		getraenk2 = new Schoko(getraenk2);
		getraenk2 = new Soja(getraenk2);
		System.out.println(getraenk2.getBeschreibung() + " " + getraenk2.preis() + " Euro");
		

	}

}

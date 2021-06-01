package UebungWdh;

import UebungWdh.Getraenk.Groesse;

public class Hauptprogramm {

	public static void main(String[] args) {
		
		Getraenk getraenk1 = new Hausmischung(Groesse.GRANDE);
		getraenk1 = new Schoko(getraenk1);
		System.out.println(getraenk1.getGroesse());
		System.out.println(getraenk1.getBeschreibung() + " " + getraenk1.preis());
		getraenk1 = new Schoko(getraenk1);
		System.out.println(getraenk1.getBeschreibung() + " " + getraenk1.preis());

	}

}

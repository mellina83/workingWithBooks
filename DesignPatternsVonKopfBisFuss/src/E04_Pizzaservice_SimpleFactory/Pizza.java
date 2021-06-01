package E04_Pizzaservice_SimpleFactory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String teig;
	String sosse;
	ArrayList belaege = new ArrayList();
	
	void vorbereiten() {
		System.out.println("Bereite " + name + " vor...");
		System.out.println("Werfe Teig...");
		System.out.println("Fuege Sosse hinzu...");
		System.out.println("Fuege Belaege hinzu...");
		for (int i = 0; i < belaege.size(); i++) {
			System.out.println(" -" + belaege.get(i));
		}
	}
	
	void backen() {
		System.out.println("Backe 25 Minuten bei 350 Grad");
	}
	
	void schneiden() {
		System.out.println("Schneide die Pizza diagonal in Stuecke");
	}
	
	void einpacken() {
		System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}

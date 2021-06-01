package E04_Pizzaservice_SimpleFactory;

interface Pizza1 {
	public void vorbereiten();
	public void backen();
	public void schneiden();
	public void einpacken();
}


class SalamiPizza1 implements Pizza1 {
	public void vorbereiten() {
	}
	public void backen() {
	}
	public void schneiden() {
	}
	public void einpacken() {
	}
}

class SchinkenPizza1 implements Pizza1 {
	public void vorbereiten() {
	}
	public void backen() {
	}
	public void schneiden() {
	}
	public void einpacken() {
	}
}

public class Ausgangslage {
	//Pizzeria bestellt und ERSTELLT die Pizza
	//Hier muessten Anpassungen direkt stattfinden, Code ist also immer offen.

	public static void main(String[] args) {
		Pizza1 pizza = bestellePizza("Salami");
		System.out.println(pizza.getClass().getSimpleName());	
	}
	
	public static Pizza1 bestellePizza(String typ) {
		Pizza1 pizza = null;
		
		if (typ.equals("Salami")) {
			pizza = new SalamiPizza1();
		} else if (typ.equals("Schinken")) {
			pizza = new SchinkenPizza1();
		}
		
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.einpacken();
		return pizza;
		
		
	}

}

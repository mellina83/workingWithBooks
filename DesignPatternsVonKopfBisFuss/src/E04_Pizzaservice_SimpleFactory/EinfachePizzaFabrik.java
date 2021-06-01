package E04_Pizzaservice_SimpleFactory;

public class EinfachePizzaFabrik {
	//IST NACH EINFUEHRUNG DER REGIONALEN PIZZERIAS OBSOLET!
	//erstellePizza ist nun in Pizzeria als abstrakte Methode und wird regional implementiert
	
	public Pizza erstellePizza(String typ) {
		Pizza pizza = null;
		
		if (typ.equals("Salami")) {
			pizza = new SalamiPizza();
		} else if (typ.equals("Schinken")) {
			pizza = new SchinkenPizza();
		}
		
		return pizza;
		
	}
	

	

}

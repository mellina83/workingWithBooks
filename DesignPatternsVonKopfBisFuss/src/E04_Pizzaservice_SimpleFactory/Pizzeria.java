package E04_Pizzaservice_SimpleFactory;

public abstract class Pizzeria {
	
	public Pizza bestellePizza(String typ) {
		Pizza pizza = null;
		
		try {
			
			pizza = erstellePizza(typ);
			
			pizza.vorbereiten();
			pizza.backen();
			pizza.schneiden();
			pizza.einpacken();
			
			
		} catch (Exception e) {
			System.out.println("Keine Pizza erstellt.");
		}
		return pizza;
		
	}
	
	protected abstract Pizza erstellePizza(String typ) ;

}

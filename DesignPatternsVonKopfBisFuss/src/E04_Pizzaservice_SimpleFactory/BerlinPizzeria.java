package E04_Pizzaservice_SimpleFactory;

public class BerlinPizzeria extends Pizzeria {

	@Override
	public Pizza erstellePizza(String typ) {
		Pizza pizza = null;
		
		if (typ.equals("Salami")) {
			pizza = new BerlinerSalamiPizza();
		} else if (typ.equals("Schinken")) {
			pizza = new BerlinerSchinkenPizza();
		}
		
		return pizza;
		
	}
	
	

}

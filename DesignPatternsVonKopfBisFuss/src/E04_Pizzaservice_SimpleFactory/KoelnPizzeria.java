package E04_Pizzaservice_SimpleFactory;

public class KoelnPizzeria extends Pizzeria {

	@Override
	public Pizza erstellePizza(String typ) throws RuntimeException {
		Pizza pizza = null;
		
		try {
			if (typ.equals("Salami")) {
				pizza = new KoelnerSalamiPizza();
			} else if (typ.equals("Schinken")) {
				pizza = new KoelnerSchinkenPizza();
			} else throw new IllegalArgumentException();
		} catch (Exception e) {
			System.out.println("Diese Pizza-Art bietet KoelnPizzeria nicht an!");
		}
		
		return pizza;
	}

}

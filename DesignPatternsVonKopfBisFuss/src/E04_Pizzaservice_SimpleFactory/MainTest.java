package E04_Pizzaservice_SimpleFactory;

public class MainTest {

	public static void main(String[] args) {
		Pizzeria berlinPizzeriaWest = new BerlinPizzeria();
		Pizzeria koelnPizzeriaZentrum = new KoelnPizzeria();
		Pizza pizza1 = koelnPizzeriaZentrum.bestellePizza("Schinken");
		System.out.println();
		Pizza pizza2 = koelnPizzeriaZentrum.bestellePizza("Banane");
		System.out.println();
		Pizza pizza = berlinPizzeriaWest.bestellePizza("Salami");
		System.out.println();
		System.out.println("Ernie hat eine " + pizza1 + " bestellt.");
		System.out.println("Bert hat eine " + pizza2 + " bestellt");
		System.out.println("Kruemelmonster hat eine " + pizza + " bestellt");
		
		

	}

}

package E04_Pizzaservice_SimpleFactory;

public class KoelnerSalamiPizza extends Pizza {
	
	public KoelnerSalamiPizza() {
		name = "Salami-Pizza nach Koelner Art";
		teig = "Teig mit extra dicker Kruste";
		sosse = "Tomatensosse";
		
		belaege.add("Mozzarella");
		belaege.add("Viel Salami in Scheiben");
	}

	@Override
	public void schneiden() {
		System.out.println("Schneide die Pizza in rechteckige Stuecke.");
	}



}

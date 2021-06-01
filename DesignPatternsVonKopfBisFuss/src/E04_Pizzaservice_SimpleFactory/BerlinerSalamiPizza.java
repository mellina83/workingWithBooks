package E04_Pizzaservice_SimpleFactory;

public class BerlinerSalamiPizza extends Pizza {
	
	public BerlinerSalamiPizza() {
		name = "Salami-Pizza nach Berliner Art";
		teig = "Teig mit knuspriger Kruste";
		sosse = "Marinara-Sosse";
		
		belaege.add("Geriebener Parmesan");
		belaege.add("Salami in Scheiben");
	}

}

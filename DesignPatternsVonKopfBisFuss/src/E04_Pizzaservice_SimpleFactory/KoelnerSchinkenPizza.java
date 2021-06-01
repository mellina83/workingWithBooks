package E04_Pizzaservice_SimpleFactory;

public class KoelnerSchinkenPizza extends Pizza {
	
	public KoelnerSchinkenPizza() {
		name = "Koelner Schinken-Pizza";
		teig = "Kaeserand";
		sosse = "Tomatensosse";
		
		belaege.add("Hinterkochschinken");
	}

	@Override
	public void einpacken() {
		System.out.println("Serviette obendrauf");
		super.einpacken();
	}

}

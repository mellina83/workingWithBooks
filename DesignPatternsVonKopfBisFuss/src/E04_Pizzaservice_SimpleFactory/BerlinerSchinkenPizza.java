package E04_Pizzaservice_SimpleFactory;

public class BerlinerSchinkenPizza extends Pizza {
	
	public BerlinerSchinkenPizza() {
		name = "Berliner Schinken-Pizza";
		teig = "Luftiger Teig";
		sosse = "Sauce Hollandaise";
		
		belaege.add("Parma-Schinken");
	}



	@Override
	public void backen() {
		System.out.println("Mit Haelfte der Sosse bei Soundsoviel Grad anbacken, danach den Rest drauf machen");
		super.backen();
	}

}

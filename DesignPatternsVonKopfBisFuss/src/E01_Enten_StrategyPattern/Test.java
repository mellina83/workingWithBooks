package E01_Enten_StrategyPattern;

public class Test {

	public static void main(String[] args) {
		Ente ente1 = new Stockente();
		ente1.tuQuaken();
		ente1.tuFliegen();
		System.out.println();
		
		Ente ente2 = new ModellEnte();
		ente2.tuFliegen();
		
		//Aendern des Flugverhaltens der ModellEnte
		ente2.setFlugVerhalten(new FliegtRaketenGetrieben());
		ente2.tuFliegen();

	}

}

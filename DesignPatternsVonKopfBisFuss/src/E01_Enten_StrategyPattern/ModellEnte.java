package E01_Enten_StrategyPattern;

public class ModellEnte extends Ente {
	
	public ModellEnte() {
		quakVerhalten = new Quaken();
		flugVerhalten = new FliegtGarNicht();
	}
	
	@Override
	public void anzeigen() {
		System.out.println("Ich bin eine ModellEnte");
	}
		
	

}

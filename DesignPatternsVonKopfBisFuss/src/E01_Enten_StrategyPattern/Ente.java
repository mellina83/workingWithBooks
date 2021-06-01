package E01_Enten_StrategyPattern;

public abstract class Ente {
	protected FlugVerhalten flugVerhalten;
	protected QuakVerhalten quakVerhalten;
	
	/* Mit den Settern will ich in der Lage sein,
	 * das Verhalten des Objekts zur Laufzeit zu aendern.
	 * (Bislang nur ueber den Konstruktor der Sub-Enten moeglich.)
	 */
	public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
		this.flugVerhalten = flugVerhalten;
	}
	
	public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
		this.quakVerhalten = quakVerhalten;
	}
	
	public void tuFliegen() {
		flugVerhalten.fliegen();
		
	}
	
	public void tuQuaken() {
		quakVerhalten.quaken();
		
	}
	
	public void schwimmen() {
		System.out.println("Alle Enten schwimmen, auch Holzenten.");
	}
	
	public void anzeigen() {
		System.out.println("Wir sind Enten.");
	}

}

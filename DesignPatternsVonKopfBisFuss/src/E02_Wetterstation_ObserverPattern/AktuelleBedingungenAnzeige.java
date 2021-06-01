package E02_Wetterstation_ObserverPattern;

public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElement {
	private float feuchtigkeit;
	private float temperatur;
	private float luftdruck;
	private Subjekt wetterDaten;
	
	public AktuelleBedingungenAnzeige(Subjekt wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.registriereBeobachter(this);
	}
	

	@Override
	public void anzeigen() {
		System.out.println("Aktuelle Wetterbedingungen: " + temperatur + " Grad Celsius und " + feuchtigkeit + " % Luftfeuchtigkeit");
	}

	@Override
	public void aktualisieren(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
		anzeigen();
	}

}

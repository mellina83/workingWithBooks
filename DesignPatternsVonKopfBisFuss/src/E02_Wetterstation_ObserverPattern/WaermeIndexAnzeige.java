package E02_Wetterstation_ObserverPattern;

public class WaermeIndexAnzeige implements AnzeigeElement, Beobachter {
	float waermeIndex;
	private WetterDaten wetterDaten;
	
	public WaermeIndexAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.registriereBeobachter(this);
	}

	@Override
	public void aktualisieren(float temp, float feucht, float druck) {
		temp = temp * 9 / 5 + 32;
		waermeIndex = berechnenWaermeIndex(temp, feucht);
		anzeigen();
	}

	@Override
	public void anzeigen() {
		System.out.println("Waerme-Index ist " + waermeIndex);

	}
	
	public float berechnenWaermeIndex(float t, float rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
				+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
				+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
				(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
				(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
				(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
				0.000000000843296 * (t * t * rh * rh * rh)) -
				(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		
			return (float) ((index -32) / 1.8);
	}

}

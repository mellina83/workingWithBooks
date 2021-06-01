package E02_Wetterstation_ObserverPattern;

public class WetterStation {

	public static void main(String[] args) {
		WetterDaten wetterDaten = new WetterDaten();
		
		AktuelleBedingungenAnzeige aktuelleAnzeige = new AktuelleBedingungenAnzeige(wetterDaten);
		WaermeIndexAnzeige waermeIndexAnzeige = new WaermeIndexAnzeige(wetterDaten);
//		StatistikAnzeige statistikAnzeige = new StatistikAnzeige(wetterDaten);
//		VorhersageAnzeige vorhersageAnzeige = new VorhersageAnzeige(wetterDaten);
		
		wetterDaten.setMesswerte(30, 65, 30.4f);
		wetterDaten.setMesswerte(32, 70, 29.2f);
		wetterDaten.setMesswerte(28, 90, 29.2f);

	}

}

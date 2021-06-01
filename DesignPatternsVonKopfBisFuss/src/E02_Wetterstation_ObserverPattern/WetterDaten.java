package E02_Wetterstation_ObserverPattern;

import java.util.ArrayList;

public class WetterDaten implements Subjekt {
	private ArrayList beobachter;
	private float feuchtigkeit;
	private float temperatur;
	private float luftdruck;
	
	public WetterDaten() {
		beobachter = new ArrayList();
	}

	@Override
	public void registriereBeobachter(Beobachter b) {
		beobachter.add(b);
	}

	@Override
	public void entferneBeobachter(Beobachter b) {
		int i = beobachter.indexOf(b);
		if (i >= 0) {
			beobachter.remove(b);			
		}
	}

	@Override
	public void benachrichtigeBeobachter() {
		for (int i = 0; i < beobachter.size(); i++) {
			Beobachter b = (Beobachter)beobachter.get(i);
			b.aktualisieren(temperatur, feuchtigkeit, luftdruck);
		}
	}
	
	public void messwerteGeaendert() {
		benachrichtigeBeobachter();
	}
	
	public void setMesswerte(float temperatur, float feuchtigkeit, float luftdruck) {
		this.temperatur = temperatur;
		this.feuchtigkeit = feuchtigkeit;
		this.luftdruck = luftdruck;
		messwerteGeaendert();
	}

}

package E02_Wetterstation_ObserverPattern;

public interface Subjekt {
	public void registriereBeobachter(Beobachter beobachter);
	public void entferneBeobachter(Beobachter beobachter);
	public void benachrichtigeBeobachter();
}

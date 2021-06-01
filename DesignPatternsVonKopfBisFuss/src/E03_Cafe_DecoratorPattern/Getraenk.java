package E03_Cafe_DecoratorPattern;

public abstract class Getraenk {
	
	public enum Groesse { TALL, Grande, Venti };
	
	String beschreibung = "Unbekanntes Getraenk";
	public Groesse groesse = Groesse.TALL;
	
	public String getBeschreibung() {
		return this.beschreibung;
	}
	
	public void setGroesse(Groesse groesse) {
		this.groesse = groesse;
	}
	
	public Groesse getGroesse() {
		return this.groesse;
	}
	
	public abstract double preis();

}

/**
 * 
 */
package UebungWdh;

/**
 * @author CC-Student
 *
 */
public abstract class Getraenk {
	
	enum Groesse {TALL, VENTI, GRANDE};
	public Groesse groesse = Groesse.TALL;
	
	protected String beschreibung = "Unbekanntes Getraenk";
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public void setBeschreibung() {
		this.beschreibung = beschreibung;
	}
	
	public Groesse getGroesse() {
		return groesse;
	}
	
	public void setGroesse(Groesse groesse) {
		this.groesse = groesse;
	}
	
	public abstract double preis();

}

package E03_Cafe_DecoratorPattern;

public abstract class ZutatDekorierer extends Getraenk {
	
	Getraenk getraenk;
	public abstract String getBeschreibung();
	
	public Groesse getGroesse() {
		return getraenk.getGroesse();
	}

}

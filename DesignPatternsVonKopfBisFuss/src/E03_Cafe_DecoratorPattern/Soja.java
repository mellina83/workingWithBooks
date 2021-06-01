package E03_Cafe_DecoratorPattern;

import E03_Cafe_DecoratorPattern.Getraenk.Groesse;

public class Soja extends ZutatDekorierer {
	
	Getraenk getraenk;
	
	public Soja(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + " Soja";
	}
	
	@Override
    public Groesse getGroesse() {
        return getraenk.getGroesse();
    }

	@Override
	public double preis() {
		double preis = getraenk.preis();
		if (getraenk.getGroesse() == Groesse.TALL) {
			preis += .15;
		} else if (getraenk.getGroesse() == Groesse.Grande) {
			preis += .20;
		} else if (getraenk.getGroesse() == Groesse.Venti) {
			preis += .30;
		}
		
		return preis;
		
		
		
	}
	
	

}

package E03_Cafe_DecoratorPattern;

import E03_Cafe_DecoratorPattern.Getraenk.Groesse;

public class Milchschaum extends ZutatDekorierer {
	
	Getraenk getraenk;
	
	public Milchschaum(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + " Milchschaum";
	}
	
	@Override
    public Groesse getGroesse() {
        return getraenk.getGroesse();
    }

	@Override
	public double preis() {
		
		double preis = getraenk.preis();
		if (getraenk.getGroesse() == Groesse.TALL) {
			preis += .12;
		} else if (getraenk.getGroesse() == Groesse.Grande) {
			preis += .30;
		} else if (getraenk.getGroesse() == Groesse.Venti) {
			preis += .70;
		}
		
		return preis;
		
		
	}
	
	

}

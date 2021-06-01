package E03_Cafe_DecoratorPattern;

public class Schoko extends ZutatDekorierer {
	Getraenk getraenk;
		
	public Schoko(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + " Schoko";
	}
	
	@Override
    public Groesse getGroesse() {
        return getraenk.getGroesse();
    }

	@Override
	public double preis() throws RuntimeException {
	
		double preis = getraenk.preis();
	
		if (this.getraenk.getGroesse() == Getraenk.Groesse.TALL) {
			preis += .10;
		} else if (this.getraenk.getGroesse() == Getraenk.Groesse.Grande) {
			preis += .15;
		} else if (this.getraenk.getGroesse() == Getraenk.Groesse.Venti) {
			preis += .20;
		}
		
		return preis;
		
		
		
		//return 0.20 + getraenk.preis();
	}
	

}

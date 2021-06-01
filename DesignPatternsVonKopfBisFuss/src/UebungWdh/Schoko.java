package UebungWdh;

public class Schoko extends Getraenk {
	Getraenk getraenk;
	
	public Schoko(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + "Schoko";
	}

	@Override
	public Groesse getGroesse() {
		return getraenk.getGroesse();
	}
	
	@Override
	public double preis() {
		double preis = getraenk.preis();
		if (getraenk.groesse == groesse.TALL) {
			preis += .10;
		} else if (getraenk.groesse == groesse.GRANDE) {
			preis += .20;
		} else if (getraenk.groesse == groesse.VENTI) {
			preis += .30;
		}
		return preis;
	}
	
	
	
	

}

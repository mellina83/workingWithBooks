package E01_Enten_StrategyPattern;

public class FliegtRaketenGetrieben implements FlugVerhalten {

	@Override
	public void fliegen() {
		System.out.println("Ich fliege mit Raketenantrieb.");
	}

}

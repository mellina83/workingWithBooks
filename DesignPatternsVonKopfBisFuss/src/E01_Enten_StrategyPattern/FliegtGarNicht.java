package E01_Enten_StrategyPattern;

public class FliegtGarNicht implements FlugVerhalten {

	@Override
	public void fliegen() {
		System.out.println("Ich kann leider nicht fliegen.");
	}

}

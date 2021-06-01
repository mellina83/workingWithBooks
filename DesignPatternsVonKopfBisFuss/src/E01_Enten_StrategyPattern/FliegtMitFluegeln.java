package E01_Enten_StrategyPattern;

public class FliegtMitFluegeln implements FlugVerhalten {

	@Override
	public void fliegen() {
		System.out.println("Ich fliege!");
	}

}

package E01_Enten_StrategyPattern;

public class StummesQuaken implements QuakVerhalten {

	@Override
	public void quaken() {
		System.out.println("<<Stille>>");
	}

}

package AdapterPattern;

public class DuckFactory {
	private static Duck duck;
	
	private DuckFactory() {	
	}
	
	public static Duck getInstance() {
		DuckFactory.duck = new ChickenAdapter(new WildChicken());
		return DuckFactory.duck;
	}
}

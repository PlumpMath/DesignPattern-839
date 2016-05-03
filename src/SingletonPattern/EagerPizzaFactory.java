package SingletonPattern;

public class EagerPizzaFactory {
	private static IPizza iPizza = new PizzaImpl();
	
	private EagerPizzaFactory() {}
	
	public static IPizza getInstance() {
		if (iPizza == null) {
			iPizza = new PizzaImpl();
		}
		return iPizza;
	}
	
}

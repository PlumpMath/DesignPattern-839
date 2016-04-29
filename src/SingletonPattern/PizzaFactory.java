package SingletonPattern;

public class PizzaFactory {
	private static IPizza iPizza = null;
	
	public static IPizza getInstance() {
		if (iPizza == null) {
			iPizza = new PizzaImpl();
		}
		return iPizza;
	}
}

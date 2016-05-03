package SingletonPattern;

public class IoDHPizzaFactory {
	private static IPizza iPizza = null;

	private IoDHPizzaFactory() {
	}

	public static IPizza getInstance() {
		return HoldClass.iPizza;
	}

	private static class HoldClass {
		private final static IPizza iPizza = new PizzaImpl();
	}
}

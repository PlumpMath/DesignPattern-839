package SingletonPattern;

public class LazyPizzaFactory {
	private static IPizza iPizza = null;

	private LazyPizzaFactory() {
	}

	public static IPizza getInstance() {
		if (iPizza == null) {
			synchronized (LazyPizzaFactory.class) {
				if (iPizza == null) {
					iPizza = new PizzaImpl();
				}
			}
		}
		return iPizza;
	}
}

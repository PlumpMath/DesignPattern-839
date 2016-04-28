package SimpleFactory;

public class SimplePizzaFactory {
	private static Pizza pizza;
	
	public static Pizza create(String type) {
		if ("NorthPizza".equals(type)) {
			pizza = new NorthPizza();
			return pizza;
		} else if ("SouthPizza".equals(type)){
			pizza = new SouthPizza();
			return pizza;
		}
		return null;
	}
}

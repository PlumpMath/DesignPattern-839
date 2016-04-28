package SimpleFactory;

public class SimplePizzaFactory {
	private static Pizza pizza = null;
	
	public static Pizza create(String type) {
		if ("NorthPizza".equals(type)) {
			pizza = new NorthPizza();
		} else if ("SouthPizza".equals(type)){
			pizza = new SouthPizza();
		}
		return pizza;
	}
}

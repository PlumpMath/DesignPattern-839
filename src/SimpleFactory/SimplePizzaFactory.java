package SimpleFactory;

public class SimplePizzaFactory {
	public static Pizza create(String type) {
		if ("NorthPizza".equals(type)) {
			return new NorthPizza();
		} else if ("SouthPizza".equals(type)){
			return new SouthPizza();
		}
		return null;
	}
}

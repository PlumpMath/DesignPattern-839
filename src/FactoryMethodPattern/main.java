package FactoryMethodPattern;

public class main {
	public static void main(String[] args) {
		PizzaFactory factory = new NorthPizzaFactory();
		Pizza pizza = factory.create();
		pizza.express();
	}
}

package AbstractFactoryPattern;

public class main {
	public static void main(String[] args) {
		Factory factory = new SouthFactory();
		Pizza pizza = factory.createPizza();
		Coffee coffee = factory.createCoffee();
		pizza.pizzaExpress();
		coffee.coffeeExpress();
	}
}

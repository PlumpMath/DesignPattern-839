package SingletonPattern;

public class main {
	public static void main(String[] args) {
		//IPizza iPizza = PizzaFactory.getInstance();
		//IPizza iPizza = LazyPizzaFactory.getInstance();
		IPizza iPizza1 = IoDHPizzaFactory.getInstance();
		IPizza iPizza2 = IoDHPizzaFactory.getInstance();
		
		System.out.println("iPizza1 is equal to iPizza2: " + (iPizza1 == iPizza2));
		//iPizza.display();
	}
}

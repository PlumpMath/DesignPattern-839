package SingletonPattern;

public class main {
	public static void main(String[] args) {
		IPizza iPizza = PizzaFactory.getInstance();
		iPizza.display();
	}
}

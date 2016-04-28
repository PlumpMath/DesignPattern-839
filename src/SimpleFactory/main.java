package SimpleFactory;

//SimpleFactory 相当于是封装创建，和封装创建的变化。
public class main {
	public static void main(String[] args) {
		Pizza pizza = SimplePizzaFactory.create("SouthPizza");
		pizza.express();
	}
}

package AbstractFactoryPattern;

public class NorthFactory implements Factory{

	@Override
	public Coffee createCoffee() {
		// TODO Auto-generated method stub
		return new NorthCoffee();
	}

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new NorthPizza();
	}

}

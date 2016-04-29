package AbstractFactoryPattern;

public class SouthFactory implements Factory{

	@Override
	public Coffee createCoffee() {
		// TODO Auto-generated method stub
		return new SouthCoffee();
	}

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new SouthPizza();
	}

}

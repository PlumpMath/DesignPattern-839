package FactoryMethodPattern;

public class SouthPizzaFactory implements PizzaFactory{

	@Override
	public Pizza create() {
		// TODO Auto-generated method stub
		return new SouthPizza();
	}

}

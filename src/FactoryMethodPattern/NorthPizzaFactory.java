package FactoryMethodPattern;

public class NorthPizzaFactory implements PizzaFactory{

	@Override
	public Pizza create() {
		// TODO Auto-generated method stub
		return new NorthPizza();
	}

}

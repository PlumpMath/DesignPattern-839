package DecoratorPattern;

public class ConcreteDecrator1 extends Decrator{
	public ConcreteDecrator1(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		concreteDecratorMethod1();
		this.component.operation();
	}

	private void concreteDecratorMethod1() {
		System.out.println("Use ConcreteDecrator1!");
	}
}

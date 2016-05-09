package DecoratorPattern;

public class ConcreteDecrator2 extends Decrator{
	public ConcreteDecrator2(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		concreteDecratorMethod2();
		this.component.operation();
	}

	private void concreteDecratorMethod2() {
		System.out.println("Use ConcreteDecrator2!");
	}
}

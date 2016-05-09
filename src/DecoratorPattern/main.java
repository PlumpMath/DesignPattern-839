package DecoratorPattern;

//注：装饰者和被装饰者应该继承同一个接口，如Component.
public class main {
	public static void main(String[] args) {
		Component component;
		component = new ConcreteComponent();
		component = new ConcreteDecrator1(component);
		component = new ConcreteDecrator2(component);
		component.operation();
	}
}

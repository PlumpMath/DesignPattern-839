package ObserverPattern;

public class ConcreteObserver2 implements Observer {
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteObserver2 update! Subject is:" + subject.getClass().getName());
	}
}

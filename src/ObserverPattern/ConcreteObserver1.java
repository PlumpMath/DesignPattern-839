package ObserverPattern;

public class ConcreteObserver1 implements Observer {
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteObserver1 update! Subject is:" + subject.getClass().getName());
	}
}

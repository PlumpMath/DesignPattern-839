package ObserverPattern;

public class main {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		//subject.removeObserver(observer1);
		subject.removeObserver(observer2);
		subject.notifyObservers();
	}
}

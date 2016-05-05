package ObserverPattern;

public class main {
	public static void main(String[] args) {
		Subject subject1 = new ConcreteSubject1();
		Subject subject2 = new ConcreteSubject2();
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		subject1.registerObserver(observer1);
		subject2.registerObserver(observer2);
		//subject.removeObserver(observer1);
		//subject2.removeObserver(observer2);
		subject1.notifyObservers();
		subject2.notifyObservers();
	}
}

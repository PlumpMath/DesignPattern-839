package ObserverPattern;

import java.util.ArrayList;

public class ConcreteSubject1 implements Subject{
	private ArrayList observers;
	
	public ConcreteSubject1() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Object observer : observers) {
			((Observer) observer).update(this);
		}
	}

}

package day3session2.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private boolean state = true;
	
	@Override
	public void attach(Observer o) {
		observers.add(o);

	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}

	@Override
	public void changeState() {
		state = !state;
		notifyUpdate(new Message("state changed to "+state));
	}
	
	
}
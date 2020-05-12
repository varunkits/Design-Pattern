package day3session2.observer;

public class MessageSubscriberOne implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}
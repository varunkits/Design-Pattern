package finalCheck.observer;

public interface INotificationService {

	void AddSubscriber(INotificationObserver iNotificationObserver);
	void RemoveSubscriber(INotificationObserver iNotificationObserver);
	void NotifySubscriber(String event);
	
}

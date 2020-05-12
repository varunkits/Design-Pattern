package practiceCheck.observer;

public class Main {

	public static void main(String[] args) {
		
		INotificationObserver steve = new SteveObserver("Steve");
		INotificationObserver john = new JohnObserver("John");
		
		
		NotificationService notificationService = new NotificationService();
		notificationService.AddSubscriber(john);
		notificationService.AddSubscriber(steve);
		
		notificationService.NotifySubscriber();
		
		notificationService.RemoveSubscriber(john);

	}

}

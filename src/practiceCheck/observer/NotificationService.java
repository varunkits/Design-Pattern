package practiceCheck.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<INotificationObserver> list = new ArrayList<>();
	@Override
	public void AddSubscriber(INotificationObserver iNotificationObserver) {
		list.add(iNotificationObserver);
		
		System.out.println("list of subs ->");
		for(INotificationObserver i:list)
			System.out.println(i);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver iNotificationObserver) {
		list.remove(iNotificationObserver);
		
		System.out.println("list of subs ->");
		for(INotificationObserver i:list)
			System.out.println(i);
	}

	@Override
	public void NotifySubscriber() {
		
		for(INotificationObserver i:list)
			i.OnServerDown("server's down");

	}

}

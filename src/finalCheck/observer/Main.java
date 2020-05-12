package finalCheck.observer;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		Map<String,Integer> eventTickets = new HashMap<String,Integer>();
		eventTickets.put("event1", 0);
		eventTickets.put("event2", 0);
		
		
		INotificationObserver admin1 = new Admin("admin1");
		INotificationObserver admin2 =new Admin("admin2");

		
		
		NotificationService notificationService = new NotificationService();
		notificationService.AddSubscriber(admin1);
		notificationService.AddSubscriber(admin2);
		
		
		
		for(int i =0 ; i < 500 ; i++)//for testing
		{
			eventTickets.put("event1",eventTickets.get("event1")+1);
			eventTickets.put("event2", eventTickets.get("event2")+2);
			for(Map.Entry<String,Integer> e : eventTickets.entrySet())
			{
				if(e.getValue()==100)
					notificationService.NotifySubscriber(e.getKey());
			}
		}
		notificationService.RemoveSubscriber(admin1);

	}

}

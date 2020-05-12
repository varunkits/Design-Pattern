package practiceCheck.observer;

public class SteveObserver implements INotificationObserver {

	String name;
	
	public SteveObserver(String name) {
		this.name = name;
	}

	@Override
	public void OnServerDown(String msg) {
		System.out.println(name+" "+msg);

	}

}

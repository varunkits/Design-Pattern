package practiceCheck.observer;

public class JohnObserver implements INotificationObserver{

	String name;
	
	public JohnObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void OnServerDown(String msg) {
		
		System.out.println(name+" "+msg);
	}

}

package finalCheck.observer;

public class Admin implements INotificationObserver{

	String name;
	
	public Admin(String name) {
		super();
		this.name = name;
	}
	@Override
	public void sendMail(String msg) {
		System.out.println(name+" "+msg);
		
	}

}

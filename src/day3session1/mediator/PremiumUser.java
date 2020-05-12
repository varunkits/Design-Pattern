package day3session1.mediator;

public class PremiumUser implements IUser {

	
	IChatMediator chatMediator = new ChatMediator();
	String name;
	

	public PremiumUser(IChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}
	
	@Override
	public void ReceiveMessage(String msg) {
		System.out.println(name);
		System.out.println(msg);
	}

	@Override
	public void sendMessage(String msg) {
		chatMediator.sendMessage(msg);

	}

}

package day3session1.mediator;

public class BasicUser implements IUser {

	IChatMediator chatMediator ;
	String name;
	
	public BasicUser(IChatMediator chatMediator, String name) {
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

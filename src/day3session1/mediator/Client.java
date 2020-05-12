package day3session1.mediator;

public class Client {

	public static void main(String[] args) {
		IChatMediator chatMediator = new ChatMediator();
		
		BasicUser basicUser1 = new BasicUser(chatMediator,"Varun");
		BasicUser basicUser2 = new BasicUser(chatMediator, "Deep");
		PremiumUser premiumUser1 = new PremiumUser(chatMediator, "Raj");
		
		chatMediator.addUser(basicUser1);
		chatMediator.addUser(premiumUser1);
		
		
		basicUser2.sendMessage("msg from bu2");


	}

}

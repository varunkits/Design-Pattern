package finalCheck.abstractFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println(OrderFactory.makeOrder(Channel.E_commerce_website,ProductType.Toys));
		System.out.println(OrderFactory.makeOrder(Channel.Tele_caller_Agents, ProductType.Electronics));

	}

}

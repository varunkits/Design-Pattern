package finalCheck.abstractFactory;

public class ToysOrder extends Order {

	public ToysOrder(Channel channel) {
		super(channel, ProductType.Toys);
		processOrder();
		
	}

	@Override
	void processOrder() {
		System.out.println("processing Toy via "+channel);
	}

}

package finalCheck.abstractFactory;

public class ElectronicOrder extends Order {

	public ElectronicOrder(Channel channel) {
		super(channel, ProductType.Electronics);
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Electronic order processing via "+ channel);
	}

}

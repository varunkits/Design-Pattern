package finalCheck.abstractFactory;

public class FurnitureOrder extends Order {

	public FurnitureOrder(Channel channel) {
		super(channel, ProductType.Furnitures);
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Processing Furniture order via "+channel);
		
	}

}

package finalCheck.abstractFactory;

public class OrderFactory {

	public static Order makeOrder(Channel channel, ProductType productType) {
		if(productType == ProductType.Toys)
			return new ToysOrder(channel);
		else if(productType == ProductType.Electronics)
			return new ElectronicOrder(channel);
		else if(productType == ProductType.Furnitures)
			return new FurnitureOrder(channel);
		else	
			return null;
	}

}

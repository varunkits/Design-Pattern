package finalCheck.abstractFactory;

public abstract class Order {

	Channel channel;
	ProductType productType;
	public Order(Channel channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}
	abstract void processOrder();
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	
}

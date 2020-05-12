package day2session1.adapter;
public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars; // standard constructors
	
	
	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	@Override 
	public double getSpeed() { 
		return convertMPHtoKMPH(luxuryCars.getSpeed()); 
	}
	
	@Override
	public double getPrice() {	
		return convertEurotoUSD(luxuryCars.getPrice());
	}
	private double convertEurotoUSD(double price) {
		return price * 1.5;
	}

	private double convertMPHtoKMPH(double mph) { 
		return mph * 1.60934; 
	}


}
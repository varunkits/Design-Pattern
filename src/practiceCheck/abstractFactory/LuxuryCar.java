package practiceCheck.abstractFactory;

public class LuxuryCar extends Car{

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to a luxuary car");
		
	}

}

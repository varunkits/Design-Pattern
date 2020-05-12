package practiceCheck.abstractFactory;

public class MicroCar extends Car{

	public MicroCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to a micro car");
		
	}

}
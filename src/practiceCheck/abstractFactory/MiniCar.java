package practiceCheck.abstractFactory;
public class MiniCar extends Car{

	public MiniCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to a mini car");
		
	}

}
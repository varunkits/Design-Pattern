package practiceCheck.abstractFactory;

public class CarFactory {

	public static Car buildCar(CarType type, Location location) {
			
			if(type == CarType.LUXURY)
				return new LuxuryCar(location);
			else if(type == CarType.MICRO)
				return new MicroCar(location);
			else if(type == CarType.MINI)
				return new MiniCar(location);
			else
				return null;
	}

}

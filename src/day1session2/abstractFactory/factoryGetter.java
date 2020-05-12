package day1session2.abstractFactory;
public class factoryGetter {

	public static Factory getFactory(String factory) {
		if (factory.equalsIgnoreCase("Audi"))
			return new AudiFactory();
		if (factory.equalsIgnoreCase("Mercedes"))
			return new MercedesFactory();
		return null;

	}
}
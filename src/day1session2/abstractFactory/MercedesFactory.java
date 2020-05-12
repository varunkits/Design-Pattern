package day1session2.abstractFactory;
public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
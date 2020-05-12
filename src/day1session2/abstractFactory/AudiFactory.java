package day1session2.abstractFactory;
public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}
       
 }
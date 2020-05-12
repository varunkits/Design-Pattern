package day1session2.abstractFactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			Factory factory = factoryGetter.getFactory("Audi");
			Headlight headLight=factory.makeHeadlight();
			Tire tire=factory.makeTire();
			System.out.println(tire.getClass().equals(AudiTire.class));
			System.out.println(headLight.getClass().equals(AudiHeadlight.class));
			
			factory = factoryGetter.getFactory("Mercedes");
			headLight=factory.makeHeadlight();
			tire=factory.makeTire();
			System.out.println(tire.getClass().equals(MercedesTire.class));
			System.out.println(headLight.getClass().equals(MercedesHeadlight.class));
	}
}
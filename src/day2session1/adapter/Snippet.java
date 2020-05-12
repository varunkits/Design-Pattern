package day2session1.adapter;

public class Snippet {

	public static void whenConvertingMPHToKMPH_thenSuccessfullyConverted() { 
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		System.out.println(bugattiVeyronAdapter.getSpeed());//should be 431303.
		System.out.println(bugattiVeyronAdapter.getPrice());//should be 900
	}
	public static void main(String[] args) {
		whenConvertingMPHToKMPH_thenSuccessfullyConverted();
	}
}


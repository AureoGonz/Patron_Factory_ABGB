package factory;

public class Exec {
	 public static void main(String[] args) {
		Mobile sansun = MobileFactory.createMobile(Mobile.SAMSUNG);
		Mobile ipon = MobileFactory.createMobile(Mobile.IPHONE);
		Mobile soni = MobileFactory.createMobile(Mobile.SONY);
		Mobile moto = MobileFactory.createMobile(Mobile.MOTOROLA);
		Mobile elege = MobileFactory.createMobile(Mobile.LG);
		Mobile hachetece = MobileFactory.createMobile(Mobile.HTC);
	}
}

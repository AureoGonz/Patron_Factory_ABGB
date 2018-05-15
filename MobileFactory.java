package factory;

public class MobileFactory {
	public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung(2,"Intel");
		}else if(type.equals(Mobile.MOTOROLA)){
			return new Motorola(16,"e4");
		}else if(type.equals(Mobile.LG)){
			return new LG("ARM Cortex A15",4,32);
		}else if(type.equals(Mobile.HTC)){
			return new HTC("M2",4,15);
		}else{
			return null;
		}
	}
}

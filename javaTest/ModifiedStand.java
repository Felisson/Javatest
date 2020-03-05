package javaTest;

public class ModifiedStand extends PearStand{

	public ModifiedStand(int cherriesPrice, int peachesPrice, int pearPrice) {
		super(cherriesPrice, peachesPrice, pearPrice);
		
		pear.setAvailability( Math.random()> 0.2 );		//20 percent chance to be unavailable
		peach.setAvailability(Math.random()> 0.2);
		cherry.setAvailability( Math.random()> 0.2 );
	}

	
	public String getCheapestAvailablePearComboFruits() {
		
		if(cherry.isAvailable && peach.isAvailable) {
			
			if(cherry.price > peach.price) {
				return pear.name + " and " + peach.name;
			} else {
				return pear.name + " and " + cherry.name;
			}
			
		}else if(cherry.isAvailable) {
			return pear.name + " and " + cherry.name;
		}else {
			return pear.name + " and " + peach.name;
		}
		
	}
	
	public int getCheapestAvailablePearComboPrice() {
		
		if(cherry.isAvailable && peach.isAvailable) {
			
			if(cherry.price > peach.price) {
				return pear.price + peach.price;
			} else {
				return pear.price + cherry.price;
			}
			
		}else if(cherry.isAvailable) {
			return pear.price + cherry.price;
		}else {
			return pear.price + peach.price;
		}
		
	}
	
	
	
}

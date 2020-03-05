package javaTest;

public class PearStand extends FruitStand{

	protected Fruit pear;
	
	public PearStand(int cherriesPrice, int peachesPrice, int pearPrice) {
		super(cherriesPrice, peachesPrice);
		pear = new Fruit("pear", pearPrice);
		
	}
	
	
	public int getCheapestPearComboPrice() {
		if(cherry.price > peach.price) {
			return pear.price + peach.price;
		} else {
			return pear.price + cherry.price;
		}
	}
	public String getCheapestPearComboFruits() {
		if(cherry.price > peach.price) {
			return pear.name + " and " + peach.name;
		} else {
			return pear.name + " and " + cherry.name;
		}
	}
}

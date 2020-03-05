package javaTest;


public class FruitStand {
	protected Fruit cherry;
	protected Fruit peach;

	public FruitStand(int cherriesPrice, int peachesPrice) {

		cherry = new Fruit("cherry", cherriesPrice);
		peach = new Fruit("peach", peachesPrice);
		
	}
	public int getTotalPrice() {
		int total = cherry.price + peach.price;
		return total;
	}
}

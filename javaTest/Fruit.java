package javaTest;

public class Fruit{
	protected int price;
	protected String name;
	protected boolean isAvailable;


	public Fruit(String name, int price) {
		this.price = price;
		this.name = name;
		
	}
	
	public void setAvailability(boolean availability){ 
        this.isAvailable = availability;
    }

}

package javaTest;

import java.util.*;

public class FruitProblem {

	public static void main(String[] args) {
				
		//task 1 show stand
		
		ArrayList<ModifiedStand> stands = new ArrayList<ModifiedStand>();
		
		stands.add( new ModifiedStand(10, 15, 10) );
		stands.add( new ModifiedStand(20, 12, 10) );
		stands.add( new ModifiedStand(14, 11, 10) );
		stands.add( new ModifiedStand(11, 20, 10) );
		stands.add( new ModifiedStand(9, 19, 10) );
		
		int lowestCurrentPrice = stands.get(0).getTotalPrice();
		int indexLowestStand = 1;
		
		int index = 1;
		for(ModifiedStand stand : stands) {
			
			if(stand.getTotalPrice() < lowestCurrentPrice) {
				indexLowestStand = index;
				lowestCurrentPrice = stand.getTotalPrice();
			}
			index++;
		}
		
		System.out.println("The fruit stand with the lowest total is number: " + indexLowestStand);
		
		//task 2 show stand and cost
		
		System.out.println("The fruit stand with the lowest total is number: " + indexLowestStand + " with cost " + lowestCurrentPrice);
		
		//task 3 show stand, cost and which fruits
		
		indexLowestStand = 1;
		lowestCurrentPrice = 0;
		String fruitNames = "";
		
		index = 1;
		
		for(ModifiedStand stand : stands) {

			
			int comboPrice = stand.getCheapestPearComboPrice();
			
			if(index == 1 || comboPrice < lowestCurrentPrice) {
				indexLowestStand = index;				
				lowestCurrentPrice = comboPrice;
				fruitNames = stand.getCheapestPearComboFruits();
			}
			index++;
		}
		
		System.out.println("The fruit stand with the lowest total is number: " 
							+ indexLowestStand + " with cost " + lowestCurrentPrice + " and fruits: " + fruitNames);
		
		
		//test 4 show stand, cost, fruits and how many stands 
		
		indexLowestStand = 1;
		lowestCurrentPrice = -1;
		fruitNames = "";
		
		index = 1;
		
		
		
		for(ModifiedStand stand : stands) {
			
			// check if any pear combo is possible
			if(!stand.pear.isAvailable || !(stand.peach.isAvailable && stand.cherry.isAvailable)) {
				index++;
				continue;
			}
			
			int comboPrice = stand.getCheapestAvailablePearComboPrice();
			
			if(lowestCurrentPrice < 0 || comboPrice < lowestCurrentPrice) {
				indexLowestStand = index;
				lowestCurrentPrice = comboPrice;
				fruitNames = stand.getCheapestAvailablePearComboFruits();
			}
			index++;
		}
		
		stands.removeIf(stand -> ( !stand.pear.isAvailable ) || 
								   !(stand.peach.isAvailable && stand.cherry.isAvailable));
		
		if(lowestCurrentPrice == -1) {
			System.out.println("No fruitstand could offer pears and one other fruit");
		}else {
			System.out.println("The fruit stand with the lowest total is number: " 
					+ indexLowestStand + " with cost " + lowestCurrentPrice + " and fruits: " + fruitNames 
					+ " and the number of stands the selection was made from is " + stands.size() );
		}
		
		
	}
	
}

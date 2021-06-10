package com.perscholas.CafeExercises;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CafeMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		Product coffee =  new Product();
		coffee.setName("coffee");
		
		Product espresso = new Product();
		espresso.setName("espresso");
		
		Product cappuccino = new Product();
		cappuccino.setName("cappuccino");
		
		coffee.setDescription("A standard coffee drink.");
		coffee.setPrice(2.00);
		
		espresso.setDescription("For those that need that extra boost.");
		espresso.setPrice(3.00);
		
		cappuccino.setDescription("Feeling a little fancy?");
		cappuccino.setPrice(4.50);
		
		System.out.print("How many orders of a coffee do you want?: ");
		coffee.setQuantity(input.nextInt());
		ordering(coffee);
		double coffeeSubtotal = coffee.calculateProductTotal();
		
		System.out.print("How many orders of an espresso do you want?: ");
		espresso.setQuantity(input.nextInt());
		ordering(espresso);
		double espressoSubtotal = espresso.calculateProductTotal();
		
		System.out.print("How many orders of a cappuccino do you want?: ");
		cappuccino.setQuantity(input.nextInt());
		ordering(cappuccino);
		double cappuccinoSubtotal = cappuccino.calculateProductTotal();
		
		input.close();
		
		// Stored the calculating values to variables for cleaner printing statement
		double salesTaxRate = 0.1;
		double orderSubTotals = coffeeSubtotal + espressoSubtotal + cappuccinoSubtotal;
		double salesTaxTotal = orderSubTotals * salesTaxRate;
		double orderTotal = orderSubTotals + salesTaxTotal;
		
		System.out.println("The subtotal for your entire order is: " + 
		(orderSubTotals) +
		". The sales tax rate is at 10%. The total sales tax is: " +
		df.format(salesTaxTotal) +
		". Your total is going to be: $" + df.format(orderTotal));
		
	}
	
	static void ordering(Product obj) {
		System.out.println("Here is the " + obj.getName() + 
				" you ordered. " + obj.getDescription() + 
				" The subtotal for the " + obj.getName() + " is: $" + obj.calculateProductTotal() + "\n");
	}
	

}

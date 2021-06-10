package com.perscholas.CafeExercises;
import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
		System.out.println("Here is the " + coffee.getName() + 
				" you ordered. " + coffee.getDescription() + 
				" The subtotal for the coffees is: $" + coffee.calculateProductTotal() + "\n");
		
		System.out.print("How many orders of an espresso do you want?: ");
		espresso.setQuantity(input.nextInt());
		System.out.println("Here is the " + espresso.getName() + 
				" you ordered. " + espresso.getDescription() + 
				" The subtotal for espressos is: $" + espresso.calculateProductTotal() + "\n");
		
		System.out.print("How many orders of a cappuccino do you want?: ");
		cappuccino.setQuantity(input.nextInt());
		System.out.println("Here is the " + cappuccino.getName() + 
				" you ordered. " + cappuccino.getDescription() + 
				" The subtotal for cappuccinos is: $" + cappuccino.calculateProductTotal() + "\n");
		
		input.close();
		
		System.out.println("The subtotal for your entire order is: " + 
		(coffee.calculateProductTotal() + espresso.calculateProductTotal() + cappuccino.calculateProductTotal()) +
		". The sales tax rate is at 10%. The total sales tax is: " +
		((coffee.calculateProductTotal() + espresso.calculateProductTotal() + cappuccino.calculateProductTotal()) * .1) +
		". Your total is going to be: $");
		
	}

}

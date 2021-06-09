package com.perscholas.CafeExercises;

public class Product {
	private String name;
	private double price;
	private String description;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	// Names
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Prices
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	// Descriptions
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Quantities
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double calculateProductTotal() {
		return quantity * price;
	}
	
	
}

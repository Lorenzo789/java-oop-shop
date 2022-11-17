package generation.italy.shop;

import java.util.Random;

public class Product {
	
	int code;
	String name;
	String description;
	int price;
	int iva;
	
	public Product(String name, String description, int price) {
		
		this.name = name;
		this.description = description;
		this.price = price;
		
		Random rnd = new Random();
		
		int randomCode = 0;
		
		randomCode = rnd.nextInt(10000,99999);

		code = randomCode;
		iva = 20;
	}
	
	public int getPrice() {
		
		return price;
	}
	
	public int totalPrice() {
		
		int ivaPrice = (price * iva) / 100;
		
		int totalPrice = ivaPrice + price;
		
		return totalPrice;
	}
	
	
	@Override
	public String toString() {

		return "Name: " + name + "\n" 
				+ "Description: " + description + "\n"
				+ "Price: " + price + "\n"
				+ "Price plus iva: " + totalPrice() + "\n"
				+ "Code Number: " + code + "\n";
	}
}

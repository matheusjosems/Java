package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product();
		
		System.out.println("enter the product data: ");
		System.out.println("name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Eneter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}

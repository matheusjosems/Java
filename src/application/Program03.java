package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		
		System.out.println();
		System.out.println("Name: ");
		employee.Name = sc.nextLine();
		
		System.out.println("Gloss Salary: ");
		employee.GlossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println(employee.Name + ", "+ employee.GlossSalary);
		
		System.out.println("Which percentage to increase salary ? ");
		employee.Tax = sc.nextDouble();

		

		
		
		
		sc.close();
	}

}

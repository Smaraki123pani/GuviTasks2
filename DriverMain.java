
//Create Interface Taxable with members sales Tax=7% and income Tax=10.5% 
//create abstract method calcTax().
//a) Create class Employee(empld,name, salary) and implement Taxable to calculate income Tax on yearly salary.
//b) Create class Product(pid, price,quantity) and implement Taxable to calculate sales Tax on unit price of product.
//c) Create class for main method(Say DriverMain), accept employee information and a product information from user 
//and print income tax and sales tax respectively.

package com.demo.task.three;

import java.util.Scanner;

interface Taxable {
	double salesTax = 0.07;
	double incomeTax = 0.105;

	double calcTax();
}

class Employee implements Taxable {
	int empId;
	String name;
	double salary;

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public double calcTax() {
		return salary * incomeTax;
	}
}

class Product implements Taxable {
	private int productId;
	private double price;
	private int quantity;

	public Product(int productId, double price, int quantity) {
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public double calcTax() {
		return price * salesTax * quantity;
	}
}

public class DriverMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Information:");
		System.out.print("Employee ID: ");
		int empId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Employee Name: ");
		String empName = scanner.nextLine();
		System.out.print("Employee Salary: ");
		double empSalary = scanner.nextDouble();

		Employee employee = new Employee(empId, empName, empSalary);
		System.out.println("Income Tax for " + empName + ":₹" + employee.calcTax());

		System.out.println("\nEnter Product Information:");
		System.out.print("Product ID: ");
		int productId = scanner.nextInt();
		System.out.print("Product Price: ");
		double productPrice = scanner.nextDouble();
		System.out.print("Product Quantity: ");
		int productQuantity = scanner.nextInt();

		Product product = new Product(productId, productPrice, productQuantity);
		System.out.println("Sales Tax for Product ID " + productId + ":₹" + product.calcTax());

		scanner.close();
	}
}

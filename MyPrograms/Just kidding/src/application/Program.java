package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.entities.Account;
import model.entities.Products;
import model.services.PaymentMethod;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy");
		
		
		System.out.println("WELCOME!!");
		System.out.println("Do you have a registration? (y/n)");
		char response = sc.next().charAt(0);

		if (response == 'n') {
			System.out.println("Create your account");
			System.out.println();
			System.out.println("What is your name?");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("What is your birth date? (dd/mm/yyyy)");
			Date birthDate = sdf.parse(sc.next());
			System.out.println();
			System.out.println("OBS: Your Login must contain only numbers");
			System.out.print("Choose your login: ");
			int login = sc.nextInt();
			System.out.println();
			System.out.println("OBS: Your password must contain only numbers");
			System.out.print("Choose your password: ");
			int password = sc.nextInt();
			Account account = new Account(name, birthDate, login, password);
			account.addAccount(account);
			System.out.println(account);
		} else {
			System.out.println("Enter your login: ");
			int login = sc.nextInt();
			System.out.println("Enter your password: ");
			int password = sc.nextInt();
			Account account1 = new Account(login, password);
			account1.addAccount(account1);
		}

		System.out.println("Welcome to our online sales website !! ");
		System.out.println();
		System.out.println("Here you find everything you need!! ");
		System.out.println();
		System.out.println("Here is our list of products!! ");
		System.out.println();

		List<Products> product = new ArrayList<>();

		String path = "C:\\Workspace\\products.TXT";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("how many products do you want to add to your list?");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("Choice your products: ");
		System.out.println("According to the numbers in front of the products: ");
		System.out.println();

		List<Double> paymentMethod = new ArrayList<>();
		double sum = 0;
		
		for (int i=1; i<=n; i++) {

			int np = sc.nextInt();
			if (np == 1) {
				double p1 = 400.00;
				paymentMethod.add(p1);
				sum += 400.00;
				System.out.print("One notebook, ");
			}
			if (np == 2) {
				double p2 = 500.00;
				paymentMethod.add(p2);
				sum += 500.00;
				System.out.print("One computer, ");
			}
			if (np == 3) {
				double p3 = 80.00;
				paymentMethod.add(p3);
				sum += 80.00;
				System.out.print("One monitor, ");
			}
			if (np == 4) {
				double p4 = 40.00;
				paymentMethod.add(p4);
				sum += 40.00;
				System.out.print("One mouse, ");
			}
			if (np == 5) {
				double p5 = 60.00;
				paymentMethod.add(p5);
				sum += 60.00;
				System.out.print("One keyboard, ");
			}
			if (np == 6) {
				double p6 = 550.00;
				paymentMethod.add(p6);
				sum += 550.00;
				System.out.print("One iphone, ");
			}
			if (np == 7) {
				double p7 = 450.00;
				paymentMethod.add(p7);
				sum += 450.00;
				System.out.print("One samsung, ");
			}
			if (np == 8) {
				double p8 = 400.00;
				paymentMethod.add(p8);
				sum += 400.00;
				System.out.print("One xiaomi ");
			}
			if (np == 9) {
				double p9 = 300.00;
				paymentMethod.add(p9);
				sum += 300.00;
				System.out.print("One motorola, ");
			}
			if (np == 10) {
				double p10 = 500.00;
				paymentMethod.add(p10);
				sum += 500.00;
				System.out.print("One smart TV, ");
			}
			if (np == 11) {
				double p11 = 800.00;
				paymentMethod.add(p11);
				sum += 800.00;
				System.out.print("One TV 4K, ");
			}
			if (np == 12) {
				double p12 = 150.00;
				paymentMethod.add(p12);
				sum += 150.00;
				System.out.print("One home theater, ");
			}
			if (np == 13) {
				double p13 = 100.00;
				paymentMethod.add(p13);
				sum += 100.00;
				System.out.print("One DVD, ");	
			}
			if (np == 14) {
				double p14 = 850.00;
				paymentMethod.add(p14);
				sum += 850.00;
				System.out.print("One fridge, ");
			}
			if (np == 15) {
				double p15 = 700.00;
				paymentMethod.add(p15);
				sum += 700.00;
				System.out.print("One washing machine, ");
			}
			if (np == 16) {
				double p16 = 150.00;
				paymentMethod.add(p16);
				sum += 150.00;
				System.out.print("One oven, ");
			}
			if (np == 17) {
				double p17 = 200.00;
				paymentMethod.add(p17);
				sum += 200.00;
				System.out.print("One cooker, ");
			} 
			if(np == 18){
				double p18 = 150.00;
				paymentMethod.add(p18);
				sum += 150.00;
				System.out.print("One microwave, ");
			}
		}
		System.out.println();
		System.out.println("Total value: " + sum);
		System.out.println("Products price: " + paymentMethod);
		System.out.println();
		
		System.out.println("What will be the payment method? (c/b) ");
		char r = sc.next().charAt(0);
		
		if( r == 'c') {
			System.out.println("Enter your credit card number: ");
			int creditCardNumber = sc.nextInt();
			System.out.println("Enter card expiration date: ");
			Date cardExpirationDate = sdf1.parse(sc.next());
			System.out.println("Enter card code: ");
			int cardCode = sc.nextInt();
		}
		else {
			
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

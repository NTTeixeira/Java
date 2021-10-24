package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Product> set = new HashSet<>();

		System.out.println("How many students for course A? ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			int numberID = sc.nextInt();
			set.add(new Product(numberID));
		}

		System.out.println("How many students for course B? ");
		int b = sc.nextInt();
		for (int i = 1; i <= b; i++) {
			int numberID = sc.nextInt();
			set.add(new Product(numberID));
		}

		System.out.println("How many students for course C? ");
		int c = sc.nextInt();
		for (int i = 1; i <= c; i++) {
			int numberID = sc.nextInt();
			set.add(new Product(numberID));
		}
		
		System.out.println("Total students: " + set.size());
		sc.close();
	}

}

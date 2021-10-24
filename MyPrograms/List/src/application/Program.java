package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Information;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Information> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Information(id, name, salary));
		}

		System.out.println();
		System.out.println("Enter the employee id that will have salaty increase: ");
		int id = sc.nextInt();
		Information emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Information obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	private static boolean hasId(List<Information> list, int id) {
		Information emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	    return emp != null;
	}

}

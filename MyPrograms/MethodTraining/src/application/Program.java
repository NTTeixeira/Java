package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Data;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Data> emp = new ArrayList<>();
		
		System.out.println("Quantos funcionários você quer registrar?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + ":");
			
			System.out.print("Id:");
			int id = sc.nextInt();
			
			while(has) {
				
			}
			
			System.out.print("Name:");
			sc.next();
			String name = sc.nextLine();
			
			System.out.println("Salary:");
			double salary = sc.nextDouble();
			
			Data employee = new Data(id, name, salary);
			emp.add(employee);
		}
				
		sc.close();
	}

}

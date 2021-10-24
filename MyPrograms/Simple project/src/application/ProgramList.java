package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.InformationList;

public class ProgramList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<InformationList> list = new ArrayList<>();
		
		String path = "C:\\Users\\natha\\OneDrive\\Documentos\\Nathan\\Workspace\\Utilitários\\employee.TXT";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				String[] fields = line.split(", ");
 				list.add(new InformationList(Integer.parseInt(fields[0]), fields[1], Double.parseDouble(fields[2])));
		        line = br.readLine();	
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

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
			list.add(new InformationList(id, name, salary));
		}

		System.out.println();
		System.out.println("Enter the employee id that will have salaty increase: ");
		int id = sc.nextInt();
		InformationList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (InformationList obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	private static boolean hasId(List<InformationList> list, int id) {
		InformationList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	    return emp != null;
	}

}

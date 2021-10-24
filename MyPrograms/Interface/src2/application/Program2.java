package application;

import java.util.Scanner;

import model.entities.Person;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome? ");
		String name = sc.nextLine();
		System.out.print("Quanto você ganha por mês? ");
		Double salaryMonth = sc.nextDouble();
		System.out.print("Quantos meses? ");
		Double count = sc.nextDouble();
		
		Person person = new Person(name, salaryMonth, count);
		
		person.salary(salaryMonth, count);
		
		System.out.println(person);
		
		sc.close();
	}

}

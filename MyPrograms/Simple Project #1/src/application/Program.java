package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ReservationData;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("How many rooms will be rented?");
		
		int n = sc.nextInt();
		
		ReservationData[] vect = new ReservationData[10];
		
		for(int i=1; i<=n; i++) {
			System.out.println("Rent#" + i + ":");
			System.out.println("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("E-mail:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			vect[room] = new ReservationData(name, email);
		}
		
		for(int i=0; i < 10; i++) {
			if(vect[i] != null){
				System.out.println(i+ ":" + vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}


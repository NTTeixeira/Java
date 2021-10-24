package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você quer calcular a área de qual figura? ");
		String figura = sc.next();
		
		if(figura.equals("retangulo")) {
			Suplement.rectancle();
		}
		if(figura.equals("triangulo")) {
			Suplement.triangle();
		}
		if(figura.equals("circulo")) {
			Suplement.circle();
		}
		if(figura.equals("trapezio")) {
			Suplement.trapeze();
		}
		if(figura.equals("quadrado")) {
			Suplement.square();
		}
		if(figura.equals("losango")) {
			Suplement.lozenge();
		}
			
		sc.close();
	}

}

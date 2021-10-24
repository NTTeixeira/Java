package application;

import java.util.Scanner;

import model.entities.Area;

public class Suplement {

	static Scanner sc = new Scanner(System.in);

	public static void rectancle() {

		System.out.print("Digite a altura: ");
		Double altura = sc.nextDouble();
		System.out.print("Digite a base: ");
		Double base = sc.nextDouble();
		Area rec = new Area(altura, base);
		Double area = rec.calculationRec(altura, base);
		System.out.println("A área do retângulo é de: " + area);
	}
	
	public static void triangle() {

		System.out.print("Digite a altura: ");
		Double altura = sc.nextDouble();
		System.out.print("Digite a base: ");
		Double base = sc.nextDouble();
		Area rec = new Area(altura, base);
		Double area = rec.calculationTri(altura, base);
		System.out.println("A área do retângulo é de: " + area);
	}
	
	public static void trapeze() {

		System.out.print("Digite a altura: ");
		Double altura = sc.nextDouble();
		System.out.print("Digite a base maior: ");
		Double baseMa = sc.nextDouble();
		System.out.print("Digite a base menor: ");
		Double baseMe = sc.nextDouble();
		Area rec = new Area(baseMa, baseMe, altura);
		Double area = rec.calculationTra(baseMa, baseMe, altura);
		System.out.println("A área do retângulo é de: " + area);
	}

	public static void circle() {

		System.out.print("Digite o raio: ");
		Double raio = sc.nextDouble();
		Area rec = new Area(raio);
		Double area = rec.calculationCir(raio);
		System.out.println("A área do circulo é de: " + area);
	}

	public static void square() {

		System.out.print("Digite o lado: ");
		Double side = sc.nextDouble();
		Area rec = new Area(side);
		Double area = rec.calculationSqu(side);
		System.out.println("A área do quadrado é de: " + area);
	}
	
	public static void lozenge() {

		System.out.print("Digite a diagonal maior: ");
		Double baseMa = sc.nextDouble();
		System.out.print("Digite a diagonal menor: ");
		Double baseMe = sc.nextDouble();
		Area rec = new Area(baseMa, baseMe);
		Double area = rec.calculationLoz(baseMa, baseMe);
		System.out.println("A área do quadrado é de: " + area);
	}

}

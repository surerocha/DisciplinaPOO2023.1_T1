package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double ang, alt, escada, radiano;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ângulo: ");
		ang=sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		alt=sc.nextDouble();
		
		radiano = ang * 3.14 / 180;
		escada = alt / Math.sin (radiano); //Está dando erro nesse cálculo da escada.
		
		System.out.println("A medida da escada são "+radiano+" metros.");
		System.out.println("A medida da escada são "+escada+" metros.");
	}

}

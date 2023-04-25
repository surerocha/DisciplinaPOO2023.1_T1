package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1=sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2=sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3=sc.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
       
		System.out.println("A média é "+media);
	}

}

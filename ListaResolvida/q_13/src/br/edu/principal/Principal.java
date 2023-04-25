package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pes, polegadas, jardas, milhas;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite o valor de pés: ");
		pes=sc.nextDouble();
		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		System.out.println("Com essa quantidade de pés obtemos "+polegadas+" polegadas, "+jardas+" jardas e "+milhas+" milhas.");
		
	}

}

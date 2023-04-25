package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, peso1, peso2, peso3;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota 1: ");
        nota1=sc.nextDouble();
        
        System.out.println("Digite o peso da nota 1: ");
        peso1=sc.nextDouble();
        
        System.out.println("Digite sua nota 2: ");
        nota2=sc.nextDouble();
        
        System.out.println("Digite o peso da nota 2: ");
        peso2=sc.nextDouble();
        
        System.out.println("Digite sua nota 3: ");
        nota3=sc.nextDouble();
        
        System.out.println("Digite o peso da nota 3: ");
        peso3=sc.nextDouble();
        
        double MediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/(peso1+peso2+peso3);
        
        System.out.println("Sua m�dia foi: "+ MediaPonderada);
	}

}

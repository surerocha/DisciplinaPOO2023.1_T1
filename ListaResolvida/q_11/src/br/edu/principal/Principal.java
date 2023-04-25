package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num;
	double quad;
	double cubo; 
	double r2;
	double r3;

Scanner sc = new Scanner ( System.in); 
System.out.println("Qual número você deseja para realizaar as seguintes opeações?  " +  " \nPotência ao quadrado; \nPotência ao cubo; \nRaíz quadrda; \nRáiz cúbica."); 
	 num = sc.nextInt();

	//Calculo Potência ao quadrado: 
	
	 quad = (double) Math. pow(num,2);
	 System.out.println ("Os resultado da potência ao quadrado é: " + quad); 
     cubo = (double) Math. pow(num,3); 
     System.out.println ("Os resultado da potência ao cubo é: " + cubo); 
     r2 = (double) Math. sqrt(num);
     System.out.println ("Os resultado da raiz quadrada é: " + r2); 
     r3 = (double) Math. cbrt(num);
     System.out.println ("Os resultado da raiz cúbica é: " + r3); 
}
	}
}
	     
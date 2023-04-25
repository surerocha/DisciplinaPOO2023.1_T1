package br.ed.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	double custo_esp;
	double p_convite; 
	double qtd_conv;
	
	 //RECEBER VARIÁVEIS
	
	Scanner sc = new Scanner (System.in);

	System.out.println("Digite o custo total do espetáculo: ");
	custo_esp = sc.nextDouble();
	
	System.out.println("Digite o preço do ingresso para o espetáculo: ");
	p_convite = sc.nextDouble();
	
    // CÁLCULOS
 
	qtd_conv = custo_esp / p_convite; 
	System.out.println("Quantidade necessária de convites vendidos para cobrir o custo do spetáculo: " + qtd_conv);
	
	}
}

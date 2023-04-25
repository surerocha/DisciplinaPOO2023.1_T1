package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do salário mínimo? ");
		vlr_sal=sc.nextDouble();
		
		System.out.println("Qual a quantidade de quilowatts consumida pela residência? ");
		qtd_kw=sc.nextDouble();
		
		vlr_kw = vlr_sal / 5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * 15/100;
		vlr_desc = vlr_reais - desc;
		
		System.out.println("Cada quilowatt vale R$"+vlr_kw+" .");//permanece esse ponto no final?
		System.out.println("O valor a ser pago pela residência é de R$"+vlr_reais+" .");
		System.out.println("O valor a ser pago com o desconto de 15% é de R$"+vlr_desc+" .");
		
	}

}

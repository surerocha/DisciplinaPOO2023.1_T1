package br.edu.principal;
import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {
	
	//RECEBER VALORES: 
	
	Scanner sc = new Scanner (System.in);
	System.out.println ("Digite o preço de fábrica do veículo:  ");
	double p_fabr = sc.nextDouble ();
	
	
	System.out.println ("Digite o percentual de lucro do distribuidor do vepiculo:  ");
	double perc_d = sc.nextDouble ();

	System.out.println ("Digite o percentual de impostos aplicados pela fábrica: ");
	double perc_i= sc.nextDouble();
	
	//CÁLCULOS: 
	
	double vlr_d = p_fabr * (perc_d/100);
	System.out.println ("Este é o valor correspondente ao lucro da distribuidora do véculo: " + vlr_d);
	
	double vlr_i = p_fabr * (perc_i/100);
	System.out.println ("Este é o valor correspondente aos impostos do veículo: " + vlr_i);
	
	double p_final = p_fabr + vlr_d + vlr_i;
	System.out.println ("Este é o valor correspondente ao preço final do véculo é: " + p_final);
	
	}
}

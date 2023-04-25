package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
      System.out.println ("Calculo da distância que a escada deve estar da parede para pendurar um quadro");
     
      //RECEBER VARIÁVEIS
      
      Scanner sc = new Scanner (System.in);
	  
      System.out.println("\nDigite a altura da escada utilizada: ");
      double tam_escada = sc.nextDouble();
	
      System.out.println("\nDigite a altura que você deseja pendurar o quadro: "); 
      double alt_quadro = sc.nextDouble();
	
      // CALCULAR DISTÂNCIA ESCADA
     
     if (alt_quadro > tam_escada) {
    	 System.out.println("Compre uma escada maior.");
     }
     else {
    	 double dist_esc = (Math.pow(tam_escada, 2) - Math.pow(alt_quadro, 2));
         dist_esc =  Math.sqrt(dist_esc);
         System.out.println( "\nA distância que a escada deve estar da parede é: " + dist_esc);
     }
     
     
      }
}

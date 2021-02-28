package Lista2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		
		System.out.println("Digite um numero:");
		numero = entrada.nextInt();
		double raiz = Math.sqrt(numero);
		double  quadrado = (numero*numero);
		
		if (numero%2==0)
		
		{
			System.out.println("Esse numero é par");
			System.out.printf("A raiz quadrada desse numero é %2f:" ,raiz);
			
					
		}else {
			System.out.println("Esse número é ímpar.");	
			System.out.printf("Esse número elevado ao quadrado é: %2f " ,quadrado);
		
	}
	}
}

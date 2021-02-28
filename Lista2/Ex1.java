package Lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		
		int numero1, numero2, numero3, maior;
		
		
		System.out.println("Digite o primeiro numero:");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero:");
		numero2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		numero3 = entrada.nextInt();
		
		if ((numero1>numero2) && (numero1>numero3))
		{
		maior = numero1;
		System.out.printf("\nO maior numero é %d" ,numero1);
		
		} else if  ((numero2>numero1) && (numero2>numero3))
		{
			maior = numero2;	
		System.out.printf("\nO maior numero é %d" ,numero1);
		
		} else if ((numero3>numero1) && (numero3>numero2))
		{
		maior = numero3;			
		System.out.printf("\nO maior numero é %d" ,numero3);
		
		}
		
		
	}									
				
				
			
}

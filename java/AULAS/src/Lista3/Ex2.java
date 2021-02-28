package Lista3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero,contador=0, contador2=0;
		
		for ( int x=0;x<10;x++) {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			
			
			if (numero%2==0) {
				contador++;
			}else {
				contador2++;
			}
			
			
		}
		System.out.printf("A quantidade de números pares é: %d\n" ,contador);
		System.out.printf("A quantidade de números impares é: %d\n" ,contador2);
	}
	

}

package LISTA1;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
			
	
	int anos, meses, dias, diasDeVida;
	System.out.println("Digite seus dias de vida: ");
	diasDeVida = entrada.nextInt();
		
	anos = (diasDeVida/365);
	meses = (diasDeVida%365 )/30;
	dias = (diasDeVida%365)/30;
	
	System.out.printf("Você tem: %d anos, %d meses, %d dias ", anos,meses,dias );
		
		
		
				
		
		
		
		

}

}
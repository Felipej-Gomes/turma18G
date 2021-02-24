package LISTA1;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int segundosEvento, horas, minutos, segundos;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		segundosEvento = entrada.nextInt();
		
		horas = segundosEvento/3600;
		minutos	= (segundosEvento%3600)/60;
		segundos = (segundosEvento%3600)/60;
		
		System.out.printf("A duração foi de: %d horas, %d minutos, %d segundos" ,horas,minutos,segundos);
	}

}

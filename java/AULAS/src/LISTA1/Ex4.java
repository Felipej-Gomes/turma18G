package LISTA1;
import java.util.Scanner;


public class Ex4 {
	public static void main(String[] args) {
		
		int a,b,c,d,s,r;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		System.out.println("Digite o valor de C: ");
		c = entrada.nextInt();
		s = (int) ((b+c)+Math.sqrt(2));
		r = (int) ((a+b)+Math.sqrt(2));
		d = (int) (r+s)/2;
		System.out.printf("Seu resultado é: %d" ,d);
		

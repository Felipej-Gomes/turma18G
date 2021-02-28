package Lista3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade=0, contatador21=0, contador50=0;
		
		while(idade != -99){
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();
			
			if(idade<21) {
				contatador21++;
		
			}else if (idade >50);{
				contador50++;
	}
		}
		
System.out.printf("O numero de pessoas com menos de 21: %d\n O numero de pessoasl com mais de 50: %d " , contatador21-1, contador50-1);
	}
	}	
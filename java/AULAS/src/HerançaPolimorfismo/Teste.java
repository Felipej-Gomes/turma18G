package Heran�aPolimorfismo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char  opcao;
		
		System.out.println("Digite o animal escolhido:\n 1- Cachorro\n 2-Cavalo\n 3- Pregui�a\n" );
		opcao = leia.next().charAt(0);
		
		if(opcao=='1') {
			Cachorro nico  = new Cachorro("nome", 10);
			System.out.println("Voc� chamou o Nico:");
			System.out.println("Ele");
			nico.acao();
			System.out.println("E");
			nico.som();
			
					
		}else if(opcao=='2') {
			Cavalo Alfredo  = new Cavalo("nome", 10);
			System.out.println("Voc� chamou o Alfredo:");
			System.out.println("Ele");
			Alfredo.acao();;
			System.out.println("E");
			Alfredo.som();
			
		}else if(opcao=='3') {
			Pregui�a Felipe = new Pregui�a("nome" ,1);
			System.out.println("Voc� chamou o Felipe");
			System.out.println("Ele");
			Felipe.acao();
			System.out.println("E");
			Felipe.som();
		}
		
		
			
			
		

	}

}

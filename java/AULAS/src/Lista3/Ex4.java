package Lista3;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		int pessoas=0, idade=0, maior40=0, menor18=0;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0,outrosCalmos=0;
		char emocoes, sexo, sair;
		
		while(pessoas<=150) {
			System.out.println("Digite seu nome:");
			nome = entrada.next();
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();
			System.out.println("Digite uma das opções: 1- Feminino/ 2- Masculino/ 3- Outros");
			sexo = entrada.next().toUpperCase().charAt(0);
			System.out.println("Você se considera uma pessoa: 1- Calma/ 2-Nervosa/ 3- Agressiva");
			emocoes = entrada.next().toUpperCase().charAt(0);
			System.out.println("Deseja sair? S-Sim ou N-Não");
			sair = entrada.next().toUpperCase().charAt(0);
			if(sair == 's');
			System.out.println("Obrigado pela pesquisa");
			
			if (emocoes == '1') {
				pessoasCalmas = pessoasCalmas + 1;
			}

			if (sexo == '1' && emocoes == '2') {
				mulheresNervosas = mulheresNervosas + 1;

			}
			if (sexo == '2' && emocoes == '3') {
				homensAgressivos = homensAgressivos + 1;
			}
			if (sexo == '3' && emocoes == '1') {
				outrosCalmos = outrosCalmos + 1;
			}
			if (idade >= 40 && emocoes == '2') {
				maior40 = maior40 + 1;
			}
			if (idade < 18 && emocoes == '1') {
				menor18 = menor18 + 1;
			}
			pessoas++;
	}
		System.out.printf("O número de pessoas calmas:%d\n", pessoasCalmas);
		System.out.printf("O número de mulheres nervosas:%d\n", mulheresNervosas);
		System.out.printf("O número de homens agressivos:%d\n", homensAgressivos);
		System.out.printf("O número de outros calmos:%d\n", outrosCalmos);
		System.out.printf("O número de pessoas nervosas com mais de 40 anos:%d\n", maior40);
		System.out.printf("O número de pessoas calmas com menos de 18 anos:%d\n", menor18);
	
}

}
programa
{
	
	funcao inicio()
	
	{
		inteiro anoNasc, mesNasc, diaNasc
		inteiro anoAtual, mesAtual, diaAtual
		inteiro diasEmAnosDevida, diasEmMesesDeVida 
		inteiro idadeEmdias, DiasDeIdade
		
		escreva ("Ola. Digite o dia do seu nascimento:")
		leia(diaNasc)
		escreva ("Digite o mes do seu nascimento:")
		leia(mesNasc)
		escreva ("Digite o ano do seu nascimento:")
		leia (anoNasc)
		

		anoAtual = 2021
		mesAtual = 2
		diaAtual = 16

		
		diasEmAnosDevida = (anoAtual - anoNasc) * 365
		diasEmMesesDeVida  = (mesAtual - mesNasc) * 30
		idadeEmdias = (diaAtual - diaNasc)

		DiasDeIdade = diasEmAnosDevida + diasEmMesesDeVida + idadeEmdias

		escreva ("Voce tem " ,DiasDeIdade, " vividos")
		
		
		

		

		
		
		
		
		
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
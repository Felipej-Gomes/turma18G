programa
{
	
	funcao inicio()
	{
		real p,E

		escreva("Digite a qauntidade de tomate em kilos:")
		leia(p)
		se(p>50)
		{
		escreva ("Peso limite excedido")
		real multa
		multa = (p-50)*4
		escreva ("Sua multa é R$:",multa)
		
		}
		senao
		{
			escreva ("Peso ok")
		}
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
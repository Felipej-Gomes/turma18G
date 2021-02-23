programa
{
	
	funcao inicio()
	{
		real c,n,E
		real salario, salarioEx
		
		escreva ("Digite seu codigo: ")
		leia (c)
		escreva ("Digite o numero de horas trabalhadas: ")
		leia (n)
		salario = (10*n)
		salarioEx = ((n-50)*20+salario)
		
						
	
		se(n<=50.00)
		{
		escreva("Seu salario é de R$ " ,salario)
		}
		
		senao
		{
		escreva ("Seu salario,com hora horas extras é de R$ " ,salarioEx)
		}
		
	
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
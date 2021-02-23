programa
{
	
funcao inicio()
    {
        
      
        inteiro pontuacao[5]
        inteiro maior = 0

        para(inteiro x=0; x<5; x++){
            escreva("Digite os pontos da ativade:" )
            leia(pontuacao[x])
            
            
        } para(inteiro y=0; y<5; y++){
            se(pontuacao[y] > maior){
               maior = pontuacao[y]
               escreva("A maior nota é:", maior)
              }
        }
 
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
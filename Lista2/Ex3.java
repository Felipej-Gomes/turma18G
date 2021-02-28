package Lista2;

	
	import java.util.Scanner;

	public class Ex3 {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			int idade;
			
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();
			
			if (idade<10)
			{System.out.println("Você não tem idade suficiente.");
			}
			else if (idade>=10 &&idade<=14)
			
			{
			System.out.println("Você esta na categoria infantil.");
			
			}
			else if(idade>=15 && idade<=17)
			{
			System.out.println("Você esta na categoria juvenil.");
			
			}
			else if(idade>=18 && idade<=25)
			{
			System.out.println("Você esta na categoria adulto.");
			}
			
		}
	}
			
			
							
				
					
			
	
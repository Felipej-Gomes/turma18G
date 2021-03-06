package HerançaPolimorfismo;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override
	public void acao() {
		System.out.println("Corre");
				
	}
	
	@Override
	public void som() {
		System.out.println("Relincha");
	}
}

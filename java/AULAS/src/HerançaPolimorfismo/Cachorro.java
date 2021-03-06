package HerançaPolimorfismo;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
		}
	@Override
	public void acao() {
		System.out.println("Corre");
				
	}
	
	@Override
	public void som() {
		System.out.println("Late");
}
}
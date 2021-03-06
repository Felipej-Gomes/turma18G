package HerançaPolimorfismo;

public class Preguiça extends Animal {

	public Preguiça(String nome, int idade) {
		super(nome, idade);


	}
	
	@Override
	public void acao() {
		System.out.println("Sobe em arvores");
				
	}
	
	@Override
	public void som() {
		System.out.println("Dorme");
}
}
package Heran�aPolimorfismo;

public class Pregui�a extends Animal {

	public Pregui�a(String nome, int idade) {
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
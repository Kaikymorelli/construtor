package metodoconstrutor;

public class ConstrutorPessoa {
	
	public static void main(String [] args) {
		Pessoa jogador1 = new Pessoa();
		Pessoa jogador2 = new Pessoa("Messi", 36);
		
		System.out.println(jogador2.getnome());
		System.out.println(jogador2.getidade());
		
	}

}

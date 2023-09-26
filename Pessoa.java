package metodoconstrutor;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa () {
	}

	public Pessoa (int idade){
	}
	public Pessoa (String nome){
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa( int idade,String nome ) {
		this.idade = idade;
		this.nome = nome;
	}

	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}

}

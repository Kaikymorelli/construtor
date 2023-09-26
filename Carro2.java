package metodoconstrutor;

public class Carro2 {

	public static void main(String [] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setplaca("12233");
		carro1.setnumChassi(53527241);
		
		
		
		System.out.println(carro1.getplaca());
		System.out.println(carro1.getnumChassi());
	}
}

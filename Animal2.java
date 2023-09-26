package metodoconstrutor;

public class Animal2 {
public static void main(String [] args) {
		
		Animal animal1 = new Animal();
		
		animal1.settamanho(150);
		animal1.setcor("preto");
		
		
		
		System.out.println(animal1.gettamanho());
		System.out.println(animal1.getcor());
}
}

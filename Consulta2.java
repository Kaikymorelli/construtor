package metodoconstrutor;

public class Consulta2 {
public static void main(String [] args) {
		
		Consulta consulta1 = new Consulta();
		
		consulta1.setdata("21/09");
		consulta1.setnomePcnt("Kaiky morelli");
		consulta1.setnomeDents("Adriano morelli");
		
		
		
		System.out.println(consulta1.getdata());
		System.out.println(consulta1.getnomePcnt());
		System.out.println(consulta1.getnomeDents());
		
}

}


public class Principal {

	public static void main(String[] args) {
		
		Carro.metodoStatico();
		Carro c = new Carro("DelRey", "Prata");
		Carro b = new Carro("Kombi", "Preta");
		
		
		if (c == b) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(b);
		System.out.println(c);
		c.metodoStatico();
		System.out.println(Carro.autoInc);
		  
		

	}

}

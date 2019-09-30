import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList {
	
	public static void main (String[] args) {
		ArrayList lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		System.out.println("1 - Adicionar valores");
		System.out.println("2 - Remover valor");
		System.out.println("3 - Buscar valor");
		System.out.println("4 - Listar valores");
		System.out.println("Negativo para encerrar");
		System.out.print("Op��o: ");
		int opcao = teclado.nextInt();
		teclado.nextLine();
		
		while (opcao > 0) {
			switch (opcao) {
				case 1:
					System.out.print("Informe um valor: ");
					lista.add(teclado.nextInt());
					break;
				case 2:
					System.out.print("Informe a posi��o que deseja remover: ");
					lista.remove(teclado.nextInt());
					break;
				case 3:
					System.out.print("Informe o valor a ser buscado na lista: ");
					String valor = teclado.nextLine();
					for(int x = 0; x <= lista.size()-1; x++) {
						if(valor == lista.get(x)) {
							System.out.println("Valor encontrado na posi��o " + x);
						}break;
					}
					break;
				case 4:
					for(int x = 0; x <= lista.size()-1; x++) {
						System.out.println(x + " : " + lista.get(x));
					}
					break;
				default:
					System.out.println("Op��o inv�lida!");
			}
			System.out.println("1 - Adicionar valores");
			System.out.println("2 - Remover valor");
			System.out.println("3 - Buscar valor");
			System.out.println("4 - Listar valores");
			System.out.println("Negativo para encerrar");
			System.out.print("Op��o: ");
			opcao = teclado.nextInt();
			teclado.nextLine();
		}
	}

}

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Aluno aluno[] = new Aluno[5];
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Cadastrar Notas");
		System.out.println("3 - Listar Aluno/Media/Situa��o");
		System.out.println("Op��o: (NEGATIVO PARA ENCERRAR)");
		int opcao = teclado.nextInt();
		teclado.nextLine();
		
		while (opcao >= 0) {
			switch(opcao) {
			case 1:
				for (int x = 0; x <= 4; x++) {
					aluno[x] = new Aluno();
					System.out.println("Nome " + x + " : ");
					aluno[x].setNome(teclado.nextLine());
				}
				break;
			case 2:
				for (int x = 0; x <= 4; x++) {
					System.out.println("Informe as notas do aluno " + aluno[x].getNome());
					for (int y = 0; y <= 3; y++) {
						System.out.println("Informe a nota " + y + " : ");
						aluno[x].matricula.setNotas(teclado.nextFloat(), y);
					}
				}
				break;
			case 3:
				for (int x = 0; x <= 4; x++) {
					System.out.print("Nome: " + aluno[x].getNome());
					System.out.print(" ** M�dia: " + aluno[x].matricula.getMedia());
					System.out.println(" ** Situa��o: " + aluno[x].matricula.getSituacao());
				}
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Notas");
			System.out.println("3 - Listar Aluno/Media/Situa��o");
			System.out.println("Op��o: (NEGATIVO PARA ENCERRAR)");
			opcao = teclado.nextInt();
			teclado.nextLine();
		}
		
	}
}
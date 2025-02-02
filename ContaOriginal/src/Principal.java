import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Cliente clientes[] = new Cliente[3];
		iniciaClientes(clientes);
		menuNaoLogado();
		int op = t.nextInt();
		t.nextLine();
		Cliente clienteLogado = null;
		while (op != 5) {
			if (clienteLogado == null) {
				 switch(op) {
				 case 1:
					 System.out.println("Informe o CPF: ");
					 String cpf = t.nextLine();
					 System.out.println("Informe a senha: ");
					 String senha = t.nextLine();
					 clienteLogado = null;
					 for(int x = 0; x <= 2; x++) {
						 if ((clientes[x].getCPF().equalsIgnoreCase(cpf)) && (clientes[x].getSenha().equalsIgnoreCase(senha))) {
							 clienteLogado = clientes[x];
						 }
					 }
					 break;
				 default:
					 System.out.println("Op��o Inv�lida");
				 }
				 
			 }else {
				 switch(op) {
				 case 1:
					 System.out.println("Informe o CPF: ");
					 String cpf = t.nextLine();
					 System.out.println("Informe a senha: ");
					 String senha = t.nextLine();
					 clienteLogado = null;
					 for(int x = 0; x <= 2; x++) {
						 if ((clientes[x].getCPF().equalsIgnoreCase(cpf)) && (clientes[x].getSenha().equalsIgnoreCase(senha))) {
							 clienteLogado = clientes[x];
						 }
					 }
					 break;
				 case 2:
					 System.out.println("Saldo atual: R$" + clienteLogado.getConta().getSaldo());
					 System.out.print("Informe o valor para dep�sito na conta do " + clienteLogado.getNome() + " : R$");
					 clienteLogado.getConta().deposito(t.nextDouble());
					 System.out.println("*****");
					 System.out.println("Saldo atual: R$" + clienteLogado.getConta().getSaldo());
					 break;
				 case 3:
					 System.out.println("Saldo atual: R$" + clienteLogado.getConta().getSaldo());
					 System.out.print("Informe o valor para saque na conta do " + clienteLogado.getNome() + " : R$");
					 if (clienteLogado.getConta().saque(t.nextDouble()) == -1) {
						 System.out.println("Saldo Insuficiente");
					 }else {
						 System.out.println("Saque de efetuado com sucesso");
					 }
					 System.out.println("*****");
					 System.out.println("Saldo atual: R$" + clienteLogado.getConta().getSaldo());
					 break;
				 case 4:
					 System.out.println("Cliente " + clienteLogado.getNome());
					 System.out.println("Saldo atual: R$" + clienteLogado.getConta().getSaldo());
					 break;
				 case 6:
					 System.out.println("Extrato Banc�rio do Cliente " + clienteLogado.getNome());
					 System.out.println("Extrato Banc�rio do Cliente " + clienteLogado.getConta().getExtrato());
					 break;
				 default:
					 System.out.println("Op��o Inv�lida");
				 } 
			 }
			if(clienteLogado == null) {
				menuNaoLogado();
			}else {
				menuLogado();
			}
			op = t.nextInt();
			t.nextLine();
		}
		
		}
	
	public static void menuNaoLogado() {
		System.out.println("1 - Autentica��o");
		System.out.println("5 - Sair do sistema");
		System.out.println("Op��o: ");
		
	}
	
	public static void menuLogado() {
		System.out.println("1 - Autentica��o");
		System.out.println("2 - Dep�sito");
		System.out.println("3 - Saque");
		System.out.println("4 - Saldo");
		System.out.println("5 - Sair do sistema");
		System.out.println("6 - Extrato");
		System.out.println("Op��o: ");
		
	}

	public static void iniciaClientes(Cliente clientes[]) {
		clientes[0] = new Cliente();
		clientes[0].setNome("Amadeu");
		clientes[0].setCPF("000.000.000-00");
		clientes[0].setSenha("0000");
		clientes[0].setConta(new Conta());
		clientes[1] = new Cliente();
		clientes[1].setNome("Juka");
		clientes[1].setCPF("111.111.111-11");
		clientes[1].setSenha("1111");
		clientes[1].setConta(new Conta());
		clientes[2] = new Cliente();
		clientes[2].setNome("Amanda");
		clientes[2].setCPF("222.222.222-22");
		clientes[2].setSenha("2222");
		clientes[2].setConta(new Conta());
		
	}
}

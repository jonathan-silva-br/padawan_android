
public class ContaCorrente extends Conta {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getSaldo() {
		return super.getSaldo()+getLimite();
	}
	
	//public double saque(double valor) {
	//	if (getSaldo() >= valor) {
	//		return valor;
	//	}
	//}

}

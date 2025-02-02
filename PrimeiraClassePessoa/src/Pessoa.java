
public class Pessoa {
	//atributo
	//nome deve possuir pelo menos 
	private String nome;
	private String cpf;
	private char sexo;
		
		
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public String getSexo() {
		if(sexo == 'M' || sexo == 'm') {
			return "Masculino";
		}else {
			if(sexo == 'F' || sexo == 'f') {
				return "Feminino";
			}else {
				return "Inv�lido";
			}
		}
	}
	
		
	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
		}else {
			System.out.println("Nome inv�lido!");
		}
	}
	
	public void setCPF(String cpf) {
		if (cpf.length() == 14) {
			this.cpf = cpf;
		}else {
			System.out.println("CPF inv�lido!");
		}
	}
	
	public void setSexo(char sexo) {
		if ((sexo == 'm') || (sexo == 'M') || (sexo == 'f') || (sexo == 'F')) {
			this.sexo = sexo;
		}else {
			System.out.println("Sexo inv�lido!");
		}
	}
	
	public String toString() {
		String s = super.toString();
		s += "\n Nome: " + getNome();
		s += "\n CPF: " + getCPF();
		s += "\n Sexo: " + getSexo();
		return s;
	}
	
}

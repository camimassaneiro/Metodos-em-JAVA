/*
	 No método depositar por questões de segurança, não deve permitir depósitos superiores a R$ 1.000,00 
	 caso a conta seja do tipo “Corrente”.

	 O método sacar não deve permitir saques superiores ao saldo total da conta.

	 O método transferir, pode realizar transferência da conta corrente para a conta poupança, 
	 mas o contrario não é permitido, também não deve permitir que o saldo da conta fique negativo.

*/

public class Conta {

	private double saldo;
	private String tipo;
	
	
	public Conta(double valorInicial) {
		
		this.tipo = "Corrente";
		this.saldo = valorInicial;
	}
	
	public Conta(double valorInicial, String tipo) {
		
		this.tipo = tipo;
		this.saldo = valorInicial;
	}
	
	public boolean depositar(double valor) {
		
		if (this.tipo.equalsIgnoreCase("Corrente") && valor > 1000.00) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public boolean sacar(double valor) {
		
		if (valor > this.saldo) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
		
	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		
		if (valor < this.saldo && this.tipo.equalsIgnoreCase("Corrente") && contaDestino.tipo.equalsIgnoreCase("Poupanca")) {
			
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
		
	
}

/*
 
 - Crie duas contas, uma do tipo �Corrente� e outra do tipo �Poupan�a� com um saldo inicial qualquer. 
 - Tente depositar R$ 1.500,00 reais na conta corrente. 
 - Tente depositar R$ 1.500,00 reais na conta poupan�a.
 - Deposite R$ 98,52 na conta poupan�a.
 - Tente sacar R$ 100,00 da poupan�a.
 - Transfira R$ 1.800,00 da corrente para a conta poupan�a.
 - Transfira R$ 700,00 da poupan�a para a conta corrente.
 - Saque R$ 1.000,00 da poupan�a.
 - Saque R$ 1.000,00 da corrente.
 Na classe de teste, exiba mensagens indicando o retorno e ou o resultado (�xito ou falha) 
 de cada um dos m�todos.
 
 */
public class Main {

	public static void main(String[] args) {
		
		Conta corrente = new Conta(1000.00);
		Conta poupanca = new Conta(1000.00, "Poupanca");
		
		System.out.println(corrente.depositar(1500.00)); //false
		System.out.println(poupanca.depositar(1500.00)); // true
		
		System.out.println("---");
		
		System.out.println(poupanca.depositar(98.52)); // true
		System.out.println(poupanca.sacar(2700.00)); //false

		System.out.println("---");
		
		System.out.println(corrente.transferir(500.00, poupanca)); // true
		System.out.println(poupanca.transferir(700.00, corrente)); // false
		
		System.out.println("---");
		
		System.out.println("tipo" + corrente.getTipo() + " saldo " + corrente.getSaldo());
		System.out.println("tipo" + poupanca.getTipo() + " saldo " + poupanca.getSaldo());
		
		System.out.println("---");
		
		
		System.out.println(poupanca.sacar(1000.00)); // true
		System.out.println(corrente.sacar(1000.00)); // false
		
		System.out.println("Novo saldo: ");
		
		System.out.println("tipo" + corrente.getTipo() + " saldo " + corrente.getSaldo());
		System.out.println("tipo" + poupanca.getTipo() + " saldo " + poupanca.getSaldo());
	}

}

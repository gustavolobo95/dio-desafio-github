
public class Teste {
public static void main(String[] args) {
	
	Cliente gustavo = new Cliente();
	gustavo.setNome("Gustavo");
	
	Cliente karolayne = new Cliente();
	karolayne.setNome("Karolayne");
	
	Conta corrente = new ContaCorrente(gustavo);
	Conta poupanca = new ContaPoupanca(karolayne);
	
	// Primeira impressão para mostrar saldo inicial!
	corrente.ImprimirExtrato();
	poupanca.ImprimirExtrato();
	
	// Segunda impressão para mostrar o saldo das duas contas após deposito!
	corrente.Depositar(500);
	corrente.ImprimirExtrato();
	poupanca.ImprimirExtrato();
	
	// Terceira impressão para mostrar o saldo das duas contas após transferencia!
	corrente.Transferir(poupanca,250);
	corrente.ImprimirExtrato();
	poupanca.ImprimirExtrato();
	
	// Quarta impressão para mostrar tratamento de erro caso o cliente saque um valor maior que o saldo!
	corrente.Sacar(1000);
	
}
}

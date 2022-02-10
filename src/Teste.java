
public class Teste {
public static void main(String[] args) {
	
	Cliente gustavo = new Cliente();
	gustavo.setNome("Gustavo");
	
	Cliente karolayne = new Cliente();
	karolayne.setNome("Karolayne");
	
	Conta corrente = new ContaCorrente(gustavo);
	Conta poupanca = new ContaPoupanca(karolayne);
	
	// Primeira impress�o para mostrar saldo inicial!
	corrente.ImprimirExtrato();
	poupanca.ImprimirExtrato();
	
	// Segunda impress�o para mostrar o saldo das duas contas ap�s deposito!
	corrente.Depositar(500);
	corrente.ImprimirExtrato();
	poupanca.ImprimirExtrato();
	
	// Terceira impress�o para mostrar o saldo das duas contas ap�s transferencia!
	corrente.Transferir(poupanca,250);
	corrente.ImprimirExtrato();
	poupanca.ImprimirExtrato();
	
	// Quarta impress�o para mostrar tratamento de erro caso o cliente saque um valor maior que o saldo!
	corrente.Sacar(1000);
	
}
}

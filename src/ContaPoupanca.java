
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void ImprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("*** EXTRATO CONTA POUPAN�A ***");
		super.ImprimirInfosComuns();
	}
	
}


public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente){
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void Sacar(double valor) {
		// TODO Auto-generated method stub
		if(valor > this.saldo) {
			System.out.println("Seu saldo é insuficiente!");
		} else {
			this.saldo -= valor;	
		}
		
	}

	@Override
	public void Depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

	@Override
	public void Transferir(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		this.Sacar(valor);
		contaDestino.Depositar(valor);
	}
	
	protected void ImprimirInfosComuns() {
		System.out.println(String.format("Nome: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("-------------------------------------------------------------");
	}
}

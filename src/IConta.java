
public interface IConta {
	
void Sacar(double valor);

void Depositar(double valor);

void Transferir(Conta contaDestino, double valor);

void ImprimirExtrato();
}

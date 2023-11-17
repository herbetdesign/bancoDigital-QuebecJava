public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, double depositoInicial) {
		super(cliente);
		this.depositar(depositoInicial);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Corrente ---");
		super.imprimirInfosComuns();
		
	}
		
}
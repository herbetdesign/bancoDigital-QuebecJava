import java.util.Scanner;

public class ContaInvestimento extends Conta {
	public ContaInvestimento(Cliente cliente, Scanner scanner) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Investimento ---");
		super.imprimirInfosComuns();
	}
}
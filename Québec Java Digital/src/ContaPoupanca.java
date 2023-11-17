import java.util.Scanner;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente, Scanner scanner) {
		super(cliente);
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Poupança ---");
		super.imprimirInfosComuns();	
	}	
}
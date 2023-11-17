import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Solicitar o nome do titular
		System.out.print("Digite seu nome: ");
        String nomeTitular = scanner.nextLine();
        
        // Solicitar o depósito inicial
        System.out.print("Digite o depósito inicial: ");
        double depositoInicialCorrente = scanner.nextDouble();
		
		Cliente titular = new Cliente();
		titular.setNome(nomeTitular);
		
		// Usar depósito inicial fornecido pelo usuário
		Conta cc = new ContaCorrente(titular, depositoInicialCorrente);
		
		Conta poupanca = new ContaPoupanca(titular, scanner);
		cc.transferir(cc.getSaldo(), poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		// Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
	}
}
import java.util.Locale;
import java.util.Scanner;

import entities.Bank;
import entities.Conta;

public class ExercicioOrientacaoBanco {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o titular da conta: ");
		String titular = sc.nextLine();
		System.out.print("Vai haver um deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Entre com o valor incial de deposito: ");
			double valorInicial = sc.nextDouble();
			conta = new Conta(numero, titular, valorInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		sc.close();

	}
	
	public static void exercicioConta() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//� obvio mas : estanciar a classe no inicio para ela ser
		//acessivel no programa e n ficar limitada
		Bank bank;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		//se for usar um nextLine dps de um nextInt � necessario
		//adicionar um nextLine a mais para pegar o espa�o do nextInt
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		//usar char se for apenas uma letra
		char question = sc.next().charAt(0);
		
		if (question == 'y') {
			System.out.print("Enter initial deposit value: ");
			double countValue = sc.nextDouble();
			bank = new Bank(number, holder, countValue);
		}
		else {
			bank = new Bank(number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		//bank.responseString();
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double value = sc.nextDouble();
		
		bank.accountDeposit(value);

		System.out.println("Updated account data:");
		//bank.responseString();
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		bank.accountWithdraw(value);
		
		System.out.println("Updated account data:");
		//bank.responseString();
		System.out.println(bank);
		
		sc.close();

	}

}

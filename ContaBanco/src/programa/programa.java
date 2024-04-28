package programa;

import java.util.Scanner;

import contaTerminal.ContaTerminal;


public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do cliente");
		String nome = sc.next();
		System.out.println("Digite o número da conta");
		int numero = sc.nextInt();
		System.out.println("Digite a Agencia");
		String agencia = sc.next();
		System.out.println("Digite o Saldo da conta");
		double saldo = sc.nextDouble();
		ContaTerminal contaBanco = new ContaTerminal(nome, numero, agencia, saldo);
		System.out.println(contaBanco);
		
	}

}

package bancoBasico;

import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String agencia = "12345-1";
		int conta = random.nextInt(90000) + 10000;
		String nome;
		String cpf;
		char sexo;
		int idade;
		double saldo = 0;
		int opcao;
		
		
		System.out.println("Seja bem-vindo(a)!");
		System.out.println("Para iniciar seu cadastro em nosso banco, siga os próximos passos.");
		
		System.out.print("Digite seu nome completo: ");
		nome = sc.nextLine();
		System.out.print("Digite seu CPF: ");
		cpf = sc.next();
		System.out.print("Digite seu sexo: [M/F] ");
		sexo = sc.next().charAt(0);
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Deseja fazer algum depósito na conta?");
		System.out.println("Digite o 1 para o depósito");
		System.out.println("Qualqauer outra tecla para não fazer o depósito");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Digite o valor que deseja fazer o depósito: R$");
			saldo = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Olá " + nome + " seu cadastro foi feito com sucesseo!");
		System.out.println("Seus dados são: ");
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Cpf: " + cpf);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Saldo: R$" + saldo);

		sc.close();
		
	}


}

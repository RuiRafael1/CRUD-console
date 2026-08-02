package Calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int RESPOSTA = 1;

		List<String> historico = new ArrayList<String>();

		System.out.println("Digite um numero");
		System.out.print(">> ");
		double numero = sc.nextDouble();

		System.out.println("| " + numero + " |");

		System.out.println("Agora digite uma operação ( +, -, /, * )");
		System.out.print(">> ");
		String operacao = sc.next();

		System.out.println("| " + numero + " " + operacao + " |");

		System.out.println("Digite o segundo valor");
		System.out.print(">> ");
		double numero2 = sc.nextDouble();

		System.out.println("| " + numero + " " + operacao + " " + numero2 + " |");
		double acumulador = 0;
		
		if (Operacoes.OPERA(operacao) == 1) {
			acumulador = (numero + numero2);
		}
		
		if (Operacoes.OPERA(operacao) == 2) {
			acumulador = (numero - numero2);
		}
		
		if (Operacoes.OPERA(operacao) == 3) {
			acumulador = (numero / numero2);
		}
		
		if (Operacoes.OPERA(operacao) == 4) {
			acumulador = (numero * numero2);
		}
		
		historico.add(String.format("| " + numero + " " + operacao + " " + numero2));

		System.out.println("Resultado -> " + acumulador);

		System.out.println("Deseja incluir mais um valor? [1] sim / [2] não");
		RESPOSTA = sc.nextInt();
		if (RESPOSTA == 2) {

		} else {

			while (RESPOSTA == 1) {

				System.out.println("Agora digite uma operação ( +, -, /, * )");
				System.out.print(">> ");
				operacao = sc.next();

				System.out.println("Digite mais um valor");
				System.out.print(">> ");
				numero = sc.nextDouble();

				if (Operacoes.OPERA(operacao) == 1) {
					acumulador = (acumulador + numero);
				} else if (Operacoes.OPERA(operacao) == 2) {
					acumulador = (acumulador - numero);
				} else if (Operacoes.OPERA(operacao) == 3) {
					acumulador = (acumulador / numero);
				} else if (Operacoes.OPERA(operacao) == 4) {
					acumulador = (acumulador * numero);
				}

				historico.add(String.format(operacao + " " + numero));

				for (String string : historico) {
					System.out.print(string + " ");
				}
				System.out.print("|");
				System.out.println("");
				System.out.println("Resultado -> " + acumulador);

				System.out.println("Deseja incluir mais um valor? [1] sim / [2] não");
				RESPOSTA = sc.nextInt();
				if (RESPOSTA == 2) {
					break;
				}
			}
		}
		System.out.println("Obrigado!");
		sc.close();
	}
}
//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

//IMPORTANTE:

//Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

package target_challenge;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.print("Informe um número: ");
			int numero = scanner.nextInt();
			if (verificaFibonacci(numero)) {
				System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
			} else {
				System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
			}
			System.out.print("Deseja inserir outro número? (S/N): ");
			String resposta = scanner.next();
			if (!resposta.equalsIgnoreCase("S")) {
				System.out.println("Encerrando o sistema.");
				continuar = false;
			}
		}
		scanner.close();
	}

	public static boolean verificaFibonacci(int numero) {
		int a = 0;
		int b = 1;
		while (a <= numero) {
			if (a == numero) {
				return true;
			}
			int temp = a + b;
			a = b;
			b = temp;
		}
		return false;
	}
}

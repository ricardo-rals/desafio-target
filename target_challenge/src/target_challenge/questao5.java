//5) Escreva um programa que inverta os caracteres de um string.

//IMPORTANTE:

//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

//b) Evite usar funções prontas, como, por exemplo, reverse;

package target_challenge;

import java.util.Scanner;

public class questao5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.print("Informe uma palavra: ");
			String entrada = scanner.nextLine();
			String invertida = inverterString(entrada);
			System.out.println("Palavra invertida: " + invertida);
			System.out.print("Deseja inserir uma nova palavra? (S/N): ");
			String resposta = scanner.nextLine();
			if (!resposta.equalsIgnoreCase("S")) {
				System.out.println("Encerrando o sistema.");
				continuar = false;
			}
		}
		scanner.close();
	}

	public static String inverterString(String entrada) {
		StringBuilder invertida = new StringBuilder();
		for (int i = entrada.length() - 1; i >= 0; i--) {
			invertida.append(entrada.charAt(i));
		}
		return invertida.toString();
	}
}

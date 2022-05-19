package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		String num = entrada.nextLine();

		int numero = Integer.parseInt(num);

		if (numero % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar!");
		}
		
		entrada.close();

	}
}

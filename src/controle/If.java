package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe sua m�dia");
		double media = input.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		
		boolean criteiroReprovacao = media < 4.5 && media >= 0; 
		if(media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		
		
		
		
	}
	
}

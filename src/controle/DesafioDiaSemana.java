package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		//Domingo -> 1
		//Quarta -> 4
		//Terça -> 3
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a data da semana: ");
		
		String data = entrada.nextLine();
		
		if(data.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		}else if(data.equalsIgnoreCase("Terça") || data.equalsIgnoreCase("Terca")){
			System.out.println("3");
		}else if(data.equalsIgnoreCase("Quarta")){
			System.out.println("4");
		}else if(data.equalsIgnoreCase("Quinta")){
			System.out.println("5");
		}else if(data.equalsIgnoreCase("Sexta")){
			System.out.println("6");
		}else if(data.equalsIgnoreCase("Sábado") || data.equalsIgnoreCase("Sabado")){
			System.out.println("7");
		}else if(data.equalsIgnoreCase("Domingo")){
			System.out.println("1");
		}	
		entrada.close();	
			
		
		
		
	}
}

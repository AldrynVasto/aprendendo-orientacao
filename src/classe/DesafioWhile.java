package classe;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	int quantidadeDeNotas = 0;
	int quantidadeDeNotasInvalidas = 0;
	double nota = 0;
	double total = 0;
	
	
	while(nota != -1){
		System.out.print("Informe a nota: (ou -1 p/ sair)");
		nota = entrada.nextDouble();
		
		if(nota >= 0 && nota <= 10) {
			total += nota;
			quantidadeDeNotas ++;	
		}else if(nota != -1){
			System.out.println("Nota inv�lida!!!");
			quantidadeDeNotasInvalidas++;
		}
			
	}
	
	// Calcular m�dia 
    double media = total / quantidadeDeNotas;
    System.out.println("M�dia= " + media);
	System.out.println("Notas inv�lidas: " + quantidadeDeNotasInvalidas);	
	entrada.close();
		
	}
}

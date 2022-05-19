package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida a1 = new Comida("Arroz", 1.00);
		
		Comida a2 = new Comida("Feijao", 1.00);

		Pessoa p = new Pessoa();
	
		var pesoTotal = p.Comer(a1) + p.Comer(a2); 	
		
		p.Comer(a2);
		
		System.out.println(p.nome + " antes de comer tinha "+ p.peso + "Kg");
		
		System.out.println(p.nome + " depois de comer " + pesoTotal + "Kg");
		
	}
}

package classe;

public class Pessoa {

	String nome;
	Double peso;
	
	Pessoa() {
		nome = "Rafa";
		peso = 50.00;
	}
	
	double Comer(Comida comida) {
		return peso + comida.pesoComida;
  		   
	}
	
	
	
	
}

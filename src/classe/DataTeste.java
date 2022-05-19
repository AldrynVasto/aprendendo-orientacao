package classe;

public class DataTeste {

	public static void main(String[] args) {
		
     Data d1 = new Data();
     d1.ano = 2021;
     
         
     var d2 = new Data(31, 12, 2020);
     
     
     System.out.println(d1.obterDataFormatada());
     System.out.printf(d2.obterDataFormatada());
     
     
		
		
		
		
		
	}
}

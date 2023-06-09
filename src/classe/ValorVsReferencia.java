package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuicao por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,6,2023);
		Data d2 = d1; //atribuição por referência
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}

}

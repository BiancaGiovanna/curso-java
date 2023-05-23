package classe;

public class DataMain {

	public static void main(String[] args) {
		Data d1 = new Data();

		Data d2 = new Data(31, 12, 2022);
		

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
	}

}

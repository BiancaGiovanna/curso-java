package classe;

public class ProdutoMain {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook");
		p1.preco = 4499.99;

		Produto p2 = new Produto("Tablet");
		p2.preco = 1999.99;

		System.out.println(p1.nome + " R$" + p1.preco);
		System.out.println(p2.nome + " R$" + p2.preco);

		double descontoP1 = p1.desconto();
		double descontoP2 = p2.desconto();
		double valorTotal = p1.preco+ p2.preco;
		double valorDesconto =  descontoP1 + descontoP2;
		System.out.printf("Valor total  R$%.2f.", valorTotal );
		System.out.printf("\nValor total com desconto R$%.2f.", valorDesconto);
	}
}

package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4499.99;
		p1.desconto = 0.25;

		Produto p2 = new Produto();
		p2.nome = "Tablet";
		p2.preco = 1999.99;
		p2.desconto = 0.15;

		System.out.println(p1.nome + " R$" + p1.preco);
		System.out.println(p2.nome + " R$" + p2.preco);

		double descontoP1 = p1.preco * (1 - p1.desconto);
		double descontoP2 = p2.preco * (1 - p2.desconto);
		double valorTotal = descontoP1 + descontoP2;
		System.out.println("Valor total " + "R$" + valorTotal);

	}
}

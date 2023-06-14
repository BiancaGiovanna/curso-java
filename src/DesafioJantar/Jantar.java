package DesafioJantar;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijão", 0.3);
		
		Pessoa p = new Pessoa("João", 80);
		
		System.out.println(p.aprensetar());
		p.comer(c1);
		System.out.println(p.aprensetar());
		p.comer(c2);
		System.out.println(p.aprensetar());
	}

}

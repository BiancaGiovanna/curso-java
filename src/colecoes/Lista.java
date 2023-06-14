package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();

		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bianca"));
		lista.add(new Usuario("Katia"));
		lista.add(new Usuario("Andy"));
		lista.add(new Usuario("Ana"));

		for (Usuario u : lista) {
			System.out.println(u);
		}
	}

}

package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Andy");
		listaAprovados.add("Bianca");
		listaAprovados.add("Katia");
		
		for(String candidato: listaAprovados ) {
			System.out.println(candidato);
		}
	}

}

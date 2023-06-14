package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapeamento {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "Bianca");
		usuarios.put(2, "Ricado");
		usuarios.put(3, "Ana");
		usuarios.put(4, "Andy");

		System.out.println(usuarios.keySet());
		
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());


	}

}

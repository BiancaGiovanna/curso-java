package classe;

public class EqualsHashCode {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		
		u1.nome = "Pedro Silva";
		u1.email = "pedrinho@email.com";
		
		Usuario u2 = new Usuario();
		
		u2.nome = "Pedro Silva";
		u2.email = "pedrinho@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
	}

}

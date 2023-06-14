package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAluno = new double[3];

		notasAluno[0] = 7.9;
		notasAluno[1] = 9;
		notasAluno[2] = 7;

		System.out.println(Arrays.toString(notasAluno));

		double total = 0;
		for (int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}

		System.out.println(total / 3);
	}

}

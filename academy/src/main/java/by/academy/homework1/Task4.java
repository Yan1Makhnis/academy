package by.academy.homework1;

public class Task4 {

	public static void main(String[] args) {
		int i = 0;
		int m = 2;
		for (i = 0; Math.pow(m, i) < 1_000_000; i++) {
			System.out.print(i + " ");
		}
	}
}
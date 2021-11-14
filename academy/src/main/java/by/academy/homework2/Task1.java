package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[256];

		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}
		
		

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введита строку 1");
		String s = sc.nextLine();
		System.out.println("Введита строку 2");
		String t = sc.nextLine();

		sc.close();
		System.out.println(permutation(s, t));

	}

}

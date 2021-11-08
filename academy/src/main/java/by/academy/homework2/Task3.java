package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово 1");
		String s1 = sc.nextLine();
		if (s1.length() % 2 != 0) {
			System.out.println("Введите слово с четным количеством символов");
			return;
		}
		System.out.println("Введите слово 2");
		String s2 = sc.nextLine();
		if (s2.length() % 2 != 0) {
			System.out.println("Введите слово с четным количеством символов");
			return;
		}
		System.out.println(s1.substring(0, s1.length() / 2) + s2.substring(s2.length() / 2));

		sc.close();

	}
}

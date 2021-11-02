package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип данных");
		String type = sc.nextLine();

		switch (type) {

		case "int":
			System.out.println("Введите число");
			int varA = sc.nextInt();
			System.out.println("Остаток от деления на 2 равняется " + varA % 2);
			break;
		case "double":
			System.out.println("Введите число");
			double varB = sc.nextDouble();
			System.out.println("70% от введенного числа равняется " + varB * 0.7);
			break;
		case "float":
			System.out.println("Введите число");
			float varC = sc.nextFloat();
			System.out.println("Квадрат числа равняется " + Math.pow(varC, 2));
			break;
		case "char":
			System.out.println("Введите символ");
			char varD = sc.next().charAt(0);
			System.out.println("Код символа " + (int) varD);
			break;
		case "String":
			System.out.println("Введите данные");
			String varE = sc.nextLine();
			System.out.println("Hello " + varE);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}
		sc.close();
	}
}

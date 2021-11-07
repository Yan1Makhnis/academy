package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		do {
			System.out.println("Введите сумму покупок (рублей)");
			while (!sc.hasNextInt()) {
				System.out.println("Необходимо ввести число!");
				sc.next(); 
			}
			sum = sc.nextInt();
		} while (sum <= 0);
		System.out.println("Сумма покупок = " + sum);
		System.out.println();

		int age;
		do {
			System.out.println("Введите возраст покупателя");
			while (!sc.hasNextInt()) {
				System.out.println("Необходимо ввести число!");
				sc.next(); 
			}
			age = sc.nextInt();
		} while (age <= 0);
		System.out.println("Возраст покупателя = " + age);
		System.out.println();
		sc.close();
		if (sum >= 400) {
			System.out.println("Размер скидки - 20%. Финальная сумма к оплате (рублей):"+(sum-sum*0.2));
		} else if(sum >= 300 && sum < 400) {
			System.out.println("Размер скидки - 15%. Финальная сумма к оплате(рублей):"+(sum-sum*0.15));
		} else if (sum >= 200 && sum < 300 && age >= 18) {
			System.out.println("Размер скидки - 16%. Финальная сумма к оплате(рублей):"+(sum-sum*0.16));
		} else if (sum >= 200 && sum < 300 && age < 18) {
			System.out.println("Размер скидки - 8%. Финальная сумма к оплате(рублей):"+(sum-sum*0.08));
		} else if (sum >= 100 && sum < 200) {
			System.out.println("Размер скидки - 7%. Финальная сумма к оплате(рублей):"+(sum-sum*0.07));
		} else if (sum > 100) {
			System.out.println("Размер скидки - 15%. Финальная сумма к оплате(рублей):"+(sum-sum*0.15));
		}
	}
}

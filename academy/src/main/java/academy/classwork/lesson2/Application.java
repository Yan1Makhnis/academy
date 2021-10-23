package academy.classwork.lesson2;

public class Application {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Вася", 7, 23);
		cat1.setAge(6);
		System.out.print(cat1);
		cat1.sleep();
		cat1.eat();
		cat1.walk();
		System.out.println();
		System.out.println();
		
		Cat cat2 = new Cat("Петя", 5, 55);
		System.out.print(cat2);
		cat2.eat();
		System.out.print(" А");
		cat1.walk();
		System.out.println();
		System.out.println();

		Cat cat3 = new Cat("Игорь", 3, 61);
		System.out.print(cat3);
		cat3.walk();
		System.out.print(" А");
		cat2.eat();
		System.out.println();
	}

}

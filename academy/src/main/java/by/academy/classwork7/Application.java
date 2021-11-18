package by.academy.classwork7;

public class Application {

	public static void main(String[] args) {
		int numberofProducts = 4;
		Product[] products = new Product[numberofProducts];

		products[0] = new Milk("Bellakt", "beverage", 2, 2, 1, 2.5, 2);
		products[1] = new Milk("Савушкин продукт", "beverage", 2.85, 8.0, 0.9, 3.6, 4);
		products[2] = new Fruit("Яблоко", "food", 4.0, 2.0, "Беларусь", "красное");
		products[3] = new Fruit("Лимон", "food", 5.0, 1.0, "Беларусь", "жёлтый");

		User seller1 = new User();
		seller1.setName("Nick");
		seller1.setMoney(1000);
		User buyer = new User();
		buyer.setName("Mike");
		buyer.setMoney(2000);

		Deal deal = new Deal(seller1, buyer, products);
		deal.printBill();
	}

}

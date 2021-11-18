package by.academy.classwork7;

import java.util.Arrays;

public class Deal {
	User seller;
	User buyer;
	Product[] products;

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	

	public double getFullPrice() {
		double fullPrice = 0;
		for (int i = 0; i < products.length; i++) {
			fullPrice = fullPrice+products[i].getProductPrice();
		}
		
		return fullPrice;
	}

	public void printBill() {
		System.out.println("Число позиций: " + products.length);
		System.out.println();
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		System.out.println("====================================================================================");
		System.out.println("К оплате: " + getFullPrice()+ " рублей");
		
		

	}

}

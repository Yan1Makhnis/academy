package by.academy.classwork7;

public abstract class Product {
	protected double cost;
	protected String name;
	protected String type;
	protected double quantity;
	
	public Product() {
		super();
	}
	
	public Product(String name, String type, double cost,double quantity) {
		super();
		this.cost = cost;
		this.name = name;
		this.type = type;
		this.quantity=quantity;
	}
	protected String getType() {
		return type;
	}

	protected double getCost() {
		return cost;
	}
	protected void setCost(double cost) {
		this.cost = cost;
	}
	protected String getName() {
		return name;
	}
	protected double getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	
	
	protected double getProductPrice() {
		return quantity*cost*getDiscount();
	}
	
	protected abstract double getDiscount() {
		return 1;
	}


}

package by.academy.classwork7;

public class Fruit extends Product {

	private String origin;
	private String color;

	public Fruit() {
		super();
		this.type = "food";
	}

	public Fruit( String name, String type,double cost, double quantity, String origin, String color) {
		super( name, "food",cost,quantity);
		this.origin = origin;
		this.color = color;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	protected double getDiscount() {
		if (origin.equals("Беларусь")) {
			return 0.7;
		}
		return 1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append(" "+color);
		builder.append(", происхождение - ");
		builder.append(origin);
		builder.append(", количество - ");
		builder.append(quantity + " кг.,");
		builder.append(" цена - ");
		builder.append(cost + " руб");
		return builder.toString();
	}




	
}

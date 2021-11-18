package by.academy.classwork7;

public class Milk extends Product {

	private double volume;
	private double fatContent;
	private int expiryDays; // число дней до истечения срока годности

	public Milk() {
		super();
		this.type = "beverage";
	}

	public Milk(String name, String type, double cost, double quantity, double volume, double fatContent,
			int expiryDays) {
		super(name, "beverage", cost, quantity);
		this.volume = volume;
		this.fatContent = fatContent;
		this.expiryDays = expiryDays;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getFatContent() {
		return fatContent;
	}

	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}

	@Override
	protected double getDiscount() {
		if (expiryDays >= 3.0&&expiryDays < 6) {
			return 0.8;
		} else if (expiryDays >= 6) {
			return 0.6;
		}
		return 1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Молоко ");
		builder.append(name);
		builder.append(", жирность ");
		builder.append(fatContent + "%, ");
		builder.append(volume + "л");
		builder.append(", количество - ");
		builder.append(quantity + " шт.");
		builder.append(", цена - ");
		builder.append(cost + " руб.");
		return builder.toString();
	}



}
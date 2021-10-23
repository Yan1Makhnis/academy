package academy.classwork.lesson2;

public class Cat {
	int age;
	String nickname;
	double money;

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Cat(String nickname, int age, double money) {
		super();
		this.nickname = nickname;
		this.age = age;
		this.money = money;
	}
	
	public void sleep() {
		System.out.print( " "+ nickname+ " спит.");
	}
	public void eat() {
		System.out.print(" "+ nickname+ " ест.");
	}
	public void walk() {
		System.out.print(" "+ nickname + " гуляет.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [имя=");
		builder.append(nickname);
		builder.append(", возраст=");
		builder.append(age);
		builder.append(", деньги=");
		builder.append(money);
		builder.append("]");
		return builder.toString();
	}

}

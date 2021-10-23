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
		System.out.print( " "+ nickname+ " ����.");
	}
	public void eat() {
		System.out.print(" "+ nickname+ " ���.");
	}
	public void walk() {
		System.out.print(" "+ nickname + " ������.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [���=");
		builder.append(nickname);
		builder.append(", �������=");
		builder.append(age);
		builder.append(", ������=");
		builder.append(money);
		builder.append("]");
		return builder.toString();
	}

}

package sukkiri.practice.practice_print12.practice03;

public class Cat extends Animal {

	/*different fields*/
	private int weight;

	/*constructor*/
	public Cat(String name, int age, int weight) {
		super(name, age);
		this.setWeight(weight);
	}

	/*setter/getter*/
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void showProfile() {
		System.out.printf("名前は%sで、%d歳、体重は%dキログラムです。\n", super.getName(), super.getAge(), this.getWeight());
	}

	/*method*/
	public void sleep() {
		System.out.println("スースー");
	}

	@Override
	public void speak() {
		System.out.println("にゃーにゃー");
	}

}

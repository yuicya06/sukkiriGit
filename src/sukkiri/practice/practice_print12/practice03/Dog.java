package sukkiri.practice.practice_print12.practice03;

public class Dog extends Animal {

	/*fields*/
	//	なし

	/*constructor*/
	public Dog(String name, int age) {
		super(name, age);
	}
	
	/*method*/
	public void run() {
		System.out.println("トコトコ");
	}
	
	@Override
	public void speak() {
		System.out.println("わんわん");
	}

}

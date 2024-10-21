package sukkiri.practice.practice_print11.practice05;

//抽象クラスの継承、インタフェースの実装
public class Animal extends Manmal implements LivingBeing {
	
	/*constructor*/
	public Animal(String name) {
		super(name);
		
	}
	
	
	/*implements abstract method*/
	@Override
	public void eat() {
		System.out.println(getName() + "is eating.");
	}

	@Override
	public void breathe() {
		System.out.println(getName() + "is breathing.");
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + "makes a sound.");
	}

}

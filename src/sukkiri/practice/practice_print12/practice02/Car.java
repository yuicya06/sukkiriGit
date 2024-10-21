package sukkiri.practice.practice_print12.practice02;

public class Car extends Vehicle{

	public Car(String name) {
		super(name);
	}

	@Override
	public void start() {
		
		System.out.println(getName() +" is starting.");
	}

	@Override
	public void stop() {
		System.out.println(getName() +" is stopping.");
	}
	
	

}

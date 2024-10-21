package sukkiri.practice.practice_print12.practice02;

public class Bicycle  extends Vehicle{

	public Bicycle(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(getName() +" is starting to pedal.");
	}

	@Override
	public void stop() {
		System.out.println(getName() +" is stopping pedaling.");
	}

}

package sukkiri.practice.practice_print12.practice02;

public abstract class Vehicle {
	
	/*field*/
	String name;
	
	/*constructor*/
	public Vehicle(String name) {
		this.name = name;
	}
	
	/*abstract method*/
	public abstract void start();
	
	public abstract void stop();



	
	/*getter/setter*/
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

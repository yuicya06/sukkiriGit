package sukkiri.practice.practice_print12.practice01;

public class Circle extends Shape{

	/*fields*/
	double radius;
	
	
	
	/*constructor*/
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	
	@Override
	public double calculateArea() {
		
		double circleArea = this.radius * this.radius * Math.PI;
		
		return circleArea;
	}

}

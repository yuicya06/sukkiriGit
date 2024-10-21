package sukkiri.practice.practice_print12.practice01;

public class Rectangle extends Shape {
	
	/*fields*/
	double width;
	double height;
	
	/*constructor*/
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	
	
	@Override
	public double calculateArea() {
		
		double rectangleArea = this.width * this.height;
		
		return rectangleArea;
	}

}

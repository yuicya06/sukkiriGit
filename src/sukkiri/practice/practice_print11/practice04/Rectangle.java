package sukkiri.practice.practice_print11.practice04;

public class Rectangle implements Shape {
	
	double width;
	double height;

	@Override
	public double calculateArea() {
		
		double squerArea = width * height;
		
		return squerArea;
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

}

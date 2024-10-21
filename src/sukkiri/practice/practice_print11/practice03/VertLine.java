package sukkiri.practice.practice_print11.practice03;

public class VertLine extends AbstLine {
	
	/*constructor*/
	public VertLine(int length) {
		super(length);
	}
	
	
	/*imprements abstract methods*/
	@Override
	public void draw() {
		
		for(int i = 0; i< getLength(); i++) {
			System.out.println(getVertline());
		}
		
	}
	
	
	
	

}

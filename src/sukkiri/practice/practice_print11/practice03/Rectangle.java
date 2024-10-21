package sukkiri.practice.practice_print11.practice03;

public class Rectangle extends Shape{
	
	/*fields*/
	private int width;
	private int height;
	
	
	/*constructor*/
	public Rectangle(int width, int height) {
		//super();は自動的に呼ばれるので省略可能
		this.width = width;
		this.height = height;
	}


	@Override
	public void draw() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(getSymbol());
				
			}
			System.out.println();
		}
		
	}
	

}

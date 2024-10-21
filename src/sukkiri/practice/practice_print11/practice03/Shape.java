package sukkiri.practice.practice_print11.practice03;

public abstract class Shape {
	/*fields*/
	private final String SYMBOL = "+";
	private final String HORZLINE = "-";
	private final String VERTLINE = "|";
	
	
	//default constructor 記述しなければ、暗黙的に呼ばれる
	//public Shape(){}
	
	//抽象メソッド
	public abstract void draw();
	
	
	
	//getter
	public String getSymbol() {
		
		return this.SYMBOL;
	}

	public String getHorzline() {
		return this.HORZLINE;
	}

	public String getVertline() {
		return this.VERTLINE;
	}
	
	
	//定数のため、setter不要
	
	
	
	

}

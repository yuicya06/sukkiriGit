package sukkiri.practice.practice_print11.practice03;

public class Point extends Shape{

	@Override
	public void draw() {
		System.out.println(getSymbol());
		
	}
	//default constructor 記述しなければ、暗黙的に呼ばれる
}

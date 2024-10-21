package sukkiri.practice.practice_print12.practice01;

public class Main {
	

//	●Mainクラス
//	・メソッド
//	mainメソッド
//	：要素数が2のShape型配列を生成する。
//	5.0をコンストラクタに渡し、Circleクラスのインスタンスを生成する。
//	4.0と6.0をコンストラクタに渡し、Rectangleクラスのインスタンスを生成する。
//	上記のインスタンス2つを配列に代入する。
//  出力結果例のように、各インスタンスのcalculateAreaメソッドを呼び出し、面積を表示する。
	
//	出力結果例
//	Circle Area   : 78.53981633974483
//	Rectangle Area: 24.0


	public static void main(String[] args) {
		
		
//		要素数が2のShape型配列を生成する
		Shape[] shape = new Shape[2];
		
		shape[0] = new Circle(5.0);
		shape[1] = new Rectangle(4.0, 6.0);
		
		
		
		for(Shape sh : shape) {
			
			if(sh instanceof Circle) {
				System.out.println(/*"Circle Area   :"+*/ sh.calculateArea());
				
			}
			
			if(sh instanceof Rectangle) {
				System.out.println(/*"Rectangle Area:" +*/ sh.calculateArea());
				
			}
			
			
		}
		
		
		
	}

}

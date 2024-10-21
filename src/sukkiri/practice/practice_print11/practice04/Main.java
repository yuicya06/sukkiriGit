package sukkiri.practice.practice_print11.practice04;

//●Mainクラス

//・メソッド
//　　mainメソッド
//	：5.0をコンストラクタに渡し、Circleクラスのインスタンスを生成する。
//4.0と6.0をコンストラクタに渡し、Rectangleクラスのインスタンスを生成する。
//	出力結果例のように、各インスタンスのcalculateAreaメソッドを呼び出し、面積を表示する。

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(4.0, 6.0);

		System.out.printf("Circle Area   : %4.2f\n" , circle.calculateArea());
		System.out.println("Rectangle Area: " + rectangle.calculateArea());

	}

}

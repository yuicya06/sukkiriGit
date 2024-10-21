package sukkiri.practice.practice_print14.practice04;

//●MathUtilityクラス

//・フィールド　※修飾子はpublic、static、final 
//型	変数名・定数名
//double	PI = 3.14159265359
//・メソッド　※すべてstatic
//　　addメソッド
//　　　：double型引数2つを受け取り、それらを加えた値を返す。
//　　substractメソッド
//　　　：double型引数2つを受け取り、第1引数から第2引数を引いた値を返す。
//　　multiplyメソッド
//　　　：double型引数2つを受け取り、それらを掛けた値を返す。
//　　divideメソッド
//　　　：double型引数2つを受け取り、第1引数を第2引数で割った値を返す。
//　　　　ただし、第2引数に0を受け取った場合は以下を記述し、例外処理をする。
//	　throw new IllegalArgumentException("Division by zero is not allowed.");

public class MathUtility {

	/*fields*/
	public static final double PI = 3.14159265359;

	/*methods*/
	public static double add(double x, double y) {

		return x + y;

	}

	public static double substract(double x, double y) {

		return x - y;

	}

	public static double multiply(double x, double y) {

		return x * y;

	}

	public static double divide(double x, double y) {

		if (y == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}

		return x / y;

	}

}

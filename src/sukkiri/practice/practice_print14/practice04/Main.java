package sukkiri.practice.practice_print14.practice04;

//Mainクラス

//・メソッド
//　　mainメソッド
//　　　： MathUtilityクラスからフィールド、メソッドを呼び出し、出力結果例のように表示する。
//
//出力結果例
//PI: 3.14159265359
//3 + 5 = 8.0
//10 - 4 = 6.0
//2 * 6 = 12.0
//8 / 2 = 4.0

public class Main {

	public static void main(String[] args) {

		System.out.println("PI:" + MathUtility.PI);
		System.out.println(MathUtility.add(3, 5));
		System.out.println(MathUtility.substract(10, 4));
		System.out.println(MathUtility.multiply(2, 6));
		System.out.println(MathUtility.divide(8, 0));

	}

}

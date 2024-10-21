package sukkiri.practice.practice_print14.practice01;

//●Mainクラス
//・メソッド
//　　mainメソッド
//　　　：3.0と4.0をコンストラクタに渡し、Vectorクラスのインスタンスを生成する。
//　　　　インスタンスのtoStringメソッドを呼び出し、出力結果例のように表示する。


public class Main {

	public static void main(String[] args) {

		Vector vector = new Vector(3.0, 4.0);
		
		System.out.println("Vector:" + vector.toString());
		
	}

}

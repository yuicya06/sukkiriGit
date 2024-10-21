package sukkiri.practice.practice_print11.practice01;

public class Main {
	
//	●Mainクラス
//	・メソッド
//	　　mainメソッド
//	　　　：コンストラクタに「Buddy」を渡し、Dogクラスのインスタンスを生成し、
//	   親クラスからオーバーライドして実装したメソッドを呼び出す。


	public static void main(String[] args) {
		
		Dog d = new Dog("Buddy");
		d.makeSound();

	}

}

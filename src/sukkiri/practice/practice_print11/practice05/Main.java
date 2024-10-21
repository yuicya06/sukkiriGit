package sukkiri.practice.practice_print11.practice05;

//●Mainクラス
//・メソッド
//　　mainメソッド
//　　　：「Lion」をコンストラクタに渡し、Animalクラスのインスタンスを生成する。
//そのインスタンスのeatメソッド、breatheメソッド、makeSoundメソッドを呼び出す。


//出力結果例
//Lion makes a sound.
//Lion is eating.
//Lion is breathing.


public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Lion");
		
		animal.makeSound();
		animal.eat();
		animal.breathe();

	}

}

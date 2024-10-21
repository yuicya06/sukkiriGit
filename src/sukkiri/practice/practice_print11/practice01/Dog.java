package sukkiri.practice.practice_print11.practice01;

//●Dogクラス(Animalクラスを実装)
//・コンストラクタ
//　　：引数を１つ受け取り、親クラスのコンストラクタに渡す。
//・メソッド
//　　makeSoundメソッド
//　　　　：親クラスのmakeSoundメソッドをオーバーライドし、実装する。
//出力結果例のようにコンソールに表示する。


public class Dog extends Animal {
	
	

	public Dog(String name) {
		super(name);
	}
	
	
	/*implements abstract method*/
	@Override
	public void makeSound() {
//		System.out.println(super.getName() + " says Woof!");
		System.out.println(this.getName() + " says Woof!");
	}



}

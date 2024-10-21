package sukkiri.object_.abstract_class.sample01;


//ただ引き継ぐだけなら、Dogクラスにabstractを付ける
//もしくは実装する
public class Dog extends Animal {
	//コンストラクタ
	public Dog(String name) {
		super(name);
	}

	//抽象メソッドの実装
	@Override /*③抽象メソッドの実装*/
	void run() {
		System.out.println(getName() + "は走りました");
	}
}

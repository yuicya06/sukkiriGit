package sukkiri.object_oriented.inheritance.sample01;

//①extends(親にAnimalクラス、子にDogクラス)
public class Dog extends Animal {

	//コンストラクタ ②コンストラクタ(super(引数リスト))
	public Dog(String name) {
		//this()みたいな
		super(name);//親クラスのコンストラクタを呼び出す
	}

	//差分フィールド ③差分メンバ
	private int age;

	//差分メソッド(showAge(), getter, setter) ③差分メンバ
	public void showAge() {
		System.out.println(this.age + "歳");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//親クラスの run メソッドをオーバーライド ④オーバーライド
	//メソッドの再定義
	//オーバーライド時はアノテーションをつけた方が良い
	@Override
	public void run() {
		System.out.println(getName() + "は走りました");
	}

}

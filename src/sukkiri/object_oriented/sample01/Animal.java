package sukkiri.object_oriented.sample01;

public class Animal {
	//①フィールド(属性)の設定
	//インスタンスフィールド
	//インスタンス変数とは、個々の変数
	//スタティックフィールド（14章）
	//private、public:アクセス修飾子、他のクラスからアクセスの許可など
	private String name;
	private int age;

	//②コンストラクタ
	//特殊なメソッドみたいなもの（9章）
	//役割：フィールドに値を設定するもの
	public Animal(String name, int age) { //引数が 2 つのコンストラクタ

		//this 自分自身の（インスタンスの）フィールド変数に、引数の値をセット
		this.name = name;
		this.age = age;
	}

	public Animal() {
	} //引数がないコンストラクタ
		//④その他メソッド（5章）
		//staticなし

	public void show() {
		System.out.println("吾輩は" + this.name + "である。");
		System.out.println(this.age + "歳である。");
	}

	//③getter, setter メソッド
	//役割：フィールドの値をget、setする
	//getterはどこからでもアクセスしたいので、public
	//setterはどこからでもアクセスしたいので、public
	
	//コンストラクタと、setの違いは、セットするタイミング
	//コンストラクタはインスタンス生成時
	//setterはそのあと
	
	//変数名:get ＋ フィールド変数名
	public String getName() {
		return this.name;
	}

	//変数名:set ＋ フィールド変数名(変数名は基本フィールドと揃える)
	public void setName(String name) {
		this.name = name;
	}

	//変数名:get ＋ フィールド変数名
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
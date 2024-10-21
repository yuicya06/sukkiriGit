package sukkiri.lesson09.sample08;

public class Hero {
	String name;
	int hp;
	Sword sword;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}

	public Hero(String name) { //コンストラクタ①
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name;//引数の値でnameフィールドを初期化
		System.out.println("args:" + name);
	
	}
	
	
	//9-12
	//コンストラクタ内で別のコンストラクタを作成
	public Hero() { //コンストラクタ②
		this("ダミー");
		System.out.println("finish calling another constructor");
	 //Hero("ダミー")と同じ意味
		
		
		
	}
	
	/*<thisに関して>
	this.フィールド変数：自分自身のインスタンスのフィールドにアクセス
	this():別コンストラクタの呼び出し
	*/

}
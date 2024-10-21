package sukkiri.lesson09.sample07;


public class Hero {
	String name;
	int hp;
	Sword sword;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	
	public Hero(String name) {
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name;//引数の値でnameフィールドを初期化
		System.out.println("have args");
	}
	
	
	//9-12 引数の個数、型が異なれば同名で定義できる
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
		System.out.println("no args");
	}

}
package sukkiri.lesson09.sample05;

public class Hero {
	String name;
	int hp;
	Sword sword;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	//9-8
	//9-10

	//9-10 引数追加、その引数をフィールドにセット
	public Hero(String name) {
		this.hp = 100; //hpフィールドを100で初期化
		//9-10
		this.name = name; //引数の値でnameのフィールドを初期化
	}

	
			public Hero() {
				//this.(第8章)
				this.hp = 100; //hpフィールドを100で初期化
			}
}

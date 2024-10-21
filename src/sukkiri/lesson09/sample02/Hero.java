package sukkiri.lesson09.sample02;

public class Hero {
	//9-3
	String name;
	int hp;
	Sword sword;//Hero has a Sword

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}

}

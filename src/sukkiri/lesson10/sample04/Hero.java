package sukkiri.lesson10.sample04;


public class Hero {
//	10-1
	String name = "ミナト";
	int hp = 100;
	//10-10
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	

	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -=5;
		System.out.println("5ポイントのダメージを与えた！");
		
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//10-7
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
		
	}
	

}

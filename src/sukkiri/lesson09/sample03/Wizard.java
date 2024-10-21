package sukkiri.lesson09.sample03;

public class Wizard {
	//9-5
	String name;
	int hp;
	
	//引数にHero型のインスタンスを受け取る
	//インスタンスメソッド（他のクラスからだとインスタンスを作らないと使えない）
	public void heal (Hero h) {
		h.hp += 10;//引数で受け取ったHeroクラスのインスタンスをhpを10加算
		System.out.println(h.name + "のHPを10回復した！");
	}
	
	//staticがあるメソッド（１４章）
	//クラスが持っているメソッド
	//インスタンス化せずに使える
	//class.method();で呼び出せる
	public static void aaa() {
		
	}

}

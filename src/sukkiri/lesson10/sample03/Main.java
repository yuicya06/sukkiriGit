package sukkiri.lesson10.sample03;


public class Main {
	
	public static void main(String[] args) {
		
		Hero h = new Hero();
//		h.run();
		SuperHero sh = new SuperHero();
//		sh.run();
		
		
		
		
		Matango m = new Matango();
		//親クラス
		h.attack(m);
		
		System.out.println("--------------");
		
		sh.name = "湊";
		System.out.println("before calling fly method:" + sh.flying);//flyメソッドのインスタンスを作る前
		sh.fly();
		System.out.println("after calling fly method:" + sh.flying);
		
		//子クラスのアタックメソッドを呼び出す
		//メソッド内のメソッド親クラスの親クラスを呼ぶ
		//if文
		sh.attack(m);
		
		/*出力結果*/
		//１回目はsuper.で2回目はif文の中のsuper.
//		湊の攻撃！
//		5ポイントのダメージを与えた！
//		湊の攻撃！
//		5ポイントのダメージを与えた！

	}

}

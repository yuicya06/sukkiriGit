package sukkiri.lesson10.sample02;

public class Main {

	public static void main(String[] args) {
		//10-6
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		
		sh.name = "minato";
		System.out.println(sh.name);
		sh.run();
		
		
		//h.fly();エラー
		
		//子クラスのインスタンスを親クラス型に代入
		Hero minato = new SuperHero();
		//= doubel a = 2
		//Heroの方がより大きな箱
		
		//親クラス型に入れても、オーバーライドした方を呼び出す
		minato.run();
		//子にあるメソッド、なので親クラス型にいれてるので、親クラスにあるメソッドしか呼び出せない
		minato.land();//エラー
		//cast で解決
		//１２章
		
		

	}

}

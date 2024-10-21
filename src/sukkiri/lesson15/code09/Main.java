package sukkiri.lesson15.code09;

public class Main {

	public static void main(String[] args) {

		// Heroクラスのインスタンスを生成
		Hero hero = new Hero();

		//field
		hero.name = "minato";
		hero.job = "hero";
		hero.gold = 280;

		//書式指定文字列を定数FORMATに代入
		//final 第2章 定数 再代入禁止
		//書式指定文字列、%部分：あとで値を入れる（プレースホルダー）
		final String FORMAT = "%-9s %-13s 所持金%,6d";

		/*
				%-9s 左寄せ 9桁確保 文字列
				%-13s 左寄せ 13桁確保 文字列
				%, 6d 右寄せ 6文字確保 整数 3桁ごとにカンマを入れる
		
		*/

		//これまでは、Stringクラスは変数を使っていた
//		String str = "abc";
//		System.out.println(str.length());

		//Stringクラスのformatメソッドを使用する場合
		//format(黄緑太文字) static がついてるかどうかのメソッドの違い
		//String.formatメソッドの第一引数に定数を渡し、それをString型変数に代入
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
//		実行結果
//		minato    hero          所持金   280
		
		System.out.println(s);

		System.out.println("---------------------");
		System.out.printf(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		
		
		//minatoさん
		Hero minato = new Hero();
		minato.name = "minato";
		minato.job = "hero";
		minato.gold = 30000;

		//sugawaraさん
		Hero sugawara = new Hero();
		sugawara.name = "sugawara";
		sugawara.job = "hero";
		sugawara.gold = 30000;

	}

}

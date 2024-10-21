package sukkiri.practice.practice_print04.practice03;

public class Main {

	public static void main(String[] args) {
		//配列namesの各要素を下記の値で初期化
		//のび太	すねお	ジャイアン	しずかちゃん	出木杉君
		String[] names = {"のび太", "すねお", "ジャイアン", "しずかちゃん", "出木杉君"};

		//ループ文を使用して順番に表示
		for(int i = 0; i < names.length; i++) {
			System.out.println("names["+ i + "]:" + names[i] );
		}
		/*
		 * 実行結果
		names[0]:のび太
		names[1]:すねお
		names[2]:ジャイアン
		names[3]:しずかちゃん
		names[4]:出木杉君
		 */
	}

}

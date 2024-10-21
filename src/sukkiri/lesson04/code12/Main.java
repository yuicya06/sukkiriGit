package sukkiri.lesson04.code12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] seq = new int[10]; //要素型int 要素数１０の配列名seq
		Random rand = new Random();

		//塩基配列をランダムに生成
		for(int i = 0; i < seq.length; i++) {
			seq[i] = rand.nextInt(4);  //要素に代入（0～3の乱数値を代入）
			System.out.println("seq[" + i + "]:" + seq[i]);

		}

		System.out.println("--------塩基配列を表示--------");


		/*
				for(int i = 0; i < seq.length; i++) {
					System.out.print("seq[" + i + "]の乱数値を塩基配列で表すと:");
					switch(seq[i]) {
					case 0 -> {
						System.out.println("A");
					}
					case 1 -> {
						System.out.println("T");
					}
					case 2 -> {
						System.out.println("G");
					}
					case 3 -> {
						System.out.println("C");
					}

					}
				}
		 */

		//コード4-12で出力したもを＝＞ランダムにATGCを１０個表示したい
		//塩基配列を作成
		char[] base = {'A', 'T', 'G', 'C'};

		//ランダムにATGCを１０表示
		for (int i = 0; i < seq.length; i++) {
			System.out.print("seq[" + i + "]の乱数値を塩基配列で表すと:");
			System.out.println(base[seq[i]]);
			/*
			 * 
						int baseType = seq[i];
						char baseChar = base[ baseType];
						System.out.println( baseChar + " ");

			 */
		}
	}

}

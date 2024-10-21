package sukkiri.practice.practice_print04.addtion.practice02;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//		（１）	int型配列aryを要素数20で宣言してください
		int[] ary = new int[20];
		//		（２）	aryの各要素に、乱数を用いて０～９９の値をセットしてください。
		Random rand = new Random();

		for (int i = 0; i < ary.length; i++) {
			ary[i] = rand.nextInt(100);
			//		（３）	aryの要素を全部表示してください
			System.out.printf("%2d", ary[i]);
			System.out.print(" ");
		}

		System.out.println("");
		//		（４）	aryを二重for文、if文を使い昇順で並び替えてください。

		for (int i = 0; i < ary.length - 1; i++) {
			int min = ary[i];
			int minIndex = i;

			for (int j = i + 1; j < ary.length; j++) {
				if (ary[j] < min) {
					min = ary[j];
					minIndex = j;
				}
			}
			ary[minIndex] = ary[i];
			ary[i] = min;

		}

		//		（５）	aryの要素を再度全部表示してください
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%2d", ary[i]);
			System.out.print(" ");
		}

	}

}

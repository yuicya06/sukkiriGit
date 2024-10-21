package sukkiri.practice.practice_print05.addition.practice02;

import java.util.Scanner;

public class Main {

	//【　引数：配列　戻り値：あり　】
	//問２　 メソッド名： getMinValue
	//引数：int[]型 array
	//戻り値の型：int
	//処理の内容： 引数で受け取る配列の要素のうち、最も小さい値をmainメソッドに返す。
	//		※最小値の初期値としてInteger.MAX_VALUEを使うこと

	public static int getMinValue(int[] array) {

		int min = Integer.MAX_VALUE;

		for (int x : array) {

			if (min > x) {

				min = x;

			}

		}

		return min;
	}

	//メソッド名：main
	//引数：String[] args
	//		　戻り値：なし
	//処理の内容：①int型配列を要素数５で宣言する
	//		　　　②for文を使い配列の各要素にキーボードから入力を行う
	//		　　　③getMinValueメソッドに配列を渡して呼び出し、戻り値を受け取る
	//		　　　④「最小値は（戻り値）です」という形で表示する。

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {

			System.out.print("入力:");
			array[i] = sc.nextInt();

		}

		System.out.printf("最小値は%dです", getMinValue(array));

	}

}

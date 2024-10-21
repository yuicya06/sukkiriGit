package sukkiri.practice.practice_print04.addition2.practice02;

import java.util.Scanner;

public class Main {
	//	問２　以下の手順でプログラムを作成しましょう。
	//	(1)9×９の形の二次元配列を宣言してください。（int型配列　変数名MulTable）
	//	(2)二重for文を使い、MulTableに九九の値をセットしてください
	//（配列のインデックスと九九の桁が異なるため、配列の要素に値を入れるときは少し工夫が必要。）

	//	(3)キーボードから整数値を入力し、それがMulTableに存在するかどうか調べる。
	//　　　　二重for文とif文を使い、入力値が存在する場合は全ての組み合わせと件数を表示する。
	//　　　　存在しない場合は、「入力値が九九の表には存在しません」と表示する。
	//実行結果例	実行結果例
	//整数値を入力：16（入力）
	//２×８（表示）
	//４×４（表示）
	//８×２（表示）
	//３件見つかりました。（表示）	整数値を入力：73（入力）
	//入力値が九九の表には存在しません（表示）

	public static void main(String[] args) {
		//		(1)9×９の形の二次元配列を宣言してください。（int型配列　変数名MulTable）
		int[][] MulTable = new int[9][9];

		//		(2)二重for文を使い、MulTableに九九の値をセットしてください
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				MulTable[i][j] = (i + 1) * (j + 1);
			}
		}

		//		3)キーボードから整数値を入力し、それがMulTableに存在するかどうか調べる。
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int input = sc.nextInt();
		int count = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (MulTable[i][j] == input) {
					System.out.printf("%d × %d\n", i + 1, j + 1);
					count++;
				}

			}
		}

		if (count == 0) {
			System.out.println("入力値が九九の表には存在しません");

		} else {

			System.out.printf("%d件みつかりました", count);
		}

	}

}

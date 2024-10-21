package sukkiri.practice.practice_print03.print03.addition.practice02;

import java.util.Scanner;

public class Main {

	//	問2	   While文を使い０を入力するまで、延々とキーボードから入力される正の整数値を加算していく  プログラムを作成しましょう。
	//	負の整数値が入力された場合は加算しない。（無限ループ、break文、continue文、if文）
	//	実行結果例
	//	入力：３
	//	入力：２
	//	入力：４
	//	入力：１
	//	入力：-3
	//	入力：５
	//	入力：０
	//
	//	合計は15です。（表示）

	public static void main(String[] args) {

		//Scanner 準備
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		//while 無限ループ
		while (true) {
			System.out.print("入力：");
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			else if (n > 0) {
				sum += n;
			}

			else  {
				continue;

			}

		}
		System.out.printf("合計は%sです。（表示）", sum);

	}

}

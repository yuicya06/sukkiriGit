package sukkiri.practice.practice_print03.print03.addition.practice04;

import java.util.Scanner;

public class Main {
	
	
//	問4  キーボードから直角三角形の段数を入力し、for文の二重ループを使って、左上側が直角の直角三角形を表示するプログラムを作成しましょう。
//	実行結果例  5段の場合
//	入力：5
//
//	*****
//	****
//	***
//	**
//	*



	public static void main(String[] args) {
		//Scanner の準備
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i ; j--) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}

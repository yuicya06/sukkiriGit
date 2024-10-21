package sukkiri.practice.practice_print03.print03.addition.practice06;

import java.util.Scanner;

public class Main {

	//	問6  do-while文を使い、「ｙ/n」が入力されるまで再入力を求めるプログラムを作成しましょう。
	//	実行結果例 
	//	入力してください（y/n）:o（表示：入力）
	//	入力してください（y/n）:u（表示：入力）
	//	入力してください（y/n）:y（表示：入力）
	//	プログラムを終了します。（表示）

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";

		do {

			System.out.print("入力してください（y/n）:");
			s = sc.nextLine();

		} while (!(s.equals("y") || s.equals("n")));

		System.out.print("プログラムを終了します。");

	}

}

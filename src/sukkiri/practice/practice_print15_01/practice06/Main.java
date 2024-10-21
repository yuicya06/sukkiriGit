package sukkiri.practice.practice_print15_01.practice06;

import java.util.Scanner;

public class Main {

	//	問6	郵便番号を表す正規表現を使って、キーボード入力した文字が郵便番号を表すかどうか判定するプログラムを作りましょう。
	//
	//	実行結果例１
	//	>> 123-4567
	//	郵便番号です
	//
	//	実行結果例２
	//	>> 1234567
	//	郵便番号ではありません

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("郵便番号：");
		String str = sc.nextLine();

		//8桁 -あり すべて数字
		//^[0-9]{3}-[0-9]{4}$
		//p541  ^ 先頭 $ 末尾　（ハット、ダラー）
		if (str.matches("[1-9][0-9]{2}[-][0-9]{4}")) {
			System.out.println("郵便番号です");

		} else {
			System.out.println("郵便番号ではありません");

		}

	}

}

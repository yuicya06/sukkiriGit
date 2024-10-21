package sukkiri.practice.practice_print15_01.practice01;

import java.util.Scanner;

public class Main {

	//	問1	String型変数strAとstrBに、それぞれにキーボードから文字列を入力させ、strAとstrBの内容が等しいかどうかを調べ、「等しい」または「等しくない」を表示するプログラムを書きましょう。
	//
	//	実行結果例							実行結果例
	//	strA:あいうえお(入力)				strA:あいうえお(入力)
	//	strB:あいうえお(入力)				strB:かきくけこ(入力)
	//	strAとstrBは等しいです。（表示）	strAとstrBは等しくないです。（表示）
	//	

	public static void main(String[] args) {
			
		//入力値受付
		Scanner sc = new Scanner(System.in);
		System.out.print("strA:");
		String strA = sc.nextLine();
		System.out.print("strB:");
		String strB = sc.nextLine();
		

		//2つの入力値の比較
		if (strA.equals(strB)) {
			System.out.print("等しいです");
		} else {
			System.out.print("等しくないです");
		}

	}

}

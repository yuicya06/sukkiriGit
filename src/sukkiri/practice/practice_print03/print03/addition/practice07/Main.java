package sukkiri.practice.practice_print03.print03.addition.practice07;

import java.util.Random;
import java.util.Scanner;

public class Main {

	//	問7     do-while文、switch文、乱数を使い、おみくじのプログラムを作成してください。
	//		乱数値は0～3の範囲になるようにしてください。
	//		値が０のときは凶、１のときは吉、２のときは中吉、３のときは大吉を表示。
	//		結果を表示後、再度おみくじを行うか確認を求め、入力値がyの場合は再度おみくじを、
	//	    nの場合はおみくじを終了させてください。
	
	
	//		実行結果例 （入力正常時）	実行結果例（入力不正時）
	//		あなたの運勢は中吉です。(表示)
	//		再度おみくじを行いますか？(y/n): y（yの場合）
	//		あなたの運勢は凶です。(表示)
	//		再度おみくじを行いますか？(y/n): n(nの場合)
	//		おみくじを終了します。(表示)	あなたの運勢は大吉です。(表示)
	//		再度おみくじを行いますか？(y/n): a
	//		入力が不正です。(表示)
	//		再度おみくじを行いますか？(y/n): b
	//		入力が不正です。(表示)

	public static void main(String[] args) {
		//Scanner
		//乱数値は0～3の範囲になるようにしてください。
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int r = rand.nextInt(4);

		//y or n
		String ans = "";

		//		値が０のときは凶、１のときは吉、２のときは中吉、３のときは大吉を表示。
		do {

			switch (r) {

			case 0 -> {
				System.out.println("あなたの運勢は凶です。");
			}
			case 1 -> {
				System.out.println("あなたの運勢は吉です。");
			}
			case 2 -> {
				System.out.println("あなたの運勢は中吉です。");
			}
			case 3 -> {
				System.out.println("あなたの運勢は大吉です。");

			}
			default -> {
				;
			}

			}

			System.out.print("再度おみくじを行いますか？(y/n):");
			ans = sc.nextLine();

			while (!(ans.equals("y") || ans.equals("n"))) {
				System.out.print("入力が不正です。");
				System.out.print("再度おみくじを行いますか？(y/n):");
				ans = sc.nextLine();

			}

			if (ans.equals("n")) {
				break;
			}

		}

		while (ans.equals("y"));
		
		System.out.println("おみくじを修了します。");

	}

}

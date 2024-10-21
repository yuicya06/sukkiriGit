package sukkiri.practice.practice_print02.practice09;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//（グー：０、チョキ：１、パー：２）入力
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("グー：０、チョキ：１、パー：２");
		int num = sc.nextInt();

		//コンピュータの手を乱数を用いて取得する
		int num_pc = rand.nextInt(3);

		if (num >= 0 && num <= 2) {

			//if文を使い、「あなたの手はグーです」
			//「あなたの手はチョキです」
			//「あなたの手はパーです」を表示させる条件分を作る
			if (num == 0) {
				System.out.println("あなたの手はグーです");
			} else if (num == 1) {
				System.out.println("あなたの手はチョキです");
			} else {
				System.out.println("あなたの手はパーです");

			}

			//また、同様に「コンピュータの手はグーです」
			//「コンピュータの手はチョキです」
			//「コンピュータの手はパーです」を表示させる条件分を作る

			System.out.println("pc:" + num_pc);

			if (num_pc == 0) {
				System.out.println("コンピュータの手はグーです");
			} else if (num_pc == 1) {
				System.out.println("コンピュータの手はチョキです");
			} else {
				System.out.println("コンピュータの手はパーです");

			}

			//お互いの手を表示した後、自分の手とコンピュータの手から
			//条件分を使い勝負結果を表示する
			//自分の勝ちの場合は、「あなたの勝ちです」
			//コンピュータの勝ちの場合、「あなたの負けです」
			//あいこの場合は、「あいこです」と表示する

			if (((num - num_pc) + 3) % 3 == 2) { 	   //
				System.out.println("あなたの勝ちです");
			} else if (((num - num_pc) + 3) % 3 == 1) {//
				System.out.println("あなたの負けです");
			} else {								   //
				System.out.println("あいこです");
			}

		} else {//入力値外
			System.out.println("入力が不正です");
		}
		sc.close();
	}
}

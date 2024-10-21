package sukkiri.practice.practice_print02.practice04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		/*
		 読み込んだ整数値が正であれば偶数/奇数を半手して表示
		 */

		// step1.整数値の読み込み
		// step2.条件分岐:整数値が正かどうか
		// step3. step2がtureの時、さらに条件分岐（偶数かどうか）


		// step1
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力:");
		int n = sc.nextInt();


		// step2
		if(n > 0) {	//入力値が正の場合

			if(n % 2 == 0) {//入力値が偶数
				System.out.println("その値は偶数です");
			} else {//入力値が偶数ではない（つまり奇数）
				System.out.println("その値は奇数です");
			}

		} else {//入力値が正以外の場合
			System.out.println("正でない値が入力されました");
		}

		sc.close();

	}

}

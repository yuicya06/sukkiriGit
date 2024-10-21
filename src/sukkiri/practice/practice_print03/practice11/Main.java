package sukkiri.practice.practice_print03.practice11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*for文を使い、整数を５回入力し平均を表示するプログラム*/

		/*入力は5回行うため、for文の中にキーボードから入力を求める文を書く。*/
		/*キーボードから入力をするたびに用意した変数に値を加算していく。*/
		/*平均を表示するのは1回のためfor文を抜けたあとに文を書く。*/

		//Scannerの用意
		Scanner sc  = new Scanner(System.in);
		//和を格納する変数の用意
		int sum = 0;
		//for文の作成
		for(int i = 0; i < 5; i++) {
			//			|-入力値の受付
			System.out.print("入力：");
			//			|- 和を格納する変数に入力値を加算
			int n_i = sc.nextInt();
			sum += n_i;
		}

		//平均値を表す変数を初期化（平均値＝データの和/データの個数)
		//平均値を表す変数を表示
		double ave = (double)sum / 5;

		System.out.println("平均：" + ave);


	}
}

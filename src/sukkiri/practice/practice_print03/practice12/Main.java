package sukkiri.practice.practice_print03.practice12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*for文を使い、整数を3回入力し最小値を求めるプログラム*/
		
		/*キーボードから入力した値を受け取るint型変数を用意する*/
		/*最小値を入れるためのint型変数を用意する。（for文の外に事前に用意しておく）*/
		/*for文の中で、if文の練習問題問５のようなif文の条件処理のプログラムを書いていく。*/

		//Scannerの用意
		//最小値を表す変数の初期化（int型の最大値を初期値とする）
		//for文の作成、 条件は3回まで
		//入力の受付
		//入力値を変数に代入
		//入力値の数と最小値を比べるif文
		//入力値が最小値より小さければ、最小値の変数に入力値を代入
		//for文終了、最初値はminですと出力
		
		
		
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		//for文で3回入力値を受け取る
		for(int i = 0; i < 3; i++) {
			System.out.print("入力：");
			int n = sc.nextInt();

			if( min > n) {
				min = n;
			}

		}

		System.out.printf("最小値は%dです\n", min);



	}

}

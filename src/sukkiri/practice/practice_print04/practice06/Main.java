package sukkiri.practice.practice_print04.practice06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		//＜前半＞
		//下記表はＢ君のテストの点数です。
		//String型配列subjects 英語	国語 数学 社会 理科
		String[] subjects = {"英語", "国語", "数学", "社会", "理科"};

		//int型配列scoresを作りましょう。48	60	50	42	80
		int[] scores = new int[subjects.length];

		//for文を使い配列scoresに
		//キーボードより点数を入力し、実行結果のようにＢ君の点数を表示してください。（ループ条件にはlengthを利用すること）
		//Scanner 準備
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + "＞");
			scores[i] = sc.nextInt();
		}
		//結果の表示
		System.out.print("B君:");
		for(int i = 0; i < subjects.length; i++) { 
			System.out.print(subjects[i] +" " + scores[i] +"点");
			//４教科までは「,」をつける
			if(i < 4) {
				System.out.print(",");
				//最後は改行
			} else {
				System.out.println("");
			}
		}

		//＜後半＞
		/*
			上記の実行結果例を元にB君の点数を表示後、
			Ｂ君の追試が必要な科目数を求めて表示する
			50点以下の科目を追試とします。

			※int型配列scores、for文、if文を使ってください。（ループ条件にはlengthを利用すること）
			実行結果例
			B君は3科目追試が必要です。

		 */

		//科目数の合計count
		int count = 0;

		//５教科の得点の判定をfor文で行う
		for(int i = 0; i < subjects.length; i++) {

			if(scores[i] <= 50) {//50点以下ならcountをインクリメント
				count++;
			}
		}
		//結果表示
		System.out.println("B君は" + count +"科目追試が必要です。");




	}

}



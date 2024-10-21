package sukkiri.practice.practice_print03.practice13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*	While文を使い、０を入力するまで、
			延々とキーボードから入力される整数値を加算していくプログラム*/
		
			//テキストP132を参考に、whileで無限ループを作り、while文の中でキーボードから入力を受け付ける。
			//if文を用いて０が入力されたらbreakでwhile文から抜ける。
			//０以外が入力された場合は、入力された整数値をひたすら加算していく。
			//（事前に入力された値を加算代入するための変数を用意しておく）
			//while文から抜けた後、加算した合計値を表示する。
		
		
		//Scannerの用意
		Scanner sc = new Scanner(System.in);
		//和を格納する変数を用意
		int sum = 0;
		//while文（無限ループ）を作成
		while(true) {
			//		|-入力の受付
			System.out.print("入力＞");
			//		|-分岐処理
			int n = sc.nextInt();
			//			|-入力値が0→while文を離脱
			if(n == 0) {
				break;
			}
			//			|-入力値が0以外→加算処理
			sum += n;

		}

		//和を表す変数を表示
		System.out.println(sum);
	}

}

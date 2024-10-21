package sukkiri.practice.practice_print02.practice03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		/*
		 読み込んだ二つの整数値は等しいかどうか判断する
		 */

		/*
		 int型変数a及びbを宣言し、
		 キーボードから整数値を入力させる
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int a = sc.nextInt();
		System.out.print("整数値を入力：");
		int b = sc.nextInt();

//確認用		System.out.println("a:" + a); 
//確認用		System.out.println("b:" + b);
		
		/*
		 aとbを比較し、
		 以下の実行結果通りになるようなif文を作る
		 */

		if(a == b) { //aとbの値が等しい場合
			System.out.println("aとbの値は等しいです。");
		} else { // // aとbの値が等しくない場合
			System.out.println("aとbの値は等しくないです。");

		}

		sc.close();

	}

}

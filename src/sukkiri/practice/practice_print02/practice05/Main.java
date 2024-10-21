package sukkiri.practice.practice_print02.practice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 三つの整数値の最大値を求め、
		 最大値を表示するプログラム
		 */



		//a b cを宣言し、キーボードから整数値を入力
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値aを入力:");
		int a = sc.nextInt();
		System.out.print("整数値bを入力:");
		int b = sc.nextInt();
		System.out.print("整数値cを入力:");
		int c = sc.nextInt();

		/*
		 最大値の求め方
		 int型変数maxを宣言
		 */

		int max = Integer.MIN_VALUE; //int型の最小値 -2147483648
		System.out.println("Integer.MIN_VALUE:" + max);

		/*
		 ３つの変数を順番にmaxと比較していく
		 値がmaxより大きい場合はmaxに値を代入していく
		 */


		if(a > max) { //変数aと変数maxの比較
			max = a;
		}

		if(b > max) { //変数bと変数maxの比較
			max = b;
		}

		if(c > max) { //変数bと変数maxの比較
			max = c;
		}

		/*
		変数maxにaを代入する方法
		int max = a;
		
		if(b > max)
		
		IF(c > max)
		
		 */



		System.out.println("max:" + max);





		//		if( max > b) {
		//
		//			if(max > c) {
		//				System.out.println(max);
		//			} else {
		//				max = c;
		//				System.out.println(max);
		//			}
		//
		//		} else {
		//			max = b;
		//			if(max > c) {
		//				System.out.println(max);
		//			} else {
		//				max = c;
		//				System.out.println(max);
		//			}
		//		}

		sc.close();

	}

}

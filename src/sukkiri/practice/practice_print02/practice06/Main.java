package sukkiri.practice.practice_print02.practice06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 読み込んだ整数値が0であるかどうかを判断するプログラムを作る
		 */
		/*入力読み取り*/
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力:");
		int a = sc.nextInt();
		/*条件分岐:入力値が0かどうか*/
		if(a == 0) {
			System.out.println("その値は0です。");
		} else {
			System.out.println("その値は0ではありません");
		}

		sc.close();

	}

}

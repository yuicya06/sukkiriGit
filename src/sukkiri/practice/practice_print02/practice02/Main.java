package sukkiri.practice.practice_print02.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力:");
		int n = sc.nextInt();
		
		/*
		 入力した～・・・大きい場合
		 入力した～・・・以下の場合
		 */

		if(n > 5) {
			System.out.println("5より大きい値です。");
		} else {
			System.out.println("5以下の数値です。");
		}

		sc.close();


	}

}

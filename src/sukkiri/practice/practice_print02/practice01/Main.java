package sukkiri.practice.practice_print02.practice01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力:");
		int n = sc.nextInt();
		
		
		//5より大きい場合のみ処理、5以下の場合の分岐は消してOK
		if(n > 5) {
			System.out.println("5より大きい値です");
		}
		
		sc.close();
	}

}

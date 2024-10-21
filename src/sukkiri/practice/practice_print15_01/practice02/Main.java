package sukkiri.practice.practice_print15_01.practice02;

import java.util.Scanner;

public class Main {

	//	問2	文字列をキーボードから入力し、入力された文字列の長さを表示するプログラムを書きましょう。
	//
	//	実行結果例
	//	入力：にほんむかしばなし(入力)
	//	文字列の長さ：９(表示)
	
	
	// 言語化!!!

	public static void main(String[] args) {
		
		//入力値受付
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		String str = sc.nextLine();
		
		//表示
		//int length = str.length();
		//System.out.println("文字列の長さ：" + length);
		System.out.println("文字列の長さ：" + str.length());

	}

}

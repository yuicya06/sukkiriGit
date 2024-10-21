package sukkiri.practice.practice_print01.addition.practice02;

import java.util.Scanner;

public class Main {
	
//	問２
//	double型の変数pにキーボードから円周率(3.14)を代入し、表示しましょう。
//	その後変数pを、int型にキャストして、再度表示しましょう。
//	実行結果
//	pの値を入力：3.14 (キーボード入力)
//	円周率は3.14です。//キャストする前表示
//	円周率は3です。//キャストした後表示


	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("入力＞");
		double p = sc.nextDouble();
		System.out.printf("円周率は：%.2fです\n", p);
		System.out.printf("円周率は：%dです\n", (int)p);
		
		
		
		

	}

}

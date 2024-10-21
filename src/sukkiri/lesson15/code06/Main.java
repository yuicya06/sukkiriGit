package sukkiri.lesson15.code06;

import java.util.Scanner;

public class Main {

	//	①isValidPlayerNameメソッドをstaticにする
	//	②メインメソッド内でisValidPlayerNameメソッドを呼び出し、動作を確認する
	
	
	/////////////////////
	//////正規表現//////
	///////////////////
	
	public static boolean isValidPlayerName(String name) {
			
			return name.matches("[A-Z][A-Z0-9]{7}"); //[A-Z] 0文字目がアルファベット大文字かどうかを判定
													 //[A-Z0-9] 1文字目がアルファベット大文字か、0～9かを判定
													 //{7} は直前の[A-Z0-9]を7回繰り返す
													 //[A-Z0-9] ⇒[A-Z\\d] と等しい（エスケープSのため\は2回表記）
		}

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力:");
		String name = sc.nextLine();
		System.out.println(isValidPlayerName(name));

	}
//
//	public static boolean isValidPlayerName(String name) {
//		//文字数の判定
//		if (name.length() != 8) {
//			System.out.println("8文字ではありません");
//			return false;
//		}
//
//		//最初の文字（0文字目）の判定
//		char first = name.charAt(0);
//		if (!(first >= 'A' && first <= 'Z')) {
//			System.out.println("最初の文字がA-Z以外");
//			return false;
//		}
//
//		//1文字目～7文字目の判定
//		for (int i = 1; i < 8; i++) {
//			char c = name.charAt(i);
//			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
//				System.out.println("c:" + c);
//				System.out.println("必要な文字が含まれていません");
//				return false;
//			}
//		}
//
//		return true;
//
//	}

}

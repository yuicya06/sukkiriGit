package sukkiri.practice.practice_print03.print03.addition.practice10;

import java.util.Scanner;

//問10	キーボードから直角三角形の段数を入力し、
//for文の二重ループを使って、右上側が直角の直角三角形を表示するプログラムを作成しましょう。
//実行結果例  5段の場合
//入力：5
//
//*****
// ****
//  ***
//   **
//    *

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int n = sc.nextInt();

		//空白の数が0 1 2 3
		
		for (int i = 0; i < n; i++) {
			
			
			for (int j = 0; j < n; j++) {
			
				if(j <=i-1) {
					System.out.print(" ");	
					
				} else {
					System.out.print("*");	
					
				}
				

			}
			System.out.println("");

		}

	}

}

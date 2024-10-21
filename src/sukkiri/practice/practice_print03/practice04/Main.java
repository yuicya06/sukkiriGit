package sukkiri.practice.practice_print03.practice04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//nをキーボードから入力
		Scanner sc = new Scanner(System.in);
		//入力値の受付
		System.out.print("入力値＞");
		int n = sc.nextInt();
		//1～n(入力値）までを表示
		
		//和を合計する変数の初期化
		int sum = 0;


		//１～nのうち正の整数かつ偶数のみを加算
		for(int i = 1; i <= n; i++) {
			if(i > 0 && i % 2 == 0 ) { //偶数の時→ループ
				sum += i; //偶数のループ変数を加算
			}

		}

		System.out.println(sum);






	}

}

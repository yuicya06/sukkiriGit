package sukkiri.practice.practice_print03.practice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*m～nまでの数を表示*/
		System.out.print("mの入力＞");
		int m = sc.nextInt();
		System.out.print("nの入力＞");
		int n = sc.nextInt();
		
		
		//開始がm 終了がnまでループ
		//表示
		//和を求める
		int sum = 0;
		for(int i = m; i <= n; i++) {
			sum += i;
		}
		
		

		System.out.println(sum);

	}

}

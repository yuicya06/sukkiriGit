package sukkiri.practice.practice_print03.practice10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("mの入力＞");
		int m = sc.nextInt();
		System.out.print("nの入力＞");
		int n = sc.nextInt();



		int sum = 0;

		/*		//開始がm 終了がnまでループ
				for(int i = m; i <= n; i++) {
					sum += i;
				}
		 */
		int i = m;
		while(i <= n) {
			sum += i;
			i++;
		}

		System.out.println(sum);

	}

}

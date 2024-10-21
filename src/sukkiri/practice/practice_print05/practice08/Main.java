package sukkiri.practice.practice_print05.practice08;

import java.util.Scanner;

public class Main {

	//	 メソッド名： minValue
	//	 引数：int[]型 array
	//	 戻り値の型：int
	//	 処理の内容： 引数で受け取る配列の要素のうち、最も小さい値を返し表示する。
	//	 配列の要素数は5で固定、各値はキーボード入力とします。

	public static int minValue(int[] array) {
		//int[]	 array = {, , , , ,}; を受け取る
		int min = array[0];
		//最小値の更新作業
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		//最小値変数を返す
		return min;

	}

	public static void main(String[] args) {

		//		int min = minValue(new int[] {1, 2, 3, 4, 5});
		//		System.out.println(min);


		//配列の宣言
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		//入力を5回受け取って配列変数に格納するfor文作成
		for(int i = 0; i < 5; i++) {
			//入力受付
			System.out.print("数字を入力してください：");
			//要素に代入
			int n = sc.nextInt();
			array[i] = n;
		}
		
//		for(int x: array) {
//			System.out.println(x);
//		}

		//メソッドの呼び出しで、 int型のminが帰ってくる
		int min = minValue(array);
		System.out.println("最小値は:" + min);


	}

}

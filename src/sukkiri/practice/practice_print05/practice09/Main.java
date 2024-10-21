package sukkiri.practice.practice_print05.practice09;

import java.util.Scanner;

public class Main {

	//	メソッド名： average
	//	引数：double[] array
	//	戻り値の型：double
	//	処理の内容： 引数で受け取る配列の要素の平均値を返し表示する。
	//	配列の要素数、各値はキーボード入力とします。

	public static double average(double[] array) {
		//和の変数の初期化
		double sum = 0;
		//加算処理
		for(double x : array) {
			sum = sum + x;
		}

		//平均
		double average = sum / array.length;
		//戻り値
		return average;
	}


	public static void main(String[] args) {
		//配列の要素数と、各値はキーボードに入力
		//Scannerの準備
		Scanner sc = new Scanner(System.in);
		//要素数の受け取り
		System.out.print("要素の数を入力:");
		int indexNum = sc.nextInt();
		//配列の用意
		double[] array = new double[indexNum];

		//配列要素に入力値を大移入
		for(int i = 0; i < array.length; i++) {
			
			System.out.printf("入力値[%d]:", i + 1);
			//入力値の受付（double型）、代入
			array[i] = sc.nextDouble();
		}


		System.out.printf("平均値:%.1f", average(array));



	}

}

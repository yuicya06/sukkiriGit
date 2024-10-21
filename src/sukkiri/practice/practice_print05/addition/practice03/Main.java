package sukkiri.practice.practice_print05.addition.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {

	//	【　引数：配列　戻り値：あり　メソッド：複数】
	//	問３ 
	//	メソッド名： getAverage
	//	引数：double[] array
	//	戻り値の型：double
	//	処理の内容： 引数で受け取る配列の要素の平均値を呼び出し元のmainメソッドに返す。

	public static double getAverage(double[] array) {

		double avg = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {

			sum +=  array[i];

		}

		avg = sum / array.length;

		return avg;

	}

	//
	//	メソッド名：printAry
	//	引数：double[] d
	//	戻り値の型：なし
	//	処理の内容：引数で受け取った配列を拡張for文で全て表示する。
	//			　　　「乱数値は〇〇〇です」という形で出力表示する。

	public static void printAry(double[] d) {

		for (double x : d) {
			System.out.printf("乱数値は%dです", x);
		}

	}

	//
	//	メソッド名：getAry
	//	引数：int a
	//	戻り値の型：double[]
	//	処理の内容：①引数で受け取ったint型変数aの要素数のdouble型配列を宣言する。
	//			　　　②for文と乱数を使い、配列の各要素に0.0～1.0の間の値を代入する。
	//			　　　③printAryメソッドに配列を引数として渡しメソッドを呼び出す。
	//	　　④配列を戻り値として返す。
	//

	public static double[] getAry(int a) {
		Random rand = new Random();
		double[] x = new double[a];

		for (int i = 0; i < x.length; i++) {
			double r = rand.nextDouble();
			System.out.printf("乱数値は%.1fです\n", r);
			x[i] = r;

		}

		return x;
	}

	//	メソッド名：main
	//	引数：String[] args
	//		　戻り値：なし
	//	処理の内容：①int型変数nを宣言し、キーボードから入力を行う。
	//	②変数nをgetAryメソッドに引数として渡し、戻り値を受け取る。
	//	③getAverageメソッドに②で受け取った戻り値を引数として渡し、戻り値を受け取る。
	//		　　　④「平均値は（③の戻り値）です」という形で表示する。

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力値:");
		int n = sc.nextInt();
		double[] x = getAry(n);
		double avg = getAverage(x);
		System.out.printf("平均値は%.2fです\n", avg);

	}
	
	

}

package sukkiri.practice.practice_print16.addition.practice01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	//	問１
	//	◇必要となる知識
	//	※分散：偏差を2乗したものの平均値
	//	※偏差：データから平均値を引いたもの
	//	※標準偏差：分散の正の平方根

	//	＜メソッド＞
	//	●calculateMeanメソッド：平均を求めるメソッド
	//	処理内容：int型配列の引数を受け取り、平均値を返す。平均値はdouble型。
	public static double calculateMean(int[] scores) {

		int sum = 0;
		double average = 0;
		for (int i = 0; i < scores.length; i++) {

			sum += scores[i];

		}

		average = (double) (sum / scores.length);

		return average;
	}

	//
	//	●calculateVarianceメソッド：分散を求めるメソッド
	//	処理内容：int型配列と平均値を引数で受け取り、分散を返す。分散はdouble型。
	public static double calculateVariance(int[] b, double average) {

		//		※分散：偏差を2乗したものの平均値
		//		※偏差：データから平均値を引いたもの

		double x = 0;
		double sum = 0;

		for (int i = 0; i < b.length; i++) {

			sum += Math.pow((b[i] - average), 2);

		}

		x = sum / b.length;

		return x;
	}

	//	●calculateStandardDeviationメソッド：標準偏差を求めるメソッド
	//	処理内容：分散を引数で受け取り、標準偏差を返す。標準偏差はdouble型。
	public static double calculateStandardDeviation(double x) {

		//		※標準偏差：分散の正の平方根

		double y = Math.sqrt(x);

		return y;
	}

	//	＜mainメソッド＞
	//	①	以下のデータ配列を用意。
	//	int[] scores = {85, 92, 78, 90, 88, 76, 89, 94, 81, 87};
	//	②平均、分散、標準偏差を求めるメソッドを呼び出し、それぞれ変数に代入する。
	//	③上記の統計情報をLinkedHashMapに追加する。キーは用語(平均、分散、標準偏差)、バリューはその用語に対する数値にする。
	//	④出力結果例のように統計情報を表示する。
	//	出力結果例
	//	分散: 32.0
	//	平均: 86.0
	//	標準偏差: 5.656854249492381

	public static void main(String[] args) {
		//配列
		int[] scores = { 85, 92, 78, 90, 88, 76, 89, 94, 81, 87 };
		//平均
		double average = calculateMean(scores);
		//System.out.println(average);

		//分散
		double x = calculateVariance(scores, average);
		//System.out.println(x);

		//標準偏差
		double y = calculateStandardDeviation(x);
		//System.out.println(y);
		//LingkedHashMapに追加

		Map<String, Double> map = new LinkedHashMap<>();
		map.put("分散", x);
		map.put("平均", average);
		map.put("標準偏差", y);

		for (String key : map.keySet()) {
			double value = map.get(key);
			System.out.println(key + ":" + value);

		}

	}

}

package sukkiri.practice.practice_print04.practice04;

public class Main {

	public static void main(String[] args) {
		//下記の値は１週間の大阪市の最高気温
		//33.2	33.6	34.9	38.4	34	30.7	27.5
		//配列kionを作成
		double[] kion = {33.2, 33.6, 34.9, 38.4, 34, 30.7, 27.5};
		//配列を使用して合計 kion_sum 平均気温 kion_avgを求め
		double kion_avg = 0;
		double kion_sum = 0;
		//ループで気温の合計を出す
		for(int i = 0; i < kion.length; i++) {
			kion_sum += kion[i];
		}

		//平均気温 kion_avg
		kion_avg = kion_sum / kion.length;
		System.out.println(kion_avg);
		//平均気温を表示
		System.out.println("平均気温は" + Math.ceil(kion_avg * 10) / 10 + "度です。");
		System.out.printf("平均気温は%.1f度です", kion_avg);
		System.out.println();
		System.out.printf("平均気温は%.2f度です", kion_avg);


		//実行結果
//		33.18571428571429
//		平均気温は33.2度です。
//		平均気温は33.2度です
//		平均気温は33.19度です
	}

}

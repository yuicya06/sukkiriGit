package sukkiri.practice.practice_print04.practice07;

public class Main {

	public static void main(String[] args) {

		//下記値を要素の値として持つ配列scoresを作り、
		//25	94	89	10	3	14	11	67
		int[] scores = { 25, 94, 89, 10, 3, 14, 11, 67 };
		//最大値と最小値を取得し表示しましょう。
		//ループ条件にはlengthを利用すること。

		//最大値max　最小値min

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		//		int max = scores[0];
		//		int min = scores[0];

		//for文作成
		for (int i = 0; i < scores.length; i++) {
			//最大値
			if (scores[i] > max) {
				max = scores[i];
			}
			//最小値
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		//結果表示
		System.out.println("最大値：" + max);
		System.out.println("最初値：" + min);

	}

}

package sukkiri.lesson04.code10;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80,};
		int sum = 0;

		//箱（変数）sumに点数を加算していく
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i]; //箱（変数）sumに配列の要素を加算
		}

		//平均点を求めて、変数avgに代入
		int avg = sum / scores.length;
		System.out.println("=========================");
		System.out.println("合計点：" + sum);
		System.out.println("合計点：" + avg);
	}

}

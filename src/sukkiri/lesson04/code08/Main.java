package sukkiri.lesson04.code08;

public class Main {

	public static void main(String[] args) {
		/*
		int[] scores = {20, 30, 40, 50, 80};
		int sum = scores[] + scores[2] + scores[3]+ scores[4]+ scores[5];　//添え字[5]はエラー
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
		 */

		int[] scores = {20, 30, 40, 50, 80};// 箱の用意＋箱に値を代入＋配列の宣言
		
		//配列は箱のイメージを持つ
		//添え字０から始まり、インデックスは１～、要素が入っている
		
		int sum = scores[0] + scores[1] + scores[2]+ scores[3]+ scores[4];
		double avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}

}
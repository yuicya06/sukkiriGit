package sukkiri.lesson04.code11;

public class Main {

	public static void main(String[] args) {

		//50点以上の科目の数を調べる
		int[] scores = {20, 30, 40, 50, 80};

		//数えたい場合は変数を用意
		int count = 0;


		for(int i = 0; i <scores.length; i++) {
			if(scores[i] >= 50) { //i番目の要素が50以上の場合
				count++; //変数countをインクリメント
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
	}

}

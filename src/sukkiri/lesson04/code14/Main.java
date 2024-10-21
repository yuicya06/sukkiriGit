package sukkiri.lesson04.code14;

public class Main {

	public static void main(String[] args) {

		int[] scores = {20, 30, 40, 50, 80};

		//拡張for文
		for(int value : scores) {        //左の変数に右側の配列の要素がひとつづつ入る
			System.out.println(value);	 //※要素の書替にはインデックス番号が必要なため、要素の書替は不向き（単に、値を取り出すためだけ）
		}

		System.out.println("------------------");

		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

	}

}

package sukkiri.lesson04.code09;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		
		for(int i = 0; i < scores.length; i++) {
			//配列の要素数だけループ 配列変数.length
			System.out.println(i + "週目の要素" + scores[i]);
		}
	}

}

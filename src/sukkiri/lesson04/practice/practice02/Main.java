package sukkiri.lesson04.practice.practice02;

public class Main {

	public static void main(String[] args) {
		//配列の初期化
		int[] moneyList = {121902, 8302, 55100};

		//moneyListの要素を１つずつfor文で出力

		System.out.println("--------for文--------");
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		System.out.println("--------拡張for文--------");
		//拡張for文// コロンから先に書くfor(:)
		for(int x: moneyList) {
			System.out.println(x);
		}



	}

}

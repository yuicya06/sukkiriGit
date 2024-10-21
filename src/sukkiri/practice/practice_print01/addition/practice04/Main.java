package sukkiri.practice.practice_print01.addition.practice04;

import java.util.Random;

public class Main {

	//	問４
	//	―５～５までのランダムな数値を発生させて（、変数randに発生させた乱数値を代入し）表示してください。
	//	実行結果
	//	乱数値：-2  //値はー５～５のいずれか 
	//11個乱数値を作る必要がある

	public static void main(String[] args) {
		Random rand = new Random();
		//int n = rand.nextInt(-5, 6);
		int n = rand.nextInt(11);
		System.out.println(n - 5);
		
		System.out.printf("製品番号%s-% 2d", "sss", 3);

	}

}

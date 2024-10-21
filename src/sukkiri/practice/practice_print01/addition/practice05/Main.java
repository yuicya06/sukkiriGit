package sukkiri.practice.practice_print01.addition.practice05;

import java.util.Random;

public class Main {
	
//	問５
//	0.0から1.0(1.0含まず)までのランダムな数値を発生させて（、変数randに発生させた乱数値を代入し）表示してください。
//	実行結果
//	乱数値：0.876384632764846  


	public static void main(String[] args) {
		
		Random rand = new Random();
		double n = rand.nextDouble();
		System.out.println(n);

	}

}

package sukkiri.practicing.coding_conventions.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*問題：ショッピングカートの合計金額を計算するプログラムの作成
 目的： ・適切な変数名、メソッド名を使うこと
        ・コードにコメントを記述し、コードの動きを説明すること*/

public class Main {

	//引数あり
	//戻り値 String "合計金額: 795.0円"
	//mainメソッドで個数と単価を受け取る

	//合計金額メソッド(変数の意味:合計の買い物（動作）額)
	public static double totalShoppingPrice(List<Integer> fruitsList) {

		//合計金額（変数の意味：合計金額）
		double totalPrice = 0;
		//単価
		double price = 0;
		//個数

		double num = 0;
		for (int i = 0; i < fruitsList.size(); i++) {

			//要素の0と偶数が単価
			if (i == 0 || i % 2 == 0) {
				price = fruitsList.get(i);
			}
			//要素の奇数が個数
			if (i % 2 == 1) {
				num = fruitsList.get(i);
				totalPrice += price * num;
			}
		}

		//System.out.printf("合計金額：%s円", totalPrice);

		return totalPrice;

	}

	public static void main(String[] args) {

		//フルーツの種類の文字配列(変数の意味:Stringの省略とフルーツ)
		String[] strFruits = { "アップル", "バナナ", "チェリー" };

		//入力受付の準備(変数の意味:Scannerの省略)
		Scanner sc = new Scanner(System.in);

		//listで受け取って、それぞれ格納する(変数の意味:購入したフルーツの単価と個数のリスト)
		//単価と個数の重複が考えられるので、とりあえずlistで格納
		List<Integer> fruitsList = new ArrayList<>();

		/*
		//フルーツの単価と個数の変数
		//単価(変数の意味：フルーツの単価)
		int fPrice = 0;
		//個数(変数の意味：フルーツの個数)
		int fNum = 0;
		*/

		//受付for文
		for (int i = 0; i < strFruits.length; i++) {
			//単価の受付
			System.out.printf("%sの単価＞", strFruits[i]);
			fruitsList.add(sc.nextInt());
			//個数の受付
			System.out.printf("%sの個数＞", strFruits[i]);
			fruitsList.add(sc.nextInt());

		}

		//		System.out.println(fruitsList);
		//listが完成したので引数listのメソッドを呼び出す
		System.out.printf("合計金額：%s円", totalShoppingPrice(fruitsList));

	}

}

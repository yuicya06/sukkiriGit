package sukkiri.lesson03.practice.practice06;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		//①【数あてゲーム】と表示
		System.out.println("【数あてゲーム】");
		//②0から9までの整数の中からランダムな数を1つ生成して変数ansに代入する
		int ans = rand.nextInt(10);
		System.out.println("ans:" + ans);
		//③for文を用いた「5回繰り返すループ」を作り、次の④～⑦をループの中に記述
		for (int i = 0; i < 5; i++) {
			//④画面に「0～9の数字を入力してください」
			System.out.println("0～9の数字を入力してください");
			//⑤数字を入力し,変数numに代入する
			int num = sc.nextInt();
		//⑥もし変数numが変数ansと等しい場合
			if (num == ans) {
				System.out.println("アタリ！");
				break;
		//⑦もし変数numが変数ansと等しくない場合
			} else {
				System.out.println("違います");
			}
		}
			
		System.out.println("ゲームを終了します");
		
		sc.close();

	}

}

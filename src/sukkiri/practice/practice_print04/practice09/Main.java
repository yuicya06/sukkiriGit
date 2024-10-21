package sukkiri.practice.practice_print04.practice09;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//以下の値を要素の値として持つ配列omikuziを作り、乱数を用いておみくじ結果を表示しましょう
		//要素の中身は以下の通り。if文、for文を使用せずに結果を表示すること。
		//[0] 凶	[1] 吉	[2] 中吉	[3] 大吉

		//乱数作成(０～１)
		Random rand = new Random();
		int fortune = rand.nextInt(4);

		//配列omikuzi作成
		String[] omikuzi = { "凶", "吉", "中吉", "大吉" };
		//表示
		System.out.println(omikuzi[fortune]);
		System.out.println(omikuzi[rand.nextInt(4)]);

	}

}

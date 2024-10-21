package sukkiri.practice.practice_print05.practice07;

import java.util.Random;

public class Main {

//	※配列を使ってください
//	メソッド名： weather
//	引数：なし
//	戻り値の型： String
//	処理の内容： 
//	天気予報メッセージをランダムに生成して、そのメッセージを返す。
//	天気予報メッセージは、次の中からランダムに組み合わせて作り出すものとする。
//	{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。 
//	例：明日の天気は雨でしょう。
//	ヒント：引数なしなので、メソッド呼び出し時に渡す値はありません。
//	配列の宣言はweatherメソッドの中で行います。

	public static String weather() {
		
		
		//配列
		String[] date = {"今日", "明日", "明後日"};//日付配列
		String[] forcast = {"晴れ", "曇り", "雨", "雪"};//天気配列
		
		//乱数値
		Random rand = new Random();
		int date_index = rand.nextInt(3);//乱数値 日付
		int forcast_index = rand.nextInt(4);//乱数値 天気
		
		//メッセージの作成
		String msg = date[date_index] + "の天気は" + forcast[forcast_index] + "でしょう";
		
		return msg;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(weather());

	}

}

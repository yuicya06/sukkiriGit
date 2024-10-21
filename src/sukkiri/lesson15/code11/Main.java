package sukkiri.lesson15.code11;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//現在時刻の取得
		Date now = new Date();//現在時刻を持ったDateインスタンスを生成
		System.out.println("Date型変数now：" + now);
		//実行結果（わかりにくい）
		//Date型変数now：Wed Aug 28 14:11:10 JST 2024

		//Date型変数.getTime()：Date変数が持っている時刻をミリ秒にする
		System.out.println("Date型変数nowをgetTime()でミリ秒にしたもの：" + now.getTime());
		
		//ある時の日時を取得
		Date past = new Date(1694984000000L);//ミリ秒（168…L）をわたす
		System.out.println(past);
		
		
		////////////////
		///無理！！！//
		//////////////

	}

}

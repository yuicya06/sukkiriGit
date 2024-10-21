package sukkiri.lesson15.code13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {//エラー処理

		//書式を設定[2023/09/18 05:53;30]
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//ココ
		//SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		//System.out.println("f:" + f);

		//文字列をDate型に変換 -> parseメソッド
		//文字列からDateインスタンスを生成
		//指定した書式で解析できなかった場合エラー
		//SimpleDateFormat型変数.parse()で引数の日時をDate型に変換
		Date d = f.parse("2023年09月18日 05:53:20");//ココ
		System.out.println(d);

		//Date型を文字列に変換　->formatメソッド
		//Date型で現在時刻を取得
		Date now = new Date();
		//SimpleDateFormat型変数.format()で引数のDate型を文字列に変換
		String s = f.format(now);
		System.out.println("現在は" + s + "です");

		s = f.format(d);
		System.out.println("現在は" + s + "です");

	}

}

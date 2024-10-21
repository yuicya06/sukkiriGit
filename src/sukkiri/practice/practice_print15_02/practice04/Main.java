package sukkiri.practice.practice_print15_02.practice04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	//	Dateクラスを使用して現在の日時を実行結果の形式で表示してください。
	//	実行結果例
	//	2023年01月09日（月） 09時05分03秒

	public static void main(String[] args) {

		//現在日時の取得
		Date d = new Date();
		System.out.println(d);

		//指定されて書式に変換	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日(E) hh時mm分ss秒");

		String dd = sdf.format(d);

		System.out.println(dd);

	}

}

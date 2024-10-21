package sukkiri.practice.practice_print15_02.practice05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//問５　Calendarクラスを使用して現在の日時を実行結果の形式で表示してください。
//実行結果例
//2023年01月09日（月） 09時05分03秒

public class Main {
	public static void main(String[] args) {

		//現在日時の取得（Calendarクラス）
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		//Calendar型変数cからDateインスタンスの生成
		Date d = c.getTime();
		System.out.println(d);

		//Date型をString型に変換
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日(E) hh時mm分ss秒");
		String dd = sdf.format(d);
		System.out.println(dd);

	}

}

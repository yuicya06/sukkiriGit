package sukkiri.practice.practice_print15_02.practice06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	//	問６　LocalDateTimeクラスを使用して現在の日時を実行結果の形式で表示してください。
	//	実行結果例
	//	2023年01月09日（月） 09時05分03秒

	public static void main(String[] args) {
		
		
		//現在日時の取得（LocalDateTimeインスタンスの生成）
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);


		//LocalDateTime型をString型に変換
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)hh時mm分ss秒");
		//変換
		String l2 = fmt.format(l);
		System.out.println(l2);

	}
	
}

package sukkiri.lesson15.practice.practice05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TimeAPI 
public class Main {

	public static void main(String[] args) {

		//TimeAPI のインスタンスはnewではなく、メソッド
		//Date Calendar SimpleDateFormat　とは違う
		//①現在の日時を取得する
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l1);
		/*
				Date d1 = new Date();
				System.out.println(d1);
		
		*/

		//④取得した値に100を足した値
		//int d2 = d1 +100;
		LocalDateTime l2 = l1.plusDays(100);//TimeAPIはl1の中身は変わらない(imutable)。なので代入
		System.out.println(l2);

		//⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示する
		//「西暦2024年09月24日」の形式で表示
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String str = fmt.format(l2);//日時情報.fortmat(書式) ← Dateなどと違う箇所
		System.out.println(str);

		//		LocalDateTime l3 = LocalDateTime.parse(str, fmt);
		//		System.out.println(l3.toString());
	}

}

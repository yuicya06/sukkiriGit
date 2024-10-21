package sukkiri.lesson15.practice.practice04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//①現在の日時をDate型で取得する
		Date d1 = new Date();
		//System.out.println(d);

		//②取得した日時情報をCalendarセットする
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		System.out.println(c);
		
		//③Calendarから「日」の数値を取得する
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		//④所得した値に100を足した値をCalendarの「日」にセットする
		c.set(Calendar.DAY_OF_MONTH, day + 100);//mutable中身を書き換えられる
		System.out.println(c);
		
		//⑤Calendarの日時情報をDate型に変換する
		Date d2 = c.getTime();
		System.out.println("d1:" + d1);
		System.out.println("d2:" + d2);
		
		//⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示する
		//「西暦2024年09月24日」の形式で表示
		//SimpleDateFormatのインスタンスを作成
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(d2);//書式.fortmat(日時情報)　← TimeAPIと違う箇所
		System.out.println(s);
		
		
		
		
		
		
	}

}

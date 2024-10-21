package sukkiri.lesson15.code12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//Date型はLong値でセット、Calendar型はまだ直感的にセットできる

		//Calendar型の現在時刻を取得
		//Calendarはnewではなくて、getInstance()を使う
		Calendar c = Calendar.getInstance();
		//Calendar型でcに入っている
		System.out.println("cの値：" + c);
		//実行結果（Calendar型）
		//cの値java.util.GregorianCalendar[time=1724822416220,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Tokyo",offset=32400000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=7,WEEK_OF_YEAR=35,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=241,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=20,SECOND=16,MILLISECOND=220,ZONE_OFFSET=32400000,DST_OFFSET=0]

		//６つのint値からDateインスタンスを生成
		//Calendar型変数cに特定の日時を代入（セット）
		c.set(2023, 8, 18, 5, 53, 20);
		System.out.println("cの値：" + c);
		//実行結果（Calendar型）
		//cの値java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Tokyo",offset=32400000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=8,WEEK_OF_YEAR=35,WEEK_OF_MONTH=5,DAY_OF_MONTH=18,DAY_OF_YEAR=241,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=5,MINUTE=53,SECOND=20,MILLISECOND=535,ZONE_OFFSET=32400000,DST_OFFSET=0]

		//月を9（10月）に変更
		c.set(Calendar.MONTH, 9);//月を9（10月）に変更
		System.out.println("cの値：" + c);
		//実行結果（Calendar型）
		//cの値：(一部省略)MONTH=9,WEEK_OF_YEAR=35,WEEK_OF_MONTH=5,DAY_OF_MONTH=18,DAY_OF_YEAR=241,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=5,MINUTE=53,SECOND=20,MILLISECOND=593,ZONE_OFFSET=32400000,DST_OFFSET=0]
		//System.out.println("ccc" + c.getTime());
		//Calendar型cをDate型に変換し、Date型変数dに代入
		
		System.out.println("c：" + c.getTime());
		Date d = c.getTime();//Dateはjava.util.のインポート（sqlもあるがまた別）
		System.out.println("d：" + d);
		//実行結果（Date型）
		//d：Wed Oct 18 05:53:20 JST 2023

		//Date型の現在時刻を取得
		Date now = new Date();
		System.out.println("now：" + now);
		//Date型時刻をCalendar型にし、Calendar型変数cを更新
		c.setTime(now);
		System.out.println("cの値：" + c);

		//実行結果
		//now：Wed Aug 28 14:41:53 JST 2024
		//cの値： java.util.GregorianCalendar[time=1724823725292,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Tokyo",offset=32400000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=7,WEEK_OF_YEAR=35,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=241,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=42,SECOND=5,MILLISECOND=292,ZONE_OFFSET=32400000,DST_OFFSET=0]

		int y = c.get(Calendar.YEAR);//年を取り出す
		System.out.println("今年は" + y + "年です");

	}

}

package sukkiri.lesson15.code14;
/*
●ZonedDateTime
：特定の地域や都市のタイムゾーンに基づいた日時を取得
　これにより、その地域の標準時や夏時間を考慮した日付と時刻を表現可能
　タイムゾーン情報を持つため、特定の地域での現地時刻を正確に扱うことが可能
●Instant
：協定世界時（UTC）を基準とするタイムスタンプを表す←本初子午線があるロンドンが基準
　タイムゾーンの変換や夏時間の影響を受けることなく、単純なタイムスタンプを扱うことができる
　そのため、異なるタイムゾーン間の比較や計算を行う場合に便利

*/

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {

		// Instantの生成
		//Instant.now()：Instant型の現在時刻を取得
		System.out.println("***Instantの生成***");
		Instant i1 = Instant.now();
		System.out.println("i1：" + i1);
		System.out.printf("%-5s:%s\n\n", "i1", i1);

		// Instantとlong値との相互変換(long値→Instantクラスのインスタンス→long値)
		//Instant.ofEpochMilli(long値)：指定されたミリ秒数(エポックからの経過ミリ秒数)に対応する日時をInstant型で取得
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		//Instant型変数.toEpochMilli()：Instantオブジェクトがエポック(1970年1月1日UTC)からの経過ミリ秒数を返す
		long l = i2.toEpochMilli();
		System.out.println("***Instantとlong値との相互変換***");
		System.out.printf("%-5s:%s\n", "i2", i2);
		System.out.printf("%-5s:%s\n\n", "l", l);

		// ZonedDateTimeの生成方法
		//ZonedDateTime.now()：ZonedDateTime 型の現在時刻を取得
		ZonedDateTime z1 = ZonedDateTime.now();
		//ZonedDateTime.of(年,月,日,時,分,秒,ナノ秒, ZoneId.of("Asia/Tokyo"));
		//：ZonedDateTime型の特定の日時を取得
		//ZoneId.of("Asia/Tokyo")：日本の東京のタイムゾーン情報を指定		
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		System.out.println("***ZonedDateTimeの生成方法***");
		System.out.printf("%-5s:%s\n", "z1", z1);
		System.out.printf("%-5s:%s\n\n", "z2", z2);

		//ZoneIdを設定すると、その地域の標準時間になる
		ZonedDateTime zz1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		ZonedDateTime zz2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("***ZoneIdを設定すると、その地域の標準時間になる***");
		System.out.printf("%-5s:%s\n", "zz1", zz1);
		System.out.printf("%-5s:%s\n\n", "zz2", zz2);

		// InstantとZoneDateTimeの相互変換(ZonedDateTime(Tokyo)→Instant→ZonedDateTime(New_York))
		//ZonedDateTime型.toInstant()：、ZonedDateTime型をInstant型に変換		
		Instant i3 = z2.toInstant();
		//Instant型変数.atZone(ZoneId.of("タイムゾーン"))：Instant型変数をZonedDateTime型に変換し、タイムゾーンを設定
		ZonedDateTime z3 = i3.atZone(ZoneId.of("America/New_York"));
		System.out.println("***InstantとZoneDateTimeの相互変換***");
		System.out.printf("%-5s:%s\n", "z2", z2);//東京の日時情報
		System.out.printf("%-5s:%s\n", "i3", i3);//世界の標準時間
		System.out.printf("%-5s:%s\n\n", "z3", z3);//i3をAmerica/New Yorkの日時情報（ZonedDateTime）に変換

		// ZonedDateTimeの利用方法
		System.out.println("***ZonedDateTimeの利用方法***");
		System.out.println("東京    :" + z2.getYear() + " " + z2.getMonth() + " " + z2.getDayOfMonth());
		System.out.println("NY      :" + z3.getYear() + " " + z3.getMonth() + " " + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {//表示結果は異なってるが、世界基準になおすとTrueになっている
			System.out.println("これらは同じ瞬間を指しています");
		}
	}

}

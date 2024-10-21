package sukkiri.lesson15.code15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		//LocalDateTimeの生成方法
		//現在時刻を取得する -> nowメソッド（インスタンスを作って変数に代入）
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("l1：" + l1);

		//特定の日時を取得する -> ofメソッド
		LocalDateTime l2 = LocalDateTime.of(2024, 1, 1, 9, 5, 0, 0);
		System.out.println("l2：" + l2);

		//LocalDateTimeとZonedDateTimeの相互変換
		//LocalDateTime型からZonedDateTime型を作って、ZonedDateTime型に戻す
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));

		//ZonedDateTime型をLocalDateTime型に変換
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println("z1："+ z1);
		System.out.println("l3：" + l3);
	}

}

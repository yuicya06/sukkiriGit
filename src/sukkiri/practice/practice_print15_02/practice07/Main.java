package sukkiri.practice.practice_print15_02.practice07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	//	問７　LocalDateクラスとPeriodクラスを使用して、年月日を入力し、今日との差を表示してください。
	//	実行結果例
	//	年月日を入力してください（yyyy/m/d形式）：2002/1/3
	//	今日との差：21年0か月9日

	public static void main(String[] args) {
		//年月日を入力
		Scanner sc = new Scanner(System.in);
		System.out.println("年月日を入力してください");
		String ymd = sc.nextLine();

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/M/d");

		//入力の日付
		LocalDate d1 = LocalDate.parse(ymd, fmt);
		//System.out.println(d1);

		//今日の年月日の取得
		LocalDate d2 = LocalDate.now();
		//System.out.println(d2);

		//今日との差 d2 - d1 Periodクラス
		Period p = Period.between(d1, d2);
		System.out.printf("今日との差：%d年%dか月%s日", p.getYears(), p.getMonths(), p.getDays());

	}

}

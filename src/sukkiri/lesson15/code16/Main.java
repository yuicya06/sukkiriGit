package sukkiri.lesson15.code16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		 //////////////////////////////
		//Date LocalDateの扱いの違い//
	   //////////////////////////////
		/*
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
				String nowString = sdf.format(d);
		
				try {
					Date dd = sdf.parse("2023年09月01日"); //ココ
		
				} catch (ParseException e) {
		
					e.printStackTrace();
		
				}
		*/

		//parse()の使い方が異なる点！

		//文字列からLocalDateを生成
		//書式の設定(SimpleDateFormatみたいなもの) TimeAPI はnew ではインスタンスは作成できない
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		//文字列をLocalDate型に変換 -> LocalDate.parse("文字列", 書式);
		LocalDate ldate = LocalDate.parse("2023/09/22", fmt); //ココ
		System.out.println("ldate：" + ldate);

		//1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);//2023/09/22から1000日後
		System.out.println("ldatep：" + ldatep);

		/*Date->SImpleDateFormatの場合
		書式.fomat(変数)つまりsdf.format(d)
		*/

		//LocalDate型を文字列に変換 -> LocalDate型変数.format(書式);
		String str = ldatep.format(fmt);
		System.out.println("str：" + str);

		//違う書式の設定
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		String str1 = ldatep.format(fmt1);
		System.out.println("1000日後は" + str1 + "(fmt1の書式で変換)");

		//現在日付との比較
		LocalDate now = LocalDate.now();
		System.out.println("now：" + now);

		if (now.isAfter(ldatep)) {
			System.out.println("本日は、その日より未来です。");

		}else {
			System.out.println("noです");
		}
		/*
		if (now.isAfter(ldate)) {
			System.out.println("本日は、その日より未来です。");
		
		}else {
			System.out.println("noです");
		}
		
		*/	
		}

}

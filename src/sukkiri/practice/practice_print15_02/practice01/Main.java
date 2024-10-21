package sukkiri.practice.practice_print15_02.practice01;

public class Main {

	//	問1　下記表はA君のテストの点数です。
	//	各科目を要素の値に持つString型の配列subjectと、
	//	各点数を要素の値に持つint型の配列scoreを作り、
	//	実行結果のような表示をしてください。

	//	英語	国語	数学	社会	理科
	//	 5	80	60	100	55
	//
	//	実行結果例
	//	英語：  5
	//	国語： 80
	//	数学： 60
	//	社会：100
	//	理科： 55

	public static void main(String[] args) {
		//方法その①
		//		各科目を要素の値に持つString型の配列subject
		String[] subject = { "英語", "国語", "数学", "社会", "理科" };
		int[] score = { 5, 80, 60, 100, 55 };
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%-2s：%3s\n", subject[i], score[i]);

		}
		
		System.out.println("------format()-------");
		//方法その②
		//書式考慮
		//プレースホルダー　場所の確保
		//書式は「科目：整数3桁（右詰め）」
		//p545
		final String FORMAT = "%s：%5d";

		for (int i = 0; i < subject.length; i++) {
			String str = String.format(FORMAT, subject[i], score[i]);
			System.out.println(str);

		}

	}

}

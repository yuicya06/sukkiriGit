package sukkiri.practice.practice_print04.practice05;

public class Main {

	public static void main(String[] args) {

		//下記表はA君のテストの点数です。
		//各科目を要素の値に持つString型の配列subjects
		String[] subjects = { "英語", "国語", "数学", "社会", "理科" };
		//各点数を要素の値に持つint型の配列scores
		int[] scores = { 75, 80, 60, 90, 55 };
		//実行結果のような表示をしてください。
		//Ａ君：
		System.out.print("A君:");
		//for文５教科分 英語 75点、国語 80点、数学 60点、社会 90点、理科 55点
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + " " + scores[i] + "点");
			//４教科までは「,」をつける
			if (i < subjects.length - 1) {
				System.out.print(",");
				//最後は改行
			} else {
				System.out.print("");
			}
		}

	}

}

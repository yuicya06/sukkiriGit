package sukkiri.practice.practice_print15_01.practice05;

public class Main {

	//	問5	下記表はA君のテストの点数です。
	//	各科目を要素の値に持つString型の配列ｓと、各点数を要素の値に持つint型の配列aを作り、
	//	実行結果のような表示をしてください。（実行結果はStringBuilderを用いて文字列を作る）
	//	※forの中で科目と点数を連結させていき、if文を使い、「、」を実行結果例に合うように連結させる。
	//	英語	国語	数学	社会	理科
	//	75	80	60	90	55
	//
	//	実行結果例
	//	Ａ君：英語 75点、国語 80点、数学 60点、社会 90点、理科 55点

	public static void main(String[] args) {
		//①要	素が科目である配列を用意
		//②要素が点数である配列を用意		
		//科目と点数の配列の用意
		String[] s = { "英語", "国語", "数学", "社会", "理科" };
		int[] a = { 75, 80, 60, 90, 55 };

		//③StringBuilderインスタンスを用意
		//for文の外で書く（for文内に書くとスコープ範囲の関係でブロックの外でつかえない）
		//for文内で書くと初期化され続けるので、最終的に"理科"しか入らない
		StringBuilder sb = new StringBuilder();

		//
		//	④文字列を連結するメソッドを用いて“A君：”を連結する
		sb.append("A君：");
		//	⑤　①の要素数だけループするfor文を用意
		//	　⑤－１：文字列を連結するメソッドを用いて“[科目配列の要素]　”を連結する
		//	　⑤－２：文字列を連結するメソッドを用いて“[点数配列の要素]点”を連結する
		//	　⑤－３：if文を用意し、変数iが(要素数-1)なら、文字列を連結するメソッドを用いて“、”を連結する
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i] + " " + a[i] + "点");
			if (i < s.length - 1) {
				sb.append(",");
			}

			//			if(i == s.length -1) {
			//				System.out.println(sb);
			//			}

		}

		//	⑥　③の変数を表示する
		System.out.println(sb);

	}

}

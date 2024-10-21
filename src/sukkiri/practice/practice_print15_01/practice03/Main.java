package sukkiri.practice.practice_print15_01.practice03;

public class Main {

	//	問3	「にほんむかしばなし」という文字列を前から７番目にある文字を切り出して表示しましょう。
	//	また、「むかし」の文字列だけを切り出して表示するプログラムを書きましょう。
	//
	//	実行結果例
	//	7文字目：ば(表示)
	//	むかし(表示)	

	public static void main(String[] args) {

		String str = "にほんむかしばなし";

		//7文字目を表示
		System.out.println("7文字目：" + str.charAt(6));
		System.out.println(str.substring(3, 6));

	}

}

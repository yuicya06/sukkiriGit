package sukkiri.practice.practice_print05.practice03;

public class Main {

	/*
	 * メソッド名： printMs2
	 * 引数： String message, int count
	 * 戻り値：なし
	 * 処理の内容： 文字列 message を、count の回数だけ繰り返し出力する
	 * printMs2("Hello", 5); とすると、"Hello" という文字が5回出力される
	 */

	public static void printMs2(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		printMs2("Hello", 5);
		System.out.println("------------------");
		printMs2("abc", 3);
	}

}

package sukkiri.practice.practice_print05.practice02;

public class Main {

	/**
	 *  メソッド名： printMs
	 *  引数： String message
	 *  戻り値：なし
	 *  処理の内容： 引数で渡された文字列を出力する
	 *  ヒント：メソッドの宣言は次のようになる
	 *  public static void printMs (String message) { 処理コード記入 }
	 *  ・printMs("Hello"); とすると、"Hello" と出力される

	 */

	public static void printMs(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		printMs("Hello");
		printMs("aaa");
		printMs("bbb");
	}

}

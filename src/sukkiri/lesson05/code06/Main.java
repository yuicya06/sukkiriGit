package sukkiri.lesson05.code06;

public class Main {

	public static void main(String[] args) {

		// 引数を使わずに値を渡せないのか→渡せない
		//ローカル変数
		int x = 100;
		int y = 10;
		add();
	}

	public static void add() {

		int x = 3;
		int y = 2;

		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
		//mainメソッドにある変数x, yはmainメソッド内にのみ使用可能
	}

}

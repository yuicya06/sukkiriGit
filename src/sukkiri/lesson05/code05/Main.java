package sukkiri.lesson05.code05;

public class Main {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		
		
		int x = 3;
		int y = 2;		
		
		add();			//エラー
		add("aaa", 10); //エラー
		add(x, y);		//特に問題なし
		add(a, b);		// add(int a, int b); ×よくある間違い
		add(100, 20);
		add(200, 50);


		//引数の対応は位置も対応している

		//		div(100,20);
		//		div(20, 100);
		//		aaa(1, "aa"); error


	}

	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

	public static void div(int x, int y) {
	
	}
	
	public static void aaa(int x, String y) {

	}
	

}

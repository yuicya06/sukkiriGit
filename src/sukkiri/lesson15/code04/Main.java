package sukkiri.lesson15.code04;

public class Main {

	public static void main(String[] args) {

		//StringBuilderインスタンスの生成
		//メモリ領域を確保（バッファー : sb）
		StringBuilder sb = new StringBuilder();

		//long型変数に開始時間を代入
		long start_1 = System.currentTimeMillis();

		System.out.println("========StringBuilderで連結========");
		for (int i = 0; i < 10000; i++) {
			sb.append("Java"); //appendメソッドを用いて、文字列を連結
		}

		//long型変数に開始時間を代入
		long finish_1 = System.currentTimeMillis();
		System.out.println("StringBuilderの処理時間：" + (finish_1 - start_1));

		//public String toString() :StringBuilderをString型に変換して変数に代入
		// toString メソッドを用いて、String型に変換
		String s = sb.toString();
		System.out.println("s:" + s);
		System.out.println(sb);//変数のみでもOK（toString()で変換しなくても同じ結果）

		System.out.println("========＋演算子で連結========");
		String ss = null;
		long start_2 = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			s += "java";

		}
		long finish_2 = System.currentTimeMillis();
		System.out.println("＋演算子の処理時間：" + (finish_2 - start_2));

		System.out.println("======P533 Stringインスタンスの不変性======");
		String str = "abc";
		System.out.println("str:" + str);
	
		String str_1 = str.replace("a", "A");//もとのものを書き換えて、インスタンス化を行っている

		System.out.println("after calling replace method");
		System.out.println("str:" + str);
		System.out.println("str_1:" + str_1);
		
		//インスタンス化する場合、基本newが必要
		//Strignクラスに関しては、暗黙のうちにnewされている
		
		//本来
		String str_fuhen = new String("aabbcc");
		
		String sss = "a"; 
		sss = sss + "b";//同じメモリアドレスに代入、新たにメモリを作っている、また代入
		sss = sss + "c";//同じメモリアドレスに代入、新たにメモリを作っている、また代入
		//上記の処理が＋演算子での文字列の作成が遅い理由
		
		
		//P535 メソッドチェーン
		
		
		sb.append("hello").append("world");
	  //| sbが帰ってくる  |
	  //               sb.append("world") がはじまる
	}

}

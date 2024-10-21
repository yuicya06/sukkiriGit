package sukkiri.practice.practice_print15_01.practice04;

public class Main {

	//	問4	下の方法で定義されたString型変数sに対し 1) ~ 5) の内容を実行するプログラムを作成してください。
	//String s = " Let it go. " ;  // 「空白Let空白it空白go.空白」になっている
	//1)  s の先頭と末尾の空白文字の塊を取り除いたものを表示する。
	//2)  s に「t」の文字が何個存在しているか数を表示する。
	//3)  s に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
	//4)  StringBuilder を使って、3)の配列の中の単語を連結し、表示する
	//
	//実行結果例
	//1) Let it go.
	//2) 2
	//3) 3
	//4) Letitgo.

	public static void main(String[] args) {
		String s = " Let it go. ";

		//imutableのためtrim後に変数に代入
		String sss = s.trim();
		System.out.println(sss);

		//1)  s の先頭と末尾の空白文字の塊を取り除いたものを表示する。
		String str = s.substring(1, 11);
		System.out.println(str);

		//2)  s に「t」の文字が何個存在しているか数を表示する。

		String[] x = str.split("");

		int sum = 0;

		for (String y : x) {

			if (y.equals("t")) {
				sum++;
			}
		}

		//別途回答
		//		int count = 0;
		//		for (int i = 0; i < str.length(); i++) {
		//			if (s.charAt(i) == 't') {
		//				count++;
		//			}
		//		}
		//		
		//		System.out.println("count：" + count);

		System.out.println(sum);

		//3)  s に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
		String[] words = str.split(" ");
		System.out.println("要素数：" + words.length);

//		for (String ss : words) {
//			System.out.println(ss);
//		}

		//4)  StringBuilder を使って、3)の配列の中の単語を連結し、表示する
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i]);

		}

		System.out.println(sb);
		
		//拡張for文
//		for(String ssss: words) {
//			sb.append(ssss);
//		}
//		
//		System.out.println(sb);

	}

}

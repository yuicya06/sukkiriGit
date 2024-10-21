package sukkiri.practice.practice_print03.print03.addition.practice08;

public class Main {

	//	問8	while文を使い、aから順にzまで表示させるプログラムを作成してください。
	//	※char c = ‘a’の値をインクリメントさせるとcの値は’b’になります。
	//	実行結果例 
	//	abcdefghijklmnopqrstuvwxyz

	public static void main(String[] args) {
		char c = 'a';
		while (c <= 'z') {

			System.out.print(c);

			c++;
		}

	}

}

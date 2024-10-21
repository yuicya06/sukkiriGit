package sukkiri.practice.practice_print03.print03.addition.practice05;

public class Main {

	//問5  while文とif文を使い、１～１００までのうち３の倍数の値を表示させるプログラムを作成しましょう。
	//実行結果例 
	//3
	//6
	//9
	//12
	//15
	//18
	//.
	//.
	//.
	//99

	public static void main(String[] args) {

		int n = 1;

		while (n <= 100) {

			//System.out.println(n);

			if (n % 3 == 0) {
				System.out.println(n);
			}

			n++;

		}

	}

}

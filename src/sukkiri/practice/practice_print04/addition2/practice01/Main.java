package sukkiri.practice.practice_print04.addition2.practice01;

import java.util.Random;

public class Main {

	//
	//問1 以下の手順で二次元配列のコードを作成してください。（簡易ビンゴカード作成）

	//
	//(3)二重for文を使い、aの配列をprintfを使い3桁指定で表示してください。
	//　　　　if文を使って要素の値が0のときは☆を表示するようにしてください。
	//整数値を表示はSystem.out.printf(“%3d”,a[][]);//a[][]には配列の添え字（インデックス）が入る
	//☆を表示時は、System.out.printf(“%2s”,”☆”);と書く
	//※表示の形を綺麗にするため、今回System.out.printfを使っていますが15章の内容になります。
	//実行結果例	添え字（インデックス対応表）
	//10	20	3	4	15
	//5	40	6	18	10
	//9	36	☆	12	15
	//19	28	12	36	20
	//21	50	15	1	45
	//a[0][0]	a[0][1]	a[0][2]	a[0][3]	a[0][4]
	//a[1][0]	a[1][1]	a[1][2]	a[1][3]	a[1][4]
	//a[2][0]	a[2][1]	a[2][2]	a[2][3]	a[2][4]
	//a[3][0]	a[3][1]	a[3][2]	a[3][3]	a[3][4]
	//a[4][0]	a[4][1]	a[4][2]	a[4][3]	a[4][4]

	public static void main(String[] args) {

		//		(1)5×5の形の二次元配列を宣言してください。（int型配列 変数名a)
		int[][] a = new int[5][5];

		//		(2)二重for文でaの配列の各要素に、乱数を用いて1～50の範囲で値をセットしてください。
		//	　　　a[2][2]の時は0を代入し、それ以外のときは乱数の値を代入するようにif文を使って記述すること。
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				int r = rand.nextInt(50) + 1;
				if (i == 2 && j == 2) {
					a[i][j] = 0;
				} else {
					a[i][j] = r;

				}

			}
		}
		
//		3)二重for文を使い、aの配列をprintfを使い3桁指定で表示してください。
//		if文を使って要素の値が0のときは☆を表示するようにしてください。
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if(a[i][j] == 0) {
					System.out.printf("%2s","☆");
				} else {
					System.out.printf("%3d", a[i][j]);
				}
				
				
				
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}

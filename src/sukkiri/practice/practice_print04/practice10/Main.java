package sukkiri.practice.practice_print04.practice10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//	(1)5×5の形の二次元配列を宣言してください。（int型配列 変数名numbers)
		//new int[行(親)][列(子)];
		int[][] numbers = new int[5][5]; //配列の初期値 int 型は "0"

		//	(2)二重for文で配列numbersの各要素に、乱数を用いて1～50の値をセットしてください。
		//乱数値
		Random rand = new Random();
		//二重for文で配列numbers
		for (int i = 0; i < numbers.length; i++) { // 外側のfor文:行(親配列)に対応
			for (int j = 0; j < numbers[i].length; j++) { // 内側のfor文:行(親配列)に対応
				int num = rand.nextInt(50) + 1;
				numbers[i][j] = num;
				//	numbers[2][2]の時は0を代入 それ以外のときは乱数の値を代入するようにif文を使って記述すること
				if (i == 2 && j == 2) { //i, jがともに２の時
					numbers[i][j] = 0;
				}
			}
		}

		//	(3)二重for文を使い、numbersの配列をprintfを使い3桁指定で表示してください。
		//	if文を使って要素の値が0のときは☆を表示するようにしてください。
		//	整数値を表示はSystem.out.printf(“%3d”,a[][]);//a[][]には配列の添え字（インデックス）が入る
		//	System.out.printf(“%2s”,”☆”)

		//(例)
		// int[] numbers = {100, 200, 300, 400, 500};
		// int[][] numbers = {{1,2,3}, {2, 5, 6}, {7, 8, 9}};

		//				[0][0]	[0][1]	[0][2]	[0][3]	[0][4]
		//				[1][0]	[1][1]	[1][2]	[1][3]	[1][4]
		//				[2][0]	[2][1]	[2][2]	[2][3]	[2][4]
		//				[3][0]	[3][1]	[3][2]	[3][3]	[3][4]
		//				[4][0]	[4][1]	[4][2]	[4][3]	[4][4]

		// % プレースホルダー
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i][j] == 0) {
					System.out.printf("%2s", "☆");
				} else {
					System.out.printf("%3d", numbers[i][j]);
				}
			}
			System.out.println("");
		}

	}

}

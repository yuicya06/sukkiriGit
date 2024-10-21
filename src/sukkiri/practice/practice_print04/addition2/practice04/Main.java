package sukkiri.practice.practice_print04.addition2.practice04;

import java.util.Random;

public class Main {

	//	問４　以下の順番の内容でソートプログラムを作成しましょう。
	//	（１）	int型配列aryを要素数20で宣言してください
	//	（２）	aryの各要素に、乱数を用いて０～９９の値をセットしてください。
	//	（３）	aryの要素を全部表示してください
	//	（４）	aryを二重for文、if文を使い昇順で並び替えてください。
	//	（５）	aryの要素を再度全部表示してください
	//	実行結果例
	//	93  91  49  9  45  30  25  53  85  46  35  57  99  52  57  73  31  77  19  91(表示)
	//	9  19  25  30  31  35  45  46  49  52  53  57  57  73  77  85  91  91  93  99(表示)

	public static void main(String[] args) {
//				（１）	int型配列aryを要素数20で宣言してください
		int[] ary = new int[20];
//				（２）	aryの各要素に、乱数を用いて０～９９の値をセットしてください。
		Random rand = new Random();
		for (int i = 0; i < ary.length; i++) {
			int r = rand.nextInt(100);
			ary[i] = r;
//				（３）	aryの要素を全部表示してください
//			System.out.printf("%2d ",ary[i]);
		}
		
		
//			（４）	aryを二重for文、if文を使い昇順で並び替えてください。
		
		int min = ary[0];
		int max = ary[0];
		for(int i = 0; i < ary.length; i++) {
			min= ary[i];
			max= ary[i];
			
			
			for(int j= 0; j < ary.length; j++) {
			
				
				if(min > ary[j]) {
					min = ary[j];
					ary[j] = 100;
					
//					if(j == ary.length - 1) {
//						//minが確定している
//					}
					
				}
				

			} System.out.printf("%2d ",min);
			
		}
		
		
		
		
		
		

	}

}

package sukkiri.lesson04.code15;

public class Main {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;

		arrayB = arrayA;   //BにAの住所を代入している

		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		System.out.println(arrayB[0]);


		int[] arrayC = {1, 3, 5};
		int[] arrayD = new int[5];

		System.out.println("arrayCのアドレス：" + arrayC);
		System.out.println("arrayDのアドレス：" + arrayD);

		/*メモリアドレスの表示となる
		arrayCのアドレス：[I@1f32e575	（arrayC の１が入っているアドレス）
		arrayDのアドレス：[I@1be6f5c3
		 */

		arrayD = arrayC;

		System.out.println("---------代入後--------");
		//配列変数名を出力
		System.out.println("arrayCのアドレス：" + arrayC);
		System.out.println("arrayDのアドレス：" + arrayD);


		//arrayB[0]に１００を代入
		arrayD[0] = 100;
		System.out.println("arrayC[0]：" + arrayC[0]);
		System.out.println("arrayD[0]：" + arrayD[0]);

		System.out.println("---------要素数--------");
		int[] arrayE = {1, 3, 5};
		int[] arrayF = new int[5];
		System.out.println("arrayE.length" + arrayE.length);
		System.out.println("arrayF.length" + arrayF.length);
		arrayF = arrayE;
		System.out.println("arrayE.length" + arrayE.length);
		System.out.println("arrayF.length" + arrayF.length);


	}

}

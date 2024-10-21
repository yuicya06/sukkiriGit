package sukkiri.lesson05.code13;

public class Main {
	//int型配列を受け取り、
	//配列内の要素すべてに１を加えるメソッド
	//incArray()はint型の配列のアドレスを受け取る
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) { //array.lengthはarray配列変数の要素数：３
			array[i]++; //配列の要素の値がインクリメントされる
		}
		System.out.println(array);
	}

	public static void main(String[] args) {
		//		
		System.out.println("--------------参照渡し（P203）-------------");
		int[] array = { 1, 2, 3 };
				System.out.println(array);
				incArray(array);
				
				System.out.println(array);
				for (int i : array) {
					System.out.println(i);
				}
				
		System.out.println("-------------値渡し(P201)--------------");

		int x = 10;
		incInt(x);//インクリメントされるのはincInt()内だけ
		System.out.println(x);//



	}

	public static void incInt(int x) {
		x++;
	}


}

package sukkiri.lesson05.code14;

public class Main {
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];// 箱の個数が引数である配列を宣言（要素数が引数である配列の）
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;//i番目の箱（要素）に変数iを代入
		}
		System.out.println("newArray in makArray method:" + newArray);
		return newArray;//int型配列（変数名）を返す
	}


	//mainメソッド
	public static void main(String[] args) {
		//アドレスが代入される
		int[] array = makeArray(3);
		System.out.println("after calling makeArray method:" + array);
		
		for (int i : array) {
			System.out.println(i);
		}
		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}

	}

}

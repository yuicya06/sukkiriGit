package sukkiri.lesson05.code12;

public class Main {
	//int型配列を受け取り、すべての要素を表示するメソッド
	// void 戻り値なしの意味
	//ここのarrayとmainメソッドのarrayはまったくの別物（ローカル変数と・・・）
	public static void printArray(int[] array) {

		for (int element : array) {
			System.out.println(element);
		}

		System.out.println(array);
	}
	//mainメソッド
	//array には配列の0番目の要素が格納されている住所（アドレス）が代入されている
	//実際に何をわたしているのか printArray()には何が格納されるのか
	//アドレスを渡している
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		printArray(array); //配列を渡す

		System.out.println(array);

	}







}

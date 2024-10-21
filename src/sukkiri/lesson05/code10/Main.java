package sukkiri.lesson05.code10;
//オーバーロード（引数の型が異なる場合）
public class Main {
	//1つ目のメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	
	//NG
	/*	
		public static int add(int y, int x) { //型が異ならないとダメ、変数を入れ替えただけではダメ
			return x + y;
	*/	

	//2つ目のメソッド
	public static double add(double x, double y) {
		return x + y;
	}

	//3つ目のメソッド
	public static String add(String x, String y) {
		return x + y;
	}

	public static void main(String[] args) {
		//1つ目のメソッドが呼び出される
		System.out.println(add(10, 20));

		//2つ目のメソッドが呼び出される
		System.out.println(add(3.5, 2.7));

		//3つ目のメソッドが呼び出される
		System.out.println(add("Hello", "World"));
	}

}
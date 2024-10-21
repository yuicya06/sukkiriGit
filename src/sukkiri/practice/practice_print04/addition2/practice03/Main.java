package sukkiri.practice.practice_print04.addition2.practice03;

public class Main {

	//	問３　次のint型変数の中身を、下記以外の変数を１つ用いて入れ替えて表示してください。
	//	　　　※この知識は問４で使います。
	//	         int x = 3,  int y = 5;
	//	実行結果例
	//	int x = 5
	//	int y = 3

	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		int z = 0;
		
		z = y;
		System.out.println("int x = " + z);
		z = x;
		System.out.println("int y = " + z);

	}

}

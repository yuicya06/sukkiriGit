package sukkiri.practice.practice_print03.practice07;

public class Main {

	public static void main(String[] args) {

		/*
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}*/

		//ループ変数の初期化、まずは外側を作ってから、内側を作る
		int i = 5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}


	}

}

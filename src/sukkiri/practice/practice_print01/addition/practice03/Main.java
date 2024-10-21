package sukkiri.practice.practice_print01.addition.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {

//	問３
//	int型変数nにキーボードから値を入力させ、０～ｎまでのランダムな数値を発生させて値を表示してください。
//	実行結果
//	整数n：1000 (キーボード入力)
//	乱数値：938  //値は０～nのいずれか

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("入力＞");
		int n = sc.nextInt();
		
		System.out.println(rand.nextInt(n));
		

	}

}

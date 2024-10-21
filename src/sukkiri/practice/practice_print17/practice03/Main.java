package sukkiri.practice.practice_print17.practice03;

import java.util.Scanner;

//問3	以下のプログラムを作成し、整数以外が入力されたら「整数値ではありません」と
//表示するように例外処理を加えてください。
//※try-catch構文を用いる


public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力してください。");
		String str = sc.nextLine();
		
		
		try {
			int num = Integer.parseInt(str);
			System.out.println("入力された整数は" + num + "です。");
			
		}catch (Exception e) {
			System.out.println("整数値ではありません");
		}

		


	}

}

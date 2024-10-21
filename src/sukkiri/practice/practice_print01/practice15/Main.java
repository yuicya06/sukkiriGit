package sukkiri.practice.practice_print01.practice15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力：");
		String name = sc.nextLine();
		System.out.print("年齢を入力：");
		int age = sc.nextInt();
		System.out.printf("%sさんの年齢は%d歳です。", name, age);

		
		
	}

}

package sukkiri.lesson02.code16_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		//インスタンス化し、その変数を使いまわす方法
		Scanner sc = new Scanner(System.in); //インスタンス化し、変数scに代入
		System.out.println("あなたの名前を入力してください");
		String name = sc.nextLine(); //インスタンス変数を使い、nextLine()メソッドを使用


		System.out.println("あなたの年齢を入力してください");
		int age = sc.nextInt();//インスタンス変数を使い、nextLine()メソッドを使用

		System.out.println("ようこそ、" + age + "歳の" + name + "さん");

	}

}

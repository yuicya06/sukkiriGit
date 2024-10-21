package sukkiri.practice.practice_print07.practice01;

import java.util.Scanner;

public class AnimalTester {

	public static void main(String[] args) {
		
//		(5)AnimalTesterで、種類：「犬」、名前：「ポチ」、年齢：「3」、鳴き声：「ワンワン」の値を持つAnimalクラスのインスタンスを作成してください。
//		インスタンス化させるときの変数名はdog

		Animal dog = new Animal();
		dog.setKind("犬");
		dog.setName("ポチ");
		dog.setAge(3);
		dog.setCry("ワンワン");
		
//		(6)AnimalTesterで、種類：「猫」、名前：「たま」、年齢：「5」、鳴き声：「にゃーにゃー」の値を持つAnimalクラスのインスタンスを作成してください。
//		インスタンス化させるときの変数名はcat
		
/*		Animal cat = new Animal();
		cat.setKind("猫");
		cat.setName("たま");
		cat.setAge(5);
		cat.setCry("にゃーにゃー");
*/		
		Animal cat = new Animal("猫", "たま", "にゃーにゃー", 5);
		
//		(7)dogとcat、それぞれのメソッドshowを呼び出して表示してください。
		
		dog.show();
		cat.show();
		
		
//		(8)AnimalTesterで、空のインスタンスを生成してください。
//		インスタンス化させるときの変数名はdog2

		Animal dog2 = new Animal();
		
//		(9) AnimalTesterクラスのMainメソッド内でキーボードから値を入力し、Animalクラス内で定義した各メソッドを使って、
//		dog2のフィールドに値をセットしてください。
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("種類：");
		dog2.setKind(sc.nextLine());
		
		System.out.print("名前：");
		dog2.setName(sc.nextLine());		
		
		System.out.print("年齢：");
		dog2.setAge(sc.nextInt());
		sc.nextLine();

		System.out.print("鳴き声：");
		dog2.setCry(sc.nextLine());
		
//		(10)dog2のshowメソッドを呼び出して表示してください。
		
		dog2.show();
		
		
	}

}

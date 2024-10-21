package sukkiri.practice.practice_print12.practice03;

import java.util.Scanner;

public class Main {

	//		4、Mainクラスを作成してください。
	//		処理内容：

	public static void main(String[] args) {

		//		①Animalクラス配列を要素数4で作成してください。
		Animal[] animal = new Animal[2];

		//		②ループ文の中で、「動物を指定してください。１：猫　２：犬」と表示後、
		//		キーボードから動物の指定番号を入力させてください。
		//		その後、犬、猫で共通の内容は、「名前」「年齢」なので、キーボードから入力させてください。
		//		動物指定が１：猫の時は、追加で「体重」をキーボードから入力させてください。
		//		動物指定が１の時は、Catクラスのコンストラクタに「名前」「年齢」「体重」を渡してインスタンス生成してください。
		//		動物指定が２の時は、Dogクラスのコンストラクタに「名前」「年齢」を渡してインスタンス生成してください。
		//		インスタンス化したら、①で作成した配列に順番に格納してください。
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < animal.length; i++) {
			System.out.print("動物を指定してください。１：猫　２：犬 ＞");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("名前＞");
			String name = sc.nextLine();
			System.out.print("年齢＞");
			int age = sc.nextInt();

			if (number == 1) {
				System.out.print("体重＞");
				int weight = sc.nextInt();

				animal[i] = new Cat(name, age, weight);

			}

			if (number == 2) {
				animal[i] = new Dog(name, age);
			}

		}

		//		③再度ループ文の中で、showProfileメソッド、speakメソッドを呼び出し、
		//		更に、配列に格納されているのがCatクラスの場合はsleepメソッドを、
		//		格納されているのがDogクラスの場合はrunメソッドを呼び出してください。
		//		※Animalクラス配列を曖昧な形で宣言しているため、まず配列の要素がDogなのかCatなのかをinstanceof演算子を使って判断し、
		//		その後各配列の要素をDogなのかCatなのかをキャストした上でsleepメソッド、runメソッドを使う。

		for (int i = 0; i < animal.length; i++) {
			System.out.println("---------------");

			if (animal[i] instanceof Cat) {
				animal[i].showProfile();
				animal[i].speak();
				Cat cat = (Cat) animal[i];
				cat.sleep();

			}
			if (animal[i] instanceof Dog) {
				animal[i].showProfile();
				animal[i].speak();
				Dog dog = (Dog) animal[i];
				dog.run();
			}

		}

	}

}

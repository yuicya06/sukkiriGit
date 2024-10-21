package sukkiri.practice.practice_print14.practice05;

//●Mainクラス

//・メソッド
//　　mainメソッド
//　　　：総動物数を表示する。
//　　　　「"Dog", 3」、「"Cat", 2」をそれぞれコンストラクタに渡し、Animalクラスのインスタンスを生成する。
//　　　　生成した各インスタンスの情報を表示する。
//　　　　再度、総動物数を表示する。

//	Total animals: 0
//	-----------------------------
//	Name: Dog
//	Age: 3
//	Name: Cat
//	Age: 2
//	-----------------------------
//	Total animals: 2

public class Main {

	public static void main(String[] args) {
		System.out.println("Total animals;" + Animal.getTotalAnimals());
		System.out.println("-----------------------------");

		Animal animal1 = new Animal("Dog", 3);
		Animal animal2 = new Animal("Cat", 2);
		
		animal1.displayInfo();
		animal2.displayInfo();
		
		System.out.println("-----------------------------");
		System.out.println("Total animals;" + Animal.getTotalAnimals());



	}

}

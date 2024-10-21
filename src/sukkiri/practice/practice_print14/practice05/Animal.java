package sukkiri.practice.practice_print14.practice05;

//●Animalクラス

//・フィールド　※アクセス修飾子はすべてprivate
//型	変数名・定数名
//int	totalAnimals    ※static
//String	name
//int	age
//・コンストラクタ
//　　：引数を2つ受け取り、非staticなフィールドにセットし、staticなフィールドをインクリメントする。
//・メソッド
//　　getTotalAnimalsメソッド
//　　　：引数はなく、staticなフィールドを返すstaticメソッド。
//　　displayInfoメソッド
//　　　：出力結果例のように、非staticフィールドを表示する。

public class Animal {

	private String name;
	private int age;

	private static int totalAnimals = 0;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		totalAnimals += 1;

	}

	public static int getTotalAnimals() {
		return totalAnimals;
	}

	public void displayInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}

	//	Total animals: 0
	//	-----------------------------
	//	Name: Dog
	//	Age: 3
	//	Name: Cat
	//	Age: 2
	//	-----------------------------
	//	Total animals: 2

}

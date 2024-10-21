package sukkiri.practice.practice_print10.practice02;

//●Mainクラス
//・メソッド
//　　mainメソッド
//　　　：コンストラクタに「"Golden Retriever", true」を渡して、Dogクラスのインスタンスを生成してください。
//	infoメソッド、behaviorメソッドを呼び出してください。
//　infoメソッド(staticメソッド)
//　　　：戻り値なしで、引数にDogクラスのインスタンスを受け取る。
//　出力結果例のように、「Breed」「Species」「Has fur」のコロンの右側をメソッドを使って、出力してください。
//　behaviorメソッド(staticメソッド)
//　　　：戻り値なしで、引数にDogクラスのインスタンスを受け取る。
//	出力結果例のように、Dogクラスで定義した、あるいは継承したメソッドを呼び出してください。
/*
出力結果例
Breed: Golden Retriever
Species: Dog
Has fur: true
The dog barks.
The mammal gives birth to live young.
The dog wags its tail.

*/

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog("Golden Retriver", true);
		
		info(dog);
		behavior(dog);

	}

	static void info(Dog dog) {
		System.out.println("Breed:" + dog.getBreed());
		System.out.println("Species:" + dog.getSpecies());
		System.out.println("Has fur:" + dog.getHasFur());

	}

	static void behavior (Dog dog) {
			dog.makeSound();
			dog.giveBirth();
			dog.wagTail();
			
		}

}

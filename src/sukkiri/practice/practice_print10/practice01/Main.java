package sukkiri.practice.practice_print10.practice01;

public class Main {
	
	
//	●Mainクラス
//	・メソッド
//	　　mainメソッド
//	　　　：引数をとらないコンストラクタを呼び出し、Animalインスタンスを生成し、変数animalに代入する。
//	　　　　AnimalのshowProfileメソッドを呼び出す。
//	　　　　「====================」を出力する。
//	　　　　引数に「"ポチ", "わんわん"」を渡し、Dogインスタンスを生成し、showProfileメソッドを呼び出す。
//	　　　　「====================」を出力する。
//	　　　　引数に「"たま", "にゃーにゃー"」を渡し、Catインスタンスを生成し、showProfileメソッドを呼び出す。


	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.showProfile();
		
		System.out.println("====================");
		
		Dog dog = new Dog("ポチ", "わんわん");
		
		dog.showProfile();
		
		System.out.println("====================");
		
		Cat cat = new Cat("たま", "にゃーにゃー");
		
		cat.showProfile();
		

	}

}

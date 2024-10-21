package sukkiri.object_oriented.sample01;

/**教科書7、8，9，13章*/

public class Main {
	public static void main(String[] args) {
		//①インスタンス生成
		Animal dog = new Animal("ポチ", 3);
		//②インスタンスフィールドにアクセス

		//dog.name; privateなので不可視
		System.out.println(dog.getName());//名前のゲッター

		System.out.println(dog.getAge());//年齢のゲッター
		
		//②インスタンスメソッドにアクセス
		dog.show();
		
		//"たま、5"のフィールド情報を持つAnimalインスタンスを生成し、変数catに代入
		Animal cat = new Animal("たま", 5);
		
		//変数catのフィールド変数ageの値を7にセット
		cat.setAge(7);
		System.out.println(cat.getAge());
		
		//変数名catのshowメソッドの呼び出し
		cat.show();
		
		
		//メモリアドレスが確保されるだけ
		System.out.println(dog);
		System.out.println(cat);
		

		Animal usagi = new Animal("usa",1);
		
		
	}
}
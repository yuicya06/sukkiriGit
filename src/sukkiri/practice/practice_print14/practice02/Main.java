package sukkiri.practice.practice_print14.practice02;

//●Mainクラス
//・メソッド
//　　mainメソッド
//：「"Alice", 25」のフィールドをもつuser1インスタンス、
//「"Bob", 30」のフィールドをもつuser2インスタンス、
//「"Alice", 25」のフィールドをもつuser3インスタンスを生成する。

//	出力結果例のように、「user1とuser2」、「user1とuser3」をequalsメソッドを用いて比較し、戻り値を表示する。
//
//出力結果例
//user1 equals user2: false
//user1 equals user3: true

public class Main {

	public static void main(String[] args) {

		User user1 = new User("Alice", 25);
		User user2 = new User("Bob", 30);
		User user3 = new User("Alice", 25);


		System.out.println("user1 equals user2:" + user1.equals(user2));
		System.out.println("user1 equals user3:" + user1.equals(user3));

	}

}

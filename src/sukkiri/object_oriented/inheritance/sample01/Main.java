package sukkiri.object_oriented.inheritance.sample01;

public class Main {

	public static void main(String[] args) {
		//各クラスのインスタンス生成
		Animal animal = new Animal("名もなき動物");
		Dog dog = new Dog("ポチ");
		//各 run メソッドの呼出し
		animal.run();
		dog.run();
		//差分フィールド・メソッドへのアクセス
		dog.setAge(3);
		dog.showAge();

	}

}

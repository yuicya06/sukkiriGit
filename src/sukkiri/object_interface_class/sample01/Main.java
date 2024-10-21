package sukkiri.object_interface_class.sample01;

public class Main {
	public static void main(String[] args) {
		//インタフェースを実装したクラスのインスタンス生成
		Dog dog = new Dog("ポチ");
		//実装したインスタンスメソッドの呼出し
		dog.run();
		//デフォルトメソッドの呼出し
		dog.showLivingBeing();
		
		//new Animal(); //インタフェースのインスタンス化はできない
		Animal animal = new Dog("dog");//より広い意味のAnimalクラスに子クラスを代入できる
	}
}
package sukkiri.object_.abstract_class.sample01;
//第１１章 行動な継承
public class Main {

	public static void main(String[] args) {
		
		//インスタンス生成
		Dog dog = new Dog("ポチ");
		//実装したインスタンスメソッドの呼出し
		dog.run();
		
		
		//抽象クラスのインスタンスは生成不可
		//Animal animal = new Anima();
		
		
//		※抽象クラスを継承したクラスのインスタンスを抽象クラス型変数に
//		代入することは可能(多態性〔第 12 章対象〕)
		Animal animal = new Dog("abc");

	}

}

package sukkiri.object_oriented.polymorphism.sample01;

/*多態性 chapter 12*/
//定義部分でより大きな型に代入することで、汎用性が高くなる

//② 実装元・継承元のメソッドの呼び出し
//実装・継承クラスで実装元・継承元のメソッドをオーバーライドしていれば、
//呼び出すことができ、実装・継承クラスで再定義した処理内容になる

//ただし子クラスでは、親クラスのメソッドしか使えない

public class Main {
	public static void main(String[] args) {
		
		
		
		//Animal 型配列に Dog インスタンス、Cat インスタンスを代入
		Animal[] animal = new Animal[2];
		
		//子のサブクラスのインスタンスを作って、親クラス型の配列に代入している
		animal[0] = new Dog();
		animal[1] = new Cat();// ・・・①
		//Breeder インスタンスを生成
		Breeder breeder = new Breeder();
		//各インスタンスの cry メソッドを呼出し
		
		
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
		} //・・・②
		
		
		
		//breeder インスタンスの have メソッドの呼出し
		/*animal[i]はAnimalインタフェースを実装しているので*/
		/*Breederクラスのhaveメソッドの引数（Animal animal）に*/
		/*送ることができる*/
		for (int i = 0; i < animal.length; i++) {
			breeder.have(animal[i]);
		} //・・・④
		
		
		
		
	}
}
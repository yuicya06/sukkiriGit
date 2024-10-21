package sukkiri.object_.abstract_class.sample01;


//●抽象メソッドが 1 つでも存在する場合、そのクラスは抽象クラスとして宣言されなけければならない
//●抽象クラスはインスタンス化(new)できない
//※抽象クラスを継承したクラスのインスタンスを抽象クラス型変数に代入することは可能(多態性〔第 12 章対象〕)
//●抽象クラスを継承(extends)し、抽象メソッドをすべて実装すれば abstract を外すことができる
// →abstract がないクラスならインスタンス化できる

public abstract class Animal {	/* ①抽象クラス*/
	

	//フィールド
	String name;
	//コンストラクタ
	public Animal(String name) { this.name = name; }
	
	
	
	//抽象メソッド
	/** ブロックの処理が分からない場合
	 * 抽象メソッドを使用 */
	abstract void run(); /*②抽象メソッド*/
	
	
	
	//getter, setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

}

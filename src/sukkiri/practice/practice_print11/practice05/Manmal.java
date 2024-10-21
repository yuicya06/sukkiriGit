package sukkiri.practice.practice_print11.practice05;

//●Mammalクラス
//・フィールド　※アクセス修飾子はすべて付けない
//型	変数名・定数名
//String	name
//・コンストラクタ
//　　　引数を1つ受け取り、フィールドにセット
//・メソッド
//　　makeSoundメソッド
//　　　：引数、戻り値なしの抽象メソッド。
//　　フィールドのgetter, setter


public abstract class Manmal {
	
	
	/*field*/
	String name;
	
	
	/*constructor*/
	public Manmal(String name) {
		this.name = name;
		
	}
	
	/*abstract method*/
	public abstract void makeSound();

	
	/*getter/setter*/
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

package sukkiri.practice.practice_print11.practice01;


//●Animal(抽象クラス)
//・フィールド　※アクセス修飾子はprivate
//型	変数名・定数名
//String	name
//・コンストラクタ
//　　　引数を1つ受け取り、フィールドにセット
//・メソッド
//　　makeSoundメソッド
//　　　：引数、戻り値はなしの抽象メソッド
//　　フィールド変数nameのgetter, setterを用意。

public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
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

package sukkiri.practice.practice_print10.practice02;

//●Dogクラス(Mammalクラスを継承)
//・フィールド　※アクセス修飾子はprivate
//型	変数名・定数名
//String	breed
//
//・コンストラクタ
//　　　：引数を２つ受け取り、そのうちの1つと「Dog」を親クラスのコンストラクタに渡し、もう1つをフィールドにセット。
//
//・メソッド
//　　wagTailメソッド
//　　　：「The dog wags its tail.」と表示する。
//　　makeSoundメソッド
//　　　：親クラスのmakeSoundメソッドをオーバーライドし、「The dog barks.」と表示する。
//　　フィールドのsetter, getterを用意


public class Dog extends Mammal {
	
	private String breed;

	public Dog(String breed, boolean hasFur) {
		super("Dog", hasFur);
		this.breed = breed;
		
	}
	
	public void wagTail() {
		System.out.println("The dog wags its tail.");
	}
	
	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	

	
	
	

}

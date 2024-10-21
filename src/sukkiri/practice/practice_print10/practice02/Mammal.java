package sukkiri.practice.practice_print10.practice02;

//●Mammalクラス(Animalクラスを継承)
//・フィールド　※アクセス修飾子はprivate
//型	変数名・定数名
//boolean	hasFur
//
//・コンストラクタ
//　　　：引数を２つ受け取り、1つは親クラスのコンストラクタに渡し、もう1つはフィールドにセットする。
//
//・メソッド
//　　giveBirthメソッド
//　　　：「The mammal gives birth to live young.」と表示する。
//　　フィールドのsetter, getterを用意



public class Mammal extends Animal{
	

	/*差分フィールド*/
	private boolean hasFur;
	
	
	/*constructor*/
	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
		
		
	}
	
	public void giveBirth() {
		System.out.println("The mammal gives birth to live young.");
	}
	
	public boolean getHasFur() {
		return this.hasFur;
	}
	
	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	

}

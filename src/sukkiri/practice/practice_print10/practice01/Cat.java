package sukkiri.practice.practice_print10.practice01;

//●Catクラス(Animalクラスを継承)
//・フィールド　※アクセス修飾子はすべて付けない
//型	変数名・定数名
//String	name
//String	cry
//
//・コンストラクタ
//　　引数を2つとる。
//　　親クラスのコンストラクタに「猫」を渡し、呼び出す。
//　　受け取った引数2つをフィールドにセット。
//
//・メソッド
//　　showProfileメソッド
//　　　　：親クラスのshowProfileメソッドをオーバーライドし、出力結果例のようにコンソールに表示する。
//　　　　　ただし、「カテゴリは～」は親クラスのメソッドを呼び出す。
//　　フィールド2つのgetter, setterの用意



public class Cat extends Animal{
	
	String name;
	String cry;
	
	public Cat(String name, String cry) {
		super("猫");
		
		this.name = name;
		this.cry = cry;
		
	}
	
	
	public void showProfile() {

		super.showProfile();
		System.out.printf("種は%sです\n", super.kind);
		System.out.printf("名前は%s\n", this.name);
		System.out.printf("鳴き声は%s\n", this.cry);
	}
	
	
//　　フィールド2つのgetter, setterの用意
	
	public String getName() {
		return this.name;
	}
	
	public String getCry() {
		return this.cry;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCry(String cry) {
		this.cry = cry;
		
	}
	

}

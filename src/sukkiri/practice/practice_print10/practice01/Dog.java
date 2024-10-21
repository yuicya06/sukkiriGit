package sukkiri.practice.practice_print10.practice01;

//●Dogクラス(Animalクラスを継承)
//・フィールド　※アクセス修飾子はすべて付けない
//型	変数名・定数名
//String	name
//String	cry

public class Dog extends Animal {
	/*diffeerence fields*/
	String name;
	String cry;

	//・コンストラクタ
	//　　引数を2つとる。
	//　　親クラスのコンストラクタに「犬」を渡し、呼び出す。
	//　　受け取った引数2つをフィールドにセット。

	/*constructor*/
	public Dog(String name, String cry) {

		super("犬");//親クラスのコンストラクタは子クラスの始めに書かないとエラー
		this.name = name;
		this.cry = cry;

	}

	//・メソッド
	//　　showProfileメソッド
	//　　　　：親クラスのshowProfileメソッドをオーバーライドし、出力結果例のようにコンソールに表示する。
	//　　　　　ただし、「カテゴリは～」は親クラスのフィールドにアクセスする。
	
	//親クラスの処理内容を再定義（＝オーバーライド）
	@Override
	public void showProfile() {
		//メンバ変数にprivateを付けていないので、アクセスにゲッターがいらない
		System.out.printf("カテゴリは%s\n", super.livingBeings);
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

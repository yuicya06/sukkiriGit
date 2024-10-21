package sukkiri.practice.practice_print10.practice01;

//●Animalクラスに以下を記述してください。
//・フィールド　※アクセス修飾子はすべて付けない
//型	変数名・定数名
//final String	livingBeings = “動物”
//String	kind

public class Animal {
	
	//finalの場合全て大文字
	final String livingBeings = "動物";
	String kind;

	//	・コンストラクタ
	//　　引数なしのコンストラクタ
	//　　　　：処理内容は「[動物]が生成されました」とコンソールに表示。
	//　　　　　ただし、[動物]はフィールドのものを使う。
	public Animal() {
		System.out.printf("%sが生成されました\n", this.livingBeings);

	}
	//　　引数を1つ受け取るコンストラクタ
	//　　：「種は[引数]のインスタンスが生成されました」とコンソールに表示後、引数で受け取ったものをフィールドにセットする。
	//　　　ただし、[引数]はフィールドのものを使う、

	public Animal(String kind) {
		System.out.printf("種は%sのインスタンスが生成されました\n", kind);
		this.kind = kind;
	}

	//・メソッド
	//　　showProfileメソッド
	//　　　：引数、戻り値はなし。
	//	「カテゴリは[動物]」とコンソールに表示。
	//ただし、[動物]はフィールドのものを使う。

	public void showProfile() {

		System.out.printf("カテゴリは%s\n", this.livingBeings);
	}

	//　　フィールド変数kindのgetter, setterを用意。

	public String getKind() {

		return this.kind;

	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}

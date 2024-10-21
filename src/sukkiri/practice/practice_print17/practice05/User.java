package sukkiri.practice.practice_print17.practice05;

//●Userクラス

//以下のフィールド、コンストラクタ、メソッドを持つUserクラスを作成してください。
//フィールド：id、name
//コンストラクタ：id(int)、name（String）を引数に持つコンストラクタ
//	メソッド：toStringのオーバーライド（idとnameを文字列で返す）
//	
//	コンストラクタでid、nameに値を設定する場合、以下の条件の時には
//IllegalArgumentExceptionをスローするようにしてください。
//	idが負の場合、「idが負の数です。」を表示
//	nameがnullまたは空の場合、「nameがnullまたは空です。」を表示

public class User {

	private int id;
	private String name;

	public User(int id, String name) {

		if (id < 0) {
			throw new IllegalArgumentException("idが負の数です。");
		}

		if (name.isEmpty() || name == null) { //ここで引数をチェック
			throw new IllegalArgumentException("nameがnullまたは空です。");
		}

		setId(id);

		setName(name);

	}

	/*constructor*/
	@Override
	public String toString() {

		return "id : " + this.id + "name : " + this.name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

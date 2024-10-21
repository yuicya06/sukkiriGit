package sukkiri.practice.practice_print12.practice03;

public class Animal {

	/*fields*/
	private String name;
	private int age;

	/*constructor*/
	public Animal(String name, int age) {

		this.setName(name);
		this.setAge(age);

	}

	/*setter/getter*/
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*method*/
	public void showProfile() {
		System.out.printf("名前は%sで、%d歳です\n", this.getName(), this.getAge());
	}

	public void speak() {
		System.out.println(".........");

	}

}

//1、	Animalクラスを以下の内容で作成してください。
//2、	
//各フィールド名：String型変数名name、int型変数名age。アクセス修飾子はprivate
//
//コンストラクタ
//引数：String型name、int型age
//処理：setNameとsetAgeを呼び出す。
//
//メソッド名：getName
//戻り値：String型
//引数：なし
//処理：nameの値を返す
//
//メソッド名：setName
//戻り値：なし
//引数：String型
//処理：引数の値をフィールド変数nameにセットする。
//
//メソッド名：getAge
//戻り値：int型
//引数：なし
//処理：ageの値を返す
//
//メソッド名：setAge
//戻り値：なし
//引数：int型
//処理：引数の値をフィールド変数ageにセットする。
//
//メソッド名：showProfile
//戻り値：なし
//引数：なし
//処理：「名前はnameで、age歳です。」と表示する。
//
//メソッド名：speak
//戻り値：なし
//引数：なし
//処理：「.........」と表示する。


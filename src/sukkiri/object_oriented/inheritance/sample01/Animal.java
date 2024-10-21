package sukkiri.object_oriented.inheritance.sample01;

public class Animal {
	//フィールド
	private String name;

	//コンストラクタ
	public Animal(String name) {
		this.name = name;
	}

	//その他メソッド
	public void run() {
		System.out.println(this.name + "は走った");
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

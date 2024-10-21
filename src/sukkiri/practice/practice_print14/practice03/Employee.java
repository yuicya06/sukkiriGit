package sukkiri.practice.practice_print14.practice03;

//(2) Employeeクラスは、以下のフィールド（アクセス修飾子はprivate）と、getter/setterメソッドを持つ。

//int id
//String name
//String dept
//(id:社員番号、name:名前、dept:部署）

public class Employee {

	private int id;
	private String name;
	private String dept;

	/*constructor*/
	public Employee(int id, String name, String dept) {

		//		(3) Employeeクラスに、(2)で指定した3個のフィールドを持つコンストラクタを宣言。
		setId(id);
		setName(name);
		setDept(dept);

	}

	/*getter/setter*/
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/*methods*/

	//	(4-1)
	//	toStringをオーバーライドする
	//	処理内容：「社員番号：id、名前：name、部署：dept」の文字列を返す。
	@Override
	public String toString() {

		return "社員番号：" + this.id +"、"+ "名前：" + this.name +"、" + "部署：" + this.dept;
	}

	//	(4-2)
	//	equalsをオーバーライドする
	//	処理内容：社員番号、名前、部署がすべて同じならtrue、違う場合はfalseを返す

	@Override //プリント練習２
	public boolean equals(Object o) {
//		if (this == o) {
//			return true;
//		}

		if (o instanceof Employee ep) {

			if (getId() == ep.getId()
					&& getName().equals(ep.getName())
					&& getDept().equals(ep.getDept())) {
				return true;
			}
		}
		return false;
	}

}

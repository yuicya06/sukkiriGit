package sukkiri.practice.practice_print07.practice03;

public class Main {

	//	・メソッド
	//	　　mainメソッド
	//	　　　：コンストラクタに「"Kate", "Jones", 27, "医者"」を渡し、Personインスタンスを生成し、変数person1に代入。
	//	コンストラクタに「"John", "Christopher", "Smith", 65, "教師"」を渡し、Personインスタンスを生成し、変数person2に代入。
	//	person1, person2のshowProfileメソッドを呼び出す。
	//	person1の仕事を「獣医」に変更し、「person1の仕事を◯◯に変更しました」と出力する。
	//	その後、もう一度、person1のshowProfileメソッドを呼び出す。

	public static void main(String[] args) {
		
		
		//9章フィールドの初期値 String型はnull
		Person person1 = new Person("Kate", "Jones", 27, "医者");
		Person person2 = new Person("John", "Christopher", "Smith", 65, "教師");

		person1.showProfile();
		
		System.out.println("------------");
		
		person2.showProfile();

		System.out.println("------------");
		
		//	person1の仕事を「獣医」に変更し、「person1の仕事を◯◯に変更しました」と出力する。
		//インスタンスメソッド
		person1.setJob("獣医");

		System.out.printf("person1の仕事を%sに変更しました\n", person1.getJob());
		person1.showProfile();

	}

}

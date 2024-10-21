package sukkiri.practice.practice_print07.practice03;

//(2)	Personクラスに以下を記述してください。
//・フィールド　※アクセス修飾子はすべてprivate
//型	変数名
//String	firstName
//String	middleName
//String	lastName
//int	age
//String	job

public class Person {
	
	//field
	//static がついていないのでインスタンスフィールド
	//また、インスタンスメソッドへのアクセスはthis.でアクセス可能
	//ただ、基本はメソッドにはthis.は使わない
	//this()はコンストラクタの呼び出し
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String job;

	//	・コンストラクタ
	//	引数にmiddleName以外を受け取り、フィールドにセットするコンストラクタと、引数にすべてを受け取り、
	//	フィールドにセットするにセットするコンストラクタを作成
	

	//constructor
	//no 'middleName'
	public Person(String firstName, String lastName, int age, String job) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.job = job;

	}

	
	//	※引数にすべてを受け取るコンストラクタ内には、別のコンストラクタを呼び出す
	//have 'middleName'
	public Person(String firstName, String middleName, String lastName, int age, String job) {

		//constructor no 'middleName'の呼び出し
		//コンストラクタのオーバーロード
		//シグニチャー（引数）の数が異なることが必須
		this(firstName, lastName, age, job);
		this.middleName = middleName;
		
		
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;
//		this.age = age;
//		this.job = job;

	}
	//	fullNameメソッド
	//	：引数はなく、戻り値はString型。
	//	フィールド変数middleNameがnullなら、「firstName lastName」となるような文字列を返し、
	//	nullでないなら「firstName middleName lastName」となるような文字列を返す。

	public String fullName() {

		//String fullName = "";
		String fullName = null; //String型 :参照型	
		

		if (this.middleName == null) {
			fullName = this.firstName + " " + this.lastName;
		} else {
			fullName = this.firstName + " " + this.middleName + " " + this.lastName;
		}

		return fullName;

	}

	//	showProfileメソッド
	//	：引数、戻り値はなし。
	//	出力結果例のように、コンソールに表示するような処理内容にする。
	//	ただし、名前の部分はfullNameメソッドを呼び出す
	//	各フィールドのgetter, setterの用意

	/** 出力結果例 */
	//	私の名前はKate Jonesです
	//	年齢は27歳です
	//	仕事は医者です
	//----------------------

	public void showProfile() {

		System.out.printf("私の名前は%s\n", fullName());
		System.out.printf("年齢は%dです\n", this.age);
		System.out.printf("仕事は%sです\n", this.job);
		System.out.println();

	}

	//getter（１３章）
	public String getfirstName() {
		return this.firstName;
	}

	public String getmiddleName() {
		return this.middleName;

	}

	public String getlastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;

	}

	public String getJob() {
		return this.job;
	}

	//setter（１３章）
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setmiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public void setJob(String job) {
		this.job = job;
	}

}

package sukkiri.practice.practice_print07.practice02;

public class Account {

	//(3)Accountクラスにフィールド、コンストラクタ、メソッドを定義してください。
	//(3-1)フィールド(String型変数name、String型変数num、int型変数balance、Day型変数day（アクセス修飾子はprivate）)
	private String name;
	private String num;
	private int balance;
	private Day day;

	
	
	//******************************************
	//(3-2)コンストラクタについては以下の通り
	//String型変数name、String型変数num、int型変数balance、int型変数year、int型変数month、int型変数dayを引数で受け取る。
	//フィールドで定義したdayについては、day = new Day(year,month,day)として(2)で作成したコンストラクタに値を渡し、インスタンスを生成する。

	public Account(String name, String num, int balance, int year, int month, int day) {
		this.name = name;
		this.num = num;
		this.balance = balance;
		//引数３つはDayクラスのフィールドと同じ
		this.day = new Day(year, month, day);

	}

	//(3-3)以下のメソッドを作ること
	//getName
	//引数：なし
	//戻り値：あり
	//機能：nameの値を戻す
	public String getName() {
		return this.name;
	}

	//setName
	//引数：あり
	//戻り値：なし
	//機能：nameに値をセットする
	public void setNmae(String name) {
		this.name = name;
	}
	
	//getNum
	//引数：なし
	//戻り値：あり
	//機能：numの値を戻す
	public String getNum() {
		return this.num;
	}
	
	
	//setNum
	//引数：あり
	//戻り値：なし
	//機能：numに値をセットする
	
	public void setNum(String num)	 {
		this.num = num;
	}
	
	
	//getBalance
	//引数：なし
	//戻り値：あり
	//機能：balanceの値を戻す
	public int getBalance() {
		return this.balance;
	}
	
	//setBalance
	//引数：あり
	//戻り値：なし
	//機能：balanceに値をセットする
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	//getDay
	//引数：なし
	//戻り値：あり（Day型)
	//機能：dayの値を戻す
	public Day getDay() {
		return this.day;
	}
	
	//******************************************
	//setDay
	//引数：int year,int month,int day
	//戻り値：なし
	//機能：フィールドのDay型変数dayのsetYear、setMonth、setDayメソッドを使用して引数の値を設定する。
	//yearをセットする場合は、day.setYear(year)となる。
	public void setDay(int year, int month, int day) {
		
		
		//Dayクラスのインスタンスメソッドであるsetメソッドを使うと以下の通り（コメント）
		//this.day.set(year, month, day);
		
		//フィールドのDay型変数dayのsetYear, setMonth, setDayメソッド
		//を使用して引数の値を設定する。
		this.day.setYear(year);
		this.day.setMonth(month);
		this.day.setDay(day);
		
		
	}
	
	
	
	//deposit
	//引数：int型
	//戻り値：なし
	//機能：balanceに引数で受け取った値を加算する。
	
	public void deposit(int depo) {
		this.balance += depo;
	}
	
	
	//withdraw
	//引数：int型
	//戻り値：なし
	//機能：balanceに引数で受け取った値を減算する。

	public void withdraw(int draw) {
		this.balance -= draw;
	}
	
	
	//showAccount
	//引数：なし
	//戻り値：なし
	//機能：name,num,balance,dayの値を表示する。
	//name,num,balanceについては、System.out.printlnを使う。
	//dayについては、(2-3)で作成したshowCreateDateメソッドを呼び出す。
	
	public void showAccount() {
		System.out.printf("口座名義：%s\n", this.name);
		System.out.printf("口座番号：%s\n", this.getNum());
		System.out.printf("口座預金：%d\n", this.balance);
		//System.out.println(this.day);
		
		
		
		this.day.showCreateDate();
		
	}






}

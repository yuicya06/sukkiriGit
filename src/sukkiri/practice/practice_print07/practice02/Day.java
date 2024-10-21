package sukkiri.practice.practice_print07.practice02;


//(2)Dayクラスにフィールド、コンストラクタ、メソッドを定義してください。



public class Day {
	
//	(2-1)フィールド (int型変数year, int型変数month, int型変数day（アクセス修飾子はprivate）)
	private int year;
	private int month;
	private int day;
	
//	(2-2)コンストラクタの引数は、int year、int month、int dayを受け取る。
	public Day(int year, int month, int day) {
//		this.year = year;
//		this.month = month;
//		this.day = day;
		
		//まとめてセットするsetメソッドの呼び出し
		//set(year, month, day);
		//個々のセッターを呼び出してフィールドにセット
		
		//定義部分の変更箇所だけで済む	
		setYear(year);
		setMonth(month);
		setDay(day);
		
	}
		
//	(2-3)以下のメソッドを作ること
//		getYear	
//		引数：なし
//		戻り値：あり
//		機能：yearの値を戻すメソッド
		public int getYear() {
			return this.year;
		}
		
		
		

//		setYear	
//		引数：あり
//		戻り値：なし
//		機能：yearに値をセットするメソッド
		public void setYear(int year) {
			this.year = year;
		}

		
//		getMonth
//		引数：なし
//		戻り値：あり	
//		機能：monthの値を戻すメソッド

		public int getMonth() {
			return this.month;
		}
		
//		setMonth
//		引数：あり
//		戻り値：なし	
//		機能：monthに値をセットするメソッド

		public void setMonth(int month) {
			this.month = month;
		}
		
		
//		getDay	
//		引数：なし
//		戻り値：あり	
//		機能：dayの値を戻すメソッド
		
		public int getDay() {
			return this.day;
		}
		
		
//		setDay
//		引数：あり
//		戻り値：なし		
//		機能：dayに値をセットするメソッド
		
		
		public void setDay(int day) {
			this.day = day;
		}
		
//
//		set		
//		引数：int year,int month,int day
//		戻り値：なし	
//		機能：year,month,dayに値をセットするメソッド
		
		public void set(int year, int month, int day) {
			//this(year, month, day);
			this.year = year;
			this.month = month;
			this.day = day;
			
			
		}
//
//		showCreateDate	
//		引数：なし
//		戻り値：なし
//		機能：System.out.printlnで、「口座作成日は〇年△月□日です。」と表示する。（〇：year、△：month、□：dayを表示）

		public void showCreateDate() {
			System.out.printf("口座作成日は%d年%d月%d日です\n", this.year, this.month, this.day);
		}
		
		
	}



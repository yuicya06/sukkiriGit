package sukkiri.practice.practice_print07.practice01;

public class Animal {
	
//	(kind:種類、name:名前、cry:鳴き声、age:年齢）
	
	
	//fields
	private String kind;
	private String name;
	private String cry;
	private int age;
	
	
	//constructor*/
	// default constructor
	public Animal() {
		
	}
	
	public Animal(String kind, String name, String cry, int age) {
		this.kind = kind;
		this.name = name;
		this.cry= cry;
		this.age = age;
	}
	
	
	/*setter*/
		
	/*メソッド名：setKind
	引数：String kind
	戻り値：なし
	処理内容：フィールド変数kindに引数の値を代入する。*/
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	

	/*	メソッド名：setName
		引数：String name
		戻り値：なし
		処理内容：フィールド変数nameに引数の値を代入する。*/
	
	public void setName(String name) {
		this.name = name;
	}

	/*	メソッド名：setCry
		引数：String cry
		戻り値：なし
		処理内容：フィールド変数cryに引数の値を代入する。*/

	public void setCry(String cry) {
		this.cry = cry;
	}
	
	/*	メソッド名：setAge
		引数：int age
		戻り値：なし
		処理内容：フィールド変数ageに引数の値を代入する。*/
		
		public void setAge(int age) {
			this.age = age;
		}
	
	
	/*	メソッド名:show
		引数：なし
		戻り値：なし
		処理内容：「nameはkindで、年齢はage歳、鳴き声はcry」を表示する。*/
		
		public void show() {
			
			System.out.printf("%sは%sで、年齢は%d歳、鳴き声は%s\n", this.name, this.kind, this.age, this.cry);
			
		}
	
	
	

}

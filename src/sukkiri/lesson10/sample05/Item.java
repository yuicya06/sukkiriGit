package sukkiri.lesson10.sample05;

public class Item {
	
	//10-11
	String name;
	int price;
	
	/*引数１つのコンストラクタ*/
	public Item(String name) {
		this.name = name;
		this.price = 0;
		
		
	}
	
	/*引数２つのコンストラクタ*/
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
		
		
		
	}
	
	//あえて親クラスに引数なしのコンストラクタを作成して
	//エラーを回避
	public Item() {
		
	}
	

}

package sukkiri.practice.practice_print11.practice02;

//●Productクラス(Categoryクラスを継承)
//・フィールド　※アクセス修飾子はすべて付けない
//型	変数名・定数名
//String	productName
//double	price
//・コンストラクタ
//　　：引数を3つ受け取り、１つは親クラスのコンストラクタに渡し、残りはフィールドにセット。
//・メソッド
//　　displayProductInfoメソッド
//　　　　：引数、戻り値はなしの抽象メソッド
//　　　　　フィールド変数のgetter, setterを用意。



//このクラスには抽象メソッドが２つある（１つは親クラスの）
public abstract class Product extends Category{
	/*fields*/
	String productName;
	double price;

	
	/*constructor*/
	public Product(String categoryName, String productName, double price) {
		super(categoryName);
		this.productName = productName;
		this.price = price;
	}
	
	
	/*abstract medhod*/
	public abstract void displayProductInfo() ;

	
	/*getter/setter*/
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}

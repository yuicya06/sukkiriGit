package sukkiri.practice.practice_print11.practice02;

//●ElectronicProduct クラス(Productクラスを実装)
//・コンストラクタ
//　　：引数を3つ受け取り、親クラスのコンストラクタに渡す。
//・メソッド
//　　displayCategoryInfoメソッド
//　　　　：オーバーライドして実装する。処理内容は出力結果例のように、カテゴリー名を表示する。
//
//displayProductInfoメソッド
//　　：オーバーライドして実装する。displayCategoryInfoメソッドを呼び出し、カテゴリー名を表示する。
//  そのあと、製品名、価格、商品説明を表示する。


public class ElectronicProduct extends Product{

	/*constructor*/
	public ElectronicProduct(String categoryName, String productName, double price) {
		super(categoryName, productName, price);
	}

	@Override
	public void displayCategoryInfo() {
		System.out.println("Category:" + getCategoryName());
	}
	
	@Override
	public void displayProductInfo() {
		
		System.out.println("Category:" + getCategoryName());
		System.out.println("Product: " + getProductName());
		System.out.println("Price:" + getPrice());
		System.out.println("This is an electronic product.");
		
	}


	
	
	
	
	

}

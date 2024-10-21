	package sukkiri.practice.practice_print11.practice02;
	
//	●Category(抽象クラス)
//	・フィールド　※アクセス修飾子はすべて付けない
//	型	変数名・定数名
//	String	categoryName
//	・コンストラクタ
//	　　　引数を1つ受け取り、フィールドにセット
//	・メソッド
//	　　displayCategoryInfoメソッド
//	　　　：引数、戻り値はなしの抽象メソッド
//	　　フィールド変数のgetter, setterを用意。


public abstract class Category {
	
	String categoryName;
	
	/*constructor*/
	public Category(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/*abstract methodd*/
	public abstract void displayCategoryInfo();


	/*getter setter*/
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

}

package sukkiri.practice.practice_print11.practice02;


//●Mainクラス
//・メソッド
//　　mainメソッド
//　　　：「"Electronics", "Laptop", 999.99」をコンストラクタに渡し、ElectronicProductクラスのインスタンスを生成し、
//   displayCategoryInfoメソッドを呼び出す。
//　　　　その後、「-------------------------------------」を出力し、displayProductInfoメソッドを呼び出す。

//	出力結果例
//	Category: Electronics
//	--------------------------
//	Category: Electronics
//	Product: Laptop
//	Price: $999.99
//	This is an electronic product.



public class Main {

	public static void main(String[] args) {
		
		ElectronicProduct ep = new ElectronicProduct("Electronics", "Laptop", 999.99);
		ep.displayCategoryInfo();
		System.out.println("-------------------------------------");
		ep.displayProductInfo();

	}

}

package file_operation.sample05;

import java.util.ArrayList;

//●Mainクラス
//・メソッド
//　　mainメソッド
//　　　：CsvOperationインスタンス、Animal型ArrayListインスタンスを生成する。
//　　　　CSVファイルの呼び出しを行い、戻り値をAnimal型ArrayListインスタンスに
//    	格納後、全件表示する。

public class Main {

	public static void main(String[] args) {

		CsvOperation co = new CsvOperation();
		ArrayList<Animal> list = new ArrayList<>();

		list = co.CsvFileReader();
		
		for(Animal animal : list) {
			
			animal.show();
		}
	}

}

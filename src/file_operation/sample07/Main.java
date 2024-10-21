package file_operation.sample07;
import java.text.ParseException;
import java.util.ArrayList;


//(4)	Mainクラスのmainメソッドを作成してください。
//1.	気温データをArrayListで持てるように宣言する
//2.	CSVファイル操作をするクラスのインスタンス化
//3.	CSVファイルの読み込みを行うメソッドを呼ぶ
//4.	「月日　平均気温　最高気温　最低気温」を順番に表示する。
//
//実行結果例（一部のみ表示）
//2023/04/25　平均気温：13.1　最高気温：16.3　最低気温：10.2 
//2023/04/26　平均気温：14.6　最高気温：16.5　最低気温：10.7 
//2023/04/24　平均気温：13.5　最高気温：16.8　最低気温：11.3 
//2023/05/08　平均気温：15.6　最高気温：19.5　最低気温：13.3 
//2023/04/30　平均気温：17.5　最高気温：19.8　最低気温：14.7 
//2023/05/14　平均気温：17.1　最高気温：19.8　最低気温：15.0 
//2023/05/07　平均気温：19.4　最高気温：20.7　最低気温：14.6


public class Main {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<TempData>list = new ArrayList<>();
		CsvReader cr = new CsvReader();
	
		cr.CsvFileReader(list);
		
		
		
		//TempData td = new TempData();
		
		
		for(TempData td : list) {
			System.out.print(td.strDate(td.getDate()));
			System.out.print("平均気温" + td.getAveTemp());
			System.out.print("最高気温"+ td.getMaxTemp());
			System.out.print("最低気温"+td.getMinTemp());
			System.out.println();
			
		}

		
		
		

	}

}

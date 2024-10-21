package file_operation.sample04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvOperation {
	
	private final String filepath;
	
	public CsvOperation() {
		
		this.filepath = "file\\\\AnimalData.txt";
	}
	
	public void CsvFileReader() {
		
		
		
		try (	//FileReader fr = new FileReader(filepath);
				
				//BufferedReader br = new BufferedReader(fr);
				
				//下記の書き方でもOK
				BufferedReader br = new BufferedReader(new FileReader(filepath));
				) {

			String line;
			// ファイルを1 行読み込み、データがある間繰り返す
			//whileの中身をアレンジしていく
			while ((line = br.readLine()) != null) {
				// １行表示
				System.out.println(line);

			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();

		}
		
	}
	
	
	
	

}

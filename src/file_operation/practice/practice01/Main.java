package file_operation.practice.practice01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		String filepath = "file\\AnimalData.txt";
		
		
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

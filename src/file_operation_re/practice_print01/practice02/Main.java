package file_operation_re.practice_print01.practice02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// 読み込むファイルを指定
		String filepath = "file\\AnimalData.txt";
		String filepath2 = "file\\AnimalData2.txt";
		
		// try-with-resources 文を使ってファイルを開く
		try (FileReader fr = new FileReader(filepath);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(filepath2);
				BufferedWriter bw = new BufferedWriter(fw);) {
			
			String line;
			// ファイルを 1 行読み込み、データがある間繰り返す
			while ((line = br.readLine()) != null) {
				// １行表示
				System.out.println(line);
				
				bw.write(line);
				bw.newLine();
			}
			
			
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		}
	}

}

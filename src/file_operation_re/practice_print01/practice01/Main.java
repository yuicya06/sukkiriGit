package file_operation_re.practice_print01.practice01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// 読み込むファイルを指定
		String filepath = "file\\AnimalData.txt";
		// try-with-resources 文を使ってファイルを開く
		try (FileReader fr = new FileReader(filepath);
				BufferedReader br = new BufferedReader(fr);) {
			String line;
			// ファイルを 1 行読み込み、データがある間繰り返す
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

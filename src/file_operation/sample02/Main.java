package file_operation.sample02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//読み込むファイルを指定
		String filepath = "data.txt";
		// 変数宣言（close 処理のためtry の外で宣言）
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// FileReader インスタンス生成
			fr = new FileReader(filepath);
			// BufferedReader インスタンス生成
			br = new BufferedReader(fr);
			String line;
			// ファイルを1 行読み込み、データがある間繰り返す
			while ((line = br.readLine()) != null) {
				// １行表示
				System.out.println(line);
			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();
		} finally {
			// finally は必ず実行される
			try {
				// BufferedReader のクローズ処理
				br.close();
			} catch (IOException e) {
				// IOException の例外処理
				e.printStackTrace();
			}

			try {
				// FileReader のクローズ処理
				fr.close();
			} catch (IOException e) {
				// IOException の例外処理
				e.printStackTrace();
			}

		}
	}
}

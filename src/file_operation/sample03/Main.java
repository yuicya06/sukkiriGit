package file_operation.sample03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*書き込み*/
/*with-resources*/
public class Main {

	public static void main(String[] args) {

		//書き込むファイルを指定
		String filepath = "data.txt";
		// try with resources 文を使ってファイルを開く
		try ( //FileWriter fw = new FileWriter(filepath);

				//BufferedWriter bw = new BufferedWriter(fw);

				BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true));

		)

		{
			// 書き込みを繰り返す
			for (int i = 0; i < 5; i++) {
				bw.write("[" + i + "]"); // ファイルに書き込み
				bw.newLine(); // 改行
			}
		} catch (IOException e) {
			// IOException の例外処理
			e.printStackTrace();
		}

	}
}

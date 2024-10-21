package file_operation.practice.practice02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//ファイルの読み込み
		String filepathR = "file\\AnimalData.txt";
		String filepathW = "file\\AnimalData2.txt";

		try ( //FileReader fr = new FileReader(filepath);

				//BufferedReader br = new BufferedReader(fr);

				//下記の書き方でもOK
				BufferedReader br = new BufferedReader(new FileReader(filepathR));
				BufferedWriter bw = new BufferedWriter(new FileWriter(filepathW));

		) {

			String line;
			// ファイルを1 行読み込み、データがある間繰り返す
			//whileの中身をアレンジしていく
			while ((line = br.readLine()) != null) {
				// １行表示
				bw.write(line);
				bw.newLine(); // 改行

			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();

		}
		
		
		/*	try-catch 文で分割して行う場合
			List＜＞コレクションを使用して読み込み、
			書き込みを行う
			String型だけだと、スコープ範囲の関係で
			複数受けって維持できないため
		*
		*
		*/
		
		
		
		
		
		
		
		

	}

}

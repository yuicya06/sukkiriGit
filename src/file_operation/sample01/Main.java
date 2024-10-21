package file_operation.sample01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*読み込み*/
/*with-resources*/
public class Main {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		
		
				// 読み込むファイルを指定
				//絶対パス
				//String filepath = "C:\\Users\\3030821\\Desktop\\github\\sukkiriJava_10\\data.txt";
				
				//相対パス
				String filepath = "data.txt";
				
				// try with resources 文を使ってファイルを開く
				//読み書きに必要なインスタンスを作成まる（）内
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

//絶対パス
//相対パス
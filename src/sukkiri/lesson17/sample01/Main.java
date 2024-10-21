package sukkiri.lesson17.sample01;

import java.io.FileWriter;

/*17-1*/
public class Main {

	public static void main(String[] args) {
		//Filewriter ファイルに書き込むためのインスタンス
		//何かを開く閉じる場合、例外が発生する可能性が考えられる
		FileWriter fw = new FileWriter("data.txt");

//		public FileWriter(String fileName)
//		           throws IOException
		/*このコンストラクタを呼び出したとき、例外が発生する場合がある*/
		
		
		
	}

}

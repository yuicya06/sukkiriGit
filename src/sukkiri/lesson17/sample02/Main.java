package sukkiri.lesson17.sample02;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/*正常*/
		/*
		try {
			FileWriter fw = new FileWriter("data1024.txt");
			fw.write("hello!");
			fw.close();
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("エラーが発生しました。");
		}
		*/
		
		
		/*エラー*/
		//存在しないディレクトリー
		try {
			FileWriter fw = new FileWriter("nonexistent_directory\\data.txt");
			fw.write("hello!");
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();//例外がどこで発生したかの情報を出力
			System.out.println(e.getMessage());
			System.out.println("エラーが発生しました。");
		}

	}

}

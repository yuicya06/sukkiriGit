package sukkiri.lesson17.sample04;
/*コピー用*/
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
								
			fw = new FileWriter("data.txt");//変更箇所：ファイルパス
			fw.write("hello!"); //変更箇所：書き込む内容
			
		} catch  (Exception e){
			System.out.println("何らかの例外が発生しました");//変更箇所（場合によって）
			
		} finally {
			if(fw != null) {
				try {
					fw.close();
					
				} catch (IOException e) {
					e.getStackTrace();//変更箇所（場合によって）
				}
			}
		}

	}

}

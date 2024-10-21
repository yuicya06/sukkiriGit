package sukkiri.practice.practice_print17.practice02;

//問2	以下のプログラムを作成し、「NullPointerException」が発生した場合に
//「null参照があります」と表示するように例外処理を加えてください。
//※try-catch構文を用いる


public class Main {

	public static void main(String[] args) {
		
		try {
			String str = null;
			int length = str.length();
			System.out.println(length);
			
		}catch (Exception e) {
			e.printStackTrace();//例外がどこで発生したかの情報を出力
			System.out.println(e.getMessage());
			System.out.println("null参照があります");
		}


	}

}

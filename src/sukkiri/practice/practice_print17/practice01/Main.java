package sukkiri.practice.practice_print17.practice01;

//問1	以下のプログラムを作成し、「ArithmeticException」が発生した場合に

//「0で割ることができません」と表示するように例外処理を加えてください。
//※try-catch構文を用いる
//public static void main(String[] args) {
//	int x = 5;
//        int y = 0;
//        int result = x / y;
//        System.out.println(result);
//}

public class Main {

	public static void main(String[] args) {

		int result;
		int x = 5;
		int y = 0;
		
		try {

			result = x / y;
			System.out.println(result);
			
		}catch (ArithmeticException e) {
			System.out.println("0で割ることができません");
		}
			
		

	}

}

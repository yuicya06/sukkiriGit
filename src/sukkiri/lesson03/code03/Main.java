package sukkiri.lesson03.code03;

public class Main {

	public static void main(String[] args) {
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else 
			System.out.println("映画をみます");//elseのブロックはこの行までみなされる
		System.out.println("ごろごろします");//この行は出力される

			
		
//		
//		int a;
//		if (true) {
//			a = 2;
//			int b = 3;
//			 b = 5;
//		}
//		
//		a = 5;
		
		
		//文字列の比較はequals();
		
		
		String str = "good morning";
		if (str.equals("good evening")) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		String str2 = "good morning";
		String str3 = new String("good morning");
		
		System.out.println("-------------------");
		
		if (str == str2) {
			System.out.println("aaa");
		} else {
			System.out.println("bbb");
		}
			
		
		int hight = 161;
		System.out.println("===================");
		
		if (hight > 170) {
			System.out.println("L");
		} else if (hight > 160) {
			System.out.println("M");
		} else {
			System.out.println("S");
		}
		

			
			
		
		
		
		
		
		
		
	}

}

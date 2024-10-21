package sukkiri.lesson02.practice02;

public class Main {
	public static void main(String[] args) {
		
		//1
		//int x = 3 +5.0; //大きいほうに統一される（8.0）、のでdouble型をint型に入れれない
		int xr = (int)(3 + 5.0);//こちらはOK
		
		//2 〇
		double d = 2.0F;//double型のほうが大きいためOK
		
		//3
		//int number = "5";//型の不一致
		int number_r = Integer.parseInt("5");//こちらはOK
		
		//4 〇
		String s = 2 + "人目";//文字列+数字のためOK
		
		
		//5 〇
		byte b = 1;//例外的にOK
		
		
		//6
		//double d = true;//×
		
		
		//7 〇
		short y = (byte)2;//byte型よりshort型の方が大きい
		
		
		System.out.println(xr);
		System.out.println(d);
		System.out.println(s);
		System.out.println(b);
		System.out.println(y);
		
	}


}

package sukkiri.lesson02.code05;

public class Main {
	public static void main(String[] args) {
		int a;
		a = 100;
		a++; //a+=1 , a=a+1
		System.out.println(a);
		
		int x =10;
		int y =10;
		
		System.out.println("-----インクリメントと出力を同時に行う-----");
		System.out.println("++x:" + ++x);
		System.out.println("y++:" + y++);
		System.out.println("y:" + y);
		/*
		 * インクリメントと、ディクリメントは単独で使う
		 * 変な動作をするので、上記のような使い方はしない
		 */
	}

}

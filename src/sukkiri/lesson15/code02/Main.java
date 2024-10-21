package sukkiri.lesson15.code02;

public class Main {

	public static void main(String[] args) {

		//public boolean contains(String s): 引数の文字列を含むかどうか
		String s1 = "Java and JavaScript";

		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}

		//public boolean endsWith(String s) 引数の文字列で終わるかどうか
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		} else {
			System.out.println("文字列s1は、Javaが末尾にありません");
		}
		//		
		//		if (s1.startsWith("Java")) {
		//			System.out.println("文字列s1は、Javaではじまる");
		//		} else {
		//			System.out.println("文字列s1は、Javaではじまらない");
		//		}
		//		
		//public int indexOf()
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));

		//public int lastIndexOf():末尾からJavaをさがしていき、見つかったら先頭から数える
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}

}

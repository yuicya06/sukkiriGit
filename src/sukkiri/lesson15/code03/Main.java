package sukkiri.lesson15.code03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";

		//a programming
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		// a pro
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));//3文字目～7文字目まで切り取り

		/*
		 */

		System.out.println("文字列s1の4文字目は" + s1.charAt(3));

		//System.out.println(s1.replace("a", "A"));
		System.out.println(s1.replaceAll("a", "A"));
	}

}


//実行結果
//文字列s1の4文字目以降はa programming
//文字列s1の4～8文字目はa pro
//文字列s1の4文字目はa
//JAvA progrAmming

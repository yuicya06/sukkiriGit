package sukkiri.lesson15.code01;

public class Main {

	public static void main(String[] args) {
		//String型はクラスなのでメソッドを持ってたりする
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		System.out.println("====s2とs3の比較=====");

		// public boolean equals(Object o)
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		} else {
			System.out.println("s2とs3は等しくない");
		}

		System.out.println("====s2とs3の比較(ケース区別なし)=====");

		//public boolean equalsIgnoreCase(String s)
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}

		//public int length() :引数なし、int型がかえってくるメソッド
		System.out.println("s1の長さは" + s1.length() + "です");

		//public booleas isEmpty() : 引数なし、boolean型がかえってくるメソッド
		System.out.println("====s1が空文字かどうか=====");

		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		} else {
			System.out.println("s1は空文字ではない");
		}

	}

}

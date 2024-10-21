package sukkiri.lesson06.sample01;
//Calcクラス
public class Calc {
	//メインメソッド
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = tasu(a, b);
		int delta = hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

	//tasuメソッド
	public static int tasu(int a, int b) {
		return (a + b);
	}

	//hikuメソッド
	public static int hiku(int a, int b) {
		return (a - b);
	}
}

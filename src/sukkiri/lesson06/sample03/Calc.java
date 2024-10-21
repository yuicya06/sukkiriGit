package sukkiri.lesson06.sample03;
//パッケージは一緒
public class Calc {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		//同パッケージ内の他クラスのメソッドの呼び出し
		//「他クラス名.メソッド名（引数）」
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}

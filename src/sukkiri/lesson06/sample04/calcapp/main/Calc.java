package sukkiri.lesson06.sample04.calcapp.main;
//パッケージは別々
public class Calc {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		//どのパッケージのCalcLogicクラスかを明示していないため下記はエラー
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
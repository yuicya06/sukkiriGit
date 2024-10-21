package sukkiri.practice.practice_print05.practice04;

public class Main {

	/**
	 * メソッド名： printArea
	 * 引数： double height, double width
	 * 戻り値：なし
	 * 処理の内容： 高さが height, 横幅が width の長方形の面積を出力する
	 * ヒント：長方形の面積の求め方　高さ×横幅
	 * 	 * @param args
	 */

	public static void printArea(double height, double width) {
		System.out.println("高さ：" + height + "、" + "横幅：" + width);
		System.out.println(height * width);
	}

	public static void main(String[] args) {
		printArea(20, 10);
	}

}

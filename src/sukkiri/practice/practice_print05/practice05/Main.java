package sukkiri.practice.practice_print05.practice05;

public class Main {

	/*
	 * メソッド名： printMin
	 * 引数： double a, double b, double c
	 * 戻り値：なし
	 * 処理の内容： 引数で渡された a, b, c の値のうち、最小値を出力する

	 */

	public static void printMin(double a, double b, double c) {

		//		double min = a;
		//		if(min > b) {
		//			System.out.println(b);
		//		} 
		//		if (min > c) {
		//			System.out.println(c);
		//		} 
		//			System.out.println(min);
		//		

		/*
			double min = Math.min(a, b);
			min = Math.min(min, c);
			System.out.println(min);
		 */

		double min = Math.min(Math.min(a, b), c);
		System.out.println("min：" + min);
	}

	public static void main(String[] args) {

		printMin(1, 2, 3);

	}

}

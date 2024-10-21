package sukkiri.lesson15.practice.practice01;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		/*
		1から100までの整数をカンマで連結した以下のような文字列sを生成する
		 */

		//1,2,3,4,5,6,...100,

		//連結
		for (int i = 1; i < 101; i++) {
			sb.append(i);
			sb.append(",");
			//sb.append(i).append(","); メソッドチェーン

		}

		//StringBuilder型変数からString型変数に格納
		String s = sb.toString();
		//表示
		System.out.println(s);
		//完成した文字列sをカンマで分割し、String配列aに格納
		String[] a = s.split(",");

		for (String x : a) {
			System.out.println(x);
		}
	}

}

package sukkiri.practice.practice_print05.practice06;

public class Main {
	//		 メソッド名：getMin
	//		 引数：double a, double b
	//		 戻り値の型：double　return文で三項条件演算子を使用して下さい (テキストp122参照)
	//		 処理の内容： 引数で受け取る2つの値のうち、小さい方の値を返す

	public static double getMin(double a, double b) {
		
		//double getMin = a > b ?  b : a; //三項条件演算子	条件式 ? trueの値: falseの値 ;
		//return getMin;

		//return a < b ? a : b; //この書き方も可能

		//if文なら①

//		if(a < b) {
//			return a;
//		} else {
//			return b;
//		}
		
		//if文なら②
		if(a < b) {
			return a;
		} 
			return b;
		
	}

	public static void main(String[] args) {

		double min = getMin(5, 10);
		System.out.println(min);

	}

}

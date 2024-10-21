package sukkiri.practice.practice_print11_nakamura;

public interface IOperation {
	
	// フィールド
	String FORMAT_INT_CALC = "%d %c %d = %d";
	char INT_ADD = '+';
	char INT_SUB = '-';
	char INT_MUL = '*';
	char INT_DIV = '/';
	
	// メソッド
	// 計算処理する用
	int intCalc(int a , int b); 
	// 定数FORMAT_INT_CALCを使って引数の内容を表示するためのメソッド
	void show(int a, int b, int result); 

}

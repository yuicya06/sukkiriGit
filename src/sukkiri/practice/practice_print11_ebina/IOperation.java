package sukkiri.practice.practice_print11_ebina;

public interface IOperation {
	//定数
	final String FORMAT_INT_CALC = "%d %c %d = %d";
	final char INT_ADD = '+';
	final char INT_SUB = '-';
	final char INT_MUL = '*';
	final char INT_DIV = '/';
	//intCalcメソッド　役割：計算処理する用
	int intCalc(int a , int b) ;
	//showメソッド　定数FORMAT_INT_CALCを使って引数の内容を表示する
	void show(int a, int b, int result) ;
	
}

package sukkiri.practice.practice_print11.practice06;

//1.IOperationインターフェースを以下の内容で作成してください。

//・String型定数名：FORMAT_INT_CALC	値："%d %c %d = %d"
//（String.formatで指定する書式指定文字列）
//・char型定数名：INT _ADD		値：'+'
//・char型定数名：INT _SUB		値：'-'
//・char型定数名：INT _MUL		値：'*'
//・char型定数名：INT _DIV		値：'/'
//
//・抽象メソッド名：intCalc
//　引数：int a , int b
//　戻り値：int型
//　役割：計算処理する用
//
//・抽象メソッド名：show
//　引数：int a, int b, int result
//　戻り値：なし


public interface IOperation {
	
	/*fields*/
	final String FORMAT_INT_CALC = "%d %c %d = %d";
	final char INT_ADD = '+';
	final char INT_SUB = '-';
	final char INT_MUL = '*';
	final char INT_DIV = '/';
	
	
	/*abstract method*/
	int intCalc(int a, int b) ;
	
	
	/*abstract method*/
	//　役割：定数FORMAT_INT_CALCを使って引数の内容を表示するためのメソッド
	void show(int a, int b, int result);
	
	
	
	

}

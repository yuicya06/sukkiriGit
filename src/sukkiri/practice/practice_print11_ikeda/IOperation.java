package sukkiri.practice.practice_print11_ikeda;

//計算クラス用のインフェース
public interface IOperation {
	//四則演算の記号の定数作成
	static final String FORMAT_INT_CALC ="%d %c %d = %d";
	static final char INT_ADD = '+';
	static final char INT_SUB = '-';
	static final char INT_MUL = '*';
	static final char INT_DIV = '/';
	
	/*
	 *抽象メソッド名：intCalc
	 *引数：int a , int b
	 *戻り値：int型
	 *役割：計算処理する用
	 */
	public abstract int intCalc(int a , int b);
	
	
	/*
	 *抽象メソッド名：show
	 *引数：int a, int b, int result
	 *戻り値：なし
	 *役割：定数FORMAT_INT_CALCを使って引数の内容を表示するためのメソッド
	 */
	public abstract void show(int a, int b, int result);
	
	

}

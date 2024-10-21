package sukkiri.practice.practice_print11.practice06;

//Mul : intCalcメソッド：2つの int 型の引数a, bを持ち、 a×b の結果を返す。
//showメソッド	：String.formatを使用して、FORMAT_INT_CALCの書式に合わせて「a * b = 計算結果」を表示する。



public class Mul  implements IOperation {

	@Override
	public int intCalc(int a, int b) {
		return a * b;
	}

	@Override
	public void show(int a, int b, int result) {
		System.out.println(String.format(FORMAT_INT_CALC, a ,INT_MUL, b ,result));
	}
	

}

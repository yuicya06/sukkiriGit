package sukkiri.practice.practice_print11_ebina;

public class Mul implements IOperation {
	//intCalcメソッド：2つの int 型の引数a, bを持ち、 a*b の結果を返す
	@Override
	public int intCalc(int a, int b) {
		int result = a*b;
		return result;
	}
	//showメソッド	：String.formatを使用して、
	//FORMAT_INT_CALCの書式に合わせて「a * b = 計算結果」を表示
	@Override
	public void show(int a, int b, int result) {
		System.out.printf(FORMAT_INT_CALC, a, INT_MUL, b, result);
	}
}

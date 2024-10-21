package sukkiri.practice.practice_print11_ikeda;

//IOperationインターフェイスから実装
//入力された2つの数の引き算を実施し、
//その計算式を表示するクラス
public class Sub implements IOperation{
	@Override
	public int intCalc(int a, int b) {
		
		return a - b;
	};
	
	
	@Override
	public void show(int a, int b, int result) {
		String formula = String.format(FORMAT_INT_CALC,a,INT_SUB,b,result);
		System.out.println(formula);
	};

}

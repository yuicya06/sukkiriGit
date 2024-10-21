package sukkiri.practice.practice_print11_nakamura;

import java.util.Scanner;



// mainクラス
public class OprTester {

	public static void main(String[] args) {

		// キーボード入力の用意
		Scanner sc = new Scanner(System.in);

		// 2つの数字と四則演算の記号（+,-,*,/）をキーボードから読み込む。
		System.out.println("計算する数値を２つ入力");
		System.out.print("1つめ：");
		int a = sc.nextInt();
		System.out.print("2つめ：");
		int b = sc.nextInt();
		sc.nextLine(); // 空白の処理

		System.out.println("計算する記号を入力（+,-,*,/）");
		String str = sc.nextLine();
		char operator = str.charAt(0);

		// 読み込んだ記号とIOperationの定数を比較し、インスタンスを生成する。
		// 生成したインスタンスはIOperationインターフェースの変数に代入する。
		if( operator == IOperation.INT_ADD || operator == IOperation.INT_SUB || operator == IOperation.INT_MUL || operator == IOperation.INT_DIV ) {
			// 四則演算の記号（+,-,*,/）の場合の処理 
			IOperation iOperation = switch( operator ) {
			case IOperation.INT_ADD -> new Add();
			case IOperation.INT_SUB -> new Sub();
			case IOperation.INT_MUL -> new Mul();
			default  -> new Div();
			};

			// intCalcメソッドを実行して、showメソッドを用いて結果を表示する。
			int result = iOperation.intCalc(a, b);
			iOperation.show(a, b, result);

		} else {
			//  四則演算の記号（+,-,*,/）ではない場合の処理。
			System.out.println("四則演算の記号ではありません");
		}

	}

}

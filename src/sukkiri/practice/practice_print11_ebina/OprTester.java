package sukkiri.practice.practice_print11_ebina;

import java.util.Scanner;

public class OprTester {

	public static void main(String[] args) {
		//2つの数字と四則演算の記号（+,-,*,/）をキーボードから読み込む
		Scanner sc = new Scanner(System.in);
		System.out.println("計算する数値を２つ入力");
		System.out.print("1つめ：");
		int a = sc.nextInt();
		System.out.print("2つめ：");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.print("入力（+,-,*,/）：");
		String c = sc.nextLine();

		//読み込んだ記号とIOperationの定数を比較
		if (c.charAt(0)==IOperation.INT_ADD ) {
			//Add, Sub, Mul, Divのいずれかのクラスのインスタンスを生成
			//生成したインスタンスはIOperationインターフェースの変数に代入
			IOperation add = new Add();
			//インスタンスが生成できている場合は
			//intCalcメソッドを実行して、showメソッドを用いて結果を表示
			add.show( a, b, add.intCalc(a, b) ); 
		} else if ( c.charAt(0)==IOperation.INT_SUB ) {
			IOperation sub = new Sub();
			sub.show( a, b, sub.intCalc(a, b) );
		} else if ( c.charAt(0)==IOperation.INT_MUL ) {
			IOperation mul = new Mul();
			mul.show( a, b, mul.intCalc(a, b) );
		} else if ( c.charAt(0)==IOperation.INT_DIV ) {
			IOperation div = new Div();
			div.show( a, b, div.intCalc(a, b));
		} else { ///該当のクラスがない場合
			System.out.println("四則演算の記号ではありません");
		}
	}
}
/*final char INT_ADD = '+';
final char INT_SUB = '-';
final char INT_MUL = '*';
final char INT_DIV = '/';*/

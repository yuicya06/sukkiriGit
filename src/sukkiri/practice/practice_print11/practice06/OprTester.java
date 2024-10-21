package sukkiri.practice.practice_print11.practice06;

import java.util.Scanner;

//3.OprTesterクラスのmainメソッドで2つの数字と四則演算の記号（+,-,*,/）をキーボードから読み込む。
//読み込んだ記号とIOperationの定数を比較し、 Add, Sub, Mul, Divのいずれかのクラスのインスタンスを生成する。
//（「+」のときはAddクラス、「-」のときはSubクラス、「*」のときはMulクラス、「/」のときはDivクラス）
//生成したインスタンスはIOperationインターフェースの変数に代入する。
//該当のクラスがない場合は、「四則演算の記号ではありません」と表示する。
//インスタンスが生成できている場合は、intCalcメソッドを実行して、showメソッドを用いて結果を表示してください。
//四則演算の記号の読み込みについては、sc.nextLine()でString型として読み込み、charAt()メソッドを使ってchar型変数に
//代入して引数に与えてください。
//
//実行結果例
//計算する数値を２つ入力
//1つめ：4			（入力）
//2つめ：7			（入力）
//計算する記号を入力（+,-,*,/）
//+				（入力）
//4  +  7  = 11


public class OprTester {
	public static void main(String[] args) {

		//		2つの数字と四則演算の記号（+,-,*,/）をキーボードから読み込む。
		Scanner sc = new Scanner(System.in);
		System.out.print("1つめ：");
		int a = sc.nextInt();
		System.out.print("2つめ：");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("計算する記号を入力（+,-,*,/）");
		String calculationSymbol = sc.nextLine();
		
		//読み込んだ記号とIOperationの定数を比較し、 Add, Sub, Mul, Divのいずれかのクラスのインスタンスを生成する。
		//（「+」のときはAddクラス、「-」のときはSubクラス、「*」のときはMulクラス、「/」のときはDivクラス）
		//生成したインスタンスはIOperationインターフェースの変数に代入する。
		//該当のクラスがない場合は、「四則演算の記号ではありません」と表示する。
		//インスタンスが生成できている場合は、intCalcメソッドを実行して、showメソッドを用いて結果を表示してください。
		//四則演算の記号の読み込みについては、sc.nextLine()でString型として読み込み、
		//charAt()メソッドを使ってchar型変数に代入して引数に与えてください。
		
		/*記号をchar型に変換*/
		char c = calculationSymbol.charAt(0);
	
		/*計算結果*/
		int result;
		
		
		IOperation io = null;
		
		
		
		switch (c) {

		case '+':
			io = new Add();
			result = io.intCalc(a, b);
			io.show(a, b, result);
			break;

		case '-':
			io = new Sub();
			result = io.intCalc(a, b);
			io.show(a, b, result);
			break;

		case '*':
			io = new Mul();
			result = io.intCalc(a, b);
			io.show(a, b, result);
			break;

		case '/':
			io = new Div();
			result = io.intCalc(a, b);
			io.show(a, b, result);
			break;

		default:
			System.out.println("四則演算の記号ではありません");

		}

	}


}

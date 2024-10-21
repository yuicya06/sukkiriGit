package sukkiri.lesson16.code01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Integer型でArrayListを宣言

		/**
		 * ArrayList<型> 変数名 = new ArrayList<型>();
		 * List<型> 変数名 = new ArrayLis<[省略可能]>;
		 * ↑子（ArrayList）のインスタンスを親(List)の型に代入
		 */

		//ArrayList<Integer> points = new ArrayList<Integer>();
		//Integer の箇所はクラスに該当するものしか書けない（ラッパークラス）
		List<Integer> points = new ArrayList<>();
		//int            a   = 〇〇;

		/**
		 * メソッドの使い方
		 * インスタンス変数名.メソッド名();
		 */

		points.add(10); //要素の追加
		points.add(80); //自動的にIntegerに変換、格納される
		points.add(75);

		Integer a = 10;
		int b = 10;

		if (a == b) {
			System.out.println(true);
		}
		//引数にint型を渡すとInteger型が返ってくる
		Integer i1 = Integer.valueOf(16);

		//オートボクシングの機能があるので上記の操作は必要ない

		//Scanner sc = new・・・
		//sc.nextLine();    みたいな使い方
		
		System.out.println("--------拡張for文--------");
		//アンオートボクシング機能で、points(Integer)→intに変換されている
		for (int i : points) { //拡張for文
			System.out.println(i);
		}
		
		System.out.println("-----iteratorで要素を表示-----");
		for (int i = 0; i< points.size(); i++) {
			System.out.println(points.get(i));
		}
		
	}

}

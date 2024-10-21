package sukkiri.practice.practice_print16.practice05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//問5   【メソッド間のArrayListの操作】

public class Main {

	public static void main(String[] args) {

		//メソッド名： main
		//引数：String[] args
		//戻り値：void
		//処理の内容： 

		//		1.スキャナを使えるようにし、乱数を作成する個数を入力させる。
		Scanner sc = new Scanner(System.in);
		System.out.print("乱数を作成する数を指定してください：");
		int n = sc.nextInt();

		//		2.getListDataメソッドに入力した値を引数で渡した後、戻り値を受け取る。
		Random rand = new Random();
		ArrayList<Integer> list = getListData(n);

		//		 3.showListDataメソッドにArrayList型の変数を引数に入れて渡す。
		//showListData(list);
		
//		ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,777));
//		showListData(list);
		

	}

	
	
	//	メソッド名： getListData
	//	引数：int型
	//	戻り値：ArrayList<Integer>
	//	処理の内容： 

	public static ArrayList<Integer> getListData(int n) {
		//	1.	ArrayListを変数名listとし宣言する
		ArrayList<Integer> list = new ArrayList<>();
		//	2.	引数で受け取った整数の回数だけ乱数を発生させ、listに追加する。
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			//	乱数については０～９９の範囲とする。
			int m = rand.nextInt(100);
			list.add(m);
		}
		//確認
//		for(int i: list) {
//			System.out.println(i);
//		}
		
		

		// 3.listを戻り値として返す。
		return list;
	}
	
	
	

	//	メソッド名： showListData
	//	引数：ArrayList
	//	戻り値：なし
	//	処理の内容： 引数で受け取ったリストを、for文を使い中身を表示する。

	public static void showListData(ArrayList<Integer> x) {
		for (int z : x) {
			System.out.println(z);
		}

	}

}

package sukkiri.practice.practice_print16.practice06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
//	問6    【メソッド間のArrayListの操作】
	
//	メソッド名： main
//	引数：String[] args
//	戻り値：void
//	処理の内容： 
//	　　　　　　1.スキャナを使えるようにし、乱数を作成する個数を入力させる。
//	　　　　　　2.getListDataメソッドに入力した値を引数で渡した後、戻り値を受け取る。
//				3.showListDataメソッドにArrayListを引数に入れて渡す。
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int input = sc.nextInt();
		ArrayList<Random> r= getListData(input);
		showListData(r);
		
	}
//
//	メソッド名： getListData
//	引数：int型
//	戻り値：ArrayList<Random>
//	処理の内容： 
//	1.	ArrayListを変数名listとし宣言する
//	2.	引数で受け取った整数の回数だけRandomインスタンスを生成し、listに加える。
//	3.	listを戻り値として返す。
	
	public static ArrayList<Random> getListData(int a) {
		ArrayList<Random> list = new ArrayList<>();
		
		for(int i = 0; i < a ; i++) {
			Random rand = new Random();
			list.add(rand);
		}
		return list;
		
	}
	
	
//
//	メソッド名： showListData
//	引数：ArrayList
//	戻り値：なし
//	処理の内容： 引数で受け取ったリストを、for文を使い中身を表示する。
	
	public static void showListData(ArrayList<Random> r) {
		
		
		for(Random x : r) {
			System.out.println(x);
		}
		
		
		
	}




}

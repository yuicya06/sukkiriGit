package sukkiri.practice.practice_print16.practice01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	//	問1	【ArrayListの基本操作】
	//	(1)整数値を扱うArrayListを宣言してください。変数名はnumList
	//	(2)文字列を扱うArrayListを宣言してください。変数名はstrList
	//	(3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
	//	(4)変数strListに「のび太」「すねお」「ジャイアン」「しずかちゃん」「出木杉君」を順番に追加してください。
	//	(5)for文を使い変数numListの中身を順番に表示してください。（要素数はsizeを使う。P584参照） 
	//	(6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）
	//	(7)for文を使い変数numListの中身の値が100以上の要素を削除してください。
	//	(8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)

	public static void main(String[] args) {
		//		(1)整数値を扱うArrayListを宣言してください。変数名はnumList
		List<Integer> numList = new ArrayList<>();
		//		(2)文字列を扱うArrayListを宣言してください。変数名はstrList
		List<String> strList = new ArrayList<>();
		//		(3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
		numList.add(1);
		numList.add(10);
		numList.add(100);
		numList.add(200);
		numList.add(5);
		numList.add(50);
		numList.add(500);
		//		(4)変数strListに「のび太」「すねお」「ジャイアン」「しずかちゃん」「出木杉君」を順番に追加してください。
		strList.add("のび太");
		strList.add("すねお");
		strList.add("ジャイアン");
		strList.add("しずかちゃん");
		strList.add("出木杉君");
		//		(5)for文を使い変数numListの中身を順番に表示してください。（要素数はsizeを使う。P584参照） 
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		//		(6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）

		//Iteratorの生成
		Iterator<String> it = strList.iterator();
		//while文で各要素を見ていく
		while (it.hasNext()) {
			String e = it.next();// next()で次の要素を取得
			System.out.println(e);
		}

		//		(7)for文を使い変数numListの中身の値が100以上の要素を削除してください。

		//                2     3
		//  1     10    100   200
		//  1     10    200    removeされた時、前に詰められるので判定をとばされる 
		//                     index番号2の200の判定のために、ディクリメントしてループを戻す		
		//回答（１）
//		for (int i = 0; i < numList.size(); i++) {
//			if (numList.get(i) >= 100) {
//				numList.remove(i);
//				i--;
//			}
//		}
/*
		//回答（２）
		//後の方から削除していくので、前に詰める動きに干渉しない
		for (int i = numList.size() - 1; i > 0; i--) {
			if (numList.get(i) >= 100) {
				numList.remove(i);
			}
		}

*/
		///回答（３）Iteratorでの回答
		//要素数でループしない、次の要素の中身があるかでループする
		Iterator<Integer> it_int = numList.iterator();
		while(it_int.hasNext()) {
			if(it_int.next()>=100) {
				it_int.remove();
			}
		}
		
		
		//		(8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)
		for (int i : numList) {
			System.out.println(i);
		}

	}

}

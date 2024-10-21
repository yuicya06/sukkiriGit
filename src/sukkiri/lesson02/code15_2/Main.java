package sukkiri.lesson02.code15_2;

import java.util.Random;//ctrl+shift + o もしくは ctrl + sで自動記述

public class Main {
	public static void main(String[] args) {
//		Random rand = new Random();
//		int r = rand.nextInt(90);
//		System.out.println("あなたはたぶん、" + r + "歳ですね");
	
		//Random randd = new Random();⇒chapter7以降に登場
		//new演算子：クラスのインスタンスを生成
		//インスタンス化し、その変数を使いまわす方法
		
		Random rand = new Random();
		int rr = rand.nextInt(90);//0～89までの乱数を作成
		int rrr = rand.nextInt(200);//0～199までの乱数を作成
		
		
		System.out.println("あなたはたぶん" + rr + "歳ですね？");
		System.out.println("いや、" + rrr +"歳ですね");
		
		//教科書のやり方だと、何度も乱数値を作るときに、
		//記述が多くなる、またメモリの領域も多く使う
	
	
	}

}

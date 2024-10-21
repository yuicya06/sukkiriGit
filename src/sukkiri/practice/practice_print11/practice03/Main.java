package sukkiri.practice.practice_print11.practice03;

import java.util.Scanner;


//処理手順：







public class Main {

	public static void main(String[] args) {
		//①スキャナを使えるように宣言する
		//スキャナー
		Scanner sc = new Scanner(System.in);
		//②Shape型配列を要素4で宣言する
		Shape[] shape = new Shape[4];
		//配列の0番目には点クラスを格納
		//shape型が親なので、子のPointを代入可能
		Point point = new Point();
		shape[0] = point;
		
		
		//配列の1番目には、キーボードからwidth（幅）とheight（高さ）を入力し、
		//長方形クラスのコンストラクタに値を渡してインスタンスを生成してから格納する
		System.out.println("幅：");
		int width = sc.nextInt();
		System.out.println("高さ：");
		int height = sc.nextInt();
		
		Rectangle rectangle = new Rectangle(width, height);
		
		shape[1]= rectangle;
		
		
		//配列の2番目には、キーボードからhorzLength（水平直線の長さ）を入力し、
		//水平直線クラスのコンストラクタに値を渡してインスタンスを生成してから格納する
		System.out.println("水平線の長さ：");
		int horzLength = sc.nextInt();
		
		HorzLine horzLine = new HorzLine(horzLength);
		shape[2] = horzLine;
		
		
		//配列の3番目には、キーボードからvertLength（垂直直線の長さ）を入力し、
		//垂直直線クラスのコンストラクタに値を渡してインスタンスを生成してから格納する
		System.out.println("垂直直線の長さ：");
		int vertLength = sc.nextInt();
		
		VertLine vertline = new VertLine(vertLength);
		shape[3] = vertline;
		
		//③Shape型配列の要素数でループ文を作り、drawメソッドを呼び出す
		
		
		
		
//		実行結果例
//		長方形の幅は：
//		5
//		長方形の高さは：
//		3
//		水平直線の長さは：
//		10
//		垂直直線の長さは：
//		3
//		+
//
//		+++++
//		+++++
//		+++++
//
//		----------
//
//		|
//		|
//		|

		

		for(int i = 0; i < shape.length; i++) {
			
			
			shape[i].draw();
			
			
			
			
			
			
			
		}

	}

}

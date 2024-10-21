package sukkiri.practice.practice_print03.print03.addition.practice09;

import java.util.Scanner;

public class Main {
	
//	問9	for文とif文を使い、ｎ回整数を読み込みし、整数を加算してください。
//	合計値が1000を超えない範囲で加算し、超えた時点でｎ回読み込みが完了していなくても入力処理を終了して合計値を表示してください。
//	実行結果例　	実行結果例　
//	何回入力？：5 (キーボード入力)
//	整数値：333(キーボード入力)
//	整数値：123(キーボード入力)
//	整数値：200(キーボード入力)
//	整数値：44(キーボード入力)
//	整数値：299(キーボード入力)
//
//	合計：999(表示)	何回入力？：5 (キーボード入力)
//	整数値：333(キーボード入力)
//	整数値：555(キーボード入力)
//	整数値：300(キーボード入力)
//
//	合計が1000超えました（表示）
//	最後の数値は無視します。（表示）
//	合計：888(表示)


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("何回入力？：");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i =0; i < n; i++) {
			System.out.print("整数値:");
			int x = sc.nextInt();
			sum += x;
			if(sum>1000) {
				System.out.println("合計が1000超えました");
				System.out.println("最後の数値は無視します。");
				System.out.println("合計:"+ (sum - x));
				break;
			}
			
			if(i == n-1) {
				System.out.println("合計:"+ sum);
			}
			
			
			
			
		}
		
		

	}

}

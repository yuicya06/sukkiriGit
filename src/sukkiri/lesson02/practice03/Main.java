package sukkiri.lesson02.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Scanner, Randomインスタンスの生成
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//①画面に「ようこそ占いの館へ」と表示
		//System.out.println(); syso ctrl スペース
		System.out.println("ようこそ占いの館へ");
		//②画面に「あなたの名前を入力してください」と表示（改行なし）
		System.out.print("あなたの名前を入力してください＞");
		//③キーボードから入力を受付、String型の変数nameに格納
		String name = sc.nextLine();
		//④画面に「あなたの年齢を入力してください」と表示（改行なし）
		System.out.print("あなたの年齢を入力してください＞");
		//⑤キーボードから入力を受付、String型の変数ageに格納
		String ageString = sc.nextLine();
		//⑥変数ageStringの内容をint型に変換し、int型の変数ageに代入
		int age = Integer.parseInt(ageString);
		//⑦0から3までの乱数を生成し、int型の変数fortuneに代入
		int fortune = rand.nextInt(4);
		//⑧fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にする
		fortune++;
		//⑨画面に「占いの結果が出ました！」
		System.out.println("占いの結果が出ました！");
		//⑩画面に、年齢、名前、乱数を表示
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です" );
		//%d 10進数 %s 文字列 \n 改行
		System.out.printf("%d歳の%sさん、あなたの運気番号は%dです\n" , age, name, fortune);//15章P544
		
		//画面に「("1:大吉 2:中吉 3:吉 4:凶")」を出力
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
		
		
		
		

	}

}
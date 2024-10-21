package sukkiri.practice.practice_print03.print03.addition.practice11;

import java.util.Random;
import java.util.Scanner;

public class Main {

	//	問11  終了を選ぶまでじゃんけんを繰り返すプログラムを以下の条件で作成しましょう。
	//	①	じゃんけんを繰り返すかどうかの判定を持つboolean型変数boolを用意する
	//	boolがtrueの時は繰り返す、falseの時は繰り返さない。
	//	②	じゃんけんを繰り返す処理はwhile文を使う（boolを条件式に使う）
	//	③	do-while文を使い、「グー：０，チョキ：１，パー：２」以外の値が入力された場合、再度入力を求めるようにする。
	//	④	NPCの手は乱数を使う
	//	⑤	お互いの手を表示する箇所はswitch文を使う
	//	⑥	勝敗判定はif-else if-elseを使い、「あなたの勝ち」「あなたの負け」「あいこ」を表示する
	//	⑦	「再度対戦しますか？(y/n)」をdo-while文を使いyとn以外が入力された場合は再度入力を求めるようにする。（ｙの時は再度じゃんけんする。ｎの時はじゃんけんを終了する）
	//	⑧	じゃんけんを終了する時は「プログラムを終了します」を表示する
	//	実行結果例  （表示内容と入力例）
	//	あなたの手を入力してください（グー：０，チョキ：１，パー：２）:3(表示と入力)
	//	あなたの手を入力してください（グー：０，チョキ：１，パー：２）:-1(表示と入力)
	//	あなたの手を入力してください（グー：０，チョキ：１，パー：２）:0(表示と入力)
	//	あなたの手はグーです(表示)
	//	NPCの手はパーです(表示)
	//	あなたの負けです(表示)
	//	再度対戦しますか？(y/n) :y(表示と入力)
	//	あなたの手を入力してください（グー：０，チョキ：１，パー：２）:1(表示と入力)
	//	あなたの手はチョキです(表示)
	//	NPCの手はパーです(表示)
	//	あなたの勝ちです(表示)
	//	再度対戦しますか？(y/n) :y(表示と入力)
	//	あなたの手を入力してください（グー：０，チョキ：１，パー：２）:2(表示と入力)
	//	あなたの手はパーです(表示)
	//	NPCの手はパーです(表示)
	//	あいこです(表示)
	//	再度対戦しますか？(y/n) :o(表示と入力)
	//	再度対戦しますか？(y/n) :n(表示と入力)
	//	プログラムを終了します(表示)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//①boolean型変数boolの用意
		boolean bool = true;

		/*int hand = 0;*/

		//②while文
		while (bool) {

			int hand = 0;

			do {
				System.out.print("あなたの手を入力してください（グー：０，チョキ：１，パー：２）:");
				hand = sc.nextInt();
			} while (hand < 0 || 2 < hand);

			//④乱数を用いてNPC手をきまる
			int npchand = rand.nextInt(3);

			//⑤wwitch文で自分の手、NPCの手をそれぞれ表示
			switch (hand) {

			case 0 -> System.out.println("あなたの手はグーです");
			case 1 -> System.out.println("あなたの手はチョキです");
			case 2 -> System.out.println("あなたの手はパーです");
			}

			switch (npchand) {
			case 0 -> System.out.println("npcの手はグーです");
			case 1 -> System.out.println("npcの手はチョキです");
			case 2 -> System.out.println("npcの手はパーです");

			}

			//⑥じゃんけんの結果を表示
			//勝敗判定はif-else if-elseを使い、「あなたの勝ち」「あなたの負け」「あいこ」を表示する
			/*		ぐちぱ
					0 1 2
			　ぐ　0 0 2 1
			　ち　1 1 0 2
			　ぱ　2 2 1 0
			*/

			if ((hand - npchand + 3) % 3 == 0) {
				System.out.println("あいこ");
			} else if ((hand - npchand + 3) % 3 == 1) {
				System.out.println("あなたの負け");

			} else {
				System.out.println("あなたの勝ち");
			}

			//		⑦	「再度対戦しますか？(y/n)」をdo-while文を使いyとn以外が入力された場合は
			//		再度入力を求めるようにする。（ｙの時は再度じゃんけんする。ｎの時はじゃんけんを終了する）
			//		⑧	じゃんけんを終了する時は「プログラムを終了します」を表示する

			//入力の受付の調整用のsc();
			sc.nextLine();

			String ans = "";
			do {
				System.out.print("再度対戦しますか？(y/n)");

				ans = sc.nextLine();

			} while (!(ans.equals("y") || ans.equals("n")));

			if (ans.equals("n")) {
				bool = false;

			}
		}

		System.out.println("プログラムを終了します");

	}
}

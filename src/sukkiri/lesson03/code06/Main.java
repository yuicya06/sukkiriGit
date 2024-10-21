package sukkiri.lesson03.code06;
//伝統的なswitch文
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("あなたの運勢を占います");
		int fortune = rand.nextInt(5) + 1;
		System.out.printf("fotune:%d\n", fortune);
		switch (fortune) {
		case 1, 2:
			System.out.println("いいね！");
		break;
		case 3:
			System.out.println("普通です");
			break;
		case 4, 5:
			System.out.println("うーん...");
		}

		fortune = 2;
		//switch1文
		String s = switch(fortune) {
		case 1 -> "大吉";
		case 2 -> "中吉";
		case 3 -> "吉";
		default -> "凶";
		};

		System.out.println(s);

		//三項条件演算子
		int age = 15;
		String ss = age >= 18 ? "成人" : "未成年";
		System.out.println("成人or未成年 : " + ss);

		/*
		 * 条件式 ? true の時の値 : falseの時の値
		 */
	}

}

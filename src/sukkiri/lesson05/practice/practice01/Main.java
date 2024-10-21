package sukkiri.lesson05.practice.practice01;

public class Main {



	/**
	 * ＜＜メソッドの情報などを書く＞＞
	 * name:introduceOneself
	 * 戻り値：なし
	 * 処理：なし
	 * 処理：変数を初期化し、コンソールに表示
	 */
	public static void introduceOneself() {
		String name = "湊";
		int age = 22;
		double height = 169.9;
		char zodiac = '辰';

		System.out.printf("私の名前は%sです。歳は%d歳です。身長は%.1fcmです。\n", name, age, height);
		System.out.printf("干支は%sです", zodiac);
	}

	public static void main(String[] args) {
		introduceOneself();
	}

}
